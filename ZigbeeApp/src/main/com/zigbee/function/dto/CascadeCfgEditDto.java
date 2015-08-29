/************************************************************************************
 * @File name   :      CascadeCfgEditDto.java
 *
 * @Author      :      ZHWANG
 *
 * @Date        :      Aug 27, 2014
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
 * Aug 27, 2014 1:39:43 PM			ZHWANG			1.0				Initial Version
 ************************************************************************************/
package com.zigbee.function.dto;

import com.zigbee.framework.common.dto.BaseDto;

/**
 *
 */
public class CascadeCfgEditDto extends BaseDto {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer Id;
	private Integer autoControl; //是否启动自动控制模式
	
	//空气温度；
	private Integer lowerAirTemperature ;
	private Integer lowerAirTemperatureAction;
	private Integer higherAirTemperature;
	private Integer higherAirTemperatureAction;
	//空气湿度；
	private Integer lowerAirWetness ;
	private Integer lowerAirWetnessAction;
	private Integer higherAirWetness;
	private Integer higherAirWetnessAction;

	//光照度；
	private Integer lowerLight ;
	private Integer lowerLightAction;
	private Integer higherLight;
	private Integer higherLightAction;
	
	//CO2浓度；
	private Integer lowerCO2Conc ;
	private Integer lowerCO2ConcAction;
	private Integer higherCO2Conc;
	private Integer higherCO2ConcAction;
	
	//土壤温度；
	private Integer lowerSoilTemperature ;
	private Integer lowerSoilTemperatureAction;
	private Integer higherSoilTemperature;
	private Integer higherSoilTemperatureAction;
	
	//土壤水分含量；
	private Integer lowerSoilWetness ;
	private Integer lowerSoilWetnessAction;
	private Integer higherSoilWetness;
	private Integer higherSoilWetnessAction;
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public Integer getAutoControl() {
		return autoControl;
	}
	public void setAutoControl(Integer autoControl) {
		this.autoControl = autoControl;
	}
	public Integer getLowerAirTemperature() {
		return lowerAirTemperature;
	}
	public void setLowerAirTemperature(Integer lowerAirTemperature) {
		this.lowerAirTemperature = lowerAirTemperature;
	}
	public Integer getLowerAirTemperatureAction() {
		return lowerAirTemperatureAction;
	}
	public void setLowerAirTemperatureAction(Integer lowerAirTemperatureAction) {
		this.lowerAirTemperatureAction = lowerAirTemperatureAction;
	}
	public Integer getHigherAirTemperature() {
		return higherAirTemperature;
	}
	public void setHigherAirTemperature(Integer higherAirTemperature) {
		this.higherAirTemperature = higherAirTemperature;
	}
	public Integer getHigherAirTemperatureAction() {
		return higherAirTemperatureAction;
	}
	public void setHigherAirTemperatureAction(Integer higherAirTemperatureAction) {
		this.higherAirTemperatureAction = higherAirTemperatureAction;
	}
	public Integer getLowerAirWetness() {
		return lowerAirWetness;
	}
	public void setLowerAirWetness(Integer lowerAirWetness) {
		this.lowerAirWetness = lowerAirWetness;
	}
	public Integer getLowerAirWetnessAction() {
		return lowerAirWetnessAction;
	}
	public void setLowerAirWetnessAction(Integer lowerAirWetnessAction) {
		this.lowerAirWetnessAction = lowerAirWetnessAction;
	}
	public Integer getHigherAirWetness() {
		return higherAirWetness;
	}
	public void setHigherAirWetness(Integer higherAirWetness) {
		this.higherAirWetness = higherAirWetness;
	}
	public Integer getHigherAirWetnessAction() {
		return higherAirWetnessAction;
	}
	public void setHigherAirWetnessAction(Integer higherAirWetnessAction) {
		this.higherAirWetnessAction = higherAirWetnessAction;
	}
	public Integer getLowerLight() {
		return lowerLight;
	}
	public void setLowerLight(Integer lowerLight) {
		this.lowerLight = lowerLight;
	}
	public Integer getLowerLightAction() {
		return lowerLightAction;
	}
	public void setLowerLightAction(Integer lowerLightAction) {
		this.lowerLightAction = lowerLightAction;
	}
	public Integer getHigherLight() {
		return higherLight;
	}
	public void setHigherLight(Integer higherLight) {
		this.higherLight = higherLight;
	}
	public Integer getHigherLightAction() {
		return higherLightAction;
	}
	public void setHigherLightAction(Integer higherLightAction) {
		this.higherLightAction = higherLightAction;
	}
	public Integer getLowerCO2Conc() {
		return lowerCO2Conc;
	}
	public void setLowerCO2Conc(Integer lowerCO2Conc) {
		this.lowerCO2Conc = lowerCO2Conc;
	}
	public Integer getLowerCO2ConcAction() {
		return lowerCO2ConcAction;
	}
	public void setLowerCO2ConcAction(Integer lowerCO2ConcAction) {
		this.lowerCO2ConcAction = lowerCO2ConcAction;
	}
	public Integer getHigherCO2Conc() {
		return higherCO2Conc;
	}
	public void setHigherCO2Conc(Integer higherCO2Conc) {
		this.higherCO2Conc = higherCO2Conc;
	}
	public Integer getHigherCO2ConcAction() {
		return higherCO2ConcAction;
	}
	public void setHigherCO2ConcAction(Integer higherCO2ConcAction) {
		this.higherCO2ConcAction = higherCO2ConcAction;
	}
	public Integer getLowerSoilTemperature() {
		return lowerSoilTemperature;
	}
	public void setLowerSoilTemperature(Integer lowerSoilTemperature) {
		this.lowerSoilTemperature = lowerSoilTemperature;
	}
	public Integer getLowerSoilTemperatureAction() {
		return lowerSoilTemperatureAction;
	}
	public void setLowerSoilTemperatureAction(Integer lowerSoilTemperatureAction) {
		this.lowerSoilTemperatureAction = lowerSoilTemperatureAction;
	}
	public Integer getHigherSoilTemperature() {
		return higherSoilTemperature;
	}
	public void setHigherSoilTemperature(Integer higherSoilTemperature) {
		this.higherSoilTemperature = higherSoilTemperature;
	}
	public Integer getHigherSoilTemperatureAction() {
		return higherSoilTemperatureAction;
	}
	public void setHigherSoilTemperatureAction(Integer higherSoilTemperatureAction) {
		this.higherSoilTemperatureAction = higherSoilTemperatureAction;
	}
	public Integer getLowerSoilWetness() {
		return lowerSoilWetness;
	}
	public void setLowerSoilWetness(Integer lowerSoilWetness) {
		this.lowerSoilWetness = lowerSoilWetness;
	}
	public Integer getLowerSoilWetnessAction() {
		return lowerSoilWetnessAction;
	}
	public void setLowerSoilWetnessAction(Integer lowerSoilWetnessAction) {
		this.lowerSoilWetnessAction = lowerSoilWetnessAction;
	}
	public Integer getHigherSoilWetness() {
		return higherSoilWetness;
	}
	public void setHigherSoilWetness(Integer higherSoilWetness) {
		this.higherSoilWetness = higherSoilWetness;
	}
	public Integer getHigherSoilWetnessAction() {
		return higherSoilWetnessAction;
	}
	public void setHigherSoilWetnessAction(Integer higherSoilWetnessAction) {
		this.higherSoilWetnessAction = higherSoilWetnessAction;
	}
	
	
}
