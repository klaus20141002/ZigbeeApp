/************************************************************************************
 * @File name   :      GreenhouseMgntController.java
 *
 * @Author      :      ZHWANG
 *
 * @Date        :      Aug 21, 2014
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
 * Aug 21, 2014 3:40:25 PM			ZHWANG			1.0				Initial Version
 ************************************************************************************/
package com.zigbee.function.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zigbee.framework.common.controller.BaseController;
import com.zigbee.framework.common.util.Utils;
import com.zigbee.function.dto.LoginDataDto;
import com.zigbee.function.service.IGreenhouseService;

/**
 *
 */
@Controller
@RequestMapping(value = "/greenhouse")
public class LoginController extends BaseController {

	@Autowired
    private IGreenhouseService greenhouseService;
	
	@RequestMapping(value = "/login")
    public String login(LoginDataDto dto, Model model,
        HttpServletRequest request) {
        if(dto != null && Utils.notEmpty(dto.getUserName()) && Utils.notEmpty(dto.getUserPwd())){
        	if(dto.getUserName().equals("Michael") && dto.getUserPwd().equals("1234")){
        		return "forward:/greenhousemobile/selectFruitAndMode";
        	}
        }
        return "mobile/login";

        
    }
	
	
}
