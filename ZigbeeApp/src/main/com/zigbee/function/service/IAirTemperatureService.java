/************************************************************************************
 * @File name   :      IAirTemperatureService.java
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
 * 2015年8月30日 下午12:21:50			DUZHOU			1.0				Initial Version
 ************************************************************************************/
package com.zigbee.function.service;

import com.zigbee.function.dto.AirTemperatureReportInputDto;
import com.zigbee.function.dto.AirTemperatureSettingDto;

/**
 *
 */
public interface IAirTemperatureService {
	
	
	public int reportAirTemperature(AirTemperatureReportInputDto dto) ;
	
	public AirTemperatureSettingDto airTemperatureAndWetSetting() ;
	
}
