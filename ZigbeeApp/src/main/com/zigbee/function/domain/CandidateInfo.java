/************************************************************************************
 * @File name   :      CandidateInfo.java
 *
 * @Author      :      YIFEGU
 *
 * @Date        :      2011-9-21
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
 * 2011-9-21 ÏÂÎç11:04:45			YIFEGU			1.0				Initial Version
 ************************************************************************************/
package com.zigbee.function.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.zigbee.framework.common.domain.BaseDomain;

/**
 *
 */
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
//@Entity
@Table(name = "candidate_info")
public class CandidateInfo extends BaseDomain {

	private static final long serialVersionUID = 1L;
	
	private Long id;
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
	private String positionCode;
	private String cityCode;
	private Integer status;
	private String remarks;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      2011-9-21
	 *
	 * @return the name
	 */
    @Column(name = "name")
	public String getName() {
		return name;
	}

	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      2011-9-21
	 *
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      2011-9-21
	 *
	 * @return the gender
	 */
	@Column(name = "gender")
	public String getGender() {
		return gender;
	}

	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      2011-9-21
	 *
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      2011-9-21
	 *
	 * @return the age
	 */
	@Column(name = "age")
	public String getAge() {
		return age;
	}

	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      2011-9-21
	 *
	 * @param age the age to set
	 */
	public void setAge(String age) {
		this.age = age;
	}

	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      2011-9-21
	 *
	 * @return the workingExperience
	 */
	@Column(name = "working_experience")
	public String getWorkingExperience() {
		return workingExperience;
	}

	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      2011-9-21
	 *
	 * @param workingExperience the workingExperience to set
	 */
	public void setWorkingExperience(String workingExperience) {
		this.workingExperience = workingExperience;
	}

	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      2011-9-21
	 *
	 * @return the phone
	 */
	@Column(name = "phone")
	public String getPhone() {
		return phone;
	}

	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      2011-9-21
	 *
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      2011-9-21
	 *
	 * @return the address
	 */
	@Column(name = "address")
	public String getAddress() {
		return address;
	}

	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      2011-9-21
	 *
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      2011-9-21
	 *
	 * @return the email
	 */
	@Column(name = "email")
	public String getEmail() {
		return email;
	}

	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      2011-9-21
	 *
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      2011-9-21
	 *
	 * @return the expectedPosition
	 */
	@Column(name = "expected_position")
	public String getExpectedPosition() {
		return expectedPosition;
	}

	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      2011-9-21
	 *
	 * @param expectedPosition the expectedPosition to set
	 */
	public void setExpectedPosition(String expectedPosition) {
		this.expectedPosition = expectedPosition;
	}

	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      2011-9-21
	 *
	 * @return the expectedSalary
	 */
	@Column(name = "expected_salary")
	public String getExpectedSalary() {
		return expectedSalary;
	}

	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      2011-9-21
	 *
	 * @param expectedSalary the expectedSalary to set
	 */
	public void setExpectedSalary(String expectedSalary) {
		this.expectedSalary = expectedSalary;
	}
	
	

	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      2011-9-23
	 *
	 * @return the education
	 */
	@Column(name = "education")
	public String getEducation() {
		return education;
	}

	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      2011-9-23
	 *
	 * @param education the education to set
	 */
	public void setEducation(String education) {
		this.education = education;
	}

	
	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      2011-10-4
	 *
	 * @return the positionCode
	 */
	@Column(name = "position_code")
	public String getPositionCode() {
		return positionCode;
	}

	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      2011-10-4
	 *
	 * @param positionCode the positionCode to set
	 */
	public void setPositionCode(String positionCode) {
		this.positionCode = positionCode;
	}

	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      2011-10-4
	 *
	 * @return the cityCode
	 */
	@Column(name = "city_code")
	public String getCityCode() {
		return cityCode;
	}

	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      2011-10-4
	 *
	 * @param cityCode the cityCode to set
	 */
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      2011-9-21
	 *
	 * @return the status
	 */
	@Column(name = "status")
	public Integer getStatus() {
		return status;
	}

	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      2011-9-21
	 *
	 * @param status the status to set
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      2011-9-21
	 *
	 * @return the remarks
	 */
	@Column(name = "remarks")
	public String getRemarks() {
		return remarks;
	}

	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      2011-9-21
	 *
	 * @param remarks the remarks to set
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
    
    

	

}
