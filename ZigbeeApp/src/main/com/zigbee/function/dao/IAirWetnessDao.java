/************************************************************************************
 * @File name   :      IAirWetnessDao.java
 *
 * @Author      :      ZHWANG
 *
 * @Date        :      Aug 21, 2014
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
 * Aug 21, 2014 9:48:40 AM			ZHWANG			1.0				Initial Version
 ************************************************************************************/
package com.zigbee.function.dao;

import java.util.List;

import com.zigbee.framework.common.dao.IBaseIntDao;
import com.zigbee.function.domain.AirWetness;

/**
 *
 */
public interface IAirWetnessDao extends IBaseIntDao<AirWetness, Integer> {

	/**
	 * 获得系统日期的按小时湿度数据
	 * @Author      :      ZHWANG
	 * @Date        :      2014-9-15
	 * @param equipmentId
	 * @return
	 */
	List<AirWetness> getHoursListByEquipId(Integer equipmentId);

}
