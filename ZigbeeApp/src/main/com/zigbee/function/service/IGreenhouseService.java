/************************************************************************************
 * @File name   :      IGreenhouseService.java
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
 * Aug 21, 2014 3:33:02 PM			ZHWANG			1.0				Initial Version
 ************************************************************************************/
package com.zigbee.function.service;

import java.util.List;

import com.zigbee.framework.common.service.IBaseService;
import com.zigbee.function.domain.CfgLightTrigger;
import com.zigbee.function.domain.MonitorPoint;
import com.zigbee.function.dto.CascadeCfgEditDto;
import com.zigbee.function.dto.ChartSeriesDto;
import com.zigbee.function.dto.EquipSwitchScheduleEditDto;
import com.zigbee.function.dto.EquipmentResultDto;
import com.zigbee.function.dto.GreenhouseQueryDto;
import com.zigbee.function.dto.GreenhouseResultDto;
import com.zigbee.function.dto.LightTriggerMasterDto;
import com.zigbee.function.dto.MonitorDetailDto;
import com.zigbee.function.dto.ThresholdMasterDto;
import com.zigbee.function.dto.VideoMessagesDto;
import com.zigbee.function.dto.WarningMessagesDto;

/**
 *
 */
public interface IGreenhouseService extends IBaseService {
	
	List<GreenhouseResultDto> getListByDto(GreenhouseQueryDto queryDto);
	
	/**
	 * 获得监控列表，以及监控值，
	 * 本方法以监控列表为基准，取最新的检测值。最后更新日期取光照度。
	 * @Author      :      ZHWANG
	 * @Date        :      2014-9-9
	 * @param queryDto
	 * @return
	 */
	List<GreenhouseResultDto> getMonitorResultListByDto(GreenhouseQueryDto queryDto);

	/**
	 * 获得控制设备列表（不包含采集器），根据所属监测点id
	 * @Author      :      ZHWANG
	 * @Date        :      2014-9-10
	 * @param equipmentId
	 * @return
	 */
	List<EquipmentResultDto> getControlEquipListByMonitorId(Integer monitorPointId);

	/**
	 * 更新开关状态，控制数据
	 * @Author      :      ZHWANG
	 * @Date        :      2014-9-11
	 * @param equipmentId
	 * @param switchOnoff
	 * @return
	 */
	boolean updateSwtichOnOff(Integer equipmentId, Integer switchOnoff);

	/**
	 * save cascade config to db
	 * @Author      :      ZHWANG
	 * @Date        :      2014-9-11
	 * @param editDto
	 * @return
	 */
	boolean saveCascadeCfg(CascadeCfgEditDto editDto);

	/**
	 * get cascade dto
	 * @Author      :      ZHWANG
	 * @Date        :      2014-9-11
	 * @return
	 */
	CascadeCfgEditDto getCascadeCfgDto();

	/**
	 * 
	 * @Author      :      ZHWANG
	 * @Date        :      2014-9-13
	 * @return
	 */
	boolean switchOnoffOnSchedule();
	
	/**
	 * 
	 * @Author      :      YIFEGU
	 * @Date        :      2014-9-14
	 * @return
	 */
	List<MonitorPoint> getAllMonitorPoints();
	
	/**
	 * 
	 * @Author      :      YIFEGU
	 * @Date        :      2014-9-14
	 * @param monitorPointId
	 * @param monitorName
	 * @return
	 */
	List<EquipmentResultDto> getControlEquipListByMonitorId(
			Integer monitorPointId,String monitorName);
	
	/**
	 * 
	 * @Author      :      YIFEGU
	 * @Date        :      Sep 15, 2014
	 * @param fetchType
	 * @param monitorPointId
	 * @return
	 */
	List<ChartSeriesDto> getTemperatureChart(int fetchType, Integer monitorPointId);
	
	/**
	 * 获得某采集设备今天温度数据，按小时
	 * @Author      :      ZHWANG
	 * @Date        :      2014-9-15
	 * @param equipmentId
	 * @return
	 */
	ChartSeriesDto getDailyTemperatureChart(Integer equipmentId);
	/**
	 * 获得某采集设备今天air wetness数据，按小时
	 * @Author      :      ZHWANG
	 * @Date        :      2014-9-15
	 * @param equipmentId
	 * @return
	 */
	ChartSeriesDto getDailyAirWetnessChart(Integer equipmentId);
	/**
	 * 获得某采集设备今天光照数据，按小时
	 * @Author      :      ZHWANG
	 * @Date        :      2014-9-15
	 * @param equipmentId
	 * @return
	 */
	ChartSeriesDto getDailyLightChart(Integer equipmentId);
	/**
	 * @Author      :      GUDONG
	 * @Date        :      2015年8月31日
	 * @param equipmentId
	 * @return
	 */
	ChartSeriesDto getDailyCo2Chart(Integer equipmentId);
	/**
	 * @Author      :      ZHWANG
	 * @Date        :      2014-9-17
	 * @return
	 */
	EquipSwitchScheduleEditDto getEquipSwitchScheduleEditDto();

	/**
	 * @Author      :      ZHWANG
	 * @Date        :      2014-9-17
	 * @param editDto
	 * @return
	 */
	boolean saveEquipSwitchSchedule(EquipSwitchScheduleEditDto editDto);

	/**
	 * @Author      :      ZHWANG
	 * @Date        :      2015-1-16
	 * @return
	 */
	ThresholdMasterDto getThresholdConfigDto(Integer cfgType);

	/**
	 * @Author      :      ZHWANG
	 * @Date        :      2015-1-16
	 * @param editDto
	 * @return
	 */
	boolean saveThresholdConfig(ThresholdMasterDto editDto);

	/**
	 * @Author      :      ZHWANG
	 * @Date        :      2015-1-16
	 * @return
	 */
	LightTriggerMasterDto getLightTriggerConfigDto();

	/**
	 * @Author      :      ZHWANG
	 * @Date        :      2015-1-16
	 * @param editDto
	 * @return
	 */
	boolean saveLightTriggerConfig(LightTriggerMasterDto editDto);
	
	/**
	 * 获得某时刻的标准值
	 * @Author      :      ZHWANG
	 * @Date        :      2015-1-19
	 * @param cfgType
	 * @param hour
	 * @param minute
	 * @return
	 */
	float getStandardByTime(Integer cfgType, Integer hour, Integer minute);
	
	/**
	 * 获得光照度在某时刻的标准值
	 * @Author      :      ZHWANG
	 * @Date        :      2015-1-19
	 * @param hour
	 * @param minute
	 * @return
	 */
	CfgLightTrigger getLightStardardByTime(Integer hour, Integer minute);
	
	/**
	 * 获得当前的行为值
	 * @Author      :      ZHWANG
	 * @Date        :      2015-1-19
	 * @param cfgType
	 * @param curValue
	 * @return
	 */
	Integer getCurrentActionByType(Integer cfgType, Float curValue);
	
	/**
	 * 定时任务
	 * @Author      :      ZHWANG
	 * @Date        :      2015-1-19
	 * @return
	 */
	boolean autoTriggerOnSchedule();

	/**
	 * @Author      :      ZHWANG
	 * @Date        :      2015-2-1
	 * @return
	 */
	MonitorDetailDto getMonitorDetailDtoByCode(String monitorCode);

	/**
	 * @Author      :      ZHWANG
	 * @Date        :      2015-2-2
	 * @return
	 */
	EquipSwitchScheduleEditDto getControlModeDto();

	/**
	 * @Author      :      ZHWANG
	 * @Date        :      2015-2-2
	 * @param editDto
	 * @return
	 */
	boolean saveSysControlMode(EquipSwitchScheduleEditDto editDto);
	/**
	 * @Author      :      GUDONG
	 * @Date        :      2015年8月30日
	 * @return
	 */
	List<WarningMessagesDto> getAllWarningMessages();
	/**
	 * @Author      :      GUDONG
	 * @Date        :      2015年8月30日
	 * @return
	 */
	List<VideoMessagesDto> getAllVideoMessages();
}
