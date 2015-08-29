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
import com.zigbee.function.dao.ICfgLightTriggerDao;
import com.zigbee.function.domain.CfgLightTrigger;

/**
 *
 */
@Repository("cfgLightTriggerDao")
public class CfgLightTriggerDaoImpl extends BaseIntDaoImpl<CfgLightTrigger, Integer> implements
		ICfgLightTriggerDao {

	/**
	 * @Author      :      ZHWANG
	 * @Date        :      Aug 21, 2014
	 * @param clazz
	 */
	@Inject
	public CfgLightTriggerDaoImpl(@Value("com.zigbee.function.domain.CfgLightTrigger") Class<CfgLightTrigger> clazz) {
		super(clazz);
	}

	/** 
	 * overridden:
	 * @Author      :      ZHWANG
	 * @Date        :      2015-1-19
	 * @see com.zigbee.function.dao.ICfgLightTriggerDao#getAllLightTriggerCfg()
	**/
	@Override
	public List<CfgLightTrigger> getAllLightTriggerCfg() {
		String hql = " from CfgLightTrigger order by id asc";
		return this.getListByQueryWithVaParam(hql);
	}

	/** 
	 * overridden:
	 * @Author      :      ZHWANG
	 * @Date        :      2015-1-20
	 * @see com.zigbee.function.dao.ICfgLightTriggerDao#queryEffectiveTriggerList(java.lang.Integer, java.lang.Integer)
	**/
	@Override
	public List<CfgLightTrigger> queryEffectiveTriggerList(Integer hour,
			Integer minute) {
		if(hour==null){
			hour = 0;
		}
		if(minute==null){
			minute = 0;
		}
		String hql = " from CfgLightTrigger where ?1 >= fromHour*60 + fromMinute and ?1< toHour*60 + toMinute  order by id asc";
		return this.getListByQueryWithVaParam(hql, hour*60 + minute);
	}

}
