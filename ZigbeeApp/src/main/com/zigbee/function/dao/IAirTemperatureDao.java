/************************************************************************************
 * @File name   :      ITraceRecordsDao.java
 *
 * @Author      :      YIFEGU
 *
 * @Date        :      2011-9-25
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
 * 2011-9-25 ����10:18:40			YIFEGU			1.0				Initial Version
 ************************************************************************************/
package com.zigbee.function.dao;

import java.util.List;

import com.zigbee.framework.common.dao.IBaseIntDao;
import com.zigbee.function.domain.AirTemperature;
import com.zigbee.function.dto.GreenhouseQueryDto;

/**
 *
 */
public interface IAirTemperatureDao extends IBaseIntDao<AirTemperature, Integer> {

	/**
	 * @Author      :      ZHWANG
	 * @Date        :      Aug 21, 2014
	 * @param queryDto
	 * @return
	 */
	List<AirTemperature> getListByQueryDto(GreenhouseQueryDto queryDto);
	
	/**
	 * 获得每日的检测数据列表，每小时的第一条数据
	 * @Author      :      ZHWANG
	 * @Date        :      2014-9-15
	 * @param equipmentId
	 * @return
	 */
	List<AirTemperature> getHoursListByEquipId(Integer equipmentId);

}
