/************************************************************************************
 * @File name   :      TriggerSettingDaoImpl.java
 *
 * @Author      :      ZHWANG
 *
 * @Date        :      2014-9-8
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
 * 2014-9-8 下午05:10:19			ZHWANG			1.0				Initial Version
 ************************************************************************************/
package com.zigbee.function.dao.impl;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.zigbee.framework.common.dao.impl.BaseIntDaoImpl;
import com.zigbee.function.dao.ICozDao;
import com.zigbee.function.domain.Coz;

/**
 *
 */
@Repository("cozDao")
public class CozDaoImpl extends
		BaseIntDaoImpl<Coz, Integer> implements ICozDao {

	/**
	 * @Author      :      ZHWANG
	 * @Date        :      2014-9-8
	 * @param clazz
	 */
	@Inject
	public CozDaoImpl(@Value("com.zigbee.function.domain.Coz") Class<Coz> clazz) {
		super(clazz);
	}

}
