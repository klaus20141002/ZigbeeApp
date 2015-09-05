/************************************************************************************
 * @File name   :      GreenhouseServiceImpl.java
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
 * Aug 21, 2014 3:34:01 PM			ZHWANG			1.0				Initial Version
 ************************************************************************************/
package com.zigbee.function.service.impl;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zigbee.framework.common.exception.AppException;
import com.zigbee.framework.common.service.impl.BaseServiceImpl;
import com.zigbee.framework.common.util.DateUtil;
import com.zigbee.framework.common.util.TriggerSettingConvertUtil;
import com.zigbee.framework.common.util.Utils;
import com.zigbee.function.constant.GreenhouseCommonConstants;
import com.zigbee.function.dao.IAirTemperatureDao;
import com.zigbee.function.dao.IAirWetnessDao;
import com.zigbee.function.dao.ICfgLightTriggerDao;
import com.zigbee.function.dao.ICfgSysControlDao;
import com.zigbee.function.dao.ICfgThresholdDao;
import com.zigbee.function.dao.ICfgTriggerModeDao;
import com.zigbee.function.dao.ICo2ConcentrationDao;
import com.zigbee.function.dao.IEquipmentDao;
import com.zigbee.function.dao.ILightDao;
import com.zigbee.function.dao.ILightSummaryDao;
import com.zigbee.function.dao.ILightSwitchDao;
import com.zigbee.function.dao.IMonitorPointDao;
import com.zigbee.function.dao.ITimeConfigrationDao;
import com.zigbee.function.dao.ITriggerSettingDao;
import com.zigbee.function.dao.IVideoMessagesDao;
import com.zigbee.function.dao.IWarningMessagesDao;
import com.zigbee.function.domain.AirTemperature;
import com.zigbee.function.domain.AirWetness;
import com.zigbee.function.domain.CfgLightTrigger;
import com.zigbee.function.domain.CfgSysControl;
import com.zigbee.function.domain.CfgThreshold;
import com.zigbee.function.domain.CfgTriggerMode;
import com.zigbee.function.domain.Co2Concentration;
import com.zigbee.function.domain.Equipment;
import com.zigbee.function.domain.Light;
import com.zigbee.function.domain.LightSummary;
import com.zigbee.function.domain.LightSwitch;
import com.zigbee.function.domain.MonitorPoint;
import com.zigbee.function.domain.TriggerSetting;
import com.zigbee.function.domain.VideoMessages;
import com.zigbee.function.domain.WarningMessages;
import com.zigbee.function.dto.CascadeCfgEditDto;
import com.zigbee.function.dto.ChartSeriesDto;
import com.zigbee.function.dto.EquipSwitchScheduleEditDto;
import com.zigbee.function.dto.EquipmentResultDto;
import com.zigbee.function.dto.GreenhouseQueryDto;
import com.zigbee.function.dto.GreenhouseResultDto;
import com.zigbee.function.dto.LightTriggerItemDto;
import com.zigbee.function.dto.LightTriggerMasterDto;
import com.zigbee.function.dto.MonitorDetailDto;
import com.zigbee.function.dto.ThresholdItemDto;
import com.zigbee.function.dto.ThresholdMasterDto;
import com.zigbee.function.dto.VideoMessagesDto;
import com.zigbee.function.dto.WarningMessagesDto;
import com.zigbee.function.service.IGreenhouseService;

/**
 *
 */
@Transactional(rollbackFor = AppException.class)
@Service("greenhouseService")
public class GreenhouseServiceImpl extends BaseServiceImpl implements
		IGreenhouseService {
	
	@Resource(name = "airTemperatureDao")
	private IAirTemperatureDao airTemperatureDao;

	@Resource(name = "airWetnessDao")
	private IAirWetnessDao airWetnessDao;
	
	@Resource(name = "lightDao")
	private ILightDao lightDao;
	
	@Resource(name = "lightSummaryDao")
	private ILightSummaryDao lightSummaryDao;
	
	@Resource(name = "lightSwitchDao")
	private ILightSwitchDao lightSwitchDao;
	
	@Resource(name = "timeConfigrationDao")
	private ITimeConfigrationDao timeConfigrationDao;
	
	@Resource(name = "monitorPointDao")
	private IMonitorPointDao monitorPointDao;
	
	@Resource(name = "equipmentDao")
	private IEquipmentDao equipmentDao;
	
	@Resource(name = "triggerSettingDao")
	private ITriggerSettingDao triggerSettingDao;
	
	public static final String GET_URL = "http://121.40.140.223:8080/sensormiddleware/MainServeice";

	@Resource(name = "cfgLightTriggerDao")
	private ICfgLightTriggerDao cfgLightTriggerDao;

	@Resource(name = "cfgSysControlDao")
	private ICfgSysControlDao cfgSysControlDao;

	@Resource(name = "cfgThresholdDao")
	private ICfgThresholdDao cfgThresholdDao;

	@Resource(name = "cfgTriggerModeDao")
	private ICfgTriggerModeDao cfgTriggerModeDao;
	
	@Resource(name = "warningMessagesDao")
	private IWarningMessagesDao warningMessagesDao;
	
	@Resource(name = "videoMessagesDao")
	private IVideoMessagesDao videoMessagesDao;
	
	@Resource(name = "co2ConcentrationDao")
	private ICo2ConcentrationDao co2ConcentrationDao;
	
	public static final Float TEMPERATURE_DEFAULT_VALUE = 15f;
	public static final Float WETNESS_DEFAULT_VALUE = 25f;
	public static final Float LIGHT_DEFAULT_VALUE = 0f;

	@Override
	public List<GreenhouseResultDto> getListByDto(GreenhouseQueryDto queryDto) {
		List<AirTemperature> temperatureList = airTemperatureDao.getListByQueryDto(queryDto);
		if(temperatureList !=null){
			List<GreenhouseResultDto> results = new ArrayList<GreenhouseResultDto>(temperatureList.size());
			int i = 0;
			for(AirTemperature temper : temperatureList){
				i++;
				GreenhouseResultDto dto = new GreenhouseResultDto();
				dto.setEquipmentId(temper.getEquipmentId());
				dto.setPort(temper.getPort());
				dto.setUploadDate(temper.getUploadDate());
				dto.setTemperatureValue(temper.getDataValue());
				dto.setId(temper.getId());
				dto.setName("大棚"+i);
				dto.setAirWetnessValue(100f);
				dto.setLightValue(99);
				results.add(dto);
				
			}
			return results;
		}
		
		return null;
	}


	/** 
	 * overridden:
	 * @Author      :      ZHWANG
	 * @Date        :      2014-9-10
	 * @see com.zigbee.function.service.IGreenhouseService#getMonitorResultListByDto(com.zigbee.function.dto.GreenhouseQueryDto)
	**/
	@Override
	public List<GreenhouseResultDto> getMonitorResultListByDto(
			GreenhouseQueryDto queryDto) {
		List<GreenhouseResultDto> result = monitorPointDao.getMonitorResultByDto(queryDto);
		return result;
	}


	/** 
	 * overridden:
	 * @Author      :      ZHWANG
	 * @Date        :      2014-9-10
	 * @see com.zigbee.function.service.IGreenhouseService#getControlEquipListByMonitorId(java.lang.Integer)
	**/
	@Override
	public List<EquipmentResultDto> getControlEquipListByMonitorId(
			Integer monitorPointId) {
		// 查找设备列表
		List<Equipment> equipList = equipmentDao.getControlEquipListByMonitorId(monitorPointId);
		if(equipList!=null && equipList.size()>0){
			List<EquipmentResultDto> dtoList = new ArrayList<EquipmentResultDto>(equipList.size());
			//循环查找开关当前状态，以及lastupdatedate
			for(Equipment equip : equipList){
				EquipmentResultDto dto = new EquipmentResultDto();
				dto.setId(equip.getId());
				dto.setEquipCode(equip.getEquipCode());
				dto.setEquipSeq(equip.getEquipSeq());
				dto.setEquipName(equip.getEquipName());
				dto.setEquipType(equip.getEquipType());
				dto.setMonitorPointId(equip.getMonitorPointId());
				
				LightSwitch lightSwitch = lightSwitchDao.getEntityByEquipmentId(equip.getId());
				if(lightSwitch!=null){
					dto.setSwitchOnoff(lightSwitch.getDataValue());
					dto.setUploadDate(lightSwitch.getUploadDate());
				}else{
					dto.setSwitchOnoff(GreenhouseCommonConstants.TRIGGERACTIONTYPE_OFF);
					dto.setUploadDate(null);
				}
				dtoList.add(dto);
			}
			return dtoList;
		}
		
		return null;
	}


	/** 
	 * overridden:
	 * @Author      :      ZHWANG
	 * @Date        :      2014-9-11
	 * @see com.zigbee.function.service.IGreenhouseService#updateSwtichOnOff(java.lang.Integer, java.lang.Integer)
	**/
	@Override
	public boolean updateSwtichOnOff(Integer equipmentId, Integer switchOnoff) {
		LightSwitch controller = lightSwitchDao.getEntityByEquipmentId(equipmentId);
		Equipment equip = equipmentDao.findById(equipmentId);
		if(equip !=null){
			boolean result = switchEquipThroughHttp(equip.getEquipCode(), switchOnoff);
			if(!result){
				return false;
			}
			if(controller!=null){
				controller.setDataValue(switchOnoff);
				controller.setUploadDate(new Date());
				lightSwitchDao.update(controller);
			}else{
				controller = new LightSwitch();
				controller.setEquipmentId(equipmentId);
				controller.setDataValue(switchOnoff);
				controller.setUploadDate(new Date());
				lightSwitchDao.save(controller);
			}
			return true;
		}
		return false;
	}


	/** 
	 * overridden:
	 * @Author      :      ZHWANG
	 * @Date        :      2014-9-11
	 * @see com.zigbee.function.service.IGreenhouseService#saveCascadeCfg(com.zigbee.function.dto.CascadeCfgEditDto)
	**/
	@Override
	public boolean saveCascadeCfg(CascadeCfgEditDto editDto) {
		//清空数据库配置数据
		triggerSettingDao.removeByQuery("delete from TriggerSetting where 1=1 ");
		//转换数据
		List<TriggerSetting> settings = TriggerSettingConvertUtil.convertDtoToDomain(editDto);
		//保存到后台
		if(settings!=null){
			Date now = new Date();
			for(TriggerSetting setting : settings){
				if(setting.getTriggerVal()!=null){
					setting.setLastUpdateTime(now);
					triggerSettingDao.save(setting);
				}
			}
		}
		
		return true;
	}


	/** 
	 * overridden:
	 * @Author      :      ZHWANG
	 * @Date        :      2014-9-11
	 * @see com.zigbee.function.service.IGreenhouseService#getCascadeCfgDto()
	**/
	@Override
	public CascadeCfgEditDto getCascadeCfgDto() {
		//读取数据库数据
		List<TriggerSetting> settings = triggerSettingDao.getListByQuery(" from TriggerSetting where 1=1 ");
		CascadeCfgEditDto dto = TriggerSettingConvertUtil.convertDomainToDto(settings);
		//转换数据
		return dto;
	}


	/** 
	 * overridden:
	 * @Author      :      ZHWANG
	 * @Date        :      2014-9-13
	 * @see com.zigbee.function.service.IGreenhouseService#switchOnoffOnSchedule()
	**/
	@Override
	public boolean switchOnoffOnSchedule() {
		//query e 使用  ontime+10Min offTime +10，查询出列表
		//select concat(date_format(now() ,'%Y-%m-%d') ,' ', date_format(ontime,'%H:%i:%S')) from light_summary_tbl
		//query all rule;
		List<LightSummary> summaryList = lightSummaryDao.getListByQuery(" from LightSummary ");
		if(summaryList!=null){
			Date now = new Date(); // system current timestamp
			
			Calendar oncal = Calendar.getInstance(); //db-config: trigger time
			Calendar offcal = Calendar.getInstance(); //db-config: trigger time
			Calendar dbcal = Calendar.getInstance();
			for(LightSummary summary : summaryList){
				boolean needUpdate = false;
				int triggerActionType = 0;
				if(summary.getOntime()==null && summary.getOfftime()==null){
					continue;
				}
				if(summary.getOntime()!=null && summary.getOfftime()!=null){
					dbcal.setTime(summary.getOntime());
					oncal.setTime(now);
					oncal.set(Calendar.HOUR_OF_DAY, dbcal.get(Calendar.HOUR_OF_DAY));
					oncal.set(Calendar.MINUTE, dbcal.get(Calendar.MINUTE));
					oncal.set(Calendar.SECOND, dbcal.get(Calendar.SECOND));
					
					dbcal.setTime(summary.getOfftime());
					offcal.setTime(now);
					offcal.set(Calendar.HOUR_OF_DAY, dbcal.get(Calendar.HOUR_OF_DAY));
					offcal.set(Calendar.MINUTE, dbcal.get(Calendar.MINUTE));
					offcal.set(Calendar.SECOND, dbcal.get(Calendar.SECOND));
				}else{
					//有一方为空
					if(summary.getOntime()!=null ){
						dbcal.setTime(summary.getOntime());
						oncal.setTime(now);
						oncal.set(Calendar.HOUR_OF_DAY, dbcal.get(Calendar.HOUR_OF_DAY));
						oncal.set(Calendar.MINUTE, dbcal.get(Calendar.MINUTE));
						oncal.set(Calendar.SECOND, dbcal.get(Calendar.SECOND));
						
						offcal.setTime(now);
						offcal.add(Calendar.DAY_OF_MONTH, 1); //加到下一天
						offcal.set(Calendar.HOUR_OF_DAY, dbcal.get(Calendar.HOUR_OF_DAY));
						offcal.set(Calendar.MINUTE, dbcal.get(Calendar.MINUTE));
						offcal.set(Calendar.SECOND, dbcal.get(Calendar.SECOND));
						
					}else{
						dbcal.setTime(summary.getOfftime());
						offcal.setTime(now);
						offcal.set(Calendar.HOUR_OF_DAY, dbcal.get(Calendar.HOUR_OF_DAY));
						offcal.set(Calendar.MINUTE, dbcal.get(Calendar.MINUTE));
						offcal.set(Calendar.SECOND, dbcal.get(Calendar.SECOND));
						
						oncal.setTime(now);
						oncal.add(Calendar.DAY_OF_MONTH, 1); //加到下一天
						oncal.set(Calendar.HOUR_OF_DAY, dbcal.get(Calendar.HOUR_OF_DAY));
						oncal.set(Calendar.MINUTE, dbcal.get(Calendar.MINUTE));
						oncal.set(Calendar.SECOND, dbcal.get(Calendar.SECOND));
					}
				}
				
				
				if(now.before(oncal.getTime())&& now.before(offcal.getTime())){
					continue;
				}
				if(now.after(oncal.getTime())&& now.after(offcal.getTime())){
					if(offcal.getTime().after(oncal.getTime())){
						if(summary.getLastOfftime()==null || summary.getLastOfftime().before(offcal.getTime())){
							//set off
							needUpdate = true;
							triggerActionType = GreenhouseCommonConstants.TRIGGERACTIONTYPE_OFF;
						}
					}else{
						if (summary.getLastOntime()==null || summary.getLastOntime().before(oncal.getTime())){
							//set on
							needUpdate = true;
							triggerActionType = GreenhouseCommonConstants.TRIGGERACTIONTYPE_ON;
						}
					}
				}else{
					if(now.after(oncal.getTime())
							&& (summary.getLastOntime()==null || summary.getLastOntime().before(oncal.getTime()))){
						//set on
						needUpdate = true;
						triggerActionType = GreenhouseCommonConstants.TRIGGERACTIONTYPE_ON;
					}
					
					if(now.after(offcal.getTime())
							&& (summary.getLastOfftime()==null || summary.getLastOfftime().before(offcal.getTime()))){
						//set off
						needUpdate = true;
						triggerActionType = GreenhouseCommonConstants.TRIGGERACTIONTYPE_OFF;
					}
				}
				
				
				
				
				//need update
				if(needUpdate){
					LightSwitch lSwitch = lightSwitchDao.getEntityByEquipmentId(summary.getEquipmentId());
					if(lSwitch!=null){
						lSwitch.setDataValue(triggerActionType);
						lSwitch.setUploadDate(now);
						lightSwitchDao.update(lSwitch);
					}else{
						lSwitch = new LightSwitch();
						lSwitch.setEquipmentId(summary.getEquipmentId());
						lSwitch.setDataValue(triggerActionType);
						lSwitch.setUploadDate(now);
						lightSwitchDao.save(lSwitch);
					}
					if(triggerActionType == GreenhouseCommonConstants.TRIGGERACTIONTYPE_ON){
						summary.setLastOntime(now);
					}else{
						summary.setLastOfftime(now);
					}
					lightSummaryDao.update(summary);
				}
				
			}
		}
		
		return true;
	}


	/** 
	 * overridden:
	 * @Author      :      Administrator
	 * @Date        :      2014-9-14
	 * @see com.zigbee.function.service.IGreenhouseService#getAllMonitorPoints()
	**/
	@Override
	public List<MonitorPoint> getAllMonitorPoints() {
		return monitorPointDao.getAllMonitorPoints();
	}


	/** 
	 * overridden:
	 * @Author      :      Administrator
	 * @Date        :      2014-9-14
	 * @see com.zigbee.function.service.IGreenhouseService#getControlEquipListByMonitorId(java.lang.Integer, java.lang.String)
	**/
	@Override
	public List<EquipmentResultDto> getControlEquipListByMonitorId(
			Integer monitorPointId, String monitorName) {
		// 查找设备列表
		List<Equipment> equipList = equipmentDao.getControlEquipListByMonitorId(monitorPointId);
		if(equipList!=null && equipList.size()>0){
			List<EquipmentResultDto> dtoList = new ArrayList<EquipmentResultDto>(equipList.size());
			//循环查找开关当前状态，以及lastupdatedate
			for(Equipment equip : equipList){
				EquipmentResultDto dto = new EquipmentResultDto();
				dto.setId(equip.getId());
				dto.setEquipCode(equip.getEquipCode());
				dto.setEquipSeq(equip.getEquipSeq());
				dto.setEquipName(equip.getEquipName());
				dto.setEquipType(equip.getEquipType());
				dto.setMonitorPointId(equip.getMonitorPointId());
				dto.setMonitorPointName(monitorName);
				
				LightSwitch lightSwitch = lightSwitchDao.getEntityByEquipmentId(equip.getId());
				if(lightSwitch!=null){
					dto.setSwitchOnoff(lightSwitch.getDataValue());
					dto.setUploadDate(lightSwitch.getUploadDate());
				}else{
					dto.setSwitchOnoff(GreenhouseCommonConstants.TRIGGERACTIONTYPE_OFF);
					dto.setUploadDate(null);
				}
				dtoList.add(dto);
			}
			return dtoList;
		}
		
		return null;
	}


	/** 
	 * overridden:
	 * @Author      :      YIFEGU
	 * @Date        :      Sep 15, 2014
	 * @see com.zigbee.function.service.IGreenhouseService#getTemperatureChart(int, java.lang.Integer)
	**/
	@Override
	public List<ChartSeriesDto> getTemperatureChart(int fetchType,
			Integer monitorPointId) {
		List<Equipment> equipList = equipmentDao.getDataAcqEquipListByMonitorId(monitorPointId);
		if(equipList!=null && equipList.size()>0){
			Integer equipmentId = equipList.get(0).getId();	
			List<ChartSeriesDto> result = new ArrayList<ChartSeriesDto>();
			if(fetchType == GreenhouseCommonConstants.FETCH_TYPE_DAILY){
				//构建温度list
				ChartSeriesDto temperDto = getDailyTemperatureChart(equipmentId); 
				result.add(temperDto);
				//构建湿度List
				ChartSeriesDto wetDto = getDailyAirWetnessChart(equipmentId); 
				result.add(wetDto);
				//构建光照List
				ChartSeriesDto lightDto = getDailyLightChart(equipmentId); 
				result.add(lightDto);
				//构建CO2List
				ChartSeriesDto Co2Dto = getDailyCo2Chart(equipmentId); 
				result.add(Co2Dto);
			}else if(fetchType == GreenhouseCommonConstants.FETCH_TYPE_WEEKLY){
				//构建温度list
				//构建湿度List
				//构建光照List
				
			}else if(fetchType == GreenhouseCommonConstants.FETCH_TYPE_MONTHY){
				//构建温度list
				//构建湿度List
				//构建光照List
				
			}
			return result;
		}
		
		return null;
	}


	/** 
	 * overridden:
	 * @Author      :      ZHWANG
	 * @Date        :      2014-9-15
	 * @see com.zigbee.function.service.IGreenhouseService#getDailyTemperatureChart(java.lang.Integer)
	**/
	@Override
	public ChartSeriesDto getDailyTemperatureChart(Integer equipmentId) {
		//后台查询，输入参数为设备ID
		List<AirTemperature> temperList = airTemperatureDao.getHoursListByEquipId(equipmentId);
		Map<Integer,Float> hourValMap = new HashMap<Integer,Float>(24);
		//初始化，设置每个小时的初始值为0
		for(int i = 0; i<24 ; i++){
			hourValMap.put(i, new Float(0));
		}
		//后台数据更新map
		if(temperList!=null){
			Calendar cal = Calendar.getInstance();
			for(AirTemperature ate : temperList){
				cal.setTime(ate.getUploadDate());
				hourValMap.put(cal.get(Calendar.HOUR_OF_DAY),ate.getDataValue());
			}
		}
		
		//构建返回对象子元素
		List<Float> data = new ArrayList<Float>(24);
		List<String> xAxis = new ArrayList<String>(24);
		for(int i = 0; i<24 ; i++){
			xAxis.add(String.valueOf(i));
			data.add(hourValMap.get(i));
		}
		//构建返回对象
		ChartSeriesDto dto = new ChartSeriesDto();
		dto.setName("空气温度");
		dto.setxAxis(xAxis);
		dto.setData(data);
		
		return dto;
	}


	/** 
	 * overridden:
	 * @Author      :      ZHWANG
	 * @Date        :      2014-9-15
	 * @see com.zigbee.function.service.IGreenhouseService#getDailyAirWetnessChart(java.lang.Integer)
	**/
	@Override
	public ChartSeriesDto getDailyAirWetnessChart(Integer equipmentId) {
		//后台查询，输入参数为设备ID
		List<AirWetness> wetnessList = airWetnessDao.getHoursListByEquipId(equipmentId);
		Map<Integer,Float> hourValMap = new HashMap<Integer,Float>(24);
		//初始化，设置每个小时的初始值为0
		for(int i = 0; i<24 ; i++){
			hourValMap.put(i, new Float(0));
		}
		//后台数据更新map
		if(wetnessList!=null){
			Calendar cal = Calendar.getInstance();
			for(AirWetness ate : wetnessList){
				cal.setTime(ate.getUploadDate());
				hourValMap.put(cal.get(Calendar.HOUR_OF_DAY),ate.getDataValue());
			}
		}
		
		//构建返回对象子元素
		List<Float> data = new ArrayList<Float>(24);
		List<String> xAxis = new ArrayList<String>(24);
		for(int i = 0; i<24 ; i++){
			xAxis.add(String.valueOf(i));
			data.add(hourValMap.get(i));
		}
		//构建返回对象
		ChartSeriesDto dto = new ChartSeriesDto();
		dto.setName("空气湿度");
		dto.setxAxis(xAxis);
		dto.setData(data);
		
		return dto;
	}


	/** 
	 * overridden:
	 * @Author      :      ZHWANG
	 * @Date        :      2014-9-15
	 * @see com.zigbee.function.service.IGreenhouseService#getDailyLightChart(java.lang.Integer)
	**/
	@Override
	public ChartSeriesDto getDailyLightChart(Integer equipmentId) {
		//后台查询，输入参数为设备ID
		List<Light> lightList = lightDao.getHoursListByEquipId(equipmentId);
		Map<Integer,Float> hourValMap = new HashMap<Integer,Float>(24);
		//初始化，设置每个小时的初始值为0
		for(int i = 0; i<24 ; i++){
			hourValMap.put(i, new Float(0));
		}
		//后台数据更新map
		if(lightList!=null){
			Calendar cal = Calendar.getInstance();
			for(Light ate : lightList){
				cal.setTime(ate.getUploadDate());
				hourValMap.put(cal.get(Calendar.HOUR_OF_DAY),Float.valueOf(ate.getDataValue()));
			}
		}
		
		//构建返回对象子元素
		List<Float> data = new ArrayList<Float>(24);
		List<String> xAxis = new ArrayList<String>(24);
		for(int i = 0; i<24 ; i++){
			xAxis.add(String.valueOf(i));
			data.add(hourValMap.get(i));
		}
		//构建返回对象
		ChartSeriesDto dto = new ChartSeriesDto();
		dto.setName("光照度");
		dto.setxAxis(xAxis);
		dto.setData(data);
		
		return dto;
	}


	/** 
	 * overridden:
	 * @Author      :      ZHWANG
	 * @Date        :      2014-9-17
	 * @see com.zigbee.function.service.IGreenhouseService#getEquipSwitchScheduleEditDto()
	**/
	@Override
	public EquipSwitchScheduleEditDto getEquipSwitchScheduleEditDto() {
		List<LightSummary> list = lightSummaryDao.getListByQuery(" from LightSummary ");
		if(list!=null && list.size()>0){
			LightSummary summary = list.get(0);
			EquipSwitchScheduleEditDto dto = new EquipSwitchScheduleEditDto();
			if(summary.getOntime()!=null){
				dto.setOpenTime(DateUtil.getFomartDate(summary.getOntime(),"HH:mm"));
			}
			if(summary.getOfftime()!=null){
				dto.setCloseTime(DateUtil.getFomartDate(summary.getOfftime(),"HH:mm"));
			}
			return dto;
		}
		return null;
	}


	/** 
	 * overridden:
	 * @Author      :      ZHWANG
	 * @Date        :      2015-2-2
	 * @see com.zigbee.function.service.IGreenhouseService#getControlModeDto()
	**/
	@Override
	public EquipSwitchScheduleEditDto getControlModeDto() {
		List<CfgSysControl> list = cfgSysControlDao.getListByQuery(" from CfgSysControl ");
		if(list!=null && list.size()>0){
			CfgSysControl summary = list.get(0);
			EquipSwitchScheduleEditDto dto = new EquipSwitchScheduleEditDto();
			dto.setId(summary.getId());
			dto.setCurMode(summary.getCurMode()==null ? GreenhouseCommonConstants.SYSCONTROL_MODE_AUTO : summary.getCurMode());
			return dto;
		}
		return null;
	}

	/** 
	 * overridden:
	 * @Author      :      ZHWANG
	 * @Date        :      2015-2-2
	 * @see com.zigbee.function.service.IGreenhouseService#saveSysControlMode(com.zigbee.function.dto.EquipSwitchScheduleEditDto)
	**/
	@Override
	public boolean saveSysControlMode(EquipSwitchScheduleEditDto editDto) {
		CfgSysControl control = null;
		if(editDto.getId()!=null){
			control = cfgSysControlDao.findById(editDto.getId());
		}
		if(control!=null){
			control.setCurMode(editDto.getCurMode());
			cfgSysControlDao.update(control);
		}else{
			control = new CfgSysControl();
			control.setCurMode(editDto.getCurMode());
			cfgSysControlDao.save(control);
		}
		return true;
	}
	/** 
	 * overridden:
	 * @Author      :      ZHWANG
	 * @Date        :      2014-9-17
	 * @see com.zigbee.function.service.IGreenhouseService#saveEquipSwitchSchedule(com.zigbee.function.dto.EquipSwitchScheduleEditDto)
	**/
	@Override
	public boolean saveEquipSwitchSchedule(EquipSwitchScheduleEditDto editDto) {
		List<Equipment> equipList = equipmentDao.getListByQuery(" from Equipment ");
		if(equipList!=null && equipList.size()>0){
			for(Equipment equip : equipList){
				LightSummary ls = lightSummaryDao.getLightSummaryByEquipId(equip.getId());
				if(ls !=null){
					ls.setOntime(editDto.getOpenTimeDate());
					ls.setOfftime(editDto.getCloseTimeDate());
					lightSummaryDao.update(ls);
				}else{
					ls = new LightSummary();
					ls.setEquipmentId(equip.getId());
					ls.setOntime(editDto.getOpenTimeDate());
					ls.setOfftime(editDto.getCloseTimeDate());
					lightSummaryDao.save(ls);
				}
			}
			
		}
		return true;
	}
	
	private static boolean switchEquipThroughHttp(String equipId, int type){
		try {
			// 拼凑get请求的URL字串，使用URLEncoder.encode对特殊和不可见字符进行编码
			String getURL = GET_URL + "?equipment_id="
			        + URLEncoder.encode(equipId, "utf-8") +"&type="
			        + URLEncoder.encode(String.valueOf(type), "utf-8");
			URL getUrl = new URL(getURL);
			// 根据拼凑的URL，打开连接，URL.openConnection函数会根据URL的类型，
			// 返回不同的URLConnection子类的对象，这里URL是一个http，因此实际返回的是HttpURLConnection
			HttpURLConnection connection = (HttpURLConnection) getUrl
			        .openConnection();
			// 进行连接，但是实际上get request要在下一句的connection.getInputStream()函数中才会真正发到
			// 服务器
			connection.connect();
			// 取得输入流，并使用Reader读取
			BufferedReader reader = new BufferedReader(new InputStreamReader(
			        connection.getInputStream()));
			System.out.println("=============================");
			System.out.println("Contents of get response");
			System.out.println("=============================");
			String lines;
			while ((lines = reader.readLine()) != null) {
			    System.out.println(lines);
			    if(Utils.notEmpty(lines) && lines.contains("result= 1")){
			    	return true;
			    }
			}
			reader.close();
			// 断开连接
			connection.disconnect();
			System.out.println("=============================");
			System.out.println("Contents of get response ends");
			System.out.println("=============================");
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		switchEquipThroughHttp("51",2);

	}	
	


	/** 
	 * overridden:
	 * @Author      :      ZHWANG
	 * @Date        :      2015-1-16
	 * @see com.zigbee.function.service.IGreenhouseService#getThresholdConfigDto(java.lang.Integer)
	**/
	@Override
	public ThresholdMasterDto getThresholdConfigDto(Integer cfgType) {
		
		List<CfgThreshold> items = cfgThresholdDao.queryListByType(cfgType,0);
		List<CfgThreshold> constantItems = cfgThresholdDao.queryListByType(cfgType,1);
		List<CfgTriggerMode> triggerModeList = cfgTriggerModeDao.queryListByType(cfgType);
		
		ThresholdMasterDto dto = new ThresholdMasterDto();
		dto.setCfgType(cfgType);
		//设置常量信息
		if(constantItems!=null && constantItems.size()>0){
			CfgThreshold costantItem = constantItems.get(0);
			dto.setConstantId(costantItem.getId());
			dto.setConstantValue(costantItem.getCfgValue());
		}
		//设置变量列表
		int item_size = 6;
		
		List<ThresholdItemDto> itemList = new ArrayList<ThresholdItemDto>(item_size);
		ThresholdItemDto itemDto = null;
		if(items!=null && items.size()>0){
			for(CfgThreshold hold : items){
				itemDto = new ThresholdItemDto();
				itemDto.setCfgHour(hold.getCfgHour());
				itemDto.setCfgMinute(hold.getCfgMinute());
				itemDto.setCfgValue(hold.getCfgValue());
				itemDto.setId(hold.getId());
				itemDto.setIsValid(hold.getIsValid());
				itemList.add(itemDto);
			}
		}
		//初始化变量列表
		int db_item_size = ((items!=null && items.size()>0) ? items.size() : 0 ) ;
		for(int i = db_item_size ; i<item_size - db_item_size; i++){
			itemDto = new ThresholdItemDto();
			itemList.add(itemDto);
		}
		dto.setItemList(itemList);
		//设置当前状态
		if(triggerModeList!=null && triggerModeList.size()>0){
			CfgTriggerMode mode = triggerModeList.get(0);
			dto.setIsConstant(mode.getCurMode());
			dto.setRegion(mode.getRegion());
			dto.setTriggerModeId(mode.getId());
		}
		return dto;
	}


	/** 
	 * overridden:
	 * @Author      :      ZHWANG
	 * @Date        :      2015-1-16
	 * @see com.zigbee.function.service.IGreenhouseService#saveThresholdConfig(com.zigbee.function.dto.ThresholdMasterDto)
	**/
	@Override
	public boolean saveThresholdConfig(ThresholdMasterDto editDto) {
		//parse list
		if(editDto!=null){
			//save constant 
			CfgThreshold threshold = null;
			if(editDto.getConstantId()!=null){
				threshold = cfgThresholdDao.findById(editDto.getConstantId());
			}
			if(threshold==null){
				threshold = new CfgThreshold();
			}
			threshold.setCfgType(editDto.getCfgType());
			threshold.setCfgValue(editDto.getConstantValue());
			threshold.setIsConstant(1);
			threshold.setIsValid(1);
			threshold.setApplied(0);
			threshold.setCfgHour(0);
			threshold.setCfgMinute(0);
			if(threshold.getId()==null){
				cfgThresholdDao.save(threshold);
			}else{
				cfgThresholdDao.update(threshold);
			}
			
			//保存 变量 列表设置 
			for(ThresholdItemDto dto : editDto.getItemList()){
				CfgThreshold thr = null;
				if(dto.getId()!=null){
					thr = cfgThresholdDao.findById(dto.getId());
				}
				if(thr==null){
					thr = new CfgThreshold();
					thr.setCfgType(editDto.getCfgType());
					thr.setIsConstant(0);
					thr.setIsValid(1);
					thr.setCfgHour(dto.getCfgHour());
					thr.setCfgMinute(dto.getCfgMinute());
					thr.setCfgValue(dto.getCfgValue());
					thr.setApplied(0);
					cfgThresholdDao.save(thr);
				}else{
					thr.setCfgHour(dto.getCfgHour());
					thr.setCfgMinute(dto.getCfgMinute());
					thr.setCfgValue(dto.getCfgValue());
					thr.setApplied(0);
					thr.setApplyDate(null);
					cfgThresholdDao.update(thr);
				}
			}
			
			
			//保存变量控制还是常量控制信息 
			CfgTriggerMode mode = null;
			if(editDto.getTriggerModeId()!=null){
				mode = cfgTriggerModeDao.findById(editDto.getTriggerModeId());
			}
			if(mode==null){
				mode = new CfgTriggerMode();
				mode.setCfgType(editDto.getCfgType());
				mode.setCurMode(editDto.getIsConstant());
				mode.setRegion(editDto.getRegion());
				cfgTriggerModeDao.save(mode);
			}else{
				mode.setCurMode(editDto.getIsConstant());
				mode.setRegion(editDto.getRegion());
				cfgTriggerModeDao.update(mode);
			}
			return true;
		}
		return false;
	}


	/** 
	 * overridden:
	 * @Author      :      ZHWANG
	 * @Date        :      2015-1-16
	 * @see com.zigbee.function.service.IGreenhouseService#getLightTriggerConfigDto()
	**/
	@Override
	public LightTriggerMasterDto getLightTriggerConfigDto() {
		int item_size = 4;
		List<CfgLightTrigger> entries = cfgLightTriggerDao.getAllLightTriggerCfg();
		LightTriggerMasterDto dto = new LightTriggerMasterDto();
		List<LightTriggerItemDto> itemList = new ArrayList<LightTriggerItemDto>(4);
		LightTriggerItemDto itemDto = null;
		int db_item_size = (entries==null ? 0 : entries.size());
		if(db_item_size>0){
			for(CfgLightTrigger trigger : entries){
				itemDto = new LightTriggerItemDto();
				itemDto.setId(trigger.getId());
				itemDto.setFromHour(trigger.getFromHour());
				itemDto.setFromMinute(trigger.getFromMinute());
				itemDto.setToHour(trigger.getToHour());
				itemDto.setToMinute(trigger.getToMinute());
				itemDto.setIsValid(trigger.getIsValid());
				itemDto.setThresholdValue(trigger.getThresholdValue());
				itemDto.setGreaterAction(trigger.getGreaterAction());
				itemDto.setLessAction(trigger.getLessAction());
				itemList.add(itemDto);
			}
		}
		
		//信息初始化
		for(int i = db_item_size ; i<item_size - db_item_size; i++){
			itemDto = new LightTriggerItemDto();
			itemList.add(itemDto);
		}
		
		dto.setItemList(itemList);
		return dto;
	}


	/** 
	 * overridden:
	 * @Author      :      ZHWANG
	 * @Date        :      2015-1-16
	 * @see com.zigbee.function.service.IGreenhouseService#saveLightTriggerConfig(com.zigbee.function.dto.LightTriggerMasterDto)
	**/
	@Override
	public boolean saveLightTriggerConfig(LightTriggerMasterDto editDto) {
		if(editDto!=null){
			if(editDto.getItemList()!=null && editDto.getItemList().size()>0){
				for(LightTriggerItemDto dto : editDto.getItemList()){
					CfgLightTrigger cfg = null;
					if(dto.getId()!=null){
						cfg = cfgLightTriggerDao.findById(dto.getId());
					}
					if(cfg==null){
						cfg = new CfgLightTrigger();
					}
					cfg.setFromHour(dto.getFromHour());
					cfg.setFromMinute(dto.getFromMinute());
					cfg.setToHour(dto.getToHour());
					cfg.setToMinute(dto.getToMinute());
					cfg.setIsValid(1);
					cfg.setThresholdValue(dto.getThresholdValue());
					cfg.setGreaterAction(dto.getGreaterAction());
					cfg.setLessAction(dto.getLessAction());
					
					if(cfg.getId()==null){
						cfgLightTriggerDao.save(cfg);
					}else{
						cfgLightTriggerDao.update(cfg);
					}
				}
			}
			return true;
		}
		return false;
	}


	/** 
	 * overridden:
	 * @Author      :      ZHWANG
	 * @Date        :      2015-1-19
	 * @see com.zigbee.function.service.IGreenhouseService#getStandardByTime(java.lang.Integer, java.lang.Integer, java.lang.Integer)
	**/
	@Override
	public float getStandardByTime(Integer cfgType, Integer hour, Integer minute) {
		List<CfgTriggerMode> triggerModeList = cfgTriggerModeDao.queryListByType(cfgType);
		if(triggerModeList!=null && triggerModeList.size()>0){
			CfgTriggerMode mode = triggerModeList.get(0);
			if(mode.getCurMode()!=null && mode.getCurMode()==1){
				//常量控制
				List<CfgThreshold> constantItems = cfgThresholdDao.queryListByType(cfgType,1);
				if(constantItems==null || constantItems.size()==0){
					return GreenhouseCommonConstants.NO_CONFIG_EXSIT;
				}
				CfgThreshold item = constantItems.get(0);
				return item.getCfgValue();
			}else{
				//变量控制
				List<CfgThreshold> items = cfgThresholdDao.queryVariantListByType(cfgType);
				if(items==null || items.size()==0){
					return GreenhouseCommonConstants.NO_CONFIG_EXSIT;
				}
				CfgThreshold firstHold = items.get(0);
				CfgThreshold lastHold = items.get(items.size()-1);
				if(hour*60 + minute < firstHold.getCfgHour()*60 + firstHold.getCfgMinute() 
						|| hour*60 + minute >= lastHold.getCfgHour()*60 + lastHold.getCfgMinute()){
					return lastHold.getCfgValue();
				}
				CfgThreshold preHold = firstHold;
				CfgThreshold curHold = null;
				for(int i=1 ;i< items.size(); i++ ){
					curHold = items.get(i);
					if(hour*60 + minute >= preHold.getCfgHour()*60 + preHold.getCfgMinute()
							&& hour*60 + minute < curHold.getCfgHour()*60 + curHold.getCfgMinute()){
						return preHold.getCfgValue();
					}
					preHold = curHold;
				}
				
				return lastHold.getCfgValue();
			}
		}
		
		return GreenhouseCommonConstants.NO_CONFIG_EXSIT;
	}


	/** 
	 * overridden:
	 * @Author      :      ZHWANG
	 * @Date        :      2015-1-19
	 * @see com.zigbee.function.service.IGreenhouseService#getLightStardardByTime(java.lang.Integer, java.lang.Integer)
	**/
	@Override
	public CfgLightTrigger getLightStardardByTime(Integer hour, Integer minute) {
		List<CfgLightTrigger> items = cfgLightTriggerDao.queryEffectiveTriggerList(hour, minute);
		if(items==null || items.size()==0){
			return null;
		}
		return items.get(0);
	}


	/** 
	 * overridden:
	 * @Author      :      ZHWANG
	 * @Date        :      2015-1-19
	 * @see com.zigbee.function.service.IGreenhouseService#getCurrentActionByType(java.lang.Integer, java.lang.Float)
	**/
	@Override
	public Integer getCurrentActionByType(Integer cfgType, Float curValue) {
		//TODO:need check applied status 
		Calendar cal = Calendar.getInstance();
		int curHour = cal.get(Calendar.HOUR_OF_DAY);
		int curMinute = cal.get(Calendar.MINUTE);
		//获取标准配置值
		Float stardVal = getStandardByTime(cfgType, curHour ,curMinute );
		//获取变动区间
		Float region = 0f;
		List<CfgTriggerMode> triggerModeList = cfgTriggerModeDao.queryListByType(cfgType);
		if(triggerModeList!=null && triggerModeList.size()>0){
			region = triggerModeList.get(0).getRegion();
		}
		if(region==null){
			region=0f;
		}
		//对于光照度的特殊处理 。
		if(cfgType == GreenhouseCommonConstants.DATAACQUTYPE_LIGHT){
			CfgLightTrigger lightTrigger = getLightStardardByTime(curHour, curMinute);
			if(lightTrigger!=null){
				if(curValue>=lightTrigger.getThresholdValue()){
					return lightTrigger.getGreaterAction();
				}else{
					return lightTrigger.getLessAction();
				}
			}
		}
		//对于温度的处理
		if(cfgType == GreenhouseCommonConstants.DATAACQUTYPE_AIRTEMPERATURE){
			if(stardVal+region>curValue){
				//TODO：大于标准值，执行动作
			}else if(stardVal-region<curValue){
				//TODO: 小于标准值，执行动作
			}
		}
		//对于湿度的处理
		if(cfgType == GreenhouseCommonConstants.DATAACQUTYPE_AIRTEMPERATURE){
			if(stardVal+region>curValue){
				//TODO：大于标准值，执行动作
			}else if(stardVal-region<curValue){
				//TODO: 小于标准值，执行动作
			}
		}
		//对于光的处理
		if(cfgType == GreenhouseCommonConstants.DATAACQUTYPE_LIGHT){
			return stardVal.intValue();
		}
		
		return null;
	}


	/** 
	 * overridden:
	 * @Author      :      ZHWANG
	 * @Date        :      2015-1-19
	 * @see com.zigbee.function.service.IGreenhouseService#autoTriggerOnSchedule()
	**/
	@Override
	public boolean autoTriggerOnSchedule() {
		//判断当前是自动控制还是手动控制。
		Integer curMode = cfgSysControlDao.getCurControlMode();
		if(curMode == GreenhouseCommonConstants.SYSCONTROL_MODE_MANUAL){
			//手动控制直接返回
			return true;
		}
		
		String curPointCode = "monitorpoint1";
		String lightEquipId = "1";
		String lightLineEquipId = "2";
		Equipment light1 = equipmentDao.getEquipmentByCode(lightEquipId);
		Equipment light2 = equipmentDao.getEquipmentByCode(lightLineEquipId);
		
		//获取最新的采集温度湿度和光照度值 - 设备号
		GreenhouseQueryDto queryDto = new GreenhouseQueryDto();
		queryDto.setPointCode(curPointCode);
		List<GreenhouseResultDto> accqInfoList = monitorPointDao.getMonitorResultByDto(queryDto);
		Float temperVal = null;
		Float wetnessVal = null;
		Float lightVal = LIGHT_DEFAULT_VALUE;
		
		if(accqInfoList==null || accqInfoList.size()==0){
			//无采集数据
			//return false;
		}else{
			GreenhouseResultDto accqInfo = accqInfoList.get(0);
			if(accqInfo.getUploadDate()==null || (new Date().getTime() - accqInfo.getUploadDate().getTime())/(1000*60)>30){
				//over 30 min invalid
				//return false;
			}else{
				temperVal = accqInfo.getAirTemperatureValue();
				wetnessVal = accqInfo.getAirWetnessValue();
				lightVal = Float.valueOf(accqInfo.getLightValue());
			}
		}
		//
		Integer lightAction = getCurrentActionByType(GreenhouseCommonConstants.DATAACQUTYPE_LIGHT,lightVal);
		////更新标准 为 applied
		//for each
		    //获取action
			//do action 
		//点亮灯1和灯2
		if(lightAction!=null){
			if(light1!=null){
				int switchOnoff = parseLightAction(lightAction, 1);
				updateSwtichOnOff(light1.getId(), switchOnoff);
			}
			if(light2!=null){
				int switchOnoff = parseLightAction(lightAction, 2);
				updateSwtichOnOff(light2.getId(), switchOnoff);
			}
		}
			//写日志
		//更新标准 为 applied
		
		return false;
	}
	
	/**
	 * 解析light的行为
	 * @Author      :      ZHWANG
	 * @Date        :      2015-1-25
	 * @param sourceAction
	 * @param lightSeq  第几个light，1.第一个， 2第二个
	 * @return
	 */
	private int parseLightAction(Integer sourceAction,Integer lightSeq){
		int result = GreenhouseCommonConstants.TRIGGERACTIONTYPE_OFF;
		if (lightSeq == null) {
			lightSeq = 1;
		}
		if (lightSeq > 1) {
			lightSeq = 2;
		}
		if (lightSeq == 1) {
			switch (sourceAction) {
			case 0:
			case 1:
				result = GreenhouseCommonConstants.TRIGGERACTIONTYPE_OFF;
				break;
			case 10:
			case 11:
				result = GreenhouseCommonConstants.TRIGGERACTIONTYPE_ON;
				break;
			}
		} else if (lightSeq == 2) {
			switch (sourceAction) {
			case 0:
				result = GreenhouseCommonConstants.TRIGGERACTIONTYPE_OFF;
				break;
			case 1:
				result = GreenhouseCommonConstants.TRIGGERACTIONTYPE_ON;
				break;
			case 10:
				result = GreenhouseCommonConstants.TRIGGERACTIONTYPE_OFF;
				break;
			case 11:
				result = GreenhouseCommonConstants.TRIGGERACTIONTYPE_ON;
				break;
			}
		}
		return result;
	}


	/** 
	 * overridden:
	 * @Author      :      ZHWANG
	 * @Date        :      2015-2-1
	 * @see com.zigbee.function.service.IGreenhouseService#getMonitorDetailDtoByCode(java.lang.String)
	**/
	@Override
	public MonitorDetailDto getMonitorDetailDtoByCode(String monitorCode) {
		MonitorDetailDto retDto = new MonitorDetailDto();
		
		Integer curMode = cfgSysControlDao.getCurControlMode();
		List<CfgSysControl> list = cfgSysControlDao.getListByQuery(" from CfgSysControl ");
		if(list==null || list.size()==0){
			retDto.setCurMode(GreenhouseCommonConstants.SYSCONTROL_MODE_AUTO);
			retDto.setCurModeId(-1);
		}else{
			CfgSysControl ctl = list.get(0);
			retDto.setCurMode(ctl.getCurMode());
			retDto.setCurModeId(ctl.getId());
		}
		
		retDto.setCurMode(curMode);
		
		String lightEquipId = "1";
		String lightLineEquipId = "2";
		Equipment light1 = equipmentDao.getEquipmentByCode(lightEquipId);
		Equipment light2 = equipmentDao.getEquipmentByCode(lightLineEquipId);
		
		//获取最新的采集温度湿度和光照度值 - 设备号
		GreenhouseQueryDto queryDto = new GreenhouseQueryDto();
		queryDto.setPointCode(monitorCode);
		List<GreenhouseResultDto> accqInfoList = monitorPointDao.getMonitorResultByDto(queryDto);
		
		if(accqInfoList==null || accqInfoList.size()==0){
			//无采集数据
			retDto.setAirTemperatureValue(0f);
			retDto.setAirWetnessValue(0f);
			retDto.setLightValue(0);
			retDto.setCo2Value(0f);
			retDto.setUploadDate(null);
		}else{
			GreenhouseResultDto accqInfo = accqInfoList.get(0);
			retDto.setAirTemperatureValue(accqInfo.getAirTemperatureValue());
			retDto.setAirWetnessValue(accqInfo.getAirWetnessValue());
			retDto.setLightValue(accqInfo.getLightValue());
			retDto.setCo2Value(accqInfo.getCO2Value());
			retDto.setUploadDate(accqInfo.getUploadDate());
		}
		
		if(light1!=null){
			retDto.setLight1EquipId(light1.getId());
			LightSwitch controller = lightSwitchDao.getEntityByEquipmentId(light1.getId());
			if(controller!=null){
				retDto.setLight1Onoff(controller.getDataValue());
			}else{
				retDto.setLight1Onoff(GreenhouseCommonConstants.TRIGGERACTIONTYPE_OFF);
			}
		}else{
			retDto.setLight1EquipId(-1);
			retDto.setLight1Onoff(GreenhouseCommonConstants.TRIGGERACTIONTYPE_OFF);
		}
		
		if(light2!=null){
			retDto.setLineLight2EquipId(light2.getId());
			LightSwitch controller = lightSwitchDao.getEntityByEquipmentId(light2.getId());
			if(controller!=null){
				retDto.setLineLight2Onoff(controller.getDataValue());
			}else{
				retDto.setLineLight2Onoff(GreenhouseCommonConstants.TRIGGERACTIONTYPE_OFF);
			}
		}else{
			retDto.setLineLight2EquipId(-1);
			retDto.setLineLight2Onoff(GreenhouseCommonConstants.TRIGGERACTIONTYPE_OFF);
		}
		
		return retDto;
	}


	/** 
	 * overridden:
	 * @Author      :      GUDONG
	 * @Date        :      2015年8月30日
	 * @see com.zigbee.function.service.IGreenhouseService#getAllWarningMessages()
	**/
	@Override
	public List<WarningMessagesDto> getAllWarningMessages() {
		List<WarningMessagesDto> list = new ArrayList<WarningMessagesDto>();
		List<WarningMessages> warning = warningMessagesDao.getAllWarningMessages();
		if(warning != null && !warning.isEmpty()){
			for(int i = 0;i < warning.size();i++){
				WarningMessagesDto warningMessage = new WarningMessagesDto();
				warningMessage.setTimestamp(warning.get(i).getTimestamp());
				if(warning.get(i).getWarningtype() == 1){
					warningMessage.setDataAlarmType(GreenhouseCommonConstants.DATA_ACQU_TYPE_1);
				}else if(warning.get(i).getWarningtype() == 2){
					warningMessage.setDataAlarmType(GreenhouseCommonConstants.DATA_ACQU_TYPE_2);
				}else if(warning.get(i).getWarningtype() == 3){
					warningMessage.setDataAlarmType(GreenhouseCommonConstants.DATA_ACQU_TYPE_3);
				}else if(warning.get(i).getWarningtype() == 4){
					warningMessage.setDataAlarmType(GreenhouseCommonConstants.DATA_ACQU_TYPE_4);
				}else if(warning.get(i).getWarningtype() == 5){
					warningMessage.setDataAlarmType(GreenhouseCommonConstants.DATA_ACQU_TYPE_5);
				}
				warningMessage.setContent(warning.get(i).getContent());
				list.add(warningMessage);
			}
		}
		return list;
	}


	/** 
	 * overridden:
	 * @Author      :      GUDONG
	 * @Date        :      2015年8月30日
	 * @see com.zigbee.function.service.IGreenhouseService#getAllVideoMessages()
	**/
	@Override
	public List<VideoMessagesDto> getAllVideoMessages() {
		List<VideoMessagesDto> list = new ArrayList<VideoMessagesDto>();
		List<VideoMessages> video = videoMessagesDao.getAllVideoMessages();
		if(video != null && !video.isEmpty()){
			for(int i = 0;i < video.size();i++){
				VideoMessagesDto videoMessage = new VideoMessagesDto();
				videoMessage.setTimestamp(video.get(i).getTimestamp());
				videoMessage.setVideoName(video.get(i).getVideoName());
				videoMessage.setVideoUrl(video.get(i).getVideoUrl());
				list.add(videoMessage);
			}
		}
		return list;
	}


	/** 
	 * overridden:
	 * @Author      :      GUDONG
	 * @Date        :      2015年8月31日
	 * @see com.zigbee.function.service.IGreenhouseService#getDailyCo2Chart(java.lang.Integer)
	**/
	@Override
	public ChartSeriesDto getDailyCo2Chart(Integer equipmentId) {
		//后台查询，输入参数为设备ID
		List<Co2Concentration> co2List = co2ConcentrationDao.getHoursListByEquipId(equipmentId);
		Map<Integer,Float> hourValMap = new HashMap<Integer,Float>(24);
		//初始化，设置每个小时的初始值为0
		for(int i = 0; i<24 ; i++){
			hourValMap.put(i, new Float(0));
		}
		//后台数据更新map
		if(co2List!=null){
			Calendar cal = Calendar.getInstance();
			for(Co2Concentration co2 : co2List){
				cal.setTime(co2.getUploadDate());
				hourValMap.put(cal.get(Calendar.HOUR_OF_DAY),co2.getDataValue());
			}
		}
		
		//构建返回对象子元素
		List<Float> data = new ArrayList<Float>(24);
		List<String> xAxis = new ArrayList<String>(24);
		for(int i = 0; i<24 ; i++){
			xAxis.add(String.valueOf(i));
			data.add(hourValMap.get(i));
		}
		//构建返回对象
		ChartSeriesDto dto = new ChartSeriesDto();
		dto.setName("CO2浓度");
		dto.setxAxis(xAxis);
		dto.setData(data);
		
		return dto;
	}
	
	
}
