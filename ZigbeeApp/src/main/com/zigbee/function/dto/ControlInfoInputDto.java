/************************************************************************************
 * @File name   :      ControlInfoInputDto.java
 *
 * @Author      :      Hasee
 *
 * @Date        :      2015年9月10日
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
 * 2015年9月10日 下午9:22:01			Hasee			1.0				Initial Version
 ************************************************************************************/
package com.zigbee.function.dto;


/**
 *
 */
public class ControlInfoInputDto {
	    private Integer type;
	    private Integer data_value;
		public Integer getType() {
			return type;
		}
		public void setType(Integer type) {
			this.type = type;
		}
		public Integer getData_value() {
			return data_value;
		}
		public void setData_value(Integer data_value) {
			this.data_value = data_value;
		}
	    
}
