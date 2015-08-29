/************************************************************************************
 * @File name   :      MailReceiverAddressDaoImpl.java
 *
 * @Author      :      YIFEGU
 *
 * @Date        :      2011-9-13
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
 * 2011-9-13 ÏÂÎç11:22:41			YIFEGU			1.0				Initial Version
 ************************************************************************************/
package com.zigbee.function.dao.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.zigbee.framework.common.dao.impl.BaseDaoImpl;
import com.zigbee.function.dao.IMailReceiverAddressDao;
import com.zigbee.function.domain.MailReceiverAddress;

/**
 *
 */
@Repository("mailReceiverAddressDao")
public class MailReceiverAddressDaoImpl extends BaseDaoImpl<MailReceiverAddress, Long> implements
		IMailReceiverAddressDao {

	/**
	 * @Author      :      YIFEGU
	 * @Date        :      2011-9-13
	 * @param clazz
	 */
	@Inject
	public MailReceiverAddressDaoImpl(@Value("com.zigbee.function.domain.MailReceiverAddress") Class<MailReceiverAddress> clazz) {
		super(clazz);
	}
	
	
}
