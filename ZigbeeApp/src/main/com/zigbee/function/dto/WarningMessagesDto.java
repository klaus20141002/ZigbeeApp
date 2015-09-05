/************************************************************************************
 * @File name   :      WarningMessagesDto.java
 *
 * @Author      :      GUDONG
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
 * 2015年8月30日 下午5:17:49			GUDONG			1.0				Initial Version
 ************************************************************************************/
package com.zigbee.function.dto;

import java.util.Date;

import com.zigbee.framework.common.dto.BasePagerDto;

/**
 *
 */
public class WarningMessagesDto extends BasePagerDto {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer equipmentId;
	private Date timestamp;//报警时间
	private String dataAlarmType;//报警类型
	private String content; //报警信息
	/**
	 * @Author      :      GUDONG
	 *
	 * @Date        :      2015年8月30日
	 *
	 * @return the timestamp
	 */
	public Date getTimestamp() {
		return timestamp;
	}
	/**
	 * @Author      :      GUDONG
	 *
	 * @Date        :      2015年8月30日
	 *
	 * @param timestamp the timestamp to set
	 */
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	/**
	 * @Author      :      GUDONG
	 *
	 * @Date        :      2015年8月30日
	 *
	 * @return the dataAlarmType
	 */
	public String getDataAlarmType() {
		return dataAlarmType;
	}
	/**
	 * @Author      :      GUDONG
	 *
	 * @Date        :      2015年8月30日
	 *
	 * @param dataAlarmType the dataAlarmType to set
	 */
	public void setDataAlarmType(String dataAlarmType) {
		this.dataAlarmType = dataAlarmType;
	}
	/**
	 * @Author      :      GUDONG
	 *
	 * @Date        :      2015年8月30日
	 *
	 * @return the content
	 */
	public String getContent() {
		return content;
	}
	/**
	 * @Author      :      GUDONG
	 *
	 * @Date        :      2015年8月30日
	 *
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * @Author      :      GUDONG
	 *
	 * @Date        :      2015年8月30日
	 *
	 * @return the equipmentId
	 */
	public Integer getEquipmentId() {
		return equipmentId;
	}
	/**
	 * @Author      :      GUDONG
	 *
	 * @Date        :      2015年8月30日
	 *
	 * @param equipmentId the equipmentId to set
	 */
	public void setEquipmentId(Integer equipmentId) {
		this.equipmentId = equipmentId;
	}
}
