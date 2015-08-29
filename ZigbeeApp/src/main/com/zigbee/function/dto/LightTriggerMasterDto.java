/************************************************************************************
 * @File name   :      LightTriggerMasterDto.java
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
 * 2015-1-16 下午09:49:57			ZHWANG			1.0				Initial Version
 ************************************************************************************/
package com.zigbee.function.dto;

import java.util.List;

import com.zigbee.framework.common.dto.BaseDto;

/**
 *
 */
public class LightTriggerMasterDto extends BaseDto {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<LightTriggerItemDto> itemList;

	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2015-1-16
	 *
	 * @return the itemList
	 */
	public List<LightTriggerItemDto> getItemList() {
		return itemList;
	}

	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2015-1-16
	 *
	 * @param itemList the itemList to set
	 */
	public void setItemList(List<LightTriggerItemDto> itemList) {
		this.itemList = itemList;
	}
	
	
}
