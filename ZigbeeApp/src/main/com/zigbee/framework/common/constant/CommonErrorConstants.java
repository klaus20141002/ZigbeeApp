/************************************************************************************
 * @File name   :      CommonErrorConstants.java
 *
 * @Author      :      Brenda Yin
 *
 * @Date        :      2011-1-11
 *
 * @Copyright Notice: 
 * Copyright (c) 2011 . All  Rights Reserved.
 * This software is published under the terms of the  Software 
 * License version 1.0, a copy of which has been included with this
 * distribution in the LICENSE.txt file.
 * 
 * 
 * ----------------------------------------------------------------------------------
 * Date                             Who             Version         Comments
 * 2011-1-11 下午02:22:10            Brenda Yin         1.0            Initial Version
 ************************************************************************************/
package com.zigbee.framework.common.constant;

/**
 * Defines all the error codes of common exceptions.
 */
public interface CommonErrorConstants {
	
	final String CHECKED_ERROR_PAGE="function_error";

    /**
     * Constant to represent not found exception.
     */
    final String NOT_FOUND = "NOT_FOUND"; // or using number to specify each
                                          // error, e.g.1001

    /**
     * Constant to represent null exception.
     */
    final String IS_NULL = "IS_NULL";
    
    final String BRAND_NOT_FOUND_ERROR = "BRAND_NOT_FOUND_ERROR";//CommonErrorConstants.BRAND_NOT_FOUND_ERROR
    
    
    /**
     * Constant to represent system exception
     */
    final String SYSTEM_ERROR = "SYSTEM_ERROR";
    
    /**
     * Constant to represent common method parameter error
     */
    final String COMMON_METHOD_PARAM_ERROR = "COMMON_METHOD_PARAM_ERROR";
    
    //from TestDrivingErrorConstants.java
    final String COMMON_UPLOAD_FILE_FAILED_EXCEPTION = "COMMON_UPLOAD_FILE_FAILED_EXCEPTION";


    /**
     * 
     */
    final String SYSTEM_EXCEPTION_MESSAGE_PREFIX = "System's Exception:";
    
    final String BEAN_COPY_EXCEPTION = "BEAN_COPY_EXCEPTION";
    
    final String IMPORT_FILE_EXCEPTION = "Import file exception";
    
    final String UPLOAD_FILE_IO_EXCEPTION = "upload file io exception"; 
    
    final String COMMON_UPLOAD_FILE_OVERSIZE_EXCEPTION = "COMMON_UPLOAD_FILE_OVERSIZE_EXCEPTION";
    
    final String COMMON_UPLOAD_FILE_OVERSIZE_20M_EXCEPTION = "COMMON_UPLOAD_FILE_OVERSIZE_20M_EXCEPTION";
    
    final String COMMON_UPLOAD_FILE_OVERSIZE_5M_EXCEPTION = "COMMON_UPLOAD_FILE_OVERSIZE_5M_EXCEPTION";
    
    final String COMMON_UPLOAD_FILE_OVERSIZE_8M_EXCEPTION = "COMMON_UPLOAD_FILE_OVERSIZE_8M_EXCEPTION";
    
    final String COMMON_USER_IS_NOT_USERGROUP = "COMMON_USER_IS_NOT_USERGROUP";
    
    final String COMMON_USER_IS_NOT_ORGANIZATION = "COMMON_USER_IS_NOT_ORGANIZATION";
    
    final String COMMON_DELETE_EMPLOYEE_STATUS = "COMMON_DELETE_EMPLOYEE_STATUS";
    
    final String COMMON_INVALID_TEMPLATE_FILE = "COMMON_INVALID_TEMPLATE_FILE";
    
    /**
     * 提醒-组织机构不存在！
     */
    final String COMMON_REMINDER_ORG_NOT_FOUND = "COMMON_REMINDER_ORG_NOT_FOUND";
    /**
     * 提醒-当前用户所在机构没有此项审批权限！
     */
    final String COMMON_REMINDER_ORG_ACCESS_ILLEGAL = "COMMON_REMINDER_ORG_ACCESS_ILLEGAL";
    /**
     * 重复提交服务器访问请求
     */
    final String COMMON_DUPLICATED_FORM_SUBMIT = "COMMON_DUPLICATED_FORM_SUBMIT";
    /**
     * 通过brandid和userid没有找到org
     */
    final String COMMON_NOT_FOUND_ORG_BY_BRANDID_USERID = "COMMON_NOT_FOUND_ORG_BY_BRANDID_USERID";
    
    /**
     * 通过brnadid和cityId找到mac
     */
    final String COMMON_NOT_MAC_BY_BRANDID_CITYID = "COMMON_NOT_MAC_BY_BRANDID_CITYID";
    
    final String TOO_MANY_EXPORT_DATA = "TOO_MANY_EXPORT_DATA";
}
