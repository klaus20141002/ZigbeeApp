/************************************************************************************
 * @File name   :      GreenhouseResultDto.java
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
 * Aug 21, 2014 11:11:10 PM			ZHWANG			1.0				Initial Version
 ************************************************************************************/
package com.zigbee.function.dto;

import java.util.Date;

import com.zigbee.framework.common.dto.BaseDto;

/**
 *
 */
public class GreenhouseResultDto extends BaseDto {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer equipmentId;
    private Integer port;
    private Integer usage;
    private Date uploadDate;
    private Integer zero;
    private Float temperatureValue;//
    private Float wetnessValue;
    private Integer id;
    private String name;
    private String subject;
    
    private Float airTemperatureValue;//
    private Float airWetnessValue;
    private Float soilTemperatureValue;//
    private Float soilWetnessValue;
    private Integer lightValue;//光照值
    private Float cO2Value; //CO2值
    private Integer lightOnOffValue;
    
    private int switchOnoff = 0;  //当前开关状态 
    private int isOnline = 0;//是否在线
    
    
	/**
	 * @Author      :      ZHWANG
	 * @Date        :      2014-9-10
	 */
	public GreenhouseResultDto() {
		super();
	}

	/**
	 * @Author      :      ZHWANG
	 * @Date        :      2014-9-10
	 * @param id
	 * @param equipmentId
	 * @param name
	 * @param airTemperatureValue
	 * @param airWetnessValue
	 * @param lightValue
	 * @param cO2Value
	 * @param soilTemperatureValue
	 * @param soilWetnessValue
	 * @param uploadDate
	 */
	public GreenhouseResultDto(Integer id, Integer equipmentId, String name,
			Float airTemperatureValue, Float airWetnessValue,
			Integer lightValue, Float cO2Value, Float soilTemperatureValue,
			Float soilWetnessValue, Date uploadDate) {
		super();
		this.id = id;
		this.equipmentId = equipmentId;
		this.name = name;
		this.airTemperatureValue = airTemperatureValue;
		this.airWetnessValue = airWetnessValue;
		this.lightValue = lightValue;
		this.cO2Value = cO2Value;
		this.soilTemperatureValue = soilTemperatureValue;
		this.soilWetnessValue = soilWetnessValue;
		this.uploadDate = uploadDate;
	}
	
	public Integer getEquipmentId() {
		return equipmentId;
	}
	public void setEquipmentId(Integer equipmentId) {
		this.equipmentId = equipmentId;
	}
	public Integer getPort() {
		return port;
	}
	public void setPort(Integer port) {
		this.port = port;
	}
	public Integer getUsage() {
		return usage;
	}
	public void setUsage(Integer usage) {
		this.usage = usage;
	}
	public Date getUploadDate() {
		return uploadDate;
	}
	public void setUploadDate(Date uploadDate) {
		this.uploadDate = uploadDate;
	}
	public Integer getZero() {
		return zero;
	}
	public void setZero(Integer zero) {
		this.zero = zero;
	}
	public Float getTemperatureValue() {
		return temperatureValue;
	}
	public void setTemperatureValue(Float temperatureValue) {
		this.temperatureValue = temperatureValue;
	}
	public Float getWetnessValue() {
		return wetnessValue;
	}
	public void setWetnessValue(Float wetnessValue) {
		this.wetnessValue = wetnessValue;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public Float getAirTemperatureValue() {
		return airTemperatureValue;
	}
	public void setAirTemperatureValue(Float airTemperatureValue) {
		this.airTemperatureValue = airTemperatureValue;
	}
	public Float getAirWetnessValue() {
		return airWetnessValue;
	}
	public void setAirWetnessValue(Float airWetnessValue) {
		this.airWetnessValue = airWetnessValue;
	}
	public Float getSoilTemperatureValue() {
		return soilTemperatureValue;
	}
	public void setSoilTemperatureValue(Float soilTemperatureValue) {
		this.soilTemperatureValue = soilTemperatureValue;
	}
	public Float getSoilWetnessValue() {
		return soilWetnessValue;
	}
	public void setSoilWetnessValue(Float soilWetnessValue) {
		this.soilWetnessValue = soilWetnessValue;
	}
	public Integer getLightValue() {
		return lightValue;
	}
	public void setLightValue(Integer lightValue) {
		this.lightValue = lightValue;
	}
	public Float getCO2Value() {
		return cO2Value;
	}
	public void setCO2Value(Float cO2Value) {
		this.cO2Value = cO2Value;
	}
	public Integer getLightOnOffValue() {
		return lightOnOffValue;
	}
	public void setLightOnOffValue(Integer lightOnOffValue) {
		this.lightOnOffValue = lightOnOffValue;
	}
	public int getSwitchOnoff() {
		return switchOnoff;
	}
	public void setSwitchOnoff(int switchOnoff) {
		this.switchOnoff = switchOnoff;
	}

	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2014-9-10
	 *
	 * @return the isOnline
	 */
	public int getIsOnline() {
		return isOnline;
	}

	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2014-9-10
	 *
	 * @param isOnline the isOnline to set
	 */
	public void setIsOnline(int isOnline) {
		this.isOnline = isOnline;
	}
	
	
}
