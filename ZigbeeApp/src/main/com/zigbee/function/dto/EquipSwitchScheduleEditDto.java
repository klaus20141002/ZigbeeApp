/************************************************************************************
 * @File name   :      EquipSwitchScheduleEditDto.java
 *
 * @Author      :      ZHWANG
 *
 * @Date        :      2014-9-17
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
 * 2014-9-17 下午04:46:38			ZHWANG			1.0				Initial Version
 ************************************************************************************/
package com.zigbee.function.dto;

import java.util.Date;

import com.zigbee.framework.common.dto.BaseDto;

/**
 *
 */
public class EquipSwitchScheduleEditDto extends BaseDto {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Integer monitorPointId;
	private Integer equipmentId;
	
	private String openTime;
	private String closeTime;
	
	private Date openTimeDate;
	private Date closeTimeDate;
	
	private Integer curMode;
	
	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2014-9-17
	 *
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2014-9-17
	 *
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2014-9-17
	 *
	 * @return the monitorPointId
	 */
	public Integer getMonitorPointId() {
		return monitorPointId;
	}
	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2014-9-17
	 *
	 * @param monitorPointId the monitorPointId to set
	 */
	public void setMonitorPointId(Integer monitorPointId) {
		this.monitorPointId = monitorPointId;
	}
	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2014-9-17
	 *
	 * @return the equipmentId
	 */
	public Integer getEquipmentId() {
		return equipmentId;
	}
	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2014-9-17
	 *
	 * @param equipmentId the equipmentId to set
	 */
	public void setEquipmentId(Integer equipmentId) {
		this.equipmentId = equipmentId;
	}
	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2014-9-17
	 *
	 * @return the openTime
	 */
	public String getOpenTime() {
		return openTime;
	}
	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2014-9-17
	 *
	 * @param openTime the openTime to set
	 */
	public void setOpenTime(String openTime) {
		this.openTime = openTime;
	}
	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2014-9-17
	 *
	 * @return the closeTime
	 */
	public String getCloseTime() {
		return closeTime;
	}
	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2014-9-17
	 *
	 * @param closeTime the closeTime to set
	 */
	public void setCloseTime(String closeTime) {
		this.closeTime = closeTime;
	}
	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2014-9-17
	 *
	 * @return the openTimeDate
	 */
	public Date getOpenTimeDate() {
		return openTimeDate;
	}
	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2014-9-17
	 *
	 * @param openTimeDate the openTimeDate to set
	 */
	public void setOpenTimeDate(Date openTimeDate) {
		this.openTimeDate = openTimeDate;
	}
	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2014-9-17
	 *
	 * @return the closeTimeDate
	 */
	public Date getCloseTimeDate() {
		return closeTimeDate;
	}
	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2014-9-17
	 *
	 * @param closeTimeDate the closeTimeDate to set
	 */
	public void setCloseTimeDate(Date closeTimeDate) {
		this.closeTimeDate = closeTimeDate;
	}
	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2015-2-2
	 *
	 * @return the curMode
	 */
	public Integer getCurMode() {
		return curMode;
	}
	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2015-2-2
	 *
	 * @param curMode the curMode to set
	 */
	public void setCurMode(Integer curMode) {
		this.curMode = curMode;
	}
}
