/************************************************************************************
 * @File name   :      Coz.java
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
 * 2015年8月30日 下午11:27:45			DUZHOU			1.0				Initial Version
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


@Entity
@Table(name = "warning_tbl")   
public class Warning extends BaseDomain{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private Integer equipmentId;
    private Integer port;
    private int data_acqu_type;
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

    @Column(name = "equipment_id")
	public Integer getEquipmentId() {
		return equipmentId;
	}

	public void setEquipmentId(Integer equipmentId) {
		this.equipmentId = equipmentId;
	}

	@Column(name = "port")
	public Integer getPort() {
		return port;
	}

	public void setPort(Integer port) {
		this.port = port;
	}

	/**
	 * @Author      :      DUZHOU
	 *
	 * @Date        :      2015年9月1日
	 *
	 * @return the data_acqu_type
	 */
	@Column(name = "data_acqu_type")
	public int getData_acqu_type() {
		return data_acqu_type;
	}

	/**
	 * @Author      :      DUZHOU
	 *
	 * @Date        :      2015年9月1日
	 *
	 * @param data_acqu_type the data_acqu_type to set
	 */
	public void setData_acqu_type(int data_acqu_type) {
		this.data_acqu_type = data_acqu_type;
	}

	/**
	 * @Author      :      DUZHOU
	 *
	 * @Date        :      2015年9月1日
	 *
	 * @return the timestamp
	 */
	@Column(name = "timestamp")
	public Date getTimestamp() {
		return timestamp;
	}

	/**
	 * @Author      :      DUZHOU
	 *
	 * @Date        :      2015年9月1日
	 *
	 * @param timestamp the timestamp to set
	 */
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	/**
	 * @Author      :      DUZHOU
	 *
	 * @Date        :      2015年9月1日
	 *
	 * @return the content
	 */
	@Column(name = "content")
	public String getContent() {
		return content;
	}

	/**
	 * @Author      :      DUZHOU
	 *
	 * @Date        :      2015年9月1日
	 *
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}

    
 }
