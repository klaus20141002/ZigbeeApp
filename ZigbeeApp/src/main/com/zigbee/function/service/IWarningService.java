/************************************************************************************
 * @File name   :      IWarningService.java
 *
 * @Author      :      DUZHOU
 *
 * @Date        :      2015年9月1日
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
 * 2015年9月1日 下午11:35:51			DUZHOU			1.0				Initial Version
 ************************************************************************************/
package com.zigbee.function.service;

import com.zigbee.function.dto.WarningInputDto;

/**
 *
 */
public interface IWarningService {
	
	
	public int alermReport(WarningInputDto dto) ; 

}
