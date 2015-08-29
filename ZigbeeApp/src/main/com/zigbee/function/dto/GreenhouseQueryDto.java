/************************************************************************************
 * @File name   :      GreenhouseQueryDto.java
 *
 * @Author      :      ZHWANG
 *
 * @Date        :      Aug 21, 2014
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
 * Aug 21, 2014 11:06:43 PM			ZHWANG			1.0				Initial Version
 ************************************************************************************/
package com.zigbee.function.dto;

import com.zigbee.framework.common.dto.BasePagerDto;

/**
 *
 */
public class GreenhouseQueryDto extends BasePagerDto {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer equipmentId;
    private Integer port;
    private Integer type;
    private String pointName;
    private String pointCode;
    
	public Integer getEquipmentId() {
		return equipmentId;
	}
	public void setEquipmentId(Integer equipmentId) {
		this.equipmentId = equipmentId;
	}
	public Integer getPort() {
		return port;
	}
	public void setPort(Integer port) {
		this.port = port;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2015-1-25
	 *
	 * @return the pointName
	 */
	public String getPointName() {
		return pointName;
	}
	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2015-1-25
	 *
	 * @param pointName the pointName to set
	 */
	public void setPointName(String pointName) {
		this.pointName = pointName;
	}
	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2015-1-25
	 *
	 * @return the pointCode
	 */
	public String getPointCode() {
		return pointCode;
	}
	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2015-1-25
	 *
	 * @param pointCode the pointCode to set
	 */
	public void setPointCode(String pointCode) {
		this.pointCode = pointCode;
	}

}
