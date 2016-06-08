/************************************************************************************
 * @File name   :      BaseDomain.java
 *
 * @Author      :      Brenda Yin
 *
 * @Date        :      2011-2-16
 *
 * @Copyright Notice: 
 * Copyright (c) 2011 Zhaogong, Inc. All  Rights Reserved.
 * This software is published under the terms of the  Software 
 * License version 1.0, a copy of which has been included with this
 * distribution in the LICENSE.txt file.
 * 
 * 
 * ----------------------------------------------------------------------------------
 * Date                             Who                 Version             Comments
 * 2011-1-26 上�?�10:15:14         Brenda Yin            1.0             Initial Version
 ************************************************************************************/
package com.zigbee.framework.common.domain;

import javax.persistence.MappedSuperclass;

/**
 * Base class of all domain.Include common fields of all domain. And it will be
 * extended by specific domains.
 * 
 */
@MappedSuperclass
public abstract class BaseDomain implements java.io.Serializable {

    // the primary id of domain
    protected Integer id;
   

	@Override
	public String toString() {
		return "BaseDomain [id=" + id + "]";
	}

}
