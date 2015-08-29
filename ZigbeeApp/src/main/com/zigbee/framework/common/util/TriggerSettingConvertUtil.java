/************************************************************************************
 * @File name   :      TriggerSettingConvertUtil.java
 *
 * @Author      :      ZHWANG
 *
 * @Date        :      2014-9-11
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
 * 2014-9-11 下午04:36:42			ZHWANG			1.0				Initial Version
 ************************************************************************************/
package com.zigbee.framework.common.util;

import java.util.ArrayList;
import java.util.List;

import com.zigbee.function.constant.GreenhouseCommonConstants;
import com.zigbee.function.domain.TriggerSetting;
import com.zigbee.function.dto.CascadeCfgEditDto;

/**
 *在dto和domain之间转换
 */
public class TriggerSettingConvertUtil {

	private TriggerSettingConvertUtil(){
	}
	/**
	 * convert dto to domain list
	 * @Author      :      ZHWANG
	 * @Date        :      2014-9-11
	 * @param dto
	 * @return
	 */
	public static List<TriggerSetting> convertDtoToDomain(CascadeCfgEditDto dto){
		List<TriggerSetting> list= new ArrayList<TriggerSetting>(12);
		if(dto!=null){
			TriggerSetting lat = new TriggerSetting();
			lat.setDataAcquType(GreenhouseCommonConstants.DATAACQUTYPE_AIRTEMPERATURE);
			lat.setTriggerType(Integer.valueOf(GreenhouseCommonConstants.TRIGGERTYPE_LOWER).byteValue());
			lat.setTriggerVal(dto.getLowerAirTemperature()==null ? null : Float.valueOf(dto.getLowerAirTemperature()));
			lat.setTriggerActionType(dto.getLowerAirTemperatureAction());
			list.add(lat);
			TriggerSetting hat = new TriggerSetting();
			hat.setDataAcquType(GreenhouseCommonConstants.DATAACQUTYPE_AIRTEMPERATURE);
			hat.setTriggerType(Integer.valueOf(GreenhouseCommonConstants.TRIGGERTYPE_UPPER).byteValue());
			hat.setTriggerVal(dto.getHigherAirTemperature()==null ? null : Float.valueOf(dto.getHigherAirTemperature()));
			hat.setTriggerActionType(dto.getHigherAirTemperatureAction());
			list.add(hat);
			
			TriggerSetting law = new TriggerSetting();
			law.setDataAcquType(GreenhouseCommonConstants.DATAACQUTYPE_AIRWETNESS);
			law.setTriggerType(Integer.valueOf(GreenhouseCommonConstants.TRIGGERTYPE_LOWER).byteValue());
			law.setTriggerVal(dto.getLowerAirWetness()==null ? null : Float.valueOf(dto.getLowerAirWetness()));
			law.setTriggerActionType(dto.getLowerAirWetnessAction());
			list.add(law);
			TriggerSetting haw = new TriggerSetting();
			haw.setDataAcquType(GreenhouseCommonConstants.DATAACQUTYPE_AIRWETNESS);
			haw.setTriggerType(Integer.valueOf(GreenhouseCommonConstants.TRIGGERTYPE_UPPER).byteValue());
			haw.setTriggerVal(dto.getHigherAirWetness()==null ? null : Float.valueOf(dto.getHigherAirWetness()));
			haw.setTriggerActionType(dto.getHigherAirWetnessAction());
			list.add(haw);
			
			TriggerSetting lli = new TriggerSetting();
			lli.setDataAcquType(GreenhouseCommonConstants.DATAACQUTYPE_LIGHT);
			lli.setTriggerType(Integer.valueOf(GreenhouseCommonConstants.TRIGGERTYPE_LOWER).byteValue());
			lli.setTriggerVal(dto.getLowerLight()==null ? null : Float.valueOf(dto.getLowerLight()));
			lli.setTriggerActionType(dto.getLowerLightAction());
			list.add(lli);
			TriggerSetting hli = new TriggerSetting();
			hli.setDataAcquType(GreenhouseCommonConstants.DATAACQUTYPE_LIGHT);
			hli.setTriggerType(Integer.valueOf(GreenhouseCommonConstants.TRIGGERTYPE_UPPER).byteValue());
			hli.setTriggerVal(dto.getHigherLight()==null ? null : Float.valueOf(dto.getHigherLight()));
			hli.setTriggerActionType(dto.getHigherLightAction());
			list.add(hli);
			
			TriggerSetting lco = new TriggerSetting();
			lco.setDataAcquType(GreenhouseCommonConstants.DATAACQUTYPE_CO2CONC);
			lco.setTriggerType(Integer.valueOf(GreenhouseCommonConstants.TRIGGERTYPE_LOWER).byteValue());
			lco.setTriggerVal(dto.getLowerCO2Conc()==null ? null : Float.valueOf(dto.getLowerCO2Conc()));
			lco.setTriggerActionType(dto.getLowerCO2ConcAction());
			list.add(lco);
			TriggerSetting hco = new TriggerSetting();
			hco.setDataAcquType(GreenhouseCommonConstants.DATAACQUTYPE_CO2CONC);
			hco.setTriggerType(Integer.valueOf(GreenhouseCommonConstants.TRIGGERTYPE_UPPER).byteValue());
			hco.setTriggerVal(dto.getHigherCO2Conc()==null ? null : Float.valueOf(dto.getHigherCO2Conc()));
			hco.setTriggerActionType(dto.getHigherCO2ConcAction());
			list.add(hco);
			
			TriggerSetting lst = new TriggerSetting();
			lst.setDataAcquType(GreenhouseCommonConstants.DATAACQUTYPE_SOILTEMPERATURE);
			lst.setTriggerType(Integer.valueOf(GreenhouseCommonConstants.TRIGGERTYPE_LOWER).byteValue());
			lst.setTriggerVal(dto.getLowerSoilTemperature()==null ? null : Float.valueOf(dto.getLowerSoilTemperature()));
			lst.setTriggerActionType(dto.getLowerSoilTemperatureAction());
			list.add(lst);
			TriggerSetting hst = new TriggerSetting();
			hst.setDataAcquType(GreenhouseCommonConstants.DATAACQUTYPE_SOILTEMPERATURE);
			hst.setTriggerType(Integer.valueOf(GreenhouseCommonConstants.TRIGGERTYPE_UPPER).byteValue());
			hst.setTriggerVal(dto.getHigherSoilTemperature()==null ? null : Float.valueOf(dto.getHigherSoilTemperature()));
			hst.setTriggerActionType(dto.getHigherSoilTemperatureAction());
			list.add(hst);
			
			TriggerSetting lsw = new TriggerSetting();
			lsw.setDataAcquType(GreenhouseCommonConstants.DATAACQUTYPE_SOILWETNESS);
			lsw.setTriggerType(Integer.valueOf(GreenhouseCommonConstants.TRIGGERTYPE_LOWER).byteValue());
			lsw.setTriggerVal(dto.getLowerSoilWetness()==null ? null : Float.valueOf(dto.getLowerSoilWetness()));
			lsw.setTriggerActionType(dto.getLowerSoilWetnessAction());
			list.add(lsw);
			TriggerSetting hsw = new TriggerSetting();
			hsw.setDataAcquType(GreenhouseCommonConstants.DATAACQUTYPE_SOILWETNESS);
			hsw.setTriggerType(Integer.valueOf(GreenhouseCommonConstants.TRIGGERTYPE_UPPER).byteValue());
			hsw.setTriggerVal(dto.getHigherSoilWetness()==null ? null : Float.valueOf(dto.getHigherSoilWetness()));
			hsw.setTriggerActionType(dto.getHigherSoilWetnessAction());
			list.add(hsw);
		}
		return list;
	}
	
	/**
	 * covert domain list to editDto
	 * @Author      :      ZHWANG
	 * @Date        :      2014-9-11
	 * @param domains
	 * @return
	 */
	public static CascadeCfgEditDto convertDomainToDto(List<TriggerSetting> domains){
		CascadeCfgEditDto dto = new CascadeCfgEditDto();
		if(domains!=null && domains.size()>0){
			for(TriggerSetting domain : domains){
				switch(domain.getDataAcquType()){
				case GreenhouseCommonConstants.DATAACQUTYPE_AIRTEMPERATURE:
					if (domain.getTriggerType()!=null){
						if(domain.getTriggerType() == GreenhouseCommonConstants.TRIGGERTYPE_LOWER){
							dto.setLowerAirTemperature(domain.getTriggerVal().intValue());
							dto.setLowerAirTemperatureAction(domain.getTriggerActionType());
						}else{
							dto.setHigherAirTemperature(domain.getTriggerVal().intValue());
							dto.setHigherAirTemperatureAction(domain.getTriggerActionType());
						}
					}
					break;
				case GreenhouseCommonConstants.DATAACQUTYPE_AIRWETNESS:
					if (domain.getTriggerType()!=null){
						if(domain.getTriggerType() == GreenhouseCommonConstants.TRIGGERTYPE_LOWER){
							dto.setLowerAirWetness(domain.getTriggerVal().intValue());
							dto.setLowerAirWetnessAction(domain.getTriggerActionType());
						}else{
							dto.setHigherAirWetness(domain.getTriggerVal().intValue());
							dto.setHigherAirWetnessAction(domain.getTriggerActionType());
						}
					}
					break;
				case GreenhouseCommonConstants.DATAACQUTYPE_LIGHT:
					if (domain.getTriggerType()!=null){
						if(domain.getTriggerType() == GreenhouseCommonConstants.TRIGGERTYPE_LOWER){
							dto.setLowerLight(domain.getTriggerVal().intValue());
							dto.setLowerLightAction(domain.getTriggerActionType());
						}else{
							dto.setHigherLight(domain.getTriggerVal().intValue());
							dto.setHigherLightAction(domain.getTriggerActionType());
						}
					}
					break;
				case GreenhouseCommonConstants.DATAACQUTYPE_CO2CONC:
					if (domain.getTriggerType()!=null){
						if(domain.getTriggerType() == GreenhouseCommonConstants.TRIGGERTYPE_LOWER){
							dto.setLowerCO2Conc(domain.getTriggerVal().intValue());
							dto.setLowerCO2ConcAction(domain.getTriggerActionType());
						}else{
							dto.setHigherCO2Conc(domain.getTriggerVal().intValue());
							dto.setHigherCO2ConcAction(domain.getTriggerActionType());
						}
					}
					break;
				case GreenhouseCommonConstants.DATAACQUTYPE_SOILTEMPERATURE:
					if (domain.getTriggerType()!=null){
						if(domain.getTriggerType() == GreenhouseCommonConstants.TRIGGERTYPE_LOWER){
							dto.setLowerSoilTemperature(domain.getTriggerVal().intValue());
							dto.setLowerSoilTemperatureAction(domain.getTriggerActionType());
						}else{
							dto.setHigherSoilTemperature(domain.getTriggerVal().intValue());
							dto.setHigherSoilTemperatureAction(domain.getTriggerActionType());
						}
					}
					break;
				case GreenhouseCommonConstants.DATAACQUTYPE_SOILWETNESS:
					if (domain.getTriggerType()!=null){
						if(domain.getTriggerType() == GreenhouseCommonConstants.TRIGGERTYPE_LOWER){
							dto.setLowerSoilWetness(domain.getTriggerVal().intValue());
							dto.setLowerSoilWetnessAction(domain.getTriggerActionType());
						}else{
							dto.setHigherSoilWetness(domain.getTriggerVal().intValue());
							dto.setHigherSoilWetnessAction(domain.getTriggerActionType());
						}
					}
					break;
				
				}
				
			}
		}
		return dto;
	}
}
