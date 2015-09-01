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
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.zigbee.framework.common.controller.BaseController;
import com.zigbee.framework.common.util.JSONUtil;
import com.zigbee.function.constant.GreenhouseCommonConstants;
import com.zigbee.function.dto.CascadeCfgEditDto;
import com.zigbee.function.dto.ChartSeriesDto;
import com.zigbee.function.dto.EquipSwitchScheduleEditDto;
import com.zigbee.function.dto.EquipmentResultDto;
import com.zigbee.function.dto.GreenhouseQueryDto;
import com.zigbee.function.dto.GreenhouseResultDto;
import com.zigbee.function.dto.LightTriggerMasterDto;
import com.zigbee.function.dto.MonitorDetailDto;
import com.zigbee.function.dto.ThresholdMasterDto;
import com.zigbee.function.dto.VideoMessagesDto;
import com.zigbee.function.dto.WarningMessagesDto;
import com.zigbee.function.service.IGreenhouseService;

/**
 *
 */
@Controller
@RequestMapping(value = "/greenhouse")
public class GreenhouseMgntController extends BaseController {

	@Autowired
    private IGreenhouseService greenhouseService;
	
	/**
	 * 进入web程序入口，构建首页
	 * @Author      :      ZHWANG
	 * @Date        :      2014-9-7
	 * @param queryDto
	 * @param model
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/index")
    public String queryCacComplainWithPaging(GreenhouseQueryDto queryDto, Model model,
        HttpServletRequest request) {
		List<GreenhouseResultDto> result = greenhouseService.getListByDto(queryDto);
		//greenhouseService.getTemperatureChart(1, 1);
        model.addAttribute("resultDto", result);
        return "greenhouse/firstpage";
    }
	
	/**
	 * 进入实时监控页面，clone过来的页面，已废弃
	 * @Author      :      ZHWANG
	 * @Date        :      2014-9-7
	 * @param queryDto
	 * @param model
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/monitor")
    public String getMonitorPage(GreenhouseQueryDto queryDto, Model model,
        HttpServletRequest request) {
		List<GreenhouseResultDto> result = greenhouseService.getListByDto(queryDto);
        
        model.addAttribute("resultDto", result);
        return "greenhouse/monitorList";
    }
	
	/**
	 * 进入web板监控页面
	 * @Author      :      ZHWANG
	 * @Date        :      2014-9-7
	 * @param queryDto
	 * @param model
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "/getMonitorList")
    public String getList(GreenhouseQueryDto queryDto, Model model,
        HttpServletRequest request,HttpServletResponse response) {
        return "greenhouse/monitorpointlist";
    }
	
	/**
	 * 
	 * @Author      :      ZHWANG
	 * @Date        :      2015-2-1
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
        return "greenhouse/monitorDetailPage";
    }
	/**
	 * 获得监测点列表json数据
	 * @Author      :      ZHWANG
	 * @Date        :      2014-9-7
	 * @param queryDto
	 * @param model
	 * @param request
	 * @param response
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "/getPointJsonData")
	@ResponseBody
    public String getJsonData(GreenhouseQueryDto queryDto, Model model,
        HttpServletRequest request,HttpServletResponse response) throws IOException {
		List<GreenhouseResultDto> result = greenhouseService.getMonitorResultListByDto(queryDto);
	    JSONObject json = new JSONObject();  
	    json.put("rows", result);  
	    json.put("total", queryDto.getTotalSizes()); 
	    String jsonResult = json.toJSONString();
	    return encodeJsonDataToUTF8(response, jsonResult);
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
	
	/**
	 * 获得监测点下的设备列表json数据
	 * @Author      :      ZHWANG
	 * @Date        :      2014-9-7
	 * @param queryDto
	 * @param model
	 * @param request
	 * @param response
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "/getEquipSubJson")
	@ResponseBody
    public String getSubJson(GreenhouseQueryDto queryDto, Model model,
        HttpServletRequest request,HttpServletResponse response) throws IOException {
		
		List<EquipmentResultDto> result = greenhouseService.getControlEquipListByMonitorId(queryDto.getEquipmentId());
	    JSONObject json = new JSONObject();  
	    json.put("rows", result);  
	    String jsonResult = json.toJSONString();
	    return encodeJsonDataToUTF8(response, jsonResult);
		/*List<GreenhouseResultDto> result = new ArrayList<GreenhouseResultDto>(3); //greenhouseService.getListByDto(queryDto);
		GreenhouseResultDto dto1 = new GreenhouseResultDto();
		dto1.setId(12);
		dto1.setEquipmentId(12);
		dto1.setWetnessValue(new Float("1.2"));
		dto1.setUploadDate(new Date());
		dto1.setName("照明1");
		dto1.setPort(1);
		dto1.setSwitchOnoff(1);
		result.add(dto1);
		GreenhouseResultDto dto2 = new GreenhouseResultDto();
		dto2.setId(13);
		dto2.setEquipmentId(13);
		dto2.setWetnessValue(new Float("1.3"));
		dto2.setUploadDate(new Date());
		dto2.setName("空气开关2");
		dto2.setPort(2);
		result.add(dto2);
		GreenhouseResultDto dto3 = new GreenhouseResultDto();
		dto3.setId(14);
		dto3.setEquipmentId(14);
		dto3.setWetnessValue(new Float("1.4"));
		dto3.setUploadDate(new Date());
		dto3.setName("继电器3");
		dto3.setPort(3);
		dto3.setSwitchOnoff(1);
		result.add(dto3);
		JSONObject json = new JSONObject();  
	      json.put("rows", result);  
	      json.put("total", 3);  
	      String jsonResult = json.toJSONString();
	      return encodeJsonDataToUTF8(response, jsonResult);*/
    }
	
	/**
	 * 保存控制命令到后台数据库
	 * @Author      :      ZHWANG
	 * @Date        :      2014-9-11
	 * @param queryDto
	 * @param model
	 * @param request
	 * @param response
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "/updateSwitchOnOff")
	@ResponseBody
    public String updateSwitchOnOff(Integer equipmentId, Integer switchOnoff, Model model,
        HttpServletRequest request,HttpServletResponse response) throws IOException {
		boolean result = greenhouseService.updateSwtichOnOff(equipmentId, switchOnoff);
		if(!result){
			return "failure";
		}
	    return "success";
    }
	/**
	 * 进入联动设置页面
	 * @Author      :      ZHWANG
	 * @Date        :      2014-9-7
	 * @param model
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/toCascadeConfig")
    public String toEditCascadeConfig( Model model,
        HttpServletRequest request) {
		
		CascadeCfgEditDto dto = greenhouseService.getCascadeCfgDto();
		
//		CascadeCfgEditDto dto = new CascadeCfgEditDto();
//		dto.setLowerAirTemperature(10);
//		dto.setLowerAirTemperatureAction(0);
//		dto.setHigherAirTemperature(30);
//		dto.setHigherAirTemperatureAction(1);
//		dto.setLowerAirWetness(10);
		
        model.addAttribute("dto", dto);
        return "greenhouse/cascadeconfig";
    }
	
	/**
	 * 保存联动设置页面
	 * @Author      :      ZHWANG
	 * @Date        :      2014-9-7
	 * @param editDto
	 * @param model
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "/saveCascadeCfg")
	@ResponseBody
	public String saveCascadeCfg(CascadeCfgEditDto editDto, Model model,
	        HttpServletRequest request,HttpServletResponse response) {
		//save config
		
		boolean result = greenhouseService.saveCascadeCfg(editDto);
		//构建dto在前台展示
		/*CascadeCfgEditDto retDto = new CascadeCfgEditDto();
		BeanCopyUtil.copyProperties(editDto, retDto);
		retDto.setLowerAirTemperature(76);
		retDto.setId(1);
		try {
			return JSONUtil.toJSONString(retDto);
		} catch (JSONException e) {
			return null;
		}   */
		return "success";
	}
	
	/**
	 * 进入配置页面
	 * @Author      :      ZHWANG
	 * @Date        :      2015-1-16
	 * @param cfgType  类型1-温度，2-湿度，3-光照
	 * @param model
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/toThresholdConfig")
    public String toThresholdConfig(@RequestParam("cfgType") Integer cfgType, Model model,
        HttpServletRequest request) {
		
		ThresholdMasterDto dto = greenhouseService.getThresholdConfigDto(cfgType);
        model.addAttribute("dto", dto);
        return "greenhouse/thresholdConfig";
    }
	
	/**
	 * 保存配置信息
	 * @Author      :      ZHWANG
	 * @Date        :      2015-1-16
	 * @param editDto
	 * @param model
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "/saveThresholdConfig")
	@ResponseBody
	public String saveThresholdConfig(ThresholdMasterDto editDto, Model model,
	        HttpServletRequest request,HttpServletResponse response) {
		//save config
		System.out.println();
		boolean result = greenhouseService.saveThresholdConfig(editDto);
		return "success";
	}
	
	/**
	 * 
	 * @Author      :      ZHWANG
	 * @Date        :      2015-1-16
	 * @param model
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/toLightTriggerConfig")
    public String toLightTriggerConfig(Model model,
        HttpServletRequest request) {
		
		LightTriggerMasterDto dto = greenhouseService.getLightTriggerConfigDto();
        model.addAttribute("dto", dto);
        return "greenhouse/lightTriggerConfig";
    }
	/**
	 * @Author      :      GUDONG
	 * @Date        :      2015年8月30日
	 * @param model
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/toShowWarningMessages")
	public String toShowWarningMessages(Model model,
			HttpServletRequest request) {
		List<WarningMessagesDto> WarningMessages = greenhouseService.getAllWarningMessages();
		model.addAttribute("WarningMessages", WarningMessages);
		return "greenhouse/showWarningMessages";
	}
	
	/**
	 * @Author      :      GUDONG
	 * @Date        :      2015年8月30日
	 * @param model
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/toShowVideoMessages")
	public String toShowVideoMessages(Model model,
			HttpServletRequest request) {
		List<VideoMessagesDto> videoMessagesDto = greenhouseService.getAllVideoMessages();
		model.addAttribute("videoMessagesDto", videoMessagesDto);
		return "greenhouse/showVideoMessages";
	}
	
	/**
	 * 
	 * @Author      :      ZHWANG
	 * @Date        :      2015-1-16
	 * @param editDto
	 * @param model
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "/saveLightTriggerConfig")
	@ResponseBody
	public String saveLightTriggerConfig(LightTriggerMasterDto editDto, Model model,
	        HttpServletRequest request,HttpServletResponse response) {
		//save config
		boolean result = greenhouseService.saveLightTriggerConfig(editDto);
		return "success";
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
	 * Chart
	 * @Author      :      yifegu
	 * @Date        :      2014-9-7
	 * @param model
	 * @param request
	 * @return
	 * @throws JSONException 
	 */
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
        
        return "greenhouse/chartPage";
    }
	

	
	/**
	 * 进入联动设置页面
	 * @Author      :      ZHWANG
	 * @Date        :      2014-9-7
	 * @param model
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/toeditschedule")
    public String toEditEquipSwitchSchedule( Model model,
        HttpServletRequest request) {
		
		EquipSwitchScheduleEditDto dto = greenhouseService.getControlModeDto();
		if(dto==null){
			dto = new EquipSwitchScheduleEditDto();
			dto.setCurMode(GreenhouseCommonConstants.SYSCONTROL_MODE_AUTO);
		}
        model.addAttribute("dto", dto);
        return "greenhouse/configEquipAutoSwitchSchedule";
    }
	
	/**
	 * 保存联动设置页面
	 * @Author      :      ZHWANG
	 * @Date        :      2014-9-7
	 * @param editDto
	 * @param model
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "/saveEquipSwitchSchedule")
	@ResponseBody
	public String saveEquipSwitchSchedule(EquipSwitchScheduleEditDto editDto, Model model,
	        HttpServletRequest request,HttpServletResponse response) {
		if(editDto.getCurMode()==null){
			editDto.setCurMode(GreenhouseCommonConstants.SYSCONTROL_MODE_AUTO);
		}
		boolean result = greenhouseService.saveSysControlMode(editDto);
		return "success";
	}
	
	/**
	 * 大棚鸟瞰图首页
	 * @Author      :      ZHWANG
	 * @Date        :      2014-9-23
	 * @param model
	 * @param request
	 * @return
	 * @throws JSONException
	 */
	@RequestMapping(value = "/layout")
    public String layoutGreenhouse( Model model,
        HttpServletRequest request) throws JSONException {		
        return "greenhouse/greenhouselayout";
    }
}
