/************************************************************************************
 * @File name   :      AirWetnessDaoImpl.java
 *
 * @Author      :      ZHWANG
 *
 * @Date        :      Aug 21, 2014
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
 * Aug 21, 2014 9:50:31 AM			ZHWANG			1.0				Initial Version
 ************************************************************************************/
package com.zigbee.function.dao.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.zigbee.framework.common.dao.impl.BaseIntDaoImpl;
import com.zigbee.function.dao.IAirWetnessDao;
import com.zigbee.function.domain.AirWetness;

/**
 *
 */
@Repository("airWetnessDao")
public class AirWetnessDaoImpl extends BaseIntDaoImpl<AirWetness, Integer>
		implements IAirWetnessDao {

	/**
	 * @Author      :      ZHWANG
	 * @Date        :      Aug 21, 2014
	 * @param clazz
	 */
	@Inject
	public AirWetnessDaoImpl(@Value("com.zigbee.function.domain.AirWetness") Class<AirWetness> clazz) {
		super(clazz);
	}

	/** 
	 * overridden:
	 * @Author      :      ZHWANG
	 * @Date        :      2014-9-15
	 * @see com.zigbee.function.dao.IAirWetnessDao#getHoursListByEquipId(java.lang.Integer)
	**/
	@Override
	public List<AirWetness> getHoursListByEquipId(Integer equipmentId) {
		String sql = "select t.* from air_wetness_tbl t where id in ( " + 
        " SELECT min(id) FROM air_wetness_tbl where equipment_id = " + equipmentId + 
        " and `timestamp`> curdate() " + 
        " group by hour(`timestamp`)) order by `timestamp` asc " ;
		return this.getListByNativeQuery(sql);
	}

}
