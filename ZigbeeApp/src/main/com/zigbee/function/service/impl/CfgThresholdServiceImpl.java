/************************************************************************************
 * @File name   :      CfgThresholdServiceImpl.java
 *
 * @Author      :      Hasee
 *
 * @Date        :      2015年9月9日
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
 * 2015年9月9日 下午10:23:00			Hasee			1.0				Initial Version
 ************************************************************************************/
package com.zigbee.function.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zigbee.framework.common.exception.AppException;
import com.zigbee.framework.common.service.impl.BaseServiceImpl;
import com.zigbee.function.dao.ICfgThresholdDao;
import com.zigbee.function.domain.CfgThreshold;
import com.zigbee.function.service.ICfgThresholdService;

/**
 *
 */
@Transactional(rollbackFor = AppException.class)
@Service
public class CfgThresholdServiceImpl extends BaseServiceImpl implements ICfgThresholdService {
	@Autowired
	private ICfgThresholdDao cfgThresholdDao ;
	/** 
	 * overridden:
	 * @Author      :      Hasee
	 * @Date        :      2015年9月9日
	 * @see com.zigbee.function.service.ICfgThresholdService#getThreshold(int)
	**/
	@Override
	public Float getThreshold(int type) {
		List<CfgThreshold> list = cfgThresholdDao.queryVariantListByType(type);
		if(list!=null && !list.isEmpty()) {
			return list.get(0).getCfgValue() ;
		}
		return 0f;
	}

}
