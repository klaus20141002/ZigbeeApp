/************************************************************************************
 * @File name   :      IMailService.java
 *
 * @Author      :      YIFEGU
 *
 * @Date        :      2011-3-14
 *
 * @Copyright Notice: 
 * Copyright (c) 2011 Zhaogong, Inc. All  Rights Reserved.
 * This software is published under the terms of the  Software 
 * License version 1.0, a copy of which has been included with this
 * distribution in the LICENSE.txt file.
 * 
 * 
 * ----------------------------------------------------------------------------------
 * Date								Who					Version				Comments
 * 2011-3-14 上�?�09:24:06			YIFEGU			1.0				Initial Version
 ************************************************************************************/
package com.zigbee.framework.mailservice.service;

import java.util.HashMap;

import com.zigbee.framework.common.exception.AppException;
import com.zigbee.framework.mailservice.domain.Mail;
import com.zigbee.framework.mailservice.domain.MailServiceConf;
import com.zigbee.framework.mailservice.domain.MailTemplate;



/**
 * Mail Service Interface
 */
public interface IMailService {
    
    /**
     * Initialization of Mail Service Configuration 
     * @Date        :      2011-4-6
     * @return true/false to identify Initialization result
     */
	public boolean initMailService();
	
	/**
	 * Initialization of Mail Service JNDI Configuration
	 * @Date        :      2011-4-18
	 * @return true/false to identify Initialization result
	 * @throws AppException 
	 */
	public boolean initMailServiceJNDI() throws AppException;
	
	/**
	 * Initialization of Mail Service Configuration
	 * @Author      :      YIFEGU
	 * @Date        :      2011-8-27
	 * @param mailServiceConf contains host and account info of sender
	 * @return
	 * @throws AppException
	 */
	public boolean initMailService(MailServiceConf mailServiceConf) throws AppException;
	
	/**
	 * Send Mail without template
	 * @Date        :      2011-4-6
	 * @param mail instance
	 * @return true/false to identify Send Mail Result
	 */
	public boolean sendMail(Mail mail);
	
	/**
	 * Send Mail with template name and template editPointsMap
	 * @Date        :      2011-4-6
	 * @param mail instance
	 * @param templateName template name
	 * @param editPointsMap template edit points map
	 * @return true/false to identify Send Mail Result
	 */
	public boolean sendMail(Mail mail, String templateName, HashMap<String, String> editPointsMap);
	
	/**
	 * Send Mail with template name and template
	 * @Date        :      2011-4-6
	 * @param mail instance
	 * @param templateName template name
	 * @return true/false to identify Send Mail Result
	 */
	public boolean sendMail(Mail mail, String templateName);
	
	/**
	 * Send Mail with template
	 * @Date        :      2011-4-6
	 * @param mail instance
	 * @param mailTemplate instance
	 * @return true/false to identify Send Mail Result
	 */
	public boolean sendMail(Mail mail, MailTemplate mailTemplate);
	
	/**
	 * Send Mail Picture Inline
	 * @Date        :      2011-4-13
	 * @param mail instance
	 * @param mailTemplate instance
	 * @param imgUrlMap Map store cid(Key) and imgUrl(Value)
	 * @return true/false to identify Send Mail Result
	 */
	public boolean sendMailInline(Mail mail, MailTemplate mailTemplate, HashMap<String,String> imgUrlMap);

}
