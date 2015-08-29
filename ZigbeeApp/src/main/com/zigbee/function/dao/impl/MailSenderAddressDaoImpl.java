/************************************************************************************
 * @File name   :      MailSenderAddressDaoImpl.java
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
import com.zigbee.function.constant.MailAppConstant;
import com.zigbee.function.dao.IMailSenderAddressDao;
import com.zigbee.function.domain.MailSenderAddress;

/**
 *
 */
@Repository("mailSenderAddressDao")
public class MailSenderAddressDaoImpl extends BaseDaoImpl<MailSenderAddress, Long> implements
		IMailSenderAddressDao {

	/**
	 * @Author      :      YIFEGU
	 * @Date        :      2011-9-13
	 * @param clazz
	 */
	@Inject
	public MailSenderAddressDaoImpl(@Value("com.zigbee.function.domain.MailSenderAddress") Class<MailSenderAddress> clazz) {
		super(clazz);
	}

	/** 
	 * overridden:
	 * @Author      :      YIFEGU
	 * @Date        :      2011-9-25
	 * @see com.zigbee.function.dao.IMailSenderAddressDao#getAvailableSenderAddress(String)
	**/
	@Override
	public List<MailSenderAddress> getAvailableSenderAddress(String mailType) {
		//String hql = "select msa from MailSenderAddress msa where not exists (select count(tr.id) >= "+MailAppConstant.MaxSentTimesPerAddress.getValue()+" from TraceRecords tr where "
		//+ " msa.id = tr.senderAddress.id and to_days(tr.lastSentTime) = to_days(now())";
		
		String hql = "select msa from MailSenderAddress msa where (" +
				" select count(tr.id) from TraceRecords tr where msa.id = tr.senderAddress.id" +
				" and to_days(tr.lastSentTime) = to_days(now())" +
				") < " + MailAppConstant.MaxSentTimesPerAddress.getValue(); 
				if(mailType != null && !mailType.trim().equals("")){
					hql = hql + " and msa.mailAddress like '%"+ mailType.trim() + "'";
				}
				hql = hql + "order by msa.id asc";
		
		List<MailSenderAddress> resultList = getJpaTemplate().find(hql);
		if(resultList != null && resultList.size() > 0){
			return resultList;
		}
		
		return null;
	}
	
}
