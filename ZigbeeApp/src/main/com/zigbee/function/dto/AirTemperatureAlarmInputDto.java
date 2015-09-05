/************************************************************************************
 * @File name   :      AirTemperatureAlarmInputDto.java
 *
 * @Author      :      DUZHOU
 *
 * @Date        :      2015年8月31日
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
 * 2015年8月31日 下午10:19:06			DUZHOU			1.0				Initial Version
 ************************************************************************************/
package com.zigbee.function.dto;

/**
 *
 */
public class AirTemperatureAlarmInputDto {
	private int temp_val ;

	/**
	 * @Author      :      DUZHOU
	 *
	 * @Date        :      2015年8月31日
	 *
	 * @return the temp_val
	 */
	public int getTemp_val() {
		return temp_val;
	}

	/**
	 * @Author      :      DUZHOU
	 *
	 * @Date        :      2015年8月31日
	 *
	 * @param temp_val the temp_val to set
	 */
	public void setTemp_val(int temp_val) {
		this.temp_val = temp_val;
	}
	
}
