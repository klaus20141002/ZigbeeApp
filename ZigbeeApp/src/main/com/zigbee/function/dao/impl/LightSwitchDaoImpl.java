/************************************************************************************
 * @File name   :      LightSwitchDaoImpl.java
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
 * Aug 21, 2014 10:06:52 AM			ZHWANG			1.0				Initial Version
 ************************************************************************************/
package com.zigbee.function.dao.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.zigbee.framework.common.dao.impl.BaseIntDaoImpl;
import com.zigbee.function.dao.ILightSwitchDao;
import com.zigbee.function.domain.LightSwitch;

/**
 *
 */
@Repository("lightSwitchDao")
public class LightSwitchDaoImpl extends BaseIntDaoImpl<LightSwitch, Integer>
		implements ILightSwitchDao {

	/**
	 * @Author      :      ZHWANG
	 * @Date        :      Aug 21, 2014
	 * @param clazz
	 */
	@Inject
	public LightSwitchDaoImpl(@Value("com.zigbee.function.domain.LightSwitch") Class<LightSwitch> clazz) {
		super(clazz);
	}

	/** 
	 * overridden:
	 * @Author      :      ZHWANG
	 * @Date        :      2014-9-11
	 * @see com.zigbee.function.dao.ILightSwitchDao#getEntityByEquipmentId(java.lang.Integer)
	**/
	@Override
	public LightSwitch getEntityByEquipmentId(Integer equipmentId) {
		List<LightSwitch> results = getListByQueryWithVaParam(" from LightSwitch where equipmentId = ?1 ", equipmentId);
		if(results!=null && results.size()>0){
			return results.get(0);
		}
		return null;
	}

}
