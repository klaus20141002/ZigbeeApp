/************************************************************************************
 * @File name   :      TraceRecords.java
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
 * 2011-9-25 ÉÏÎç10:08:18			YIFEGU			1.0				Initial Version
 ************************************************************************************/
package com.zigbee.function.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.zigbee.framework.common.domain.BaseDomain;

/**
 *
 */
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
//@Entity
@Table(name = "Sent_Trace_Records")
public class TraceRecords extends BaseDomain {

	private static final long serialVersionUID = 1L;
	private Long id;
	private MailSenderAddress senderAddress;
	private CandidateInfo candidateInfo;
	private Date lastSentTime;
	private Integer readStatus;
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
	 * @return the senderAddress
	 */
    @ManyToOne(targetEntity = MailSenderAddress.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "SENDER_ADDRESS_ID", referencedColumnName = "ID")
	public MailSenderAddress getSenderAddress() {
		return senderAddress;
	}

	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      2011-9-25
	 *
	 * @param senderAddress the senderAddress to set
	 */
	public void setSenderAddress(MailSenderAddress senderAddress) {
		this.senderAddress = senderAddress;
	}

	

	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      2011-9-26
	 *
	 * @return the candidateInfo
	 */
	@ManyToOne(targetEntity = CandidateInfo.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "CANDIDATE_ID", referencedColumnName = "ID")
	public CandidateInfo getCandidateInfo() {
		return candidateInfo;
	}

	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      2011-9-26
	 *
	 * @param candidateInfo the candidateInfo to set
	 */
	public void setCandidateInfo(CandidateInfo candidateInfo) {
		this.candidateInfo = candidateInfo;
	}

	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      2011-9-25
	 *
	 * @return the lastSentTime
	 */
	@Column(name = "LAST_SENT_TIME")
	public Date getLastSentTime() {
		return lastSentTime;
	}

	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      2011-9-25
	 *
	 * @param lastSentTime the lastSentTime to set
	 */
	public void setLastSentTime(Date lastSentTime) {
		this.lastSentTime = lastSentTime;
	}

	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      2011-9-25
	 *
	 * @return the readStatus
	 */
	@Column(name="IS_READ_BY_RECEIVER")
	public Integer getReadStatus() {
		return readStatus;
	}

	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      2011-9-25
	 *
	 * @param readStatus the readStatus to set
	 */
	public void setReadStatus(Integer readStatus) {
		this.readStatus = readStatus;
	}

	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      2011-9-25
	 *
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
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
