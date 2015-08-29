/************************************************************************************
 * @File name   :      EquipmentResultDto.java
 *
 * @Author      :      ZHWANG
 *
 * @Date        :      2014-9-10
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
 * 2014-9-10 下午10:19:12			ZHWANG			1.0				Initial Version
 ************************************************************************************/
package com.zigbee.function.dto;

import java.util.Date;

import com.zigbee.framework.common.dto.BaseDto;
import com.zigbee.framework.common.util.Utils;
import com.zigbee.function.constant.GreenhouseCommonConstants;

/**
 *
 */
public class EquipmentResultDto extends BaseDto {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String equipCode; //设备Id/code
	private String equipSeq; //设备编号
	private String equipName; //设备名
    private Byte equipType; //设备类型
    private String equipTypeText; //
    private Integer monitorPointId;//所属监测点ID
    private Date uploadDate; //更新时刻
    private int switchOnoff = 0;  //当前开关状态 
    private int isOnline = 0;//是否在线
    private String monitorPointName;//所属监测点名称
	/**
	 * @Author      :      yifegu
	 *
	 * @Date        :      2014-9-14
	 *
	 * @return the monitorPointName
	 */
	public String getMonitorPointName() {
		return monitorPointName;
	}
	/**
	 * @Author      :      yifegu
	 *
	 * @Date        :      2014-9-14
	 *
	 * @param monitorPointName the monitorPointName to set
	 */
	public void setMonitorPointName(String monitorPointName) {
		this.monitorPointName = monitorPointName;
	}
	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2014-9-10
	 *
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2014-9-10
	 *
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2014-9-10
	 *
	 * @return the equipCode
	 */
	public String getEquipCode() {
		return equipCode;
	}
	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2014-9-10
	 *
	 * @param equipCode the equipCode to set
	 */
	public void setEquipCode(String equipCode) {
		this.equipCode = equipCode;
	}
	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2014-9-10
	 *
	 * @return the equipSeq
	 */
	public String getEquipSeq() {
		return equipSeq;
	}
	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2014-9-10
	 *
	 * @param equipSeq the equipSeq to set
	 */
	public void setEquipSeq(String equipSeq) {
		this.equipSeq = equipSeq;
	}
	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2014-9-10
	 *
	 * @return the equipName
	 */
	public String getEquipName() {
		return equipName;
	}
	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2014-9-10
	 *
	 * @param equipName the equipName to set
	 */
	public void setEquipName(String equipName) {
		this.equipName = equipName;
	}
	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2014-9-10
	 *
	 * @return the equipType
	 */
	public Byte getEquipType() {
		return equipType;
	}
	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2014-9-10
	 *
	 * @param equipType the equipType to set
	 */
	public void setEquipType(Byte equipType) {
		this.equipType = equipType;
	}
	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2014-9-10
	 *
	 * @return the equipTypeText
	 */
	public String getEquipTypeText() {
		if(Utils.notEmpty(equipTypeText)){
			return equipTypeText;
		}
		switch(equipType){
			case GreenhouseCommonConstants.EQUIPMENT_TYPE_DATA_ACQUISITION:
				return "采集器/控制器";
			case GreenhouseCommonConstants.EQUIPMENT_TYPE_CONTROLLER:
				return "继电器";
			default:
				return "传感器";
		}
	}
	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2014-9-10
	 *
	 * @param equipTypeText the equipTypeText to set
	 */
	public void setEquipTypeText(String equipTypeText) {
		this.equipTypeText = equipTypeText;
	}
	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2014-9-10
	 *
	 * @return the monitorPointId
	 */
	public Integer getMonitorPointId() {
		return monitorPointId;
	}
	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2014-9-10
	 *
	 * @param monitorPointId the monitorPointId to set
	 */
	public void setMonitorPointId(Integer monitorPointId) {
		this.monitorPointId = monitorPointId;
	}
	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2014-9-10
	 *
	 * @return the uploadDate
	 */
	public Date getUploadDate() {
		return uploadDate;
	}
	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2014-9-10
	 *
	 * @param uploadDate the uploadDate to set
	 */
	public void setUploadDate(Date uploadDate) {
		this.uploadDate = uploadDate;
	}
	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2014-9-10
	 *
	 * @return the switchOnoff
	 */
	public int getSwitchOnoff() {
		return switchOnoff;
	}
	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2014-9-10
	 *
	 * @param switchOnoff the switchOnoff to set
	 */
	public void setSwitchOnoff(int switchOnoff) {
		this.switchOnoff = switchOnoff;
	}
	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2014-9-10
	 *
	 * @return the isOnline
	 */
	public int getIsOnline() {
		return isOnline;
	}
	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2014-9-10
	 *
	 * @param isOnline the isOnline to set
	 */
	public void setIsOnline(int isOnline) {
		this.isOnline = isOnline;
	}
}
