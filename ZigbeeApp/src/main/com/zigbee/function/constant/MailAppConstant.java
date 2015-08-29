/************************************************************************************
 * @File name   :      MailAppConstant.java
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
 * 2011-9-25 ÉÏÎç10:29:15			YIFEGU			1.0				Initial Version
 ************************************************************************************/
package com.zigbee.function.constant;

/**
 *
 */
public enum MailAppConstant {
	
	
	MaxSentTimesPerAddress(800);
	
	private int value;
	
	private MailAppConstant(int value){
		this.value = value;
	}

	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      2011-9-25
	 *
	 * @return the value
	 */
	public int getValue() {
		return value;
	}

	
	
}
