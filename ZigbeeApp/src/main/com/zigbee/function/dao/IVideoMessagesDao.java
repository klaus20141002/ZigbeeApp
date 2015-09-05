/************************************************************************************
 * @File name   :      IVideoMessagesDao.java
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
 * 2015年8月30日 下午11:52:39			GUDONG			1.0				Initial Version
 ************************************************************************************/
package com.zigbee.function.dao;

import java.util.List;

import com.zigbee.framework.common.dao.IBaseIntDao;
import com.zigbee.function.domain.VideoMessages;

/**
 *
 */
public interface IVideoMessagesDao extends IBaseIntDao<VideoMessages, Integer>  {
	/**
	 * @Author      :      GUDONG
	 * @Date        :      2015年8月30日
	 * @return
	 */
	List<VideoMessages> getAllVideoMessages();
}
