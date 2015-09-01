/************************************************************************************
 * @File name   :      Co2ConcentrationDaoImpl.java
 *
 * @Author      :      GUDONG
 *
 * @Date        :      2015年8月31日
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
 * 2015年8月31日 下午9:53:23			GUDONG			1.0				Initial Version
 ************************************************************************************/
package com.zigbee.function.dao.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.zigbee.framework.common.dao.impl.BaseIntDaoImpl;
import com.zigbee.function.dao.ICo2ConcentrationDao;
import com.zigbee.function.domain.Co2Concentration;

/**
 *
 */
 @Repository("co2ConcentrationDao")
public class Co2ConcentrationDaoImpl  extends BaseIntDaoImpl<Co2Concentration, Integer> implements ICo2ConcentrationDao  {

	/**
	 * @Author      :      GUDONG
	 * @Date        :      2015年8月31日
	 * @param clazz
	 */
	@Inject
	public Co2ConcentrationDaoImpl(@Value("com.zigbee.function.domain.Co2Concentration") Class<Co2Concentration> clazz) {
		super(clazz);
		// TODO Auto-generated constructor stub
	}

	/** 
	 * overridden:
	 * @Author      :      GUDONG
	 * @Date        :      2015年8月31日
	 * @see com.zigbee.function.dao.ICo2ConcentrationDao#getHoursListByEquipId(java.lang.Integer)
	**/
	@Override
	public List<Co2Concentration> getHoursListByEquipId(Integer equipmentId) {
		String sql = "select t.* from co2_tbl t where id in ( " + 
                " SELECT min(id) FROM co2_tbl where equipment_id = " + equipmentId + 
                " and `uploadDate`> curdate() " + 
                " group by hour(`uploadDate`)) order by `uploadDate` asc " ;
		return this.getListByNativeQuery(sql);
	}

}
