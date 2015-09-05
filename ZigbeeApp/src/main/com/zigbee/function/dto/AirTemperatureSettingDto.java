/************************************************************************************
 * @File name   :      AirTemperatureSettingDto.java
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
 * 2015年8月30日 下午9:49:46			DUZHOU			1.0				Initial Version
 ************************************************************************************/
package com.zigbee.function.dto;

/**
 *
 */
public class AirTemperatureSettingDto {
	private int  temp_threshold ;
	private int hum_threshold ;
	/**
	 * @Author      :      DUZHOU
	 *
	 * @Date        :      2015年8月30日
	 *
	 * @return the temp_threshold
	 */
	public int getTemp_threshold() {
		return temp_threshold;
	}
	/**
	 * @Author      :      DUZHOU
	 *
	 * @Date        :      2015年8月30日
	 *
	 * @param temp_threshold the temp_threshold to set
	 */
	public void setTemp_threshold(int temp_threshold) {
		this.temp_threshold = temp_threshold;
	}
	/**
	 * @Author      :      DUZHOU
	 *
	 * @Date        :      2015年8月30日
	 *
	 * @return the hum_threshold
	 */
	public int getHum_threshold() {
		return hum_threshold;
	}
	/**
	 * @Author      :      DUZHOU
	 *
	 * @Date        :      2015年8月30日
	 *
	 * @param hum_threshold the hum_threshold to set
	 */
	public void setHum_threshold(int hum_threshold) {
		this.hum_threshold = hum_threshold;
	}
	
}
