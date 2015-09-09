/************************************************************************************
 * @File name   :      ReportMgntController.java
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
 * 2015年8月30日 下午12:14:14			DUZHOU			1.0				Initial Version
 ************************************************************************************/
package com.zigbee.function.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.zigbee.function.constant.WarningConstants;
import com.zigbee.function.dto.AirTemperatureReportInputDto;
import com.zigbee.function.dto.AirTemperatureSettingDto;
import com.zigbee.function.dto.CozInputDto;
import com.zigbee.function.dto.CozThresholdDto;
import com.zigbee.function.dto.IIlluminanceInputDto;
import com.zigbee.function.dto.IlluminanceThresholdDto;
import com.zigbee.function.dto.ReportResultDto;
import com.zigbee.function.dto.WarningInputDto;
import com.zigbee.function.service.IAirTemperatureAlarmService;
import com.zigbee.function.service.IAirTemperatureService;
import com.zigbee.function.service.ICfgThresholdService;
import com.zigbee.function.service.ICozService;
import com.zigbee.function.service.IIlluminanceService;
import com.zigbee.function.service.IWarningService;

/**
 *
 */
@Controller
@RequestMapping(value = "/mgnt")
public class ReportMgntController {
	@Autowired
	private IAirTemperatureService airTemperatureService ;
	@Autowired
	private ICozService cozService ;
	@Autowired
	private IIlluminanceService illuminanceService ;
	@Autowired
	private IAirTemperatureAlarmService airTemperatureAlarmService ;
	@Autowired
	private IWarningService warningService ;
	
	@Autowired
	private ICfgThresholdService cfgThresholdService ;
	/*
	 * temperature report
	 */
	@RequestMapping(value = "/temperature/report")
	@ResponseBody
    public ReportResultDto airTemperatureReport(@RequestBody String query) {
		ReportResultDto result = new ReportResultDto();
		AirTemperatureReportInputDto queryDto = JSON.parseObject(query, AirTemperatureReportInputDto.class);
		int i = airTemperatureService.reportAirTemperature(queryDto);
		result.setErr_code(i);
	    return result;
    }
	
	
	@RequestMapping(value = "/temperature/threshold")
	@ResponseBody
    public AirTemperatureSettingDto airTemperatureReport() {
		AirTemperatureSettingDto result = new AirTemperatureSettingDto();
		result.setTemp_threshold(cfgThresholdService.getThreshold(WarningConstants.THRESHOLD_TEMP).intValue());
		result.setHum_threshold(cfgThresholdService.getThreshold(WarningConstants.THRESHOLD_HUM).intValue());
	    return result;
    }
	
	/*
	 * co2 report
	 */
	@RequestMapping(value = "/co2/report")
	@ResponseBody
    public ReportResultDto cozReport(@RequestBody String query) {
		ReportResultDto result = new ReportResultDto();
		CozInputDto queryDto = JSON.parseObject(query, CozInputDto.class);
		int i = cozService.reportCoz(queryDto);
		result.setErr_code(i);
	    return result;
    }
	
	@RequestMapping(value = "/co2/threshold")
	@ResponseBody
    public CozThresholdDto cozThreshold(@RequestBody String query) {
		CozThresholdDto result = new CozThresholdDto();
		result.setCo2_threshold(cfgThresholdService.getThreshold(WarningConstants.THRESHOLD_COZ).intValue());
	    return result;
    }
	/*
	 * illuminance report 光照
	 */
	@RequestMapping(value = "/illuminance/report")
	@ResponseBody
    public ReportResultDto illuminanceReport(@RequestBody String query) {
		ReportResultDto result = new ReportResultDto();
		IIlluminanceInputDto queryDto = JSON.parseObject(query, IIlluminanceInputDto.class);
		int i = illuminanceService.reportIIlluminance(queryDto);
		result.setErr_code(i);
	    return result;
    }

	/*
	 * illuminance report 光照
	 */
	@RequestMapping(value = "/illuminance/threshold")
	@ResponseBody
    public IlluminanceThresholdDto illuminanceThreshold() {
    	IlluminanceThresholdDto result = new IlluminanceThresholdDto();
//		IIlluminanceInputDto queryDto = JSON.parseObject(query, IIlluminanceInputDto.class);
//		int i = illuminanceService.reportIIlluminance(queryDto);
//		result.setErr_code(i);
	    return result;
    }
	
	
	/**
	 * water_level alarm_report
	 */
	@RequestMapping(value = "alarmReport")
	@ResponseBody
    public ReportResultDto waterLevelAlarmReport(@RequestBody String query) {
		ReportResultDto result = new ReportResultDto();
		WarningInputDto queryDto = JSON.parseObject(query, WarningInputDto.class);
		int i = warningService.alermReport(queryDto);
		result.setErr_code(i);
	    return result;
    }

}
