/************************************************************************************
 * @File name   :      LoginDataDto.java
 *
 * @Author      :      YIFEGU
 *
 * @Date        :      Aug 31, 2014
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
 * Aug 31, 2014 5:46:08 PM			YIFEGU			1.0				Initial Version
 ************************************************************************************/
package com.zigbee.function.dto;

/**
 *
 */
public class LoginDataDto {
	private String userName;
	private String userPwd;
	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      Aug 31, 2014
	 *
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      Aug 31, 2014
	 *
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      Aug 31, 2014
	 *
	 * @return the userPwd
	 */
	public String getUserPwd() {
		return userPwd;
	}
	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      Aug 31, 2014
	 *
	 * @param userPwd the userPwd to set
	 */
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	
}
