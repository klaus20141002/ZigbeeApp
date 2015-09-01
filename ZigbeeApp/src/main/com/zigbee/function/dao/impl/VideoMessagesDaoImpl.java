/************************************************************************************
 * @File name   :      VideoMessagesDaoImpl.java
 *
 * @Author      :      GUDONG
 *
 * @Date        :      2015年8月30日
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
 * 2015年8月30日 下午11:58:17			GUDONG			1.0				Initial Version
 ************************************************************************************/
package com.zigbee.function.dao.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.zigbee.framework.common.dao.impl.BaseIntDaoImpl;
import com.zigbee.function.dao.IVideoMessagesDao;
import com.zigbee.function.domain.VideoMessages;
import com.zigbee.function.dto.VideoMessagesDto;

/**
 *
 */
@Repository("videoMessagesDao")
public class VideoMessagesDaoImpl extends BaseIntDaoImpl<VideoMessages, Integer> 
	implements IVideoMessagesDao{

	/**
	 * @Author      :      GUDONG
	 * @Date        :      2015年8月30日
	 * @param clazz
	 */
	@Inject
	public VideoMessagesDaoImpl(@Value("com.zigbee.function.domain.VideoMessages") Class<VideoMessages> clazz) {
		super(clazz);
	}

	/** 
	 * overridden:
	 * @Author      :      GUDONG
	 * @Date        :      2015年8月31日
	 * @see com.zigbee.function.dao.IVideoMessagesDao#getAllWarningMessages()
	**/
	@Override
	public List<VideoMessages> getAllVideoMessages() {
		VideoMessagesDto videoMessagesDto = new VideoMessagesDto();
		StringBuffer hql = new StringBuffer();
		hql.append(" from VideoMessages where 1=1 ");
		String countHql="select count(id) ";
		String orderBy = "order by timestamp desc " ; 
		return getListByQueryWithPaging(hql.toString() + orderBy, countHql+hql.toString(), videoMessagesDto.getPager());
	}
	
	

}
