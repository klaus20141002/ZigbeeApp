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
 * 2015年8月30日 下午11:53:28			GUDONG			1.0				Initial Version
 ************************************************************************************/
package com.zigbee.function.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.zigbee.framework.common.domain.BaseDomain;

/**
 *
 */
@Entity
@Table(name = "video_tbl")
public class VideoMessages extends BaseDomain {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer equipmentId;
	private String videoName; //视频名称
	private String videoUrl;//视频地址
	private Date timestamp;//时间
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY) 
    public Integer getId(){
        return this.id;
    }
    
    public void setId(Integer id){
        this.id = id;
    }
	/**
	 * @Author      :      GUDONG
	 *
	 * @Date        :      2015年8月30日
	 *
	 * @return the equipmentId
	 */
    @Column(name = "equipment_id")
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
	@Column(name = "video_name")
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
	@Column(name = "video_url")
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
	@Column(name = "timestamp")
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
