/************************************************************************************
 * @File name   :      LightTriggerEditDto.java
 *
 * @Author      :      ZHWANG
 *
 * @Date        :      2015-1-16
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
 * 2015-1-16 上午10:42:14			ZHWANG			1.0				Initial Version
 ************************************************************************************/
package com.zigbee.function.dto;

import com.zigbee.framework.common.dto.BaseDto;

/**
 *
 */
public class LightTriggerItemDto extends BaseDto {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Integer fromHour=0;
    private Integer fromMinute=0;
    private Integer toHour=0;
    private Integer toMinute=0;
    private Integer greaterAction=0;
    private Integer lessAction=0;
    private Integer isValid=0;
    private Float thresholdValue=0f;
    
    
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
	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2015-1-16
	 *
	 * @return the fromHour
	 */
	public Integer getFromHour() {
		return fromHour;
	}
	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2015-1-16
	 *
	 * @param fromHour the fromHour to set
	 */
	public void setFromHour(Integer fromHour) {
		this.fromHour = fromHour;
	}
	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2015-1-16
	 *
	 * @return the fromMinute
	 */
	public Integer getFromMinute() {
		return fromMinute;
	}
	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2015-1-16
	 *
	 * @param fromMinute the fromMinute to set
	 */
	public void setFromMinute(Integer fromMinute) {
		this.fromMinute = fromMinute;
	}
	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2015-1-16
	 *
	 * @return the toHour
	 */
	public Integer getToHour() {
		return toHour;
	}
	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2015-1-16
	 *
	 * @param toHour the toHour to set
	 */
	public void setToHour(Integer toHour) {
		this.toHour = toHour;
	}
	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2015-1-16
	 *
	 * @return the toMinute
	 */
	public Integer getToMinute() {
		return toMinute;
	}
	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2015-1-16
	 *
	 * @param toMinute the toMinute to set
	 */
	public void setToMinute(Integer toMinute) {
		this.toMinute = toMinute;
	}
	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2015-1-16
	 *
	 * @return the greaterAction
	 */
	public Integer getGreaterAction() {
		return greaterAction;
	}
	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2015-1-16
	 *
	 * @param greaterAction the greaterAction to set
	 */
	public void setGreaterAction(Integer greaterAction) {
		this.greaterAction = greaterAction;
	}
	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2015-1-16
	 *
	 * @return the lessAction
	 */
	public Integer getLessAction() {
		return lessAction;
	}
	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2015-1-16
	 *
	 * @param lessAction the lessAction to set
	 */
	public void setLessAction(Integer lessAction) {
		this.lessAction = lessAction;
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
	 * @return the thresholdValue
	 */
	public Float getThresholdValue() {
		return thresholdValue;
	}
	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2015-1-16
	 *
	 * @param thresholdValue the thresholdValue to set
	 */
	public void setThresholdValue(Float thresholdValue) {
		this.thresholdValue = thresholdValue;
	}
    
    
}
