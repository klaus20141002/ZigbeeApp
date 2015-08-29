/************************************************************************************
 * @File name   :      TraceRecordsDaoImpl.java
 *
 * @Author      :      YIFEGU
 *
 * @Date        :      2011-9-25
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
 * 2011-9-25 ����10:19:37			YIFEGU			1.0				Initial Version
 ************************************************************************************/
package com.zigbee.function.dao.impl;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.zigbee.framework.common.dao.impl.BaseDaoImpl;
import com.zigbee.function.dao.ITraceRecordsDao;
import com.zigbee.function.domain.TraceRecords;

/**
 *
 */
@Repository("traceRecordsDao")
public class TraceRecordsDaoImpl extends BaseDaoImpl<TraceRecords, Long> implements ITraceRecordsDao {

	/**
	 * @Author      :      YIFEGU
	 * @Date        :      2011-9-25
	 * @param clazz
	 */
	@Inject
	public TraceRecordsDaoImpl(@Value("com.zigbee.function.domain.TraceRecords") Class<TraceRecords> clazz) {
		super(clazz);
	}

}
