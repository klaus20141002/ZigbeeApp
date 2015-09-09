/************************************************************************************
 * @File name   :      WarningServiceImpl.java
 *
 * @Author      :      DUZHOU
 *
 * @Date        :      2015年9月1日
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
 * 2015年9月1日 下午11:36:05			DUZHOU			1.0				Initial Version
 ************************************************************************************/
package com.zigbee.function.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zigbee.framework.common.exception.AppException;
import com.zigbee.framework.common.service.impl.BaseServiceImpl;
import com.zigbee.function.constant.ReportMgntConstants;
import com.zigbee.function.dao.IWarningDao;
import com.zigbee.function.domain.Warning;
import com.zigbee.function.dto.WarningInputDto;
import com.zigbee.function.service.IWarningService;

/**
 *
 */
@Transactional(rollbackFor = AppException.class)
@Service
public class WarningServiceImpl extends BaseServiceImpl implements IWarningService{
	@Autowired
	private IWarningDao warningDao ;
	
	
	/** 
	 * overridden:
	 * @Author      :      DUZHOU
	 * @Date        :      2015年9月5日
	 * @see com.zigbee.function.service.IWarningService#alermReport(com.zigbee.function.dto.WarningInputDto)
	**/
	@Override
	public int alermReport(WarningInputDto dto) {
		Warning obj = new Warning() ;
		obj.setData_acqu_type(dto.getAlertType());
		obj.setContent(String.valueOf(dto.getDataDalue()));
		return warningDao.save(obj)!=null?ReportMgntConstants.REPORT_SUCCESS:ReportMgntConstants.REPORT_FAILURE;
	}


	
	
	

}
