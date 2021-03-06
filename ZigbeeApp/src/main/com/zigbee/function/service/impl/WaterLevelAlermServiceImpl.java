/************************************************************************************
 * @File name   :      WaterLevelAlermServiceImpl.java
 *
 * @Author      :      DUZHOU
 *
 * @Date        :      2015年8月30日
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
 * 2015年8月30日 下午3:19:08			DUZHOU			1.0				Initial Version
 ************************************************************************************/
package com.zigbee.function.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zigbee.framework.common.exception.AppException;
import com.zigbee.framework.common.service.impl.BaseServiceImpl;
import com.zigbee.function.service.IWaterLevelAlermService;

/**
 *
 */
@Transactional(rollbackFor = AppException.class)
@Service
public class WaterLevelAlermServiceImpl  extends BaseServiceImpl implements IWaterLevelAlermService {

	/** 
	 * overridden:
	 * @Author      :      DUZHOU
	 * @Date        :      2015年8月30日
	 * @see com.zigbee.function.service.IWaterLevelAlermService#waterLevelAlermReport()
	**/
	@Override
	public int waterLevelAlermReport() {
		// TODO Auto-generated method stub
		return 0;
	}

}
