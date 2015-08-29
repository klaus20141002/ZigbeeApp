/******************************************************************************
 * @File name   :      CodeTextRegistry.java
 *
 * @Author      :      wujianxi
 *
 * @Date        :      2011-6-8
 *
 * @Copyright Notice: 
 * Copyright (c) 2011 SGM, Inc. All  Rights Reserved.
 * This software is published under the terms of the SGM Software
 * License version 1.0, a copy of which has been included with this
 * distribution in the LICENSE.txt file.
 * 
 * 
 * ----------------------------------------------------------------------------
 * Date                   Who         Version        Comments
 * 2011-6-8 ä¸‹å?ˆ05:18:33        wujianxi     1.0            Initial Version
 *****************************************************************************/
package com.zigbee.framework.common.dto;

import java.util.Collections;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

/**
 *
 */
public class CodeTextRegistry {
    private Map<String,Map<String,String>> codeTextMap;

    public Map<String, String>  getStatusMap(String code){
        if(StringUtils.isBlank(code)){
            return null;
        }
        return Collections.unmodifiableMap(codeTextMap.get(code));
    }

    public void setCodeTextMap(Map<String, Map<String, String>> codeTextMap) {
        this.codeTextMap = codeTextMap;
    }
    
    public String getCodeText(String code, String statusCode){
        
        if(StringUtils.isBlank(code)){
            return "";
        }
        if(StringUtils.isBlank(statusCode)){
            return "";
        }
        
        if(!codeTextMap.containsKey(code)){
            return "";
        }
        
        Map<String,String> statusCodeMap = codeTextMap.get(code);
        if(null == statusCodeMap || !statusCodeMap.containsKey(statusCode)){
            return "";
        }
        
        return statusCodeMap.get(statusCode);
    }
}
