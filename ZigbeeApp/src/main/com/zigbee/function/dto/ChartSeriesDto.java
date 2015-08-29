/************************************************************************************
 * @File name   :      ChartSeriesDto.java
 *
 * @Author      :      YIFEGU
 *
 * @Date        :      Aug 31, 2014
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
 * Aug 31, 2014 8:17:57 PM			YIFEGU			1.0				Initial Version
 ************************************************************************************/
package com.zigbee.function.dto;

import java.util.ArrayList;
import java.util.List;

import com.zigbee.framework.common.dto.BaseDto;

/**
 *
 */
public class ChartSeriesDto extends BaseDto {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private List<Float> data = new ArrayList<Float>();
	private List<String> xAxis = new ArrayList<String>();
	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      Aug 31, 2014
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      Aug 31, 2014
	 *
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      Aug 31, 2014
	 *
	 * @return the data
	 */
	public List<Float> getData() {
		return data;
	}
	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      Aug 31, 2014
	 *
	 * @param data the data to set
	 */
	public void setData(List<Float> data) {
		this.data = data;
	}
	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      Sep 15, 2014
	 *
	 * @return the xAxis
	 */
	public List<String> getxAxis() {
		return xAxis;
	}
	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      Sep 15, 2014
	 *
	 * @param xAxis the xAxis to set
	 */
	public void setxAxis(List<String> xAxis) {
		this.xAxis = xAxis;
	}
	
	
	
	
	

}
