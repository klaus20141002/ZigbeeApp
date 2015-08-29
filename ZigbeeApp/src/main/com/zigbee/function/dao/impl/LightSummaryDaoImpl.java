/************************************************************************************
 * @File name   :      LightSummaryDaoImpl.java
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
 * Aug 21, 2014 10:03:15 AM			ZHWANG			1.0				Initial Version
 ************************************************************************************/
package com.zigbee.function.dao.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.zigbee.framework.common.dao.impl.BaseIntDaoImpl;
import com.zigbee.function.dao.ILightSummaryDao;
import com.zigbee.function.domain.LightSummary;

/**
 *
 */
@Repository("lightSummaryDao")
public class LightSummaryDaoImpl extends BaseIntDaoImpl<LightSummary, Integer>
		implements ILightSummaryDao {

	/**
	 * @Author      :      ZHWANG
	 * @Date        :      Aug 21, 2014
	 * @param clazz
	 */
	@Inject
	public LightSummaryDaoImpl(@Value("com.zigbee.function.domain.LightSummary") Class<LightSummary> clazz) {
		super(clazz);
	}

	/** 
	 * overridden:
	 * @Author      :      ZHWANG
	 * @Date        :      2014-9-17
	 * @see com.zigbee.function.dao.ILightSummaryDao#getLightSummaryByEquipId(java.lang.Integer)
	**/
	@Override
	public LightSummary getLightSummaryByEquipId(Integer equipId) {
	 List<LightSummary> list = getListByQueryWithVaParam(" from LightSummary where equipmentId=?1 ", equipId);
	 if(list!=null && list.size()>0){
		 return list.get(0);
	 }
	 return null;
	}
	
	

}
