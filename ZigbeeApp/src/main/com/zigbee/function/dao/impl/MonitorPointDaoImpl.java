/************************************************************************************
 * @File name   :      MonitorPointDaoImpl.java
 *
 * @Author      :      ZHWANG
 *
 * @Date        :      2014-9-8
 *
 * @Copyright Notice: 
 * Copyright (c) 2011 , Inc. All  Rights Reserved.
 * This software is published under the terms of the Software
 * License version 1.0, a copy of which has been included with this
 * distribution in the LICENSE.txt file.
 * 
 * 
 * ----------------------------------------------------------------------------------
 * Date								Who					Version				Comments
 * 2014-9-8 下午05:11:19			ZHWANG			1.0				Initial Version
 ************************************************************************************/
package com.zigbee.function.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.zigbee.framework.common.dao.callback.NativeQueryWithPagingJpaCallback;
import com.zigbee.framework.common.dao.impl.BaseIntDaoImpl;
import com.zigbee.framework.common.util.Utils;
import com.zigbee.function.constant.GreenhouseCommonConstants;
import com.zigbee.function.dao.IMonitorPointDao;
import com.zigbee.function.domain.MonitorPoint;
import com.zigbee.function.dto.GreenhouseQueryDto;
import com.zigbee.function.dto.GreenhouseResultDto;

/**
 *
 */
@Repository("monitorPointDao")
public class MonitorPointDaoImpl extends BaseIntDaoImpl<MonitorPoint, Integer>
		implements IMonitorPointDao {

	/**
	 * @Author      :      ZHWANG
	 * @Date        :      2014-9-8
	 * @param clazz
	 */
	@Inject
	public MonitorPointDaoImpl(@Value("com.zigbee.function.domain.MonitorPoint") Class<MonitorPoint> clazz) {
		super(clazz);
	}

	/** 
	 * overridden:
	 * @Author      :      ZHWANG
	 * @Date        :      2014-9-10
	 * @see com.zigbee.function.dao.IMonitorPointDao#getMonitorResultByDto(com.zigbee.function.dto.GreenhouseQueryDto)
	**/
	@Override
	public List<GreenhouseResultDto> getMonitorResultByDto(
			GreenhouseQueryDto queryDto) {
		 String countHql = "select count(*) from tm_monitor_point mp,tm_equipment e where  e.monitor_point_id = mp.id and e.equip_type = "
			 + GreenhouseCommonConstants.EQUIPMENT_TYPE_DATA_ACQUISITION ;

	        String hql = "select mp.id, e.id,mp.point_name,te.atd, aw.wdv, li.ldv" +
	        		" ,0.0,0.0,0.0,te.last_update_date \n"
	            + " from tm_monitor_point mp \n "
	            + " inner join tm_equipment e on e.monitor_point_id = mp.id and e.equip_type = " + GreenhouseCommonConstants.EQUIPMENT_TYPE_DATA_ACQUISITION
	            + " left join (select equipment_id, max(id) as id from air_temperature_tbl te group by equipment_id ) atn on e.id = atn.equipment_id \n "
	            + " left join (select id, data_value as atd,`timestamp` as last_update_date from  air_temperature_tbl) te on te.id = atn.id  \n "
	            + " left join (select equipment_id, max(id) as id from air_wetness_tbl aw group by equipment_id ) awn on e.id = awn.equipment_id \n "
	            + " left join (select id as id, data_value as wdv from air_wetness_tbl) aw on aw.id = awn.id  \n "
	            + " left join (select equipment_id, max(id) as id from light_tbl li group by equipment_id ) lin on e.id = lin.equipment_id \n "
	            + " left join (select id, data_value as ldv,`timestamp` as last_update_date from  light_tbl ) li on li.id = lin.id  \n "
	            + " where 1=1 ";


	        StringBuffer sb = new StringBuffer(500);
	        if (queryDto.getEquipmentId() != null && queryDto.getEquipmentId() > 0) {
	            sb.append(" and e.id = " + queryDto.getEquipmentId());
	        }
	        if (Utils.notEmpty(queryDto.getPointName())) {
	            sb.append(" and mp.point_name = " + queryDto.getPointName());
	        }
	        if (Utils.notEmpty(queryDto.getPointCode())) {
	            sb.append(" and mp.point_code = '" + queryDto.getPointCode()).append("' ");
	        }
	       
	        String orderStr = " order by mp.point_name asc ";

	        List<Object[]> listDto = getJpaTemplate().executeFind(
	            new NativeQueryWithPagingJpaCallback<Object[]>(
	                        hql + sb.toString() + orderStr, countHql + sb.toString(), queryDto.getPager()));
	        
	        List<GreenhouseResultDto> result = null;
	        if(listDto!=null && listDto.size()>0){
	        	result = new ArrayList<GreenhouseResultDto>(listDto.size());
	        	for(Object[] objects : listDto){
	        		GreenhouseResultDto dto = new GreenhouseResultDto();
	        		dto.setId(Utils.getInt(objects[0]));
	        		dto.setEquipmentId(Utils.getInt(objects[1]));
	        		dto.setName(Utils.getString(objects[2]));
	        		dto.setAirTemperatureValue(Utils.getFloat(objects[3]));
	        		dto.setAirWetnessValue(Utils.getFloat(objects[4]));
	        		dto.setLightValue(Utils.getInt(objects[5]));
	        		dto.setCO2Value(0f);
	        		dto.setSoilTemperatureValue(0f);
	        		dto.setSoilWetnessValue(0f);
	        		dto.setUploadDate(Utils.getDate(objects[9]));
	        		result.add(dto);
	        	}
	        }

	        return result;
	}

	/** 
	 * overridden:
	 * @Author      :      Administrator
	 * @Date        :      2014-9-14
	 * @see com.zigbee.function.dao.IMonitorPointDao#getAllMonitorPoints()
	**/
	@Override
	public List<MonitorPoint> getAllMonitorPoints() {
		String hql = "select mp from MonitorPoint mp";
		return this.getListByQuery(hql);
	}

}
