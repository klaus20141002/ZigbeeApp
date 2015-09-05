/************************************************************************************
 * @File name   :      WarningDaoImpl.java
 *
 * @Author      :      DUZHOU
 *
 * @Date        :      2015年9月1日
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
 * 2015年9月1日 下午11:28:30			DUZHOU			1.0				Initial Version
 ************************************************************************************/
package com.zigbee.function.dao.impl;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.zigbee.framework.common.dao.impl.BaseIntDaoImpl;
import com.zigbee.function.dao.IWarningDao;
import com.zigbee.function.domain.Warning;


/**
 *
 */
@Repository("warningDao")
public class WarningDaoImpl extends BaseIntDaoImpl<Warning, Integer> implements IWarningDao {

	/**
	 * @Author      :      DUZHOU
	 * @Date        :      2015年9月1日
	 * @param clazz
	 */
	@Inject
	public WarningDaoImpl(@Value("com.zigbee.function.domain.Warning") Class<Warning> clazz) {
		super(clazz);
	}

	
}
