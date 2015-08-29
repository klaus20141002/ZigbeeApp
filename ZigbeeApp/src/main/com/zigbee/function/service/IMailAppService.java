/************************************************************************************
 * @File name   :      IMailAppService.java
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
 * 2011-9-13 ÏÂÎç11:27:30			YIFEGU			1.0				Initial Version
 ************************************************************************************/
package com.zigbee.function.service;

import java.util.List;

import com.zigbee.framework.common.service.IBaseService;
import com.zigbee.function.domain.CandidateInfo;
import com.zigbee.function.domain.MailReceiverAddress;
import com.zigbee.function.domain.MailSenderAddress;

/**
 *
 */
public interface IMailAppService extends IBaseService {
	
	/**
	 * 
	 * @Author      :      YIFEGU
	 * @Date        :      2011-9-19
	 * @param mailAddressList
	 * @return
	 */
	boolean saveMailReceiverAddress(List<MailReceiverAddress> mailAddressList);
	
	/**
	 * 
	 * @Author      :      YIFEGU
	 * @Date        :      2011-9-22
	 * @param candidateList
	 * @return
	 */
	boolean saveCandidates(List<CandidateInfo> candidateList);
	/**
	 * 
	 * @Author      :      YIFEGU
	 * @Date        :      2011-9-13
	 * @param mailSenderAddress
	 */
	void saveMailSenderAddress(MailSenderAddress mailSenderAddress);
	
	/**
	 * 
	 * @Author      :      YIFEGU
	 * @Date        :      2011-9-25
	 */
	void autoSendMail(int receiverIndex);
}
