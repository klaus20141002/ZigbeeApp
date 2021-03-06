/************************************************************************************
 * @File name   :      IMailSessionHostDao.java
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
 * 2011-9-25 ����10:04:20			YIFEGU			1.0				Initial Version
 ************************************************************************************/
package com.zigbee.function.dao;

import com.zigbee.framework.common.dao.IBaseDao;
import com.zigbee.function.domain.MailSessionHost;

/**
 *
 */
public interface IMailSessionHostDao extends IBaseDao<MailSessionHost, Long> {
	
	/**
	 * 
	 * @Author      :      YIFEGU
	 * @Date        :      2011-9-25
	 * @param name
	 * @return
	 */
	public MailSessionHost getMailSessionHostByName(String name);

}
