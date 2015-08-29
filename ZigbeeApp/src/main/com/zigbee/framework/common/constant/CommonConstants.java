/******************************************************************************
 * @File name   :      CommonConstants.java
 *
 * @Author      :      Junyi Cai
 *
 * @Date        :      2011-3-28
 *
 * @Copyright Notice: 
 * Copyright (c) 2011 Zhaogong, Inc. All  Rights Reserved.
 * This software is published under the terms of the SGM Software
 * License version 1.0, a copy of which has been included with this
 * distribution in the LICENSE.txt file.
 * 
 * 
 * ----------------------------------------------------------------------------
 * Date                   Who         Version        Comments
 * 2011-3-28 ä¸‹å?ˆ04:18:22        Junyi Cai     1.0            Initial Version
 *****************************************************************************/
package com.zigbee.framework.common.constant;

/**
 * Define the common constants for common service
 */
public interface CommonConstants {
    
    /**
     * Constant for Multiple Wildcard Character of SQL Like Condition
     */
    public static final String MULTIPLE_WILDCARD_CHARACTER = "%";
    
    /**
     * Constant for Single Wildcard Character of SQL Like Condition
     */
    public static final String SINGLE_WILDCARD_CHARACTER = "_";
    
    
    /**
     * Date Format Pattern 'yyyy-MM-dd'
     */
    public static final String DATE_FORMATE_YYMMDD = "yyyy-MM-dd";
    
    public static final String COMMON_YES_NO_VALUE="Common.yesNo";
    public static final int YES = 1;
    public static final int NO  = 0;
    
    public static final int PRODUCT_INFO_VALID_YES=1001;
    public static final int PRODUCT_INFO_VALID_NO=1005;
    int TRUE = 1;
    int FALSE = 0;
    /**
     * is delete yes
     */
    public static final int IS_DELETE_NO=0;
    /**
     * is delete no
     */
    public static final int IS_DELETE_YES=1;
    
    
    /**
     * Date Format Pattern 'yyyy-MM-dd'
     */
//    public static final String DATE_FORMATE_YYMMDD = "yyyy-MM-dd";
    
    public static final String EXPORT_CSV_DATA_LIST = "EXPORT_CSV_DATA_LIST";
    
    public static final String EXPORT_CSV_MAPPING_FILE = "EXPORT_CSV_MAPPING_FILE";
    
    public static final String EXPORT_CSV_TEMPLATE_NAME = "EXPORT_CSV_TEMPLATE_NAME";
    
    public static final String REQUEST_ATTRIBUTE_PAGER = "pager";
    
    public static final String BULLETIN_MODULE_NAME="bulletin.upload.directory";
    
    public static final String NOTES_MODULE_NAME = "notes.upload.directory";
    
    public static final String QUESTIONNAIRE_MODULE_NAME = "questionnaire.upload.directory";
    
    public static final String ANSWER_MODULE_NAME = "answer.upload.directory";
    
    public static final String TD_CADI_MODULE_NAME = "testdrive.upload.directory.cadi";

    public static final String EMPLOYEE_PHOTO_ODULE_NAME =  "employee.photo.url.directory";
     
    public static final String TD_CHEV_MODULE_NAME = "testdrive.upload.directory.chev";
    
    public static final String MARKET_EVENT_MODULE_NAME = "marketevent.upload.directory";
    
    public static final String MARKET_EVENT_BUDGET_MODULE_NAME = "marketevent.budget.upload.directory";
    
    public static final String TEMPLATE_DIR_NAME = "template.directory";
    
    public static final String COMPETITOR_PROMOTION_CADI = "competitor.promotion.cadi"; 
    
    public static final String CROSS_REGION_APPLICATION_UPLOAD = "crossRegionApplication.upload.directory"; 
    
    public static final String EXPORT_MODULE_NAME = "export.directory";
    /**
     * Date Format Pattern 'yyyy-MM-dd HH:mm:ss'
     */
    public static final String DATE_FORMAT_YMDHMS = "yyyy-MM-dd HH:mm:ss";
    
    String DATE_FORMAT_YYMMDD = "yyyy-MM-dd";
    
    String DATE_FORMAT_HHMMSS = "HH:mm:ss";
    
    public static final String SGM_CUSTOMER_VISIT_FILE = "sgmcustomervisit.directory";
    

    public static final String TEMP_CUSTOMER_VISIT_FILE = "tempcustomervisit.directory";
    
    public static final String  COMPETITORPROMOTION_FILE =  "competitor.file.url.directory";
    
    public static final String DOSS_BASE_URL = "doss.base.url";
    
    public static final String GDMS_BASE_URL = "gdms.base.url";
    
    public static final int BASE_URL_TYPE_DOSS = 1;
    
    public static final int BASE_URL_TYPE_GDMS = 2;
    
    public static final String SYSTEM_ERROR_PAGE = "error";
    
    public static final String CUSTOMER_VISIT_PLAN_FILE = "customervisitplan.file.url.directory";
    
    public static final String TRAINPLAN_CREATE_FILE="trainingplan";
    final int MOBILE_LENGTH = 11;
    
    String SEPERATE = "|";
    
    String BLANK_STRING = "";
    
    String SESSION_KEY_TOKEN = "session.token";
    
    /**
     * option of please select int value -1
     */
    int OPTION_PLEASE_SELECT_INT = -1;
    
    /**
     * option of please select string value "-1"
     */
    String OPTION_PLEASE_SELECT_STRING = "-1";
    
    int COOKIE_EXPIRY_SECONDS = 1800;
    
    int COOKIE_EXPIRY_NEVER = -1;
    
    String SQL_QUERY_SEPERATE_REG = ",";
    
    int HISTORY_BACK_TRUE = 1;
    
    
    int COMMON_INTERFACE_IN_STATUS_INITIAL=0;
    
    int COMMON_INTERFACE_IN_STATUS_HAS_READ=1;
    
    int COMMON_INTERFACE_IN_STATUS_SUCCESS=2;

    int COMMON_INTERFACE_IN_STATUS_FAIL=3;
    
    int EXPORT_BATCH_SIZE = 10000;
}
