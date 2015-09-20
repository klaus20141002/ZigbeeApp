/************************************************************************************
 * @File name   :      LightSwitchServiceImpl.java
 *
 * @Author      :      Hasee
 *
 * @Date        :      2015年9月10日
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
 * 2015年9月10日 下午9:19:35			Hasee			1.0				Initial Version
 ************************************************************************************/
package com.zigbee.function.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zigbee.framework.common.exception.AppException;
import com.zigbee.framework.common.service.impl.BaseServiceImpl;
import com.zigbee.function.constant.ReportMgntConstants;
import com.zigbee.function.dao.ILightSwitchDao;
import com.zigbee.function.domain.LightSwitch;
import com.zigbee.function.dto.ControlInfoInputDto;
import com.zigbee.function.service.ILightSwitchService;

/**
 *
 */
@Transactional(rollbackFor = AppException.class)
@Service
public class LightSwitchServiceImpl  extends BaseServiceImpl implements ILightSwitchService{
	@Autowired
	private ILightSwitchDao lightSwitchDao ;

	/** 
	 * overridden:
	 * @Author      :      Hasee
	 * @Date        :      2015年9月10日
	 * @see com.zigbee.function.service.ILightSwitchService#controlInfoReport(com.zigbee.function.dto.ControlInfoInputDto)
	**/
	@Override
	public int controlInfoReport(ControlInfoInputDto dto) {
		LightSwitch obj = new LightSwitch() ;
		
		obj.setDataValue(dto.getData_value());
		obj.setType(dto.getType());
		obj.setUploadDate(new Date());
		return lightSwitchDao.save(obj)!=null?ReportMgntConstants.REPORT_SUCCESS:ReportMgntConstants.REPORT_FAILURE;
		
	}
	
	
	

}
