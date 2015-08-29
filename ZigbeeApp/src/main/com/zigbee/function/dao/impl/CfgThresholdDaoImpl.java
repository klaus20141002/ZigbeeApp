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
import com.zigbee.function.dao.ICfgThresholdDao;
import com.zigbee.function.domain.CfgThreshold;

/**
 *
 */
@Repository("cfgThresholdDao")
public class CfgThresholdDaoImpl extends BaseIntDaoImpl<CfgThreshold, Integer> implements
		ICfgThresholdDao {

	/**
	 * @Author      :      ZHWANG
	 * @Date        :      Aug 21, 2014
	 * @param clazz
	 */
	@Inject
	public CfgThresholdDaoImpl(@Value("com.zigbee.function.domain.CfgThreshold") Class<CfgThreshold> clazz) {
		super(clazz);
	}

	/** 
	 * overridden:
	 * @Author      :      ZHWANG
	 * @Date        :      2015-1-18
	 * @see com.zigbee.function.dao.ICfgThresholdDao#queryListByType(java.lang.Integer, java.lang.Integer)
	**/
	@Override
	public List<CfgThreshold> queryListByType(Integer cfgType,
			Integer isConstant) {
		String hql = " from CfgThreshold where cfgType = ?1 and isConstant = ?2 order by id asc ";
		return this.getListByQueryWithVaParam(hql, cfgType, isConstant);
	}

	/** 
	 * overridden:
	 * @Author      :      ZHWANG
	 * @Date        :      2015-1-19
	 * @see com.zigbee.function.dao.ICfgThresholdDao#queryVariantListByType(java.lang.Integer)
	**/
	@Override
	public List<CfgThreshold> queryVariantListByType(Integer cfgType) {
		String hql = " from CfgThreshold where cfgType = ?1 and isConstant = 0 and cfgHour+cfgMinute>0 order by id asc ";
		return this.getListByQueryWithVaParam(hql, cfgType);
	}
}
