/******************************************************************************
 * @File name   :      CodeTextUtils.java
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
 * 2011-6-8 ä¸‹å?ˆ05:43:15        wujianxi     1.0            Initial Version
 * 2011-9-22 ä¸‹å?ˆ05:43:15       wangzhize     1.1          add 3 new method (getFirstKeyByValue,getkeySet,getValueList)
 *****************************************************************************/
package com.zigbee.framework.common.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.zigbee.framework.common.dto.CodeTextRegistry;
import com.zigbee.framework.common.dto.HtmlOption;

/**
 *
 */
public final class CodeTextUtils {
    private static CodeTextRegistry codeTextRegistry;
    
    static{
        codeTextRegistry = ApplicationContextUtil.getBean("codeTextRegistry",CodeTextRegistry.class);
    }
    
    private CodeTextUtils(){
        
    }
    public static Map<String, String>  getStatusMap(String code){
        return codeTextRegistry.getStatusMap(code);
    }
    
    public static String getText(String code, String statusCode){
        return codeTextRegistry.getCodeText(code, statusCode);
    }
    public static String getText(String code, Long statusCode){
        if(statusCode!=null){
            return codeTextRegistry.getCodeText(code, statusCode.toString());
        }
        return null;
    }
    //Add by Gu yifeng 2011-6-23
    public static String getText(String code, int statusCode){
    	return codeTextRegistry.getCodeText(code, String.valueOf(statusCode));
    }
    //addjcg
    public static String getText(String code, Integer statusCode){
        if(statusCode!=null){
            return codeTextRegistry.getCodeText(code, statusCode.toString());
        }
        return null;
    }
    
    public static String getOptions(String code, String selectedStatusCode){
        Map<String,String> statusMap = codeTextRegistry.getStatusMap(code);
        if(null == statusMap){
            return "";
        }
        
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<String, String> entry: statusMap.entrySet()){
            sb.append(HtmlOption.create(entry.getKey(), entry.getValue()).getOptionTag(selectedStatusCode));
        }
        return sb.toString();
    }
    
    //Add by Gu yifeng
    public static String getFormOptions(String code, String selectedStatusCode){
        Map<String,String> statusMap = codeTextRegistry.getStatusMap(code);
        if(null == statusMap){
            return "";
        }
        
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<String, String> entry: statusMap.entrySet()){
            sb.append(HtmlOption.create(entry.getKey(), entry.getValue()).getFormOptionTag(selectedStatusCode));
        }
        return sb.toString();
    }
    
    /**
     * get first key by value
     * @author ZIZOU WANG
     * @Date        :      2011-9-22
     * @param code
     * @param value
     * @return
     */
    public static String getFirstKeyByValue(String code, String value){
    	if (value==null || "".equals(value))
    		return "";
    	
        Map<String,String> statusMap = codeTextRegistry.getStatusMap(code);
        if(null == statusMap){
            return "";
        }
        String result = "";
        for(Map.Entry<String, String> entry: statusMap.entrySet()){
        	if(entry.getValue().equals(value)){
        		result = entry.getKey();
        		break;
        	}
        }
        return result;
    }
    
    /**
     * @author ZIZOU WANG
     * @Date        :      2011-9-22
     * @param code
     * @return
     */
    public static Set<String> getKeySet(String code){
    	if (code==null || "".equals(code))
    		return new HashSet<String>(0);
    	
        Map<String,String> statusMap = codeTextRegistry.getStatusMap(code);
        if(null == statusMap){
        	return new HashSet<String>(0);
        }
        return statusMap.keySet();
    }
    
    /**
     * @author ZIZOU WANG
     * @Date        :      2011-9-22
     * @param code
     * @return
     */
    public static List<String> getValueList(String code){
    	if (code==null || "".equals(code))
    		return new ArrayList<String>(0);
    	
        Map<String,String> statusMap = codeTextRegistry.getStatusMap(code);
        if(null == statusMap){
        	return new ArrayList<String>(0);
        }
        List<String> result = new ArrayList<String>(statusMap.size());
        result.addAll(statusMap.values());
        return result;
    }
    
}

