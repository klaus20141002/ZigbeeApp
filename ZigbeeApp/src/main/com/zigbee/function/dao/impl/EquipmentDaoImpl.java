/************************************************************************************
 * @File name   :      EquipmentDaoImpl.java
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
 * 2014-9-8 下午05:12:24			ZHWANG			1.0				Initial Version
 ************************************************************************************/
package com.zigbee.function.dao.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.zigbee.framework.common.dao.impl.BaseIntDaoImpl;
import com.zigbee.function.constant.GreenhouseCommonConstants;
import com.zigbee.function.dao.IEquipmentDao;
import com.zigbee.function.domain.Equipment;

/**
 *
 */
@Repository("equipmentDao")
public class EquipmentDaoImpl extends BaseIntDaoImpl<Equipment, Integer>
		implements IEquipmentDao {

	/**
	 * @Author      :      ZHWANG
	 * @Date        :      2014-9-8
	 * @param clazz
	 */
	@Inject
	public EquipmentDaoImpl(@Value("com.zigbee.function.domain.Equipment") Class<Equipment> clazz) {
		super(clazz);
	}

	/** 
	 * overridden:
	 * @Author      :      ZHWANG
	 * @Date        :      2014-9-11
	 * @see com.zigbee.function.dao.IEquipmentDao#getControlEquipListByMonitorId(java.lang.Integer)
	**/
	@Override
	public List<Equipment> getControlEquipListByMonitorId(Integer monitorPointId) {
		String hql = " from Equipment where monitorPointId = ?1 and equipType!=?2 order by equipSeq ";
		return this.getListByQueryWithVaParam(hql, monitorPointId, 
				Integer.valueOf(GreenhouseCommonConstants.EQUIPMENT_TYPE_SENSOR).byteValue()
		);
	}

	/** 
	 * overridden:
	 * @Author      :      ZHWANG
	 * @Date        :      2014-9-11
	 * @see com.zigbee.function.dao.IEquipmentDao#getEquipListByMonitorId(java.lang.Integer)
	**/
	@Override
	public List<Equipment> getEquipListByMonitorId(Integer monitorPointId) {
		String hql = " from Equipment where monitorPointId = ?1 order by equipSeq ";
		return this.getListByQueryWithVaParam(hql, monitorPointId);
	}

	/** 
	 * overridden:
	 * @Author      :      ZHWANG
	 * @Date        :      2014-9-15
	 * @see com.zigbee.function.dao.IEquipmentDao#getDataAcqEquipListByMonitorId(java.lang.Integer)
	**/
	@Override
	public List<Equipment> getDataAcqEquipListByMonitorId(Integer monitorPointId) {
		String hql = " from Equipment where monitorPointId = ?1 and equipType=?2 order by equipSeq ";
		return this.getListByQueryWithVaParam(hql, monitorPointId, Integer.valueOf(GreenhouseCommonConstants.EQUIPMENT_TYPE_DATA_ACQUISITION).byteValue());

	}

	/** 
	 * overridden:
	 * @Author      :      ZHWANG
	 * @Date        :      2015-1-25
	 * @see com.zigbee.function.dao.IEquipmentDao#getEquipmentByCode(java.lang.String)
	**/
	@Override
	public Equipment getEquipmentByCode(String equipCode) {
		String hql = " from Equipment where equipCode = ?1 ";
		List<Equipment> list = this.getListByQueryWithVaParam(hql, equipCode);

		if(list!=null && list.size()>0){
			return list.get(0);
		}
		return null;
	}

	
}
