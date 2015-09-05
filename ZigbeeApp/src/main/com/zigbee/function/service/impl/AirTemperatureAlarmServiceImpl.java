/************************************************************************************
 * @File name   :      TemperatureAlarmServiceImpl.java
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
 * 2015年8月30日 下午3:18:01			DUZHOU			1.0				Initial Version
 ************************************************************************************/
package com.zigbee.function.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zigbee.framework.common.exception.AppException;
import com.zigbee.framework.common.service.impl.BaseServiceImpl;
import com.zigbee.function.constant.ReportMgntConstants;
import com.zigbee.function.dao.IAirTemperatureDao;
import com.zigbee.function.domain.AirTemperature;
import com.zigbee.function.dto.AirTemperatureAlarmInputDto;
import com.zigbee.function.service.IAirTemperatureAlarmService;

/**
 *
 */
@Transactional(rollbackFor = AppException.class)
@Service
public class AirTemperatureAlarmServiceImpl extends BaseServiceImpl implements IAirTemperatureAlarmService {
	@Autowired
	private IAirTemperatureDao airTemperatureDao ;
	/** 
	 * overridden:
	 * @Author      :      DUZHOU
	 * @Date        :      2015年8月30日
	 * @see com.zigbee.function.service.IAirTemperatureAlarmService#temperatureAlarmReport()
	**/
	@Override
	public int temperatureAlarmReport(AirTemperatureAlarmInputDto dto) {
		AirTemperature airTemperature = new AirTemperature() ;
		airTemperature.setDataValue(Float.valueOf(dto.getTemp_val()));
		airTemperature.setUploadDate(new Date());
		airTemperature.setEquipmentId(1);
		return airTemperatureDao.save(airTemperature)!=null?ReportMgntConstants.REPORT_SUCCESS:ReportMgntConstants.REPORT_FAILURE;
	}

}
