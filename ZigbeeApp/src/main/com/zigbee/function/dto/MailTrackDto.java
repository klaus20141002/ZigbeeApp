/************************************************************************************
 * @File name   :      MailTrackDto.java
 *
 * @Author      :      YIFEGU
 *
 * @Date        :      2011-10-1
 *
 * @Copyright Notice: 
 * Copyright (c) 2011 . All  Rights Reserved.
 * This software is published under the terms of the  Software 
 * License version 1.0, a copy of which has been included with this
 * distribution in the LICENSE.txt file.
 * 
 * 
 * ----------------------------------------------------------------------------------
 * Date								Who					Version				Comments
 * 2011-10-1 ����11:49:55			YIFEGU			1.0				Initial Version
 ************************************************************************************/
package com.zigbee.function.dto;

import java.util.Date;


/**
 *
 */
public class MailTrackDto implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private String name;
	private String gender;
	private String age;
	private String workingExperience;
	private String phone;
	private String address;
	private String email;
	private String expectedPosition;
	private String expectedSalary;
	private String education;
	private String senderAddress;
	private Date sentTime;
	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      2011-10-1
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      2011-10-1
	 *
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      2011-10-1
	 *
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      2011-10-1
	 *
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      2011-10-1
	 *
	 * @return the age
	 */
	public String getAge() {
		return age;
	}
	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      2011-10-1
	 *
	 * @param age the age to set
	 */
	public void setAge(String age) {
		this.age = age;
	}
	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      2011-10-1
	 *
	 * @return the workingExperience
	 */
	public String getWorkingExperience() {
		return workingExperience;
	}
	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      2011-10-1
	 *
	 * @param workingExperience the workingExperience to set
	 */
	public void setWorkingExperience(String workingExperience) {
		this.workingExperience = workingExperience;
	}
	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      2011-10-1
	 *
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      2011-10-1
	 *
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      2011-10-1
	 *
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      2011-10-1
	 *
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      2011-10-1
	 *
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      2011-10-1
	 *
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      2011-10-1
	 *
	 * @return the expectedPosition
	 */
	public String getExpectedPosition() {
		return expectedPosition;
	}
	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      2011-10-1
	 *
	 * @param expectedPosition the expectedPosition to set
	 */
	public void setExpectedPosition(String expectedPosition) {
		this.expectedPosition = expectedPosition;
	}
	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      2011-10-1
	 *
	 * @return the expectedSalary
	 */
	public String getExpectedSalary() {
		return expectedSalary;
	}
	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      2011-10-1
	 *
	 * @param expectedSalary the expectedSalary to set
	 */
	public void setExpectedSalary(String expectedSalary) {
		this.expectedSalary = expectedSalary;
	}
	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      2011-10-1
	 *
	 * @return the education
	 */
	public String getEducation() {
		return education;
	}
	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      2011-10-1
	 *
	 * @param education the education to set
	 */
	public void setEducation(String education) {
		this.education = education;
	}
	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      2011-10-1
	 *
	 * @return the senderAddress
	 */
	public String getSenderAddress() {
		return senderAddress;
	}
	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      2011-10-1
	 *
	 * @param senderAddress the senderAddress to set
	 */
	public void setSenderAddress(String senderAddress) {
		this.senderAddress = senderAddress;
	}
	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      2011-10-1
	 *
	 * @return the sentTime
	 */
	public Date getSentTime() {
		return sentTime;
	}
	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      2011-10-1
	 *
	 * @param sentTime the sentTime to set
	 */
	public void setSentTime(Date sentTime) {
		this.sentTime = sentTime;
	}
	
	

}
