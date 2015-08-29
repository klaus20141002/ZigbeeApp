/************************************************************************************
 * @File name   :      SwitchOnoffOnScheduleTask.java
 *
 * @Author      :      ZHWANG
 *
 * @Date        :      2014-9-13
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
 * 2014-9-13 下午11:08:17			ZHWANG			1.0				Initial Version
 ************************************************************************************/
package com.zigbee.function.schedule;

import java.util.TimerTask;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zigbee.function.service.IGreenhouseService;

/**
 *
 */
@Component("switchOnoffOnScheduleTask")
public class SwitchOnoffOnScheduleTask extends TimerTask {

	@Autowired
    private IGreenhouseService greenhouseService;
	/** 
	 * overridden:
	 * @Author      :      ZHWANG
	 * @Date        :      2014-9-13
	 * @see java.util.TimerTask#run()
	**/
	@Override
	public void run() {
		boolean result = greenhouseService.autoTriggerOnSchedule();
	}

}
