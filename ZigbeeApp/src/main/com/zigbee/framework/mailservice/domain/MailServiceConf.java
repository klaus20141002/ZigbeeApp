/************************************************************************************
 * @File name   :      MailServiceConf.java
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
 * 2011-3-14 上�?�09:32:24			YIFEGU			1.0				Initial Version
 ************************************************************************************/
package com.zigbee.framework.mailservice.domain;

import java.io.Serializable;

/**
 * Mail Service Conf Domain
 */
public class MailServiceConf implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String host;
	private String username;
	private String password;
	/**
	 * Get Host
	 *
	 * @Date        :      2011-3-14
	 *
	 * @return the host
	 */
	public String getHost() {
		return host;
	}
	/**
	 * Set Host
	 *
	 * @Date        :      2011-3-14
	 *
	 * @param host the host to set
	 */
	public void setHost(String host) {
		this.host = host;
	}
	/**
	 * Get User Name
	 *
	 * @Date        :      2011-3-14
	 *
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * Set User Name
	 *
	 * @Date        :      2011-3-14
	 *
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * Get Password
	 *
	 * @Date        :      2011-3-14
	 *
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * Set password
	 *
	 * @Date        :      2011-3-14
	 *
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	

}
