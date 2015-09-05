/************************************************************************************
 * @File name   :      Co2Concentration.java
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
 * 2015年8月30日 下午3:09:44			GUDONG			1.0				Initial Version
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
@Table(name = "co2_tbl")   
public class Co2Concentration extends BaseDomain {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer equipmentId;
    private Integer port;
    private String usage;
    private Date uploadDate;
    private Float dataValue;
    private Integer zero;
    
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
	 * @return the usage
	 */
	@Column(name = "`usage`")
	public String getUsage() {
		return usage;
	}
	/**
	 * @Author      :      GUDONG
	 *
	 * @Date        :      2015年8月30日
	 *
	 * @param usage the usage to set
	 */
	public void setUsage(String usage) {
		this.usage = usage;
	}
	/**
	 * @Author      :      GUDONG
	 *
	 * @Date        :      2015年8月30日
	 *
	 * @return the uploadDate
	 */
	@Column(name = "`uploadDate`")
	public Date getUploadDate() {
		return uploadDate;
	}
	/**
	 * @Author      :      GUDONG
	 *
	 * @Date        :      2015年8月30日
	 *
	 * @param uploadDate the uploadDate to set
	 */
	public void setUploadDate(Date uploadDate) {
		this.uploadDate = uploadDate;
	}
	/**
	 * @Author      :      GUDONG
	 *
	 * @Date        :      2015年8月30日
	 *
	 * @return the dataValue
	 */
	@Column(name = "data_value")
	public Float getDataValue() {
		return dataValue;
	}
	/**
	 * @Author      :      GUDONG
	 *
	 * @Date        :      2015年8月30日
	 *
	 * @param dataValue the dataValue to set
	 */
	public void setDataValue(Float dataValue) {
		this.dataValue = dataValue;
	}
	/**
	 * @Author      :      GUDONG
	 *
	 * @Date        :      2015年8月30日
	 *
	 * @return the zero
	 */
	@Column(name = "zero")
	public Integer getZero() {
		return zero;
	}
	/**
	 * @Author      :      GUDONG
	 *
	 * @Date        :      2015年8月30日
	 *
	 * @param zero the zero to set
	 */
	public void setZero(Integer zero) {
		this.zero = zero;
	}
    
}
