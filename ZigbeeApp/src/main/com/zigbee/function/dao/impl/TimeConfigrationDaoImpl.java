/************************************************************************************
 * @File name   :      TimeConfigrationDaoImpl.java
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
 * Aug 21, 2014 10:09:42 AM			ZHWANG			1.0				Initial Version
 ************************************************************************************/
package com.zigbee.function.dao.impl;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.zigbee.framework.common.dao.impl.BaseIntDaoImpl;
import com.zigbee.function.dao.ITimeConfigrationDao;
import com.zigbee.function.domain.TimeConfigration;

/**
 *
 */
@Repository("timeConfigrationDao")
public class TimeConfigrationDaoImpl extends
		BaseIntDaoImpl<TimeConfigration, Integer> implements
		ITimeConfigrationDao {

	/**
	 * @Author      :      ZHWANG
	 * @Date        :      Aug 21, 2014
	 * @param clazz
	 */
	@Inject
	public TimeConfigrationDaoImpl(@Value("com.zigbee.function.domain.TimeConfigration") Class<TimeConfigration> clazz) {
		super(clazz);
	}

}
