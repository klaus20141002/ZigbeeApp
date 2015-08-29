/************************************************************************************
 * @File name   :      ILightSwitchDao.java
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
 * Aug 21, 2014 10:05:29 AM			ZHWANG			1.0				Initial Version
 ************************************************************************************/
package com.zigbee.function.dao;

import com.zigbee.framework.common.dao.IBaseIntDao;
import com.zigbee.function.domain.LightSwitch;

/**
 *
 */
public interface ILightSwitchDao extends IBaseIntDao<LightSwitch, Integer> {

	/**
	 * 根据设备ID 获得开关状态
	 * @Author      :      ZHWANG
	 * @Date        :      2014-9-11
	 * @param id
	 * @return
	 */
	LightSwitch getEntityByEquipmentId(Integer equipmentId);

}
