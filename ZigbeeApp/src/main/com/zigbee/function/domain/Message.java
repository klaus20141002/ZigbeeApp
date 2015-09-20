package com.zigbee.function.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class Message implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id ;
	private String equipmentId;
	private String status;
	
	
	/**
	 * @Author      :      Hasee
	 *
	 * @Date        :      2015年9月20日
	 *
	 * @return the id
	 */
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)	@Column(name = "id" )
	public int getId() {
		return id;
	}
	/**
	 * @Author      :      Hasee
	 *
	 * @Date        :      2015年9月20日
	 *
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the equipmentId
	 */
	@Column(name = "EQUIPMENT_ID")
	public String getEquipmentId() {
		return equipmentId;
	}
	/**
	 * @param equipmentId the equipmentId to set
	 */
	public void setEquipmentId(String equipmentId) {
		this.equipmentId = equipmentId;
	}
	/**
	 * @return the status
	 */
	@Column(name = "STATUS")
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
