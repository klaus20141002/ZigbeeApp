/************************************************************************************
 * @File name   :      MailSessionHost.java
 *
 * @Author      :      YIFEGU
 *
 * @Date        :      2011-9-25
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
 * 2011-9-25 ÉÏÎç10:00:00			YIFEGU			1.0				Initial Version
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
@Table(name = "Mail_Session")
public class MailSessionHost extends BaseDomain {
	
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private String smtpHost;
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
	 * @Date        :      2011-9-25
	 *
	 * @return the name
	 */
    @Column(name = "NAME")
	public String getName() {
		return name;
	}

	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      2011-9-25
	 *
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      2011-9-25
	 *
	 * @return the smtpHost
	 */
	@Column(name = "SMTP_HOST")
	public String getSmtpHost() {
		return smtpHost;
	}

	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      2011-9-25
	 *
	 * @param smtpHost the smtpHost to set
	 */
	public void setSmtpHost(String smtpHost) {
		this.smtpHost = smtpHost;
	}

	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      2011-9-13
	 *
	 * @return the status
	 */
	@Column(name = "STATUS")
	public Integer getStatus() {
		return status;
	}

	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      2011-9-13
	 *
	 * @param status the status to set
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      2011-9-13
	 *
	 * @return the remarks
	 */
	@Column(name = "REMARKS")
	public String getRemarks() {
		return remarks;
	}

	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      2011-9-13
	 *
	 * @param remarks the remarks to set
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
    
}
