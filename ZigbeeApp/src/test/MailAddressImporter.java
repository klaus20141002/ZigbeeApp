import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import au.com.bytecode.opencsv.CSVReader;

import com.zigbee.function.domain.CandidateInfo;
import com.zigbee.function.domain.MailReceiverAddress;
import com.zigbee.function.service.IMailAppService;

/************************************************************************************
 * @File name   :      MailAddressImporter.java
 *
 * @Author      :      YIFEGU
 *
 * @Date        :      2011-9-19
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
 * 2011-9-19 ÏÂÎç11:11:21			YIFEGU			1.0				Initial Version
 ************************************************************************************/

/**
 *
 */
public class MailAddressImporter {
	
	private static final String config = "D:/workspace/MailServiceApp/webapp/WEB-INF/spring-context.xml";
	
	private static final String importFilePath = "D:/CandidateInfo.csv";
	
	private static IMailAppService mailAppService;
	
	public static void importMailAddressList(){
		try {
			ApplicationContext applicationContext = new FileSystemXmlApplicationContext(
					config);
			mailAppService = (IMailAppService)applicationContext.getBean("mailAppServiceImpl");
			List<MailReceiverAddress> addressList = new ArrayList<MailReceiverAddress>();
			CSVReader reader = new CSVReader(new FileReader(importFilePath));
		    List<String[]> mailList = reader.readAll();
		    for(String[] address : mailList){
		    	if(address[0] != null && !address[0].equals("")){
		    		MailReceiverAddress mailReceiverAddress = new MailReceiverAddress();
		    		mailReceiverAddress.setMailAddress(address[0]);
		    		addressList.add(mailReceiverAddress);
		    	}
		    }
		    boolean result = mailAppService.saveMailReceiverAddress(addressList);
		    if(result){
		    	System.out.println("Import Successful!");
		    }else{
		    	System.out.println("Import Failed!");
		    }

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void importCandidateList(){
		try {
			ApplicationContext applicationContext = new FileSystemXmlApplicationContext(
					config);
			mailAppService = (IMailAppService)applicationContext.getBean("mailAppServiceImpl");
			List<CandidateInfo> candidateList = new ArrayList<CandidateInfo>();
			CSVReader reader = new CSVReader(new FileReader(importFilePath));
			List<String[]> importList = reader.readAll();
			for(String[] array: importList){
				if(array != null && array.length == 12){
					CandidateInfo candidate = new CandidateInfo();
					candidate.setName(array[0]);
					candidate.setGender(array[1]);
					candidate.setAge(array[2]);
					candidate.setWorkingExperience(array[3]);
					candidate.setPhone(array[4]);
					candidate.setAddress(array[5]);
					candidate.setEmail(array[6]);
					candidate.setExpectedPosition(array[7]);
					candidate.setExpectedSalary(array[8]);
					candidate.setEducation(array[9]);
					candidate.setPositionCode(array[10]);
					candidate.setCityCode(array[11]);
					candidateList.add(candidate);
				}
			}
			boolean result = mailAppService.saveCandidates(candidateList);
			if(result){
		    	System.out.println("Import Successful!");
		    }else{
		    	System.out.println("Import Failed!");
		    }
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	/**
	 * @Author      :      YIFEGU
	 * @Date        :      2011-9-19
	 * @param args
	 */
	public static void main(String[] args) {
		
		//importMailAddressList();
		
		importCandidateList();
	}

}
