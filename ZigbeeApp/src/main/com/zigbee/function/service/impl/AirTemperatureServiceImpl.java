/************************************************************************************
 * @File name   :      AirTemperatureServiceImpl.java
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
 * 2015年8月30日 下午12:22:07			DUZHOU			1.0				Initial Version
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
import com.zigbee.function.dao.IAirWetnessDao;
import com.zigbee.function.domain.AirTemperature;
import com.zigbee.function.domain.AirWetness;
import com.zigbee.function.dto.AirTemperatureReportInputDto;
import com.zigbee.function.dto.AirTemperatureSettingDto;
import com.zigbee.function.service.IAirTemperatureService;

/**
 *
 */
@Transactional(rollbackFor = AppException.class)
@Service
public class AirTemperatureServiceImpl extends BaseServiceImpl implements IAirTemperatureService {
	
	@Autowired
	private IAirTemperatureDao airTemperatureDao ;
	@Autowired
	private IAirWetnessDao airWetnessDao ;

	/** 
	 * overridden:
	 * @Author      :      DUZHOU
	 * @Date        :      2015年8月30日
	 * @see com.zigbee.function.service.ICozService#reportAirTemperature()
	**/
	@Override
	public int reportAirTemperature(AirTemperatureReportInputDto dto) {
		AirTemperature airTemperature  = new AirTemperature() ;
		
		AirWetness airWetness =  new AirWetness() ;
		airTemperature.setUploadDate(new Date());
		airTemperature.setEquipmentId(1);
		airWetness.setUploadDate(new Date());
		airWetness.setEquipmentId(1);
		return airTemperatureDao.save(airTemperature)!=null&&airWetnessDao.save(airWetness)!=null?ReportMgntConstants.REPORT_SUCCESS:ReportMgntConstants.REPORT_FAILURE;
	}

	/** 
	 * overridden:
	 * @Author      :      DUZHOU
	 * @Date        :      2015年8月30日
	 * @see com.zigbee.function.service.IAirTemperatureService#airTemperatureAndWetSetting()
	**/
	@Override
	public AirTemperatureSettingDto airTemperatureAndWetSetting() {
		AirTemperatureSettingDto result = new AirTemperatureSettingDto( ) ;
		
		
		return result;
	}
	
	
	
	
	
	
	
	
	
}
