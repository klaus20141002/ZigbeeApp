/************************************************************************************
 * @File name   :      LightDaoImpl.java
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
 * Aug 21, 2014 9:55:57 AM			ZHWANG			1.0				Initial Version
 ************************************************************************************/
package com.zigbee.function.dao.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.zigbee.framework.common.dao.impl.BaseIntDaoImpl;
import com.zigbee.function.dao.ILightDao;
import com.zigbee.function.domain.Light;

/**
 *
 */
@Repository("lightDao")
public class LightDaoImpl extends BaseIntDaoImpl<Light, Integer> implements
		ILightDao {

	/**
	 * @Author      :      ZHWANG
	 * @Date        :      Aug 21, 2014
	 * @param clazz
	 */
	@Inject
	public LightDaoImpl(@Value("com.zigbee.function.domain.Light") Class<Light> clazz) {
		super(clazz);
	}

	/** 
	 * overridden:
	 * @Author      :      ZHWANG
	 * @Date        :      2014-9-15
	 * @see com.zigbee.function.dao.ILightDao#getHoursListByEquipId(java.lang.Integer)
	**/
	@Override
	public List<Light> getHoursListByEquipId(Integer equipmentId) {
		String sql = "select t.* from light_tbl t where id in ( " + 
        " SELECT min(id) FROM light_tbl where equipment_id = " + equipmentId + 
        " and `timestamp`> curdate() " + 
        " group by hour(`timestamp`)) order by `timestamp` asc " ;
		return this.getListByNativeQuery(sql);
	}

}
