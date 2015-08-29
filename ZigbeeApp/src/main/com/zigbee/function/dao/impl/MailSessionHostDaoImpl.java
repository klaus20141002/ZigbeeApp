/************************************************************************************
 * @File name   :      MailSessionHostDaoImpl.java
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
 * 2011-9-25 ÉÏÎç10:05:41			YIFEGU			1.0				Initial Version
 ************************************************************************************/
package com.zigbee.function.dao.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.zigbee.framework.common.dao.impl.BaseDaoImpl;
import com.zigbee.function.dao.IMailSessionHostDao;
import com.zigbee.function.domain.MailSessionHost;

/**
 *
 */
@Repository("mailSessionHostDao")
public class MailSessionHostDaoImpl extends BaseDaoImpl<MailSessionHost, Long> implements
		IMailSessionHostDao {

	/**
	 * @Author      :      YIFEGU
	 * @Date        :      2011-9-25
	 * @param clazz
	 */
	@Inject
	public MailSessionHostDaoImpl(@Value("com.zigbee.function.domain.MailSessionHost") Class<MailSessionHost> clazz) {
		super(clazz);
	}

	/** 
	 * overridden:
	 * @Author      :      YIFEGU
	 * @Date        :      2011-9-25
	 * @see com.zigbee.function.dao.IMailSessionHostDao#getMailSessionHostByName(java.lang.String)
	**/
	@Override
	public MailSessionHost getMailSessionHostByName(String name) {
        String hql = "select msh from MailSessionHost msh where msh.name ='" + name + "'";	
        List<MailSessionHost> resultList = this.getJpaTemplate().find(hql);
        if(resultList != null && resultList.size() > 0){
        	return resultList.get(0);
        }
		return null;
	}
	
}
