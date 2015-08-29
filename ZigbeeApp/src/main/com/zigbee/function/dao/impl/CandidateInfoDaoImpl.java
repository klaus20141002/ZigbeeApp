/************************************************************************************
 * @File name   :      CandidateInfoDaoImpl.java
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
 * 2011-9-21 ÏÂÎç11:19:47			YIFEGU			1.0				Initial Version
 ************************************************************************************/
package com.zigbee.function.dao.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.zigbee.framework.common.dao.impl.BaseDaoImpl;
import com.zigbee.function.dao.ICandidateInfoDao;
import com.zigbee.function.domain.CandidateInfo;

/**
 *
 */
@Repository("candidateInfoDao")
public class CandidateInfoDaoImpl extends BaseDaoImpl<CandidateInfo, Long> implements
		ICandidateInfoDao {

	/**
	 * @Author      :      YIFEGU
	 * @Date        :      2011-9-21
	 * @param clazz
	 */
	@Inject
	public CandidateInfoDaoImpl(@Value("com.zigbee.function.domain.CandidateInfo") Class<CandidateInfo> clazz) {
		super(clazz);
	}

	/** 
	 * overridden:
	 * @Author      :      YIFEGU
	 * @Date        :      2011-9-26
	 * @see com.zigbee.function.dao.ICandidateInfoDao#getAvailableCandidates()
	**/
	@Override
	public List<CandidateInfo> getAvailableCandidates() {
				
		/*String hql = "select ci from CandidateInfo ci where ci.email is not null and ci.email !='' " +
		"and not exists(" +
		"select tr from TraceRecords tr where tr.candidateInfo.id = ci.id and " +
		"to_days(tr.lastSentTime) = to_days(now())" +
		")" +
		" order by ci.id asc"; */
		//No duplicate per day 
		
		String hql = "select ci from CandidateInfo ci where ci.email like '%@qq.com' and not exists(" +
		"select tr from TraceRecords tr where tr.candidateInfo.id = ci.id)" +
		" order by ci.id asc";//just test qq mail
		//No duplicate all
		
		List<CandidateInfo> resultList = this.getJpaTemplate().find(hql);
		return resultList;
	}

	/** 
	 * overridden:
	 * @Author      :      YIFEGU
	 * @Date        :      2011-10-4
	 * @see com.zigbee.function.dao.ICandidateInfoDao#isDuplicateCandidate(java.lang.String)
	**/
	@Override
	public boolean isDuplicateCandidate(String phone) {
		if(phone != null && !phone.trim().equals("")){
			String hql = "select count(ci.id) from CandidateInfo ci where ci.phone = '" +phone+ "'";
			int count = this.countByQuery(hql);
			if(count > 0){
				return true;
			}
		}		
		return false;
	}
	
}
