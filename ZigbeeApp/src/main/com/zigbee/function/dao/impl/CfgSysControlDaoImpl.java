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
import com.zigbee.function.constant.GreenhouseCommonConstants;
import com.zigbee.function.dao.ICfgSysControlDao;
import com.zigbee.function.domain.CfgSysControl;

/**
 *
 */
@Repository("cfgSysControlDao")
public class CfgSysControlDaoImpl extends BaseIntDaoImpl<CfgSysControl, Integer> implements
		ICfgSysControlDao {

	/**
	 * @Author      :      ZHWANG
	 * @Date        :      Aug 21, 2014
	 * @param clazz
	 */
	@Inject
	public CfgSysControlDaoImpl(@Value("com.zigbee.function.domain.CfgSysControl") Class<CfgSysControl> clazz) {
		super(clazz);
	}

	/** 
	 * overridden:
	 * @Author      :      ZHWANG
	 * @Date        :      2015-1-20
	 * @see com.zigbee.function.dao.ICfgSysControlDao#getCurControlMode()
	**/
	@Override
	public Integer getCurControlMode() {
		List<CfgSysControl> list = this.getListByQuery(" from CfgSysControl ");
		if(list==null || list.size()==0){
			return GreenhouseCommonConstants.SYSCONTROL_MODE_AUTO;
		}
		return list.get(0).getCurMode();
	}

	
}
