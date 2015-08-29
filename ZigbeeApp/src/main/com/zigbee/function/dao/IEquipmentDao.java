/************************************************************************************
 * @File name   :      IEquipmentDao.java
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
 * 2014-9-8 下午05:06:47			ZHWANG			1.0				Initial Version
 ************************************************************************************/
package com.zigbee.function.dao;

import java.util.List;

import com.zigbee.framework.common.dao.IBaseIntDao;
import com.zigbee.function.domain.Equipment;

/**
 *
 */
public interface IEquipmentDao extends IBaseIntDao<Equipment, Integer> {

	/**
	 * 根据parent-监测点id 查找采集器以外的设备列表
	 * @Author      :      ZHWANG
	 * @Date        :      2014-9-11
	 * @param monitorPointId
	 * @return
	 */
	List<Equipment> getControlEquipListByMonitorId(Integer monitorPointId);
	
	/**
	 * 根据parent-监测点id 查找采集器备列表
	 * @Author      :      ZHWANG
	 * @Date        :      2014-9-15
	 * @param monitorPointId
	 * @return
	 */
	List<Equipment> getDataAcqEquipListByMonitorId(Integer monitorPointId);

	/**
	 * 根据parent-监测点id 查找all设备列表
	 * @Author      :      ZHWANG
	 * @Date        :      2014-9-11
	 * @param monitorPointId
	 * @return
	 */
	List<Equipment> getEquipListByMonitorId(Integer monitorPointId);
	
	/**
	 * get equip by code
	 * @Author      :      ZHWANG
	 * @Date        :      2015-1-25
	 * @param equipCode
	 * @return
	 */
	Equipment getEquipmentByCode(String equipCode);
}
