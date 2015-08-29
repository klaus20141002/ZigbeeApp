/************************************************************************************
 * @File name   :      Utils.java
 *
 * @Author      :      Brenda Yin
 *
 * @Date        :      2011-1-24
 *
 * @Copyright Notice: 
 * Copyright (c) 2011 SGM, Inc. All  Rights Reserved.
 * This software is published under the terms of the SGM Software
 * License version 1.0, a copy of which has been included with this
 * distribution in the LICENSE.txt file.
 * 
 * 
 * ----------------------------------------------------------------------------------
 * Date                         Who             Version            Comments
 * 2011-1-24 下午12:43:43        Brenda Yin         1.0                Initial Version
 * 2011-10-19 下午12:43:43        wangzhize         1.0               modify convertStrToSqlKeywordIn() remove;
 * 2011-10-31 下午12:43:43        wangzhize         1.0               modify convertStrToSqlKeywordIn();
 * 2011-11-3 下午01:28:58         Wu Jianxi           1.1             add getDate,getLong,getInt,getString
 ************************************************************************************/
package com.zigbee.framework.common.util;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;


/**
 * This class contains the common utilities methods
 */
public final class Utils {

	/**
	 * default private constructor
	 * 
	 * @Date : 2011-3-28
	 */
	private Utils() {

	}

	/**
	 * Check if the input str is null or ""
	 * 
	 * @Date : 2011-3-21
	 * @param str
	 *            - string
	 * @return true if str is null or empty; otherwise, false
	 */
	public static boolean isNullOrEmpty(String str) {
		return str == null || str.trim().length() == 0;
	}

	/**
	 * Check if the input str is not null and ""
	 * 
	 * @Date : 2011-3-21
	 * @param str
	 *            - string
	 * @return true if str is not null and empty
	 */
	public static boolean notEmpty(String str) {
		return str != null && str.trim().length() > 0;
	}
    /**
     * Check if the input long id is not null and 0
     * @Date        :      2011-7-19
     * @param id
     * @return
     */
	public static boolean notNullAndZero(Long id) {
		return id != null && id != 0;
	}
	
	/**
	 * Check if the input integer id is not null and 0		
	 * @Date        :      2011-7-19
	 * @param id
	 * @return
	 */
	public static boolean notNullAndZero(Integer id) {
		return id != null && id != 0;
	}
	
	/**
	 * check if the value is null and negative
	 * @Date        :      2011-11-8
	 * @param value - value
	 * @return ture/false
	 */
	public static boolean notNullAndNegative(Integer value){
	    return value != null && value > 0;
	}
	
	/**
	 * check if the value is null and negative
	 * @Date        :      2011-11-8
	 * @param value - value
	 * @return true/false
	 */
	public static boolean notNullAndNegative(Long value){
	    return value != null && value > 0;
	}
	/**
	 * Formats the date input with the given format
	 * 
	 * @Date : 2011-1-25
	 * @param format
	 *            - date format strign
	 * @param date
	 *            - instance of java.util.Date
	 * @return string representation of date
	 */
	public static String formatDate(String format, Date date) {
		if (isNullOrEmpty(format) || date == null) {
			return "";
		}

		SimpleDateFormat dateFormat = new SimpleDateFormat(format);
		return dateFormat.format(date);
	}

	/**
	 * Transfer \\ to / in path
	 * 
	 * @Date : 2011-3-9
	 * @param path
	 *            - uri path string
	 * @return String
	 */
	public static String transferPath(String path) {
		if (path == null) {
			return null;
		}
		path = path.replace("\\", "/");
		return path;
	}

	/**
	 * 格式化string
	 * 
	 * @Date : 2011-6-2
	 * @param str
	 * @return
	 */
	public static String removeNull(String str) {
		if (str == null)
			str = "";
		if (str.equals("null"))
			str = "";
		return str.trim();
	}

	/**
	 * Parse the date with the given date string and date format.
	 * 
	 * @Date        :      2011-6-9
	 * @param dateStr a string of date
	 * @param format a string of date format
	 * @return an instance of Date after parsed
	 * @throws ParseException 
	 */
	public static Date parseDate(String dateStr, String format) throws ParseException {
        if (isNullOrEmpty(format) || isNullOrEmpty(dateStr)) {
            return null;
        }

        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        
        return dateFormat.parse(dateStr.trim());        	   
	}
	
	/**
	 * 得到本周的星期一的日期
	 * @Date        :      2011-6-27
	 * @return
	 */
	public static String getMondayOfThisWeek(){
	    Calendar c = Calendar.getInstance();   
	    int dayOfWeek = c.get(Calendar.DAY_OF_WEEK)-1;
	    if(dayOfWeek == 0){
	        dayOfWeek = 7;
	    }
	    c.add(Calendar.DATE, -dayOfWeek + 1);
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	    return sdf.format(c.getTime());
	}
	
	/**
     * 得到本周之前的最后一个的星期日的日期
     * @Date        :      2011-6-27
     * @return
     */
    public static String getLastSundayBeforeThisWeek(){
        Calendar c = Calendar.getInstance();   
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK)-1;
        if(dayOfWeek == 0){
            dayOfWeek = 7;
        }
        c.add(Calendar.DATE, -dayOfWeek);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(c.getTime());
    }
	
	/**
	 * 
	 * @Date        :      2011-7-6
	 * @param currentContactCodeSeq
	 * @return
	 */
	public static String getNextContactCodeSeq(String dealerOrgCode,Integer contactCodeSeq){
	    
		int year = Calendar.getInstance().get(Calendar.YEAR); 
		
		contactCodeSeq = contactCodeSeq + 1;

        return dealerOrgCode + year + StringUtils.leftPad(contactCodeSeq + "", 6, "0");
   
	}
	
	/**
	 * 
	 * @Date        :      2011-7-13
	 * @param ids
	 * @return
	 */
	public static String getSplitStr(List<Long> ids){
	    StringBuilder sb = new StringBuilder();
	    if(ids != null && ids.size() >0){
	        for(int i = 0;i<ids.size();i++){
	            Long id = ids.get(i);
	            if(i == 0){
	                sb.append(id);
	            }else{
	                sb.append(","+id);
	            }
	        }
	    }
	    return sb.toString();
	}
/**
 * 将字符串数组组合成以指定字符分隔的字符串，不指定字符时以逗号分隔
 * @Date        :      2011-7-15
 * @param objects
 * @param splitChar
 * @return
 */
	public static String getSplitString(String[] objects,String splitChar){
	    
	    if(Utils.isNullOrEmpty(splitChar)){
	        splitChar="," ;
	    }
	    
        StringBuilder sb = new StringBuilder();
        if(objects != null && objects.length >0){
            for(int i = 0;i<objects.length;i++){
                String id = objects[i];
                if(i == 0){
                    sb.append(id);
                }else{
                    sb.append(splitChar+id);
                }
            }
        }
        return sb.toString();
	}
	/**
	 * 将Long数组组合成以指定字符分隔的字符串，不指定字符时以逗号分隔
	 * @Date        :      2011-7-15
	 * @param objects
	 * @param splitChar
	 * @return
	 */
	   public static String getSplitString(Long[] objects,String splitChar){
	        
	        if(Utils.isNullOrEmpty(splitChar)){
	            splitChar="," ;
	        }
	        
	        StringBuilder sb = new StringBuilder();
	        if(objects != null && objects.length >0){
	            for(int i = 0;i<objects.length;i++){
	                Long id = objects[i];
	                if(i == 0){
	                    sb.append(id);
	                }else{
	                    sb.append(splitChar+id);
	                }
	            }
	        }
	        return sb.toString();
	    }
	   /**
	    * 
	    * @Date        :      2011-7-22
	    * @param strs
	    * @param splitChar
	    * @return
	    */
       public static List<String> getSplitList(String strs,String splitChar){
           
           if(Utils.isNullOrEmpty(splitChar)){
               splitChar="," ;
           }
           
           List<String> list=new ArrayList<String>();
           for(String str:strs.split(splitChar)){
               list.add(str);
           }
           
           return list;
       }
       
       /**
        * convert string to sql statement keyword in
        * usage:
        * in your hql, you can use as: "where vehicle.vin in " + convertStrToSqlKeywordIn(queryVin)
        * be careful ,you do not need add "'"
        * @author ZizOU wang
        * @Date        :      2011-7-27
        * @param in  "aa，bb; cc"
        * @return "('aa','bb','cc')"
        */
       public static String convertStrToSqlKeywordIn(String in){
           if (notEmpty(in)){
               String chineseComma = CodeTextUtils.getText("Punctuation", 1);
//               String chineseSemicolon = CodeTextUtils.getText("Punctuation", 3);
//               String englishSemicolon = CodeTextUtils.getText("Punctuation", 4);
               /*in = in.trim().replaceAll(chineseComma, ",")
                   .replaceAll(chineseSemicolon,"," )
                   .replaceAll(englishSemicolon, ",");*/
               in = in.trim().replaceAll(chineseComma, ",");
               StringBuilder sb = new StringBuilder("(\'-1\'");
               for (String s : in.split(",")){
            	   if(notEmpty(s)){
            		   sb.append(",\'").append(s.trim()).append("\'"); 
            	   }
               }
               sb.append(")");
               return sb.toString();
           }
           return null;
           
       }
       public static Date getDateStrByDateAndTime(String date, String time) {
           SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
           String str=date;
           if (time!=null&&!"".equals(time)) {
               str=str + " " + time + ":00";
           }else{
        	   return new Date();
           }
           try {
               return dateFormat.parse(str);
           } catch (ParseException e) {
               e.printStackTrace();
               return null;
           }
      }
       /**
        * get database column date value
        * @Date        :      2011-11-3
        * @param obj - column object
        * @return - Date
        */
       public static Date getDate(Object obj){
           if(null == obj){
               return null;
           }
           return (Date)obj;
       }
       
       /**
        * get database column long value
        * @Date        :      2011-11-3
        * @param obj - column object
        * @return - Long
        */
       public static Long getLong(Object obj){
           if(null == obj){
               return null;
           }
           return ((BigDecimal)obj).longValue();
       }

       /**
        * get database column int value
        * @Date        :      2011-11-3
        * @param obj - column object
        * @return - Integer
        */
       public static Integer getInt(Object obj){
           if(null == obj){
               return null;
           }
           return ((Integer)obj).intValue();
       }
       
       /**
        * get database column string value
        * @Date        :      2011-11-3
        * @param obj - column object
        * @return - String
        */
       public static String getString(Object obj){
           if(null == obj){
               return "";
           }
           return String.valueOf(obj);
       }
       
    
       public static BigDecimal getBigDecimal(Object obj){
    	   if(null == obj){
    		   return null;
    	   }
    	   return (BigDecimal)obj;
       }
  
       /**
        * get float value
        * @Author      :      ZHWANG
        * @Date        :      2014-9-10
        * @param obj
        * @return
        */
       public static Float getFloat(Object obj){
           if(null == obj){
               return null;
           }
           return ((Float)obj).floatValue();
       }
    /**
     * 
     * @Date        :      Dec 9, 2011
     * @param s    字符串
     * @param Length   验证长度
     * @param addmunber 遇到非英文字符   需要累加书
     * @return
     */
      public static boolean widthCheck(String s,int Length ,int addmunber){
    	int  count =StringLength(s,addmunber);
    	if(count<=Length){
    		return true;
    	}else{
    		return false;
    	}
    } 
    /**
     *  
     * @Date        :      Dec 9, 2011
     * @param s
     * @param addmunber
     * @return
     */
    public static int StringLength(String s,int addmunber){
    	int count =0;
    	int add =addmunber;
    	if(s==null || s.equals("")){
        	count=0;		
    	}else{
    		 char[] ch = s.toCharArray();
    		 for(int i =0 ; i< ch.length; i++){ 
    			if((ch[i]>0x0001&&ch[i]<0x007e)||(0xff60<=ch[i]&&ch[i]<=0xff9f)){
    				count++;
    			}else{
    				count+=add;
    			}
    		}
    	}
		 return  count;
     }
    /**
     *   
     * @Date        :      Dec 9, 2011
     * @param s
     * @param interPart
     * @param decimalPart
     * @return
     */
    public static boolean  decimal_16_4Validato(String s) {
    	Pattern pattern = Pattern.compile("^\\d{0,12}(\\.\\d{1,4})?$");
    	if(pattern.matcher(s).matches()){
    		return  true;
    	}
    	return  false;    	     	  
    } 
    
    /**
     * Replace event term 
     * @Date        :      2011-12-14
     * @return
     */
    public static String replaceForEventTerm(String eventTerm){
        String resultStr = eventTerm;
        if(notEmpty(resultStr)){
            resultStr = resultStr.replaceAll("\r\n", "<br/>");
            resultStr = resultStr.replaceAll("\n", "<br/>");
            resultStr = resultStr.replaceAll("\\r\\n", "<br/>");
            resultStr = resultStr.replaceAll("\\n", "<br/>");
            resultStr = resultStr.replaceAll("\\\\r\\\\n", "<br/>");
            resultStr = resultStr.replaceAll("\\\\n", "<br/>");
            resultStr = resultStr.replaceAll(" ", "&nbsp;");
        }
        return resultStr;
    }
    
    /**
     * 判断srcString字符串（‘,’分隔符分隔）中是否包含key字符串
     * @Date        :      Mar 23, 2012
     * @param key
     * @param srcString
     * @return -boolean
     */
    public static boolean containsKey(String key,String srcString){
    	if(Utils.notEmpty(key)&&Utils.notEmpty(srcString)){
    		String[] temp = srcString.split(",");
    		for(int index = 0;index < temp.length; index++){
    			if(key.equals(temp[index]))return true;
    		}
    	}
    	return false;
    }
 
    /**
     * 不等于 0，空，-1
     * @Date        :      2012-4-16
     * @param str
     * @return
     */
   public static boolean notNullAndZeroAndNegativeOne(String str){
       
       return Utils.notEmpty(str) && !"0".equals(str) && !"-1".equals(str);
   }
    
}
