/************************************************************************************
 * @File name   :      TrackRecord.java
 *
 * @Author      :      YIFEGU
 *
 * @Date        :      2011-10-1
 *
 * @Copyright Notice: 
 * Copyright (c) 2011 SGM, Inc. All  Rights Reserved.
 * This software is published under the terms of the SGM Software
 * License version 1.0, a copy of which has been included with this
 * distribution in the LICENSE.txt file.
 * 
 * 
 * ----------------------------------------------------------------------------------
 * Date								Who					Version				Comments
 * 2011-10-1 ÏÂÎç11:16:50			YIFEGU			1.0				Initial Version
 ************************************************************************************/
package com.zigbee.function.domain.webclient;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.zigbee.framework.common.domain.BaseDomain;
import com.zigbee.function.domain.CandidateInfo;

/**
 *
 */
public class TrackRecord extends BaseDomain {

	private static final long serialVersionUID = 1L;
	private Long id;
	private CandidateInfo candidate;
	private String senderAddress;
	private Date sentTime;
	private int mailReadTimes;
	private int viewDirectlyTimes;
	private int viewRegTimes;
	private int viewAllTimes;
	private int unsubscribeTimes;
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
	 * @Date        :      2011-10-1
	 *
	 * @return the candidate
	 */
    @ManyToOne(targetEntity = CandidateInfo.class, fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
	@JoinColumn(name = "CANDIDATE_ID", referencedColumnName = "ID")
    public CandidateInfo getCandidate() {
		return candidate;
	}

	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      2011-10-1
	 *
	 * @param candidate the candidate to set
	 */
	public void setCandidate(CandidateInfo candidate) {
		this.candidate = candidate;
	}

	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      2011-10-1
	 *
	 * @return the senderAddress
	 */
	@Column(name = "SENDER_ADDRESS")
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
	@Column(name = "SENT_TIME")
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

	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      2011-10-1
	 *
	 * @return the mailReadTimes
	 */
	@Column(name = "MAIL_READ_TIMES")
	public int getMailReadTimes() {
		return mailReadTimes;
	}

	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      2011-10-1
	 *
	 * @param mailReadTimes the mailReadTimes to set
	 */
	public void setMailReadTimes(int mailReadTimes) {
		this.mailReadTimes = mailReadTimes;
	}

	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      2011-10-1
	 *
	 * @return the viewDirectlyTimes
	 */
	@Column(name = "VIEW_DIRECTLY_TIMES")
	public int getViewDirectlyTimes() {
		return viewDirectlyTimes;
	}

	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      2011-10-1
	 *
	 * @param viewDirectlyTimes the viewDirectlyTimes to set
	 */
	public void setViewDirectlyTimes(int viewDirectlyTimes) {
		this.viewDirectlyTimes = viewDirectlyTimes;
	}

	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      2011-10-1
	 *
	 * @return the viewRegTimes
	 */
	@Column(name = "VIEW_REG_TIMES")
	public int getViewRegTimes() {
		return viewRegTimes;
	}

	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      2011-10-1
	 *
	 * @param viewRegTimes the viewRegTimes to set
	 */
	public void setViewRegTimes(int viewRegTimes) {
		this.viewRegTimes = viewRegTimes;
	}

	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      2011-10-1
	 *
	 * @return the viewAllTimes
	 */
	@Column(name = "VIEW_ALL_TIMES")
	public int getViewAllTimes() {
		return viewAllTimes;
	}

	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      2011-10-1
	 *
	 * @param viewAllTimes the viewAllTimes to set
	 */
	public void setViewAllTimes(int viewAllTimes) {
		this.viewAllTimes = viewAllTimes;
	}

	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      2011-10-1
	 *
	 * @return the unsubscribeTimes
	 */
	@Column(name = "UNSUBSCRIBE_TIMES")
	public int getUnsubscribeTimes() {
		return unsubscribeTimes;
	}

	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      2011-10-1
	 *
	 * @param unsubscribeTimes the unsubscribeTimes to set
	 */
	public void setUnsubscribeTimes(int unsubscribeTimes) {
		this.unsubscribeTimes = unsubscribeTimes;
	}

	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      2011-10-1
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
	 * @Date        :      2011-10-1
	 *
	 * @param status the status to set
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 * @Author      :      YIFEGU
	 *
	 * @Date        :      2011-10-1
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
	 * @Date        :      2011-10-1
	 *
	 * @param remarks the remarks to set
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
    
    

}
