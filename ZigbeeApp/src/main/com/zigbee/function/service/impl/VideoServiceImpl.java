/************************************************************************************
 * @File name   :      VideoServiceImpl.java
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
 * 2015年9月10日 下午9:07:51			Hasee			1.0				Initial Version
 ************************************************************************************/
package com.zigbee.function.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zigbee.framework.common.exception.AppException;
import com.zigbee.framework.common.service.impl.BaseServiceImpl;
import com.zigbee.function.constant.ReportMgntConstants;
import com.zigbee.function.dao.IVideoMessagesDao;
import com.zigbee.function.domain.VideoMessages;
import com.zigbee.function.dto.VideoInputDto;
import com.zigbee.function.service.IVideoService;

/**
 *
 */
@Transactional(rollbackFor = AppException.class)
@Service
public class VideoServiceImpl extends BaseServiceImpl implements IVideoService {

	@Autowired
	private IVideoMessagesDao videoMessagesDao ;
	/** 
	 * overridden:
	 * @Author      :      Hasee
	 * @Date        :      2015年9月10日
	 * @see com.zigbee.function.service.IVideoService#saveVideo(com.zigbee.function.dto.VideoInputDto)
	**/
	@Override
	public int saveVideo(VideoInputDto dto) {

		VideoMessages obj = new VideoMessages() ;
		obj.setTimestamp(new Date());
		obj.setVideoName(dto.getVideo_name());
		obj.setVideoUrl(dto.getVideo_url());
		return videoMessagesDao.save(obj) != null ?ReportMgntConstants.REPORT_SUCCESS:ReportMgntConstants.REPORT_FAILURE;
	}
	
	
	
	

}
