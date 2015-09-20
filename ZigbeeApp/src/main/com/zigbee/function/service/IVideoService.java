/************************************************************************************
 * @File name   :      IVideoService.java
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
 * 2015年9月10日 下午9:07:28			Hasee			1.0				Initial Version
 ************************************************************************************/
package com.zigbee.function.service;

import com.zigbee.function.dto.VideoInputDto;

/**
 *
 */
public interface IVideoService {

	
	public int saveVideo(VideoInputDto dto) ;
}
