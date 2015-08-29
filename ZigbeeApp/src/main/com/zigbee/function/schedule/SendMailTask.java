/************************************************************************************
 * @File name   :      SendMailTask.java
 *
 * @Author      :      YIFEGU
 *
 * @Date        :      2011-9-5
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
 * 2011-9-5 ÏÂÎç10:03:03			YIFEGU			1.0				Initial Version
 ************************************************************************************/
package com.zigbee.function.schedule;

import java.util.Calendar;
import java.util.TimerTask;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zigbee.function.service.IMailAppService;

/**
 *
 */
@Component("sendMailTask")
public class SendMailTask extends TimerTask {

	@Autowired
	private IMailAppService mailAppService;
	
	private static int receiverIndex = -1;
	/** 
	 * overridden:
	 * @Author      :      YIFEGU
	 * @Date        :      2011-9-5
	 * @see java.util.TimerTask#run()
	 **/
	@Override
	public void run() {

		receiverIndex ++;
		System.err.println("----------Execution Task"+ receiverIndex +"---------" + Calendar.getInstance().getTime());
		
		mailAppService.autoSendMail(receiverIndex);
		

	}

}
