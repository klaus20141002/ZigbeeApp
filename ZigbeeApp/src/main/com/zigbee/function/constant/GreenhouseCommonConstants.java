/************************************************************************************
 * @File name   :      GreenhouseCommonConstants.java
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
 * 2014-9-11 上午10:46:39			ZHWANG			1.0				Initial Version
 ************************************************************************************/
package com.zigbee.function.constant;

/**
 *
 */
public interface GreenhouseCommonConstants {
	//开关状态
	public static final int SWITCH_STATUS_ON = 1 ;
	public static final int SWITCH_STATUS_OFF = 0 ;
	
	//设备类型
	public static final int EQUIPMENT_TYPE_DATA_ACQUISITION = 1 ;//数据采集器
	public static final int EQUIPMENT_TYPE_CONTROLLER = 2 ; //控制器-开关、继电器等控制输出
	public static final int EQUIPMENT_TYPE_SENSOR = 3 ;  //传感器
	
	//dataAcquType数据采集类型
	public static final int DATAACQUTYPE_AIRTEMPERATURE = 1 ;//空气温度
	public static final int DATAACQUTYPE_AIRWETNESS = 2 ; //空气湿度
	public static final int DATAACQUTYPE_LIGHT = 3 ;  //光照度
	public static final int DATAACQUTYPE_CO2CONC = 4 ;//CO2浓度
	public static final int DATAACQUTYPE_SOILTEMPERATURE = 5 ; //土壤温度
	public static final int DATAACQUTYPE_SOILWETNESS = 6 ;  //土壤水分含量
	
	//triggerType; -1代表低于，+1代表高于
	public static final int TRIGGERTYPE_LOWER = -1;
	public static final int TRIGGERTYPE_UPPER = 1;
	
	//triggerActionType; //1闭合，2断开
	public static final int TRIGGERACTIONTYPE_ON = 1;
	public static final int TRIGGERACTIONTYPE_OFF = 2;
	//Fetch type of the chart
	int FETCH_TYPE_DAILY = 1; //daily
	int FETCH_TYPE_WEEKLY = 2; //weekly
	int FETCH_TYPE_MONTHY = 3; //monthly
	
	public static final float NO_CONFIG_EXSIT = -1f;
	
	public static final int SYSCONTROL_MODE_AUTO = 1;
	public static final int SYSCONTROL_MODE_MANUAL = 2;
	
	public static final String DATA_ACQU_TYPE_1 = "空气温度";
	public static final String DATA_ACQU_TYPE_2 = "空气湿度";
	public static final String DATA_ACQU_TYPE_3 = "光照度";
	public static final String DATA_ACQU_TYPE_4 = "co2";
	public static final String DATA_ACQU_TYPE_5 = "灌溉报警";
}
