/************************************************************************************
 * @File name   :      WarningMessagesDaoImpl.java
 *
 * @Author      :      GUDONG
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
 * 2015年8月30日 下午5:51:19			GUDONG			1.0				Initial Version
 ************************************************************************************/
package com.zigbee.function.dao.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.zigbee.framework.common.dao.impl.BaseIntDaoImpl;
import com.zigbee.function.dao.IWarningMessagesDao;
import com.zigbee.function.domain.WarningMessages;
import com.zigbee.function.dto.WarningMessagesDto;

/**
 *
 */
@Repository("warningMessagesDao")
public class WarningMessagesDaoImpl extends BaseIntDaoImpl<WarningMessages, Integer> 
	implements IWarningMessagesDao{

	/**
	 * @Author      :      GUDONG
	 * @Date        :      2015年8月30日
	 * @param clazz
	 */
	@Inject
	public WarningMessagesDaoImpl(@Value("com.zigbee.function.domain.WarningMessages") Class<WarningMessages> clazz) {
		super(clazz);
	}

	/** 
	 * overridden:
	 * @Author      :      GUDONG
	 * @Date        :      2015年8月30日
	 * @see com.zigbee.function.dao.IWarningMessagesDao#getAllWarningMessages()
	**/
	@Override
	public List<WarningMessages> getAllWarningMessages() {
		WarningMessagesDto warningMessagesDto = new WarningMessagesDto();
		StringBuffer hql = new StringBuffer();
		hql.append(" from WarningMessages where 1=1 ");
		String countHql="select count(id) ";
		String orderBy = "order by timestamp desc " ; 
		return getListByQueryWithPaging(hql.toString() + orderBy, countHql+hql.toString(), warningMessagesDto.getPager());
	}

}
