/************************************************************************************
 * @File name   :      Co2ConcentrationDao.java
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
 * 2015年8月31日 下午9:49:25			GUDONG			1.0				Initial Version
 ************************************************************************************/
package com.zigbee.function.dao;

import java.util.List;

import com.zigbee.framework.common.dao.IBaseIntDao;
import com.zigbee.function.domain.Co2Concentration;

/**
 *
 */
public interface ICo2ConcentrationDao extends IBaseIntDao<Co2Concentration, Integer>  {
	List<Co2Concentration> getHoursListByEquipId(Integer equipmentId);
}
