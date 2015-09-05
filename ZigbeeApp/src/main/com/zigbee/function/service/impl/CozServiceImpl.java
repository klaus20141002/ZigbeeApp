/************************************************************************************
 * @File name   :      ImplirTemperatureService.java
 *
 * @Author      :      DUZHOU
 *
 * @Date        :      2015年8月30日
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
 * 2015年8月30日 下午3:13:53			DUZHOU			1.0				Initial Version
 ************************************************************************************/
package com.zigbee.function.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zigbee.framework.common.exception.AppException;
import com.zigbee.framework.common.service.impl.BaseServiceImpl;
import com.zigbee.function.constant.ReportMgntConstants;
import com.zigbee.function.dao.ICozDao;
import com.zigbee.function.domain.Coz;
import com.zigbee.function.dto.CozInputDto;
import com.zigbee.function.service.ICozService;

/**
 *
 */
@Transactional(rollbackFor = AppException.class)
@Service
public class CozServiceImpl extends BaseServiceImpl implements ICozService {
	@Autowired
	private ICozDao cozDao ;
	/** 
	 * overridden:
	 * @Author      :      DUZHOU
	 * @Date        :      2015年8月30日
	 * @see com.zigbee.function.service.ICozService#reportCoz(com.zigbee.function.dto.AirTemperatureReportInputDto)
	**/
	@Override
	public int reportCoz(CozInputDto dto) {
		Coz coz = new Coz() ;
		coz.setDataValue(Float.valueOf(dto.getCo2_val()));
		return cozDao.save(coz)!=null?ReportMgntConstants.REPORT_SUCCESS:ReportMgntConstants.REPORT_FAILURE;
	}

}
