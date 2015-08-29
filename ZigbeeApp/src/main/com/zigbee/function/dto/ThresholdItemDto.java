/************************************************************************************
 * @File name   :      ThresholdItemDto.java
 *
 * @Author      :      ZHWANG
 *
 * @Date        :      2015-1-15
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
 * 2015-1-15 下午05:27:01			ZHWANG			1.0				Initial Version
 ************************************************************************************/
package com.zigbee.function.dto;

import com.zigbee.framework.common.dto.BaseDto;

/**
 *
 */
public class ThresholdItemDto extends BaseDto {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer cfgHour=0;
    private Integer cfgMinute=0;
    private Float cfgValue=0f;
    private Integer isValid=1;
    private Integer id;
	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2015-1-16
	 *
	 * @return the cfgHour
	 */
	public Integer getCfgHour() {
		return cfgHour;
	}
	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2015-1-16
	 *
	 * @param cfgHour the cfgHour to set
	 */
	public void setCfgHour(Integer cfgHour) {
		this.cfgHour = cfgHour;
	}
	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2015-1-16
	 *
	 * @return the cfgMinute
	 */
	public Integer getCfgMinute() {
		return cfgMinute;
	}
	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2015-1-16
	 *
	 * @param cfgMinute the cfgMinute to set
	 */
	public void setCfgMinute(Integer cfgMinute) {
		this.cfgMinute = cfgMinute;
	}
	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2015-1-16
	 *
	 * @return the cfgValue
	 */
	public Float getCfgValue() {
		return cfgValue;
	}
	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2015-1-16
	 *
	 * @param cfgValue the cfgValue to set
	 */
	public void setCfgValue(Float cfgValue) {
		this.cfgValue = cfgValue;
	}
	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2015-1-16
	 *
	 * @return the isValid
	 */
	public Integer getIsValid() {
		return isValid;
	}
	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2015-1-16
	 *
	 * @param isValid the isValid to set
	 */
	public void setIsValid(Integer isValid) {
		this.isValid = isValid;
	}
	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2015-1-16
	 *
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2015-1-16
	 *
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
    
    
}
