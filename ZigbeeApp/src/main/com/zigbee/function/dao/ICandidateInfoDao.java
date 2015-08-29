/************************************************************************************
 * @File name   :      ICandidateInfoDao.java
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
 * 2011-9-21 ÏÂÎç11:16:41			YIFEGU			1.0				Initial Version
 ************************************************************************************/
package com.zigbee.function.dao;

import java.util.List;

import com.zigbee.framework.common.dao.IBaseDao;
import com.zigbee.function.domain.CandidateInfo;

/**
 *
 */
public interface ICandidateInfoDao extends IBaseDao<CandidateInfo, Long> {
	
	/**
	 * 
	 * @Author      :      YIFEGU
	 * @Date        :      2011-9-26
	 * @return
	 */
	public List<CandidateInfo> getAvailableCandidates();
	
	/**
	 * 
	 * @Author      :      YIFEGU
	 * @Date        :      2011-10-4
	 * @param phone
	 * @return
	 */
	public boolean isDuplicateCandidate(String phone);

}
