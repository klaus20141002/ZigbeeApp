/************************************************************************************
 * @File name   :      SMTPHostNameConstant.java
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
 * 2011-9-25 ÉÏÎç11:09:36			YIFEGU			1.0				Initial Version
 ************************************************************************************/
package com.zigbee.function.constant;

/**
 *
 */
public enum SMTPHostNameConstant {
	
	SMTP_QQ("@qq.com"),
	SMTP_126("@126.com"),
	SMTP_CAIZHI("@caizhi.name"),
	SMTP_VIP_163("@vip.163.com");
	
	private String mailType;
	private SMTPHostNameConstant(String mailType){
		this.mailType = mailType;
	}
	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      2011-9-30
	 *
	 * @return the mailType
	 */
	public String getMailType() {
		return mailType;
	}

	

}
