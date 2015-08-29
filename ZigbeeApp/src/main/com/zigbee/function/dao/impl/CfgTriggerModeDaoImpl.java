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
import com.zigbee.function.dao.ICfgTriggerModeDao;
import com.zigbee.function.domain.CfgTriggerMode;

/**
 *
 */
@Repository("cfgTriggerModeDao")
public class CfgTriggerModeDaoImpl extends BaseIntDaoImpl<CfgTriggerMode, Integer> implements
		ICfgTriggerModeDao {

	/**
	 * @Author      :      ZHWANG
	 * @Date        :      Aug 21, 2014
	 * @param clazz
	 */
	@Inject
	public CfgTriggerModeDaoImpl(@Value("com.zigbee.function.domain.CfgTriggerMode") Class<CfgTriggerMode> clazz) {
		super(clazz);
	}

	/** 
	 * overridden:
	 * @Author      :      ZHWANG
	 * @Date        :      2015-1-18
	 * @see com.zigbee.function.dao.ICfgTriggerModeDao#queryListByType(java.lang.Integer)
	**/
	@Override
	public List<CfgTriggerMode> queryListByType(Integer cfgType) {
		String hql = " from CfgTriggerMode where cfgType =?1 ";
		return this.getListByQueryWithVaParam(hql, cfgType);
	}

}
