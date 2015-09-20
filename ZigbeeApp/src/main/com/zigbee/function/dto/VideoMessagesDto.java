/************************************************************************************
 * @File name   :      VideoMessages.java
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
 * 2015年8月30日 下午11:44:37			GUDONG			1.0				Initial Version
 ************************************************************************************/
package com.zigbee.function.dto;

import java.util.Date;

import com.zigbee.framework.common.dto.BasePagerDto;

/**
 *
 */
public class VideoMessagesDto extends BasePagerDto  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer equipmentId;
	private String videoName; //视频名称
	private String videoUrl;//视频地址
	private Date timestamp;//时间
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
	/**
	 * @Author      :      GUDONG
	 *
	 * @Date        :      2015年8月30日
	 *
	 * @return the videoName
	 */
	public String getVideoName() {
		return videoName;
	}
	/**
	 * @Author      :      GUDONG
	 *
	 * @Date        :      2015年8月30日
	 *
	 * @param videoName the videoName to set
	 */
	public void setVideoName(String videoName) {
		this.videoName = videoName;
	}
	/**
	 * @Author      :      GUDONG
	 *
	 * @Date        :      2015年8月30日
	 *
	 * @return the videoUrl
	 */
	public String getVideoUrl() {
		return videoUrl;
	}
	/**
	 * @Author      :      GUDONG
	 *
	 * @Date        :      2015年8月30日
	 *
	 * @param videoUrl the videoUrl to set
	 */
	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}
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
}
