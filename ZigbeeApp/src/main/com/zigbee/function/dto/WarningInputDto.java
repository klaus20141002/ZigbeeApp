/************************************************************************************
 * @File name   :      WarningInputDto.java
 *
 * @Author      :      DUZHOU
 *
 * @Date        :      2015年9月5日
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
 * 2015年9月5日 上午11:33:51			DUZHOU			1.0				Initial Version
 ************************************************************************************/
package com.zigbee.function.dto;

/**
 *
 */
public class WarningInputDto {
	private int alertType ;
	private int data_value ;
	public int getAlertType() {
		return alertType;
	}
	public void setAlertType(int alertType) {
		this.alertType = alertType;
	}
	public int getData_value() {
		return data_value;
	}
	public void setData_value(int data_value) {
		this.data_value = data_value;
	}
	
	
}
