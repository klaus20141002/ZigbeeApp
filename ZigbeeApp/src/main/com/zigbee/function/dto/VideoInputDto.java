/************************************************************************************
 * @File name   :      VideoInputDto.java
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
 * 2015年9月10日 下午9:06:16			Hasee			1.0				Initial Version
 ************************************************************************************/
package com.zigbee.function.dto;

/**
 *
 */
public class VideoInputDto {

	
	private String video_name; //视频名称
	private String video_url;//视频地址
	/**
	 * @Author      :      Hasee
	 *
	 * @Date        :      2015年9月10日
	 *
	 * @return the video_name
	 */
	public String getVideo_name() {
		return video_name;
	}
	/**
	 * @Author      :      Hasee
	 *
	 * @Date        :      2015年9月10日
	 *
	 * @param video_name the video_name to set
	 */
	public void setVideo_name(String video_name) {
		this.video_name = video_name;
	}
	/**
	 * @Author      :      Hasee
	 *
	 * @Date        :      2015年9月10日
	 *
	 * @return the video_url
	 */
	public String getVideo_url() {
		return video_url;
	}
	/**
	 * @Author      :      Hasee
	 *
	 * @Date        :      2015年9月10日
	 *
	 * @param video_url the video_url to set
	 */
	public void setVideo_url(String video_url) {
		this.video_url = video_url;
	}
	
	
}
