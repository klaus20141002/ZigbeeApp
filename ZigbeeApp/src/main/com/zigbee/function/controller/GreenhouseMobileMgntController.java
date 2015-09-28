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

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.zigbee.framework.common.controller.BaseController;
import com.zigbee.framework.common.exception.AppException;
import com.zigbee.framework.common.util.JSONUtil;
import com.zigbee.function.constant.EquipmentConstants;
import com.zigbee.function.constant.GreenhouseCommonConstants;
import com.zigbee.function.domain.Message;
import com.zigbee.function.domain.MonitorPoint;
import com.zigbee.function.dto.ChartSeriesDto;
import com.zigbee.function.dto.EquipmentResultDto;
import com.zigbee.function.dto.GreenhouseQueryDto;
import com.zigbee.function.dto.GreenhouseResultDto;
import com.zigbee.function.dto.MonitorDetailDto;
import com.zigbee.function.service.IGreenhouseService;
import com.zigbee.function.util.MessageUtil;

/**
 *
 */
@Controller
@RequestMapping(value = "/greenhousemobile")
public class GreenhouseMobileMgntController extends BaseController {

	@Autowired
    private IGreenhouseService greenhouseService;
	
	
	@RequestMapping(value = "/monitor")
    public String getMonitorPage(GreenhouseQueryDto queryDto, Model model,
        HttpServletRequest request) throws JSONException {
		List<GreenhouseResultDto> result = greenhouseService.getMonitorResultListByDto(queryDto);
		String resultJson = JSONUtil.toJSONString(result);
        model.addAttribute("resultDto",resultJson);
        //chart
        
        List<ChartSeriesDto> seriesDtoList = greenhouseService.getTemperatureChart(GreenhouseCommonConstants.FETCH_TYPE_DAILY, 1);
        
        String resultJsonChart = JSONUtil.toJSONString(seriesDtoList);
        model.addAttribute("resultDtoChart",resultJsonChart);
        String resultxAxis = JSONUtil.toJSONString(seriesDtoList.get(0).getxAxis());
        model.addAttribute("xAxisList", resultxAxis);
        //chart
        
        //control
        List<EquipmentResultDto> resultEq = new ArrayList<EquipmentResultDto>();
		List<MonitorPoint> monitorPointList = greenhouseService.getAllMonitorPoints();
		for(MonitorPoint monitorPoint:monitorPointList){
			List<EquipmentResultDto> list = greenhouseService.getControlEquipListByMonitorId(monitorPoint.getId(),monitorPoint.getPointName());
			if(list != null && list.size() > 0){
				resultEq.addAll(list);
			}
			
		}
		
		String resultJsonEq = JSONUtil.toJSONString(resultEq);
		model.addAttribute("resultEqDto",resultJsonEq);
        //control
        
        return "mobile/index_mobile";
    }
	
	/**
	 * 进入配置页面
	 * @Author      :      ZHWANG
	 * @Date        :      2015-2-7
	 * @param queryDto
	 * @param model
	 * @param request
	 * @return
	 * @throws JSONException
	 */
	@RequestMapping(value = "/getSysConfigPage")
    public String getSysConfigPage(GreenhouseQueryDto queryDto, Model model,
        HttpServletRequest request) throws JSONException {
        return "mobile/config_mobile";
    }
	/**
	 * 设备监控
	 * @Author      :      ZHWANG
	 * @Date        :      2014-9-18
	 * @param queryDto
	 * @param model
	 * @param request
	 * @return
	 * @throws JSONException
	 */
	@RequestMapping(value = "/equipmonitor")
    public String getEquipMonitorPage(GreenhouseQueryDto queryDto, Model model,
        HttpServletRequest request) throws JSONException {
		List<GreenhouseResultDto> result = greenhouseService.getMonitorResultListByDto(queryDto);
		String resultJson = JSONUtil.toJSONString(result);
        model.addAttribute("resultDto",resultJson);
        
        return "mobile/equipmonitor_mobile";
    }
	
	@RequestMapping(value = "/chart")
    public String getMonitorPage(Model model,
        HttpServletRequest request){
        return "mobile/chart";
    }
	
	/**
	 * 获得设备列表json数据
	 * @Author      :      YIFEGU
	 * @Date        :      2014-9-7
	 * @param queryDto
	 * @param model
	 * @param request
	 * @param response
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "/getEquipJson")
	@ResponseBody
    public String getSubJson( Model model,
        HttpServletRequest request,HttpServletResponse response) throws IOException {
		List<EquipmentResultDto> result = new ArrayList<EquipmentResultDto>();
		List<MonitorPoint> monitorPointList = greenhouseService.getAllMonitorPoints();
		for(MonitorPoint monitorPoint:monitorPointList){
			List<EquipmentResultDto> list = greenhouseService.getControlEquipListByMonitorId(monitorPoint.getId(),monitorPoint.getPointName());
			if(list != null && list.size() > 0){
				result.addAll(list);
			}
			
		}
		
	    JSONObject json = new JSONObject();  
	    json.put("rows", result);  
	    String jsonResult = json.toJSONString();
	    return encodeJsonDataToUTF8(response, jsonResult);
    }
	
	@RequestMapping(value = "/mobile")
    public String toMobileFirstPage(Model model,HttpServletRequest request) {
        return "greenhouse/mobilefirstpage";
    }
	
	@RequestMapping(value = "/showCurrent")
    public String showCurrentEnvironment(Model model,HttpServletRequest request) {
        return "greenhouse/showcurrent";
    }
	
	/**
	 * 编码 json data to utf8
	 * @Author      :      ZHWANG
	 * @Date        :      Sep 1, 2014
	 * @param response
	 * @param jsonResult
	 * @return
	 * @throws IOException
	 */
	private String encodeJsonDataToUTF8(HttpServletResponse response,
			String jsonResult) throws IOException {
		  response.setCharacterEncoding("UTF-8");
	      PrintWriter writer = response.getWriter();
	      writer.print(jsonResult);
	      writer.close();
	      return null;
	}
	
	@RequestMapping(value = "/toChart")
    public String toChart( Model model,
        HttpServletRequest request) throws JSONException {		
		//chart
        
        List<ChartSeriesDto> seriesDtoList = greenhouseService.getTemperatureChart(GreenhouseCommonConstants.FETCH_TYPE_DAILY, 1);
        
        String resultJsonChart = JSONUtil.toJSONString(seriesDtoList);
        model.addAttribute("resultDtoChart",resultJsonChart);
        String resultxAxis = JSONUtil.toJSONString(seriesDtoList.get(0).getxAxis());
        model.addAttribute("xAxisList", resultxAxis);
        //chart
        
        return "mobile/chartPageMobile";
    }
	
	/**
	 * 进入跟踪明细页面
	 * @Author      :      ZHWANG
	 * @Date        :      2015-2-2
	 * @param model
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/toMonitorDetailPage")
    public String toMonitorDetailPage( Model model,
        HttpServletRequest request) {
		String monitorCode = "monitorpoint1";
		MonitorDetailDto dto = greenhouseService.getMonitorDetailDtoByCode(monitorCode);
        model.addAttribute("dto", dto);
        return "mobile/monitorDetailPageMobile";
    }
	
	/**
	 * 进入选择水果类选择页面
	 * @Author      :      ZHWANG
	 * @Date        :      2015-2-6
	 * @param model
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/selectFruitAndMode")
    public String selectFruitAndMode( Model model,HttpServletRequest request) {
		MonitorDetailDto dto = new MonitorDetailDto();
        model.addAttribute("dto", dto);
        return "mobile/selectFruitAndMode";
    }
	
	/**
	 * 进入自动控制页面
	 * @Author      :      ZHWANG
	 * @Date        :      2015-2-6
	 * @param model
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/toAutoControlPage")
    public String toAutoControlPage( Model model,
        HttpServletRequest request)  {
		try {
			String monitorCode = "monitorpoint1";
			MonitorDetailDto dto = greenhouseService.getMonitorDetailDtoByCode(monitorCode);
			model.addAttribute("dto", dto);
			//chart
			List<ChartSeriesDto> seriesDtoList = greenhouseService.getTemperatureChart(GreenhouseCommonConstants.FETCH_TYPE_DAILY, 1);
			String resultJsonChart = JSONUtil.toJSONString(seriesDtoList);
			model.addAttribute("resultDtoChart",resultJsonChart);
			String resultxAxis = JSONUtil.toJSONString(seriesDtoList.get(0).getxAxis());
			model.addAttribute("xAxisList", resultxAxis);
			
			MessageUtil.openChannel();
			Message message = new Message() ;
	        message.setEquipmentId(EquipmentConstants.CONTROL_MODEL);
	        message.setStatus(EquipmentConstants.CONTROL_MODEL_AUTO);
			MessageUtil.sendMessage(message);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (AppException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return "mobile/autoControlPage";
    }
	
	/**
	 * 进入手动控制页面
	 * @Author      :      ZHWANG
	 * @Date        :      2015-2-6
	 * @param model
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/toManualControlPage")
    public String toManualControlPage( Model model,
        HttpServletRequest request) {
		try {
			String monitorCode = "monitorpoint1";
			MonitorDetailDto dto = greenhouseService.getMonitorDetailDtoByCode(monitorCode);
			model.addAttribute("dto", dto);
			
			//chart
			List<ChartSeriesDto> seriesDtoList = greenhouseService.getTemperatureChart(GreenhouseCommonConstants.FETCH_TYPE_DAILY, 1);
			String resultJsonChart = JSONUtil.toJSONString(seriesDtoList);
			model.addAttribute("resultDtoChart",resultJsonChart);
			String resultxAxis = JSONUtil.toJSONString(seriesDtoList.get(0).getxAxis());
			model.addAttribute("xAxisList", resultxAxis);
			MessageUtil.openChannel();
			Message message = new Message() ;
	        message.setEquipmentId(EquipmentConstants.CONTROL_MODEL);
	        message.setStatus(EquipmentConstants.CONTROL_MODEL_MANUAL);
			MessageUtil.sendMessage(message);
		} catch (JSONException e) {
			e.printStackTrace();
		} catch (AppException e) {
			e.printStackTrace();
		}
        return "mobile/manualControlPage";
    }
}
