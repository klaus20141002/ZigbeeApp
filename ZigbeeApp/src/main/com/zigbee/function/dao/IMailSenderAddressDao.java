/************************************************************************************
 * @File name   :      IMailSenderAddressDao.java
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
 * 2011-9-13 ÏÂÎç11:21:17			YIFEGU			1.0				Initial Version
 ************************************************************************************/
package com.zigbee.function.dao;

import java.util.List;

import com.zigbee.framework.common.dao.IBaseDao;
import com.zigbee.function.domain.MailSenderAddress;

/**
 *
 */
public interface IMailSenderAddressDao extends IBaseDao<MailSenderAddress, Long> {
	
	/**
	 * 
	 * @Author      :      YIFEGU
	 * @Date        :      2011-9-25
	 * @param mailType TODO
	 * @return
	 */
	public List<MailSenderAddress> getAvailableSenderAddress(String mailType);

}
