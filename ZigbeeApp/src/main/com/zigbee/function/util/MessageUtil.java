/************************************************************************************
 * @File name   :      MessageUtil.java
 *
 * @Author      :      Hasee
 *
 * @Date        :      2015年9月20日
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
 * 2015年9月20日 下午12:31:41			Hasee			1.0				Initial Version
 ************************************************************************************/
package com.zigbee.function.util;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import com.alibaba.fastjson.JSON;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.ConsumerCancelledException;
import com.rabbitmq.client.QueueingConsumer;
import com.rabbitmq.client.ShutdownSignalException;
import com.zigbee.framework.common.exception.AppException;
import com.zigbee.function.domain.Message;

/**
 *
 */
public class MessageUtil {
	private final static String QUEUE_NAME = "ControllerQueue";  
	public static void sendMessage(Message message) throws AppException{
			try {
				Channel channel = openChannel() ;
				channel.basicPublish("", QUEUE_NAME, null, JSON.toJSONString(message).getBytes());
			} catch (IOException e) {
				e.printStackTrace();
			}
        
	}
	
	public static Channel openChannel() {
		ConnectionFactory factory = new ConnectionFactory();  
		
		Channel channel;
		try {
			factory.setHost("45.63.124.106");
			Connection connection = factory.newConnection();  
			channel = connection.createChannel();
			channel.queueDeclare(QUEUE_NAME, false, false, false, null);
			return channel ;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (TimeoutException e) {
			e.printStackTrace();
		}
		return null ;
		
	}
	
	
	public static void reciveMessage() {
		try {
			Channel channel = openChannel() ;
			
			System.out.println(" [*] Waiting for messages");  
  
			QueueingConsumer consumer = new QueueingConsumer(channel);  
			channel.basicConsume(QUEUE_NAME, true, consumer);  
  
			while (true) {  
			    QueueingConsumer.Delivery delivery = consumer.nextDelivery();  
			    String message = new String(delivery.getBody());  
			    System.out.println(" Message Received '" + message + "'");  
			}
		} catch (ShutdownSignalException e) {
			e.printStackTrace();
		} catch (ConsumerCancelledException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}  catch (InterruptedException e) {
			e.printStackTrace();
		}  
		
		
		
	}
}
