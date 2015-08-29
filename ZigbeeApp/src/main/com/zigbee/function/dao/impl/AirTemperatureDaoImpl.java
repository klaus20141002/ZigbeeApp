/************************************************************************************
 * @File name   :      AirTemperatureDaoImpl.java
 *
 * @Author      :      ZHWANG
 *
 * @Date        :      Aug 20, 2014
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
 * Aug 20, 2014 5:19:43 PM			ZHWANG			1.0				Initial Version
 ************************************************************************************/
package com.zigbee.function.dao.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.zigbee.framework.common.dao.impl.BaseIntDaoImpl;
import com.zigbee.function.dao.IAirTemperatureDao;
import com.zigbee.function.domain.AirTemperature;
import com.zigbee.function.dto.GreenhouseQueryDto;

/**
 *
 */
@Repository("airTemperatureDao")
public class AirTemperatureDaoImpl  extends BaseIntDaoImpl<AirTemperature, Integer> implements IAirTemperatureDao {

	/**
	 * @Author      :      ZHWANG
	 * @Date        :      Aug 20, 2014
	 * @param clazz
	 */
	@Inject 
	public AirTemperatureDaoImpl(@Value("com.zigbee.function.domain.AirTemperature") Class<AirTemperature> clazz) {
		super(clazz);
	}

	/** 
	 * overridden:
	 * @Author      :      ZHWANG
	 * @Date        :      Aug 21, 2014
	 * @see com.zigbee.function.dao.IAirTemperatureDao#getListByQueryDto(com.zigbee.function.dto.GreenhouseQueryDto)
	**/
	@Override
	public List<AirTemperature> getListByQueryDto(GreenhouseQueryDto queryDto) {
		StringBuffer hql = new StringBuffer();
		hql.append(" from AirTemperature where 1=1 ");
		String countHql="select count(id) ";
		if(queryDto.getEquipmentId()!=null){
			hql.append(" and equipmentId = ").append(queryDto.getEquipmentId());
		}
		if(queryDto.getPort()!=null){
			hql.append(" and port = ").append(queryDto.getPort());
		}
		String orderBy = " order by uploadDate desc " ; 
        return getListByQueryWithPaging(hql.toString() + orderBy, countHql+hql.toString(), queryDto.getPager());
	}

	/** 
	 * overridden:
	 * @Author      :      ZHWANG
	 * @Date        :      2014-9-15
	 * @see com.zigbee.function.dao.IAirTemperatureDao#getHoursListByEquipId(java.lang.Integer)
	**/
	@Override
	public List<AirTemperature> getHoursListByEquipId(Integer equipmentId) {
		String sql = "select t.* from air_temperature_tbl t where id in ( " + 
                     " SELECT min(id) FROM air_temperature_tbl where equipment_id = " + equipmentId + 
                     " and `timestamp`> curdate() " + 
                     " group by hour(`timestamp`)) order by `timestamp` asc " ;
		return this.getListByNativeQuery(sql);
	}

	
}
