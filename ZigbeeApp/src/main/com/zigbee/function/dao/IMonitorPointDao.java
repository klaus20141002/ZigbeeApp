/************************************************************************************
 * @File name   :      IMonitorPointDao.java
 *
 * @Author      :      ZHWANG
 *
 * @Date        :      2014-9-8
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
 * 2014-9-8 下午05:07:47			ZHWANG			1.0				Initial Version
 ************************************************************************************/
package com.zigbee.function.dao;

import java.util.List;

import com.zigbee.framework.common.dao.IBaseIntDao;
import com.zigbee.function.domain.MonitorPoint;
import com.zigbee.function.dto.GreenhouseQueryDto;
import com.zigbee.function.dto.GreenhouseResultDto;

/**
 *
 */
public interface IMonitorPointDao extends IBaseIntDao<MonitorPoint, Integer> {

	/**
	 * 获取结果列表
	 * @Author      :      ZHWANG
	 * @Date        :      2014-9-10
	 * @param queryDto
	 * @return
	 */
	List<GreenhouseResultDto> getMonitorResultByDto(GreenhouseQueryDto queryDto);
	
	/**
	 * Get all monitor points
	 * @Author      :      Administrator
	 * @Date        :      2014-9-14
	 * @return
	 */
	List<MonitorPoint> getAllMonitorPoints();

}
