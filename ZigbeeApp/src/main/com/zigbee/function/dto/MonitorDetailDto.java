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
public class MonitorDetailDto extends BaseDto {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer equipmentId;
    private Integer port;
    private Integer usage;
    private Date uploadDate;
    private Integer zero;
    private Integer id;
    private String name;
    private String subject;
    
    private Float airTemperatureValue;//
    private Float airWetnessValue;
    private Integer lightValue;//光照值

    private Integer curMode; //自动手动
    private int switchOnoff = 0;  //当前开关状态 
    private int isOnline = 0;//是否在线
    
    private Integer light1EquipId;
    private int light1Onoff = 2; //大灯状态
    
    private Integer lineLight2EquipId;
    private int lineLight2Onoff = 2; //条带灯状态
    
    private Integer curModeId;//当前模式ID
    
    
	/**
	 * @Author      :      ZHWANG
	 * @Date        :      2014-9-10
	 */
	public MonitorDetailDto() {
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
	public MonitorDetailDto(Integer id, Integer equipmentId, String name,
			Float airTemperatureValue, Float airWetnessValue,
			Integer lightValue,  Date uploadDate) {
		super();
		this.id = id;
		this.equipmentId = equipmentId;
		this.name = name;
		this.airTemperatureValue = airTemperatureValue;
		this.airWetnessValue = airWetnessValue;
		this.lightValue = lightValue;
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
	public Integer getLightValue() {
		return lightValue;
	}
	public void setLightValue(Integer lightValue) {
		this.lightValue = lightValue;
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

	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2015-2-1
	 *
	 * @return the curMode
	 */
	public Integer getCurMode() {
		return curMode;
	}

	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2015-2-1
	 *
	 * @param curMode the curMode to set
	 */
	public void setCurMode(Integer curMode) {
		this.curMode = curMode;
	}

	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2015-2-1
	 *
	 * @return the light1Onoff
	 */
	public int getLight1Onoff() {
		return light1Onoff;
	}

	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2015-2-1
	 *
	 * @param light1Onoff the light1Onoff to set
	 */
	public void setLight1Onoff(int light1Onoff) {
		this.light1Onoff = light1Onoff;
	}

	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2015-2-1
	 *
	 * @return the lineLight2Onoff
	 */
	public int getLineLight2Onoff() {
		return lineLight2Onoff;
	}

	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2015-2-1
	 *
	 * @param lineLight2Onoff the lineLight2Onoff to set
	 */
	public void setLineLight2Onoff(int lineLight2Onoff) {
		this.lineLight2Onoff = lineLight2Onoff;
	}

	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2015-2-1
	 *
	 * @return the light1EquipId
	 */
	public Integer getLight1EquipId() {
		return light1EquipId;
	}

	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2015-2-1
	 *
	 * @param light1EquipId the light1EquipId to set
	 */
	public void setLight1EquipId(Integer light1EquipId) {
		this.light1EquipId = light1EquipId;
	}

	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2015-2-1
	 *
	 * @return the lineLight2EquipId
	 */
	public Integer getLineLight2EquipId() {
		return lineLight2EquipId;
	}

	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2015-2-1
	 *
	 * @param lineLight2EquipId the lineLight2EquipId to set
	 */
	public void setLineLight2EquipId(Integer lineLight2EquipId) {
		this.lineLight2EquipId = lineLight2EquipId;
	}

	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2015-2-7
	 *
	 * @return the curModeId
	 */
	public Integer getCurModeId() {
		return curModeId;
	}

	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2015-2-7
	 *
	 * @param curModeId the curModeId to set
	 */
	public void setCurModeId(Integer curModeId) {
		this.curModeId = curModeId;
	}
	
}
