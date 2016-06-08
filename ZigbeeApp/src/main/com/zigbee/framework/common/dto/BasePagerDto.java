/************************************************************************************
 * @File name   :      BasePagerDto.java
 *
 * @Author      :      Jianxi Wu
 *
 * @Date        :      2011-3-11
 *
 * @Copyright Notice: 
 * Copyright (c) 2011 Zhaogong, Inc. All  Rights Reserved.
 * This software is published under the terms of the  Software 
 * License version 1.0, a copy of which has been included with this
 * distribution in the LICENSE.txt file.
 * 
 * 
 * ----------------------------------------------------------------------------------
 * Date                             Who                 Version          Comments
 * 2011-3-11 下�?�04:21:16            Jianxi Wu            1.0             Initial Version
 ************************************************************************************/
package com.zigbee.framework.common.dto;

import com.zigbee.framework.common.dto.BaseDto;
import com.zigbee.framework.common.util.Pager;

/**
 * Provide paging support. All Dto which needs paging support will extend it.
 */
public class BasePagerDto extends BaseDto {
    // instance of Pager.
    private Pager pager = new Pager();
    private Integer page = 1; //当前页
    private Integer rows = 10;//每页行数
    private Integer totalPages=0;
    private Integer totalSizes = 0;
    /**
     * get instance of Pager.
     * 
     * @Date : 2011-3-11
     * 
     * @return the instance of Pager
     */
    public Pager getPager() {
        return pager;
    }

    /**
     * set pager instance which includes paging information.
     * 
     * @Date : 2011-3-11
     * 
     * @param pager
     *            the pager to set
     */
    public void setPager(Pager pager) {
        this.pager = pager;
    }

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
		pager.setCurrentPage(page);
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
		pager.setPageSize(rows);
	}

	public Integer getTotalPages() {
		return pager.getTotalPages();
	}

	public void setTotalPages(Integer totalPages) {
		this.totalPages = totalPages;
	}

	public Integer getTotalSizes() {
		return pager.getTotalSize();
	}

	public void setTotalSizes(Integer totalSizes) {
		this.totalSizes = totalSizes;
	}

    
}
