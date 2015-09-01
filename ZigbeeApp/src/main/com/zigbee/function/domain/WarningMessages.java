/************************************************************************************
 * @File name   :      WarningMessages.java
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
 * 2015年8月30日 下午5:43:11			GUDONG			1.0				Initial Version
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
@Table(name = "warning_tbl") 
public class WarningMessages extends BaseDomain{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer equipmentId;
    private Integer port;
    private Integer warningtype;
    private Date timestamp;
    private String content;
    
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
	 * @return the port
	 */
	@Column(name = "port")
	public Integer getPort() {
		return port;
	}

	/**
	 * @Author      :      GUDONG
	 *
	 * @Date        :      2015年8月30日
	 *
	 * @param port the port to set
	 */
	public void setPort(Integer port) {
		this.port = port;
	}

	/**
	 * @Author      :      GUDONG
	 *
	 * @Date        :      2015年8月30日
	 *
	 * @return the warningtype
	 */
	@Column(name = "data_acqu_type")
	public Integer getWarningtype() {
		return warningtype;
	}

	/**
	 * @Author      :      GUDONG
	 *
	 * @Date        :      2015年8月30日
	 *
	 * @param warningtype the warningtype to set
	 */
	public void setWarningtype(Integer warningtype) {
		this.warningtype = warningtype;
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

	/**
	 * @Author      :      GUDONG
	 *
	 * @Date        :      2015年8月30日
	 *
	 * @return the content
	 */
	@Column(name = "content")
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
}
