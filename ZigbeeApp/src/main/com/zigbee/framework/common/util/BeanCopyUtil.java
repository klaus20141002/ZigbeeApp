/******************************************************************************
 * @File name   :      CodeMappingImpl.java
 *
 * @Author      :      <Michael Gu>
 *
 * @Date        :      2011-6-10
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
 * 2011-6-10          <Michael Gu>     1.0            Initial Version
 * 2011-9-29          tun.tan     2.0            add method copyProps
 * 2011-10-9          tun.tan     3.0            add throw exception
 *****************************************************************************/
package com.zigbee.framework.common.util;

import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import org.apache.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeansException;
import org.springframework.util.Assert;

import com.zigbee.framework.common.constant.CommonErrorConstants;
import com.zigbee.framework.common.exception.AppException;
import com.zigbee.framework.common.exception.ZigbeeSystemException;

/**
 * Bean Copy Utility Class
 *
 */
public class BeanCopyUtil extends org.springframework.beans.BeanUtils {
        
    private static Logger logger = Logger.getLogger(BeanCopyUtil.class);
	/**
	 * Bean Copy Method
	 * @param srcBean source bean instance
	 * @param destBean destination bean instance
	 * @throws AppException Application Exception
	 */
	public static void beanCopy(Object srcBean, Object destBean) throws AppException{
		
		try {
			BeanUtils.copyProperties(srcBean, destBean);
		} catch (BeansException e) {
		    e.printStackTrace();
            String errMsg = "BEAN COPY Exception!" + e.getMessage() + e.getStackTrace();
            throw new AppException(CommonErrorConstants.BEAN_COPY_EXCEPTION, errMsg, e.getCause());        
			
		}
		
	}
	
	/**
	 * Apache Copy Properties
	 * @Date        :      2011-8-5
	 * @param srcBean source bean instance
	 * @param destBean destination bean instance
	 * @throws AppException
	 */
	public static void beanCopyProperties(Object srcBean, Object destBean) throws AppException{
	    try {
            org.apache.commons.beanutils.BeanUtils.copyProperties(destBean, srcBean);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            String errMsg = "BEAN COPY Exception!" + e.getMessage() + e.getStackTrace();
            throw new AppException(CommonErrorConstants.BEAN_COPY_EXCEPTION, errMsg, e.getCause()); 
        } catch (InvocationTargetException e) {           
            e.printStackTrace();
            String errMsg = "BEAN COPY Exception!" + e.getMessage() + e.getStackTrace();
            throw new AppException(CommonErrorConstants.BEAN_COPY_EXCEPTION, errMsg, e.getCause()); 
        }
	}
	
	/**
	 * Override copyProperties Method
	 * @Date        :      2011-8-5
	 * @param source source bean instance
	 * @param target destination bean instance
	 */
	public static void copyProperties(Object source, Object target){
	    Assert.notNull(source, "Source must not be null");
	    Assert.notNull(target, "Target must not be null");
	    Class<?> actualEditable = target.getClass();
	    PropertyDescriptor[] targetPds = getPropertyDescriptors(actualEditable);
	    for(PropertyDescriptor targetPd : targetPds){
	        if(targetPd.getWriteMethod() != null){
	           
                try {
                    PropertyDescriptor sourcePd = getPropertyDescriptor(source.getClass(), targetPd.getName());
                    if(sourcePd != null && sourcePd.getReadMethod() != null){
                        Method readMethod = sourcePd.getReadMethod();
                        if(!Modifier.isPublic(readMethod.getDeclaringClass().getModifiers())){
                            readMethod.setAccessible(true);
                        }
                        Object value = readMethod.invoke(source);
                        //Check whether the value is empty, only copy the properties which are not empty
                        if(value != null){
                            Method writeMethod = targetPd.getWriteMethod();
                            if(!Modifier.isPublic(writeMethod.getDeclaringClass().getModifiers())){
                                readMethod.setAccessible(true);
                            }
                            writeMethod.invoke(target, value);
                        }
                        
                       
                    }
                } catch (BeansException e) {
                    e.printStackTrace();
                    String errMsg = "BEAN COPY Exception!" + e.getMessage();
                    logger.error(errMsg);

                } catch (SecurityException e) {
                    e.printStackTrace();
                    String errMsg = "BEAN COPY Exception!" + e.getMessage();
                    logger.error(errMsg);

                } catch (IllegalArgumentException e) {
                    e.printStackTrace();
                    String errMsg = "BEAN COPY Exception!" + e.getMessage();
                    logger.error(errMsg);

                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                    String errMsg = "BEAN COPY Exception!" + e.getMessage();
                    logger.error(errMsg);

                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                    String errMsg = "BEAN COPY Exception!" + e.getMessage();
                    logger.error(errMsg);

                }
                 
	        }
	    }
	}
	/**
	 * 属性复制
	 * @author tun.tan
	 * @Date ：2011-9-29 上午11:18:42
	 */
	public static void copyProps(Object source, Object target){
		copyProps( source,  target,null);
	}
	
	/**
	 * 属性复制
	 * @author tun.tan
	 * @Date ：2011-9-29 上午11:18:42
	 */
	public static void copyProps(Object source, Object target,String [] igonre){
		Assert.notNull(source, "Source must not be null");
		Assert.notNull(target, "Target must not be null");
		Class<?> actualEditable = target.getClass();
		PropertyDescriptor[] targetPds = getPropertyDescriptors(actualEditable);
		Object methodName=null;
//		Object targetValue=null;
		//需复制字段
		for(PropertyDescriptor  targetPd: targetPds){
			if(targetPd.getWriteMethod() != null){
				
				try {
					PropertyDescriptor sourcePd = getPropertyDescriptor(source.getClass(), targetPd.getName());
					if(igonre!=null){
						boolean jump=false;
						//忽略字段
						for (int i = 0; i < igonre.length; i++) {
							if(igonre[i]==null){//判空
								continue;
							}
							if(targetPd.getName().equals(igonre[i])){//是否为忽略字段
								logger.info(targetPd.getName());
								jump=true;
							}
						}
						if(jump){//忽略标志
							continue;
						}
					}
					if(sourcePd != null && sourcePd.getReadMethod() != null){//判空
						Method readMethod = sourcePd.getReadMethod();
						if(!Modifier.isPublic(readMethod.getDeclaringClass().getModifiers())){
							readMethod.setAccessible(true);
						}
						Object value = readMethod.invoke(source);
						//Check whether the value is empty, only copy the properties which are not empty
//						targetValue=value;
						if(value != null){//判空
							Method writeMethod = targetPd.getWriteMethod();
							methodName=writeMethod.getName();
							if(!Modifier.isPublic(writeMethod.getDeclaringClass().getModifiers())){
								readMethod.setAccessible(true);
							}
							writeMethod.invoke(target, value);
						}
						
						
					}
				} catch (BeansException e) {
					e.printStackTrace();
					String errMsg = "BEAN COPY Exception! methodName="+methodName+" ;"+ e.getMessage();
					logger.error(errMsg);
					throw new ZigbeeSystemException("beanCopyException", errMsg,e.getCause());
					
				} catch (SecurityException e) {
					e.printStackTrace();
					String errMsg = "BEAN COPY Exception! methodName="+methodName+" ;"+ e.getMessage();
					logger.error(errMsg);
					throw new ZigbeeSystemException("beanCopyException", errMsg,e.getCause());
					
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
					String errMsg = "BEAN COPY Exception! methodName="+methodName +" ;"+ e.getMessage();
					logger.error(errMsg);
					throw new ZigbeeSystemException("beanCopyException", errMsg,e.getCause());
					
				} catch (IllegalAccessException e) {
					e.printStackTrace();
					String errMsg = "BEAN COPY Exception! methodName="+methodName +" ;"+ e.getMessage();
					logger.error(errMsg);
					throw new ZigbeeSystemException("beanCopyException", errMsg,e.getCause());
					
				} catch (InvocationTargetException e) {
					e.printStackTrace();
					String errMsg = "BEAN COPY Exception! methodName="+methodName+" ;"+ e.getMessage();
					logger.error(errMsg);
					throw new ZigbeeSystemException("beanCopyException", errMsg,e.getCause());
					
				}
				
			}
		}
	}
	

}
