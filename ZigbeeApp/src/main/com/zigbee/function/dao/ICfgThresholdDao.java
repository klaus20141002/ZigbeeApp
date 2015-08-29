/************************************************************************************
 * @File name   :      ILightDao.java
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
 * Aug 21, 2014 9:54:54 AM			ZHWANG			1.0				Initial Version
 ************************************************************************************/
package com.zigbee.function.dao;

import java.util.List;

import com.zigbee.framework.common.dao.IBaseIntDao;
import com.zigbee.function.domain.CfgThreshold;

/**
 *
 */
public interface ICfgThresholdDao extends IBaseIntDao<CfgThreshold, Integer> {

	/**
	 * @Author      :      ZHWANG
	 * @Date        :      2015-1-18
	 * @param cfgType
	 * @param i
	 * @return
	 */
	List<CfgThreshold> queryListByType(Integer cfgType, Integer isConstant);

	
	List<CfgThreshold> queryVariantListByType(Integer cfgType);

}
