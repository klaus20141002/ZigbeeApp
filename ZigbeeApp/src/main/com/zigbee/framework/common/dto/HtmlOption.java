/******************************************************************************
 * @File name   :      Option.java
 *
 * @Author      :      wujianxi
 *
 * @Date        :      2011-6-8
 *
 * @Copyright Notice: 
 * Copyright (c) 2011 . All  Rights Reserved.
 * This software is published under the terms of the  Software 
 * License version 1.0, a copy of which has been included with this
 * distribution in the LICENSE.txt file.
 * 
 * 
 * ----------------------------------------------------------------------------
 * Date                   Who         Version        Comments
 * 2011-6-8 下�?�06:07:31        wujianxi     1.0            Initial Version
 *****************************************************************************/
package com.zigbee.framework.common.dto;

/**
 *
 */
public class HtmlOption {
    private String value="";
    private String text = "";
    
    private HtmlOption(){
    }
    
    private HtmlOption(String value, String text){
        this.value = value;
        this.text = text;
    }
    public static HtmlOption create(String value, String text){
        return new HtmlOption(value, text);
    }
    
    public String getOptionTag(String selectedVal){
        StringBuilder sb = new StringBuilder();
        sb.append("<option value=\"").append(this.value)
        .append("\" ");
        if(null != selectedVal && selectedVal.equals(this.value)){
            sb.append("selected ");
        }
        sb.append(">").append(this.text).append("</option>");
        return sb.toString();
    }
    
    //add by gu yifeng
    public String getFormOptionTag(String selectedVal){
        StringBuilder sb = new StringBuilder();
        sb.append("<form:option value=\"").append(this.value)
        .append("\" ");
        if(null != selectedVal && selectedVal.equals(this.value)){
            sb.append("selected ");
        }
        sb.append(">").append(this.text).append("</form:option>");
        return sb.toString();
    }
}
