/************************************************************************************
 * @File name   :      ThresholdMasterDto.java
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
 * 2015-1-15 下午05:25:51			ZHWANG			1.0				Initial Version
 ************************************************************************************/
package com.zigbee.function.dto;

import java.util.List;

import com.zigbee.framework.common.dto.BaseDto;

/**
 *
 */
public class ThresholdMasterDto extends BaseDto {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer cfgType;
    private Integer isConstant=0; //当前是否恒温有效
    private Float constantValue=0f; //常量设定值
    private Float region=0f; //浮动区间
    private List<ThresholdItemDto> itemList;
    private String cfgTypeText;
    private Integer constantId;
    private Integer triggerModeId;
	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2015-1-16
	 *
	 * @return the cfgType
	 */
	public Integer getCfgType() {
		return cfgType;
	}
	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2015-1-16
	 *
	 * @param cfgType the cfgType to set
	 */
	public void setCfgType(Integer cfgType) {
		this.cfgType = cfgType;
	}
	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2015-1-16
	 *
	 * @return the isConstant
	 */
	public Integer getIsConstant() {
		return isConstant;
	}
	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2015-1-16
	 *
	 * @param isConstant the isConstant to set
	 */
	public void setIsConstant(Integer isConstant) {
		this.isConstant = isConstant;
	}
	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2015-1-16
	 *
	 * @return the constantValue
	 */
	public Float getConstantValue() {
		return constantValue;
	}
	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2015-1-16
	 *
	 * @param constantValue the constantValue to set
	 */
	public void setConstantValue(Float constantValue) {
		this.constantValue = constantValue;
	}
	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2015-1-16
	 *
	 * @return the region
	 */
	public Float getRegion() {
		return region;
	}
	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2015-1-16
	 *
	 * @param region the region to set
	 */
	public void setRegion(Float region) {
		this.region = region;
	}
	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2015-1-16
	 *
	 * @return the itemList
	 */
	public List<ThresholdItemDto> getItemList() {
		return itemList;
	}
	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2015-1-16
	 *
	 * @param itemList the itemList to set
	 */
	public void setItemList(List<ThresholdItemDto> itemList) {
		this.itemList = itemList;
	}
	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2015-1-16
	 *
	 * @return the cfgTypeText
	 */
	public String getCfgTypeText() {
		if(cfgTypeText!=null){
			return cfgTypeText;
		}
		if(getCfgType()!=null){
			return getCfgType()==1 ? "温度" : (getCfgType()==2 ? "湿度" : "光照度" );
		}
		return "光照度";
	}
	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2015-1-16
	 *
	 * @param cfgTypeText the cfgTypeText to set
	 */
	public void setCfgTypeText(String cfgTypeText) {
		this.cfgTypeText = cfgTypeText;
	}
	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2015-1-17
	 *
	 * @return the constantId
	 */
	public Integer getConstantId() {
		return constantId;
	}
	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2015-1-17
	 *
	 * @param constantId the constantId to set
	 */
	public void setConstantId(Integer constantId) {
		this.constantId = constantId;
	}
	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2015-1-17
	 *
	 * @return the triggerModeId
	 */
	public Integer getTriggerModeId() {
		return triggerModeId;
	}
	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2015-1-17
	 *
	 * @param triggerModeId the triggerModeId to set
	 */
	public void setTriggerModeId(Integer triggerModeId) {
		this.triggerModeId = triggerModeId;
	}
}
