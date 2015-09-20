/************************************************************************************
 * @File name   :      AirTemperatureReportUploadDto.java
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
 * 2015年8月30日 下午12:25:23			DUZHOU			1.0				Initial Version
 ************************************************************************************/
package com.zigbee.function.dto;

/**
 *
 */
public class AirTemperatureReportInputDto {
	private String temp_val ;//温度
	private String hum_val ;//湿度
	/**
	 * @Author      :      DUZHOU
	 *
	 * @Date        :      2015年8月30日
	 *
	 * @return the temp_val
	 */
	public String getTemp_val() {
		return temp_val;
	}
	/**
	 * @Author      :      DUZHOU
	 *
	 * @Date        :      2015年8月30日
	 *
	 * @param temp_val the temp_val to set
	 */
	public void setTemp_val(String temp_val) {
		this.temp_val = temp_val;
	}
	/**
	 * @Author      :      DUZHOU
	 *
	 * @Date        :      2015年8月30日
	 *
	 * @return the hum_val
	 */
	public String getHum_val() {
		return hum_val;
	}
	/**
	 * @Author      :      DUZHOU
	 *
	 * @Date        :      2015年8月30日
	 *
	 * @param hum_val the hum_val to set
	 */
	public void setHum_val(String hum_val) {
		this.hum_val = hum_val;
	}
	
}
