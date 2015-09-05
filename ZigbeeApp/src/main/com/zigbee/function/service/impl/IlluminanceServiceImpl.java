/************************************************************************************
 * @File name   :      IlluminanceServiceImpl.java
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
 * 2015年8月30日 下午3:17:02			DUZHOU			1.0				Initial Version
 ************************************************************************************/
package com.zigbee.function.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zigbee.framework.common.exception.AppException;
import com.zigbee.framework.common.service.impl.BaseServiceImpl;
import com.zigbee.function.constant.ReportMgntConstants;
import com.zigbee.function.dao.ILightDao;
import com.zigbee.function.domain.Light;
import com.zigbee.function.dto.IIlluminanceInputDto;
import com.zigbee.function.service.IIlluminanceService;

/**
 *
 */
@Transactional(rollbackFor = AppException.class)
@Service
public class IlluminanceServiceImpl extends BaseServiceImpl implements IIlluminanceService {
	@Autowired
	private ILightDao lightDao ;
	/** 
	 * overridden:
	 * @Author      :      DUZHOU
	 * @Date        :      2015年8月30日
	 * @see com.zigbee.function.service.IIlluminanceService#reportIIlluminance(com.zigbee.function.dto.IIlluminanceInputDto)
	**/
	@Override
	public int reportIIlluminance(IIlluminanceInputDto dto) {
		Light light = new Light() ;
		light.setDataValue(dto.getIlluminance_val());
		light.setUploadDate(new Date());
		
		return lightDao.save(light)!=null?ReportMgntConstants.REPORT_SUCCESS:ReportMgntConstants.REPORT_FAILURE;
	}

}
