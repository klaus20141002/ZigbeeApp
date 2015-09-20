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
@Table(name = "co2_tbl")   
public class Coz extends BaseDomain{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private Integer equipmentId;
    private Integer port;
    private String usage;
    private Date uploadDate;
    private Integer zero;
    private Float dataValue;
    
    
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

	@Column(name = "usage")
	public String getUsage() {
		return usage;
	}

	public void setUsage(String usage) {
		this.usage = usage;
	}

	@Column(name = "uploadDate")
	public Date getUploadDate() {
		return uploadDate;
	}

	public void setUploadDate(Date uploadDate) {
		this.uploadDate = uploadDate;
	}
	
	@Column(name = "zero")
	public Integer getZero() {
		return zero;
	}

	public void setZero(Integer zero) {
		this.zero = zero;
	}

	@Column(name = "data_value")
	public Float getDataValue() {
		return dataValue;
	}

	public void setDataValue(Float dataValue) {
		this.dataValue = dataValue;
	}
    
    
    }
