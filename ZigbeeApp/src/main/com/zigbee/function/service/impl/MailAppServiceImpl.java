/************************************************************************************
 * @File name   :      MailAppServiceImpl.java
 *
 * @Author      :      YIFEGU
 *
 * @Date        :      2011-9-13
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
 * 2011-9-13 ����11:29:37			YIFEGU			1.0				Initial Version
 ************************************************************************************/
package com.zigbee.function.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import com.zigbee.framework.common.exception.AppException;
import com.zigbee.framework.common.service.impl.BaseServiceImpl;
import com.zigbee.framework.common.util.ApplicationContextUtil;
import com.zigbee.framework.mailservice.service.IMailService;
import com.zigbee.function.constant.MailTrackConstant;
import com.zigbee.function.constant.SMTPHostNameConstant;
import com.zigbee.function.dao.IAirTemperatureDao;
import com.zigbee.function.dao.ICandidateInfoDao;
import com.zigbee.function.dao.IMailReceiverAddressDao;
import com.zigbee.function.dao.IMailSenderAddressDao;
import com.zigbee.function.dao.IMailSessionHostDao;
import com.zigbee.function.dao.IMonitorPointDao;
import com.zigbee.function.dao.ITraceRecordsDao;
import com.zigbee.function.domain.CandidateInfo;
import com.zigbee.function.domain.MailReceiverAddress;
import com.zigbee.function.domain.MailSenderAddress;
import com.zigbee.function.domain.MonitorPoint;
import com.zigbee.function.domain.webclient.TrackRecord;
import com.zigbee.function.dto.MailTrackDto;
import com.zigbee.function.service.IMailAppService;

/**
 *
 */
@Transactional(rollbackFor = AppException.class)
@Service
public class MailAppServiceImpl extends BaseServiceImpl implements
		IMailAppService {
	
	@Resource(name = "mailSenderAddressDao")
	private IMailSenderAddressDao mailSenderAddressDao;
	
	@Resource(name = "mailReceiverAddressDao")
	private IMailReceiverAddressDao mailReceiverAddressDao;
	
	@Resource(name = "candidateInfoDao")
	private ICandidateInfoDao candidateInfoDao;
	
	@Resource(name = "mailSessionHostDao")
	private IMailSessionHostDao mailSessionHostDao;
	
	@Resource(name = "traceRecordsDao")
	private ITraceRecordsDao traceRecordsDao;
	
	@Resource(name = "monitorPointDao")
	private IMonitorPointDao monitorPointDao;
	
	@Autowired
	private IMailService mailService;
	
	@Autowired
	private IAirTemperatureDao airTemperatureDao;
	
	private static List<CandidateInfo> candidateInfoList = null;
	
	private static List<MailSenderAddress> senderAddressList = null;
	
	private static int senderIndex = -1;
	private static int maxSenderIndex = -1;
	
	private  List<CandidateInfo> initCandidateInfoList(){
		if(candidateInfoList == null || candidateInfoList.size() == 0){
			return candidateInfoDao.getAvailableCandidates();
		}else{
			return candidateInfoList;
		}
	}
	
	private List<MailSenderAddress> initMailSenderAddressAndIndex(){
		
		if(senderIndex < maxSenderIndex){
			senderIndex ++;
		}else{
			senderAddressList = mailSenderAddressDao.getAvailableSenderAddress(SMTPHostNameConstant.SMTP_VIP_163.getMailType());
			if(senderAddressList != null && senderAddressList.size() > 0){
				maxSenderIndex = senderAddressList.size() - 1;
				senderIndex = 0;
			}
		}
		return senderAddressList;
	}
	
	private Long getTrackId(CandidateInfo candidateInfo, List<MailSenderAddress> senderAddressList){
		if(candidateInfo == null || senderAddressList == null){
			return -1L;
		}
		RestTemplate restTemplate = (RestTemplate) ApplicationContextUtil.getBean("restTemplate");
		MailTrackDto mailTrackDto = new MailTrackDto();
		mailTrackDto.setSenderAddress(senderAddressList.get(senderIndex).getMailAddress());
		mailTrackDto.setName(candidateInfo.getName());
		mailTrackDto.setAddress(candidateInfo.getAddress());
		mailTrackDto.setAge(candidateInfo.getAge());
		mailTrackDto.setEducation(candidateInfo.getEducation());
		mailTrackDto.setEmail(candidateInfo.getEmail());
		mailTrackDto.setExpectedPosition(candidateInfo.getExpectedPosition());
		mailTrackDto.setExpectedSalary(candidateInfo.getExpectedSalary());
		mailTrackDto.setGender(candidateInfo.getGender());
		mailTrackDto.setPhone(candidateInfo.getPhone());
		mailTrackDto.setWorkingExperience(candidateInfo.getWorkingExperience());
		mailTrackDto.setSentTime(new Date());
		TrackRecord trackRecord = restTemplate.postForObject(MailTrackConstant.TRACKING_URL+ "createTrackRecord", mailTrackDto, TrackRecord.class);
		if(trackRecord != null){
			return trackRecord.getId();
		}else{
			return -1L;
		}
	}

	/** 
	 * overridden:
	 * @Author      :      YIFEGU
	 * @Date        :      2011-9-13
	 * @see com.zigbee.function.service.IMailAppService#saveMailSenderAddress(com.zigbee.function.domain.MailSenderAddress)
	 **/
	@Override
	public void saveMailSenderAddress(MailSenderAddress mailSenderAddress) {
		mailSenderAddressDao.save(mailSenderAddress);
	}

	/** 
	 * overridden:
	 * @Author      :      YIFEGU
	 * @Date        :      2011-9-19
	 * @see com.zigbee.function.service.IMailAppService#saveMailReceiverAddress(java.util.List)
	**/
	@Override
	public boolean saveMailReceiverAddress(
			List<MailReceiverAddress> mailAddressList) {
		try {
			for(MailReceiverAddress addressObj : mailAddressList){
				if(addressObj != null){
					mailReceiverAddressDao.save(addressObj);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	/** 
	 * overridden:
	 * @Author      :      YIFEGU
	 * @Date        :      2011-9-22
	 * @see com.zigbee.function.service.IMailAppService#saveCandidates(java.util.List)
	**/
	@Override
	public boolean saveCandidates(List<CandidateInfo> candidateList) {
		try {
			for(CandidateInfo candidate: candidateList){
				if(candidate != null){
					boolean isDuplicate = candidateInfoDao.isDuplicateCandidate(candidate.getPhone());
					if(!isDuplicate){
						candidateInfoDao.save(candidate);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	/** 
	 * overridden:
	 * @Author      :      YIFEGU
	 * @Date        :      2011-9-25
	 * @see com.zigbee.function.service.IMailAppService#autoSendMail()
	**/
	@Override
	public void autoSendMail(int receiverIndex) {
		/*AirTemperature newa = new AirTemperature();
		newa.setUploadDate(new Date());
		airTemperatureDao.save(newa);
		
		airTemperatureDao.remove(3);
		
		AirTemperature air = airTemperatureDao.findById(2);
		if(air!=null){
			air.setEquipmentId(12);
			airTemperatureDao.update(air);
		}
		System.out.println(air==null);*/
		MonitorPoint mp = new MonitorPoint();
		mp.setPointName("监测点1");
		mp.setDescription("大棚监测点1");
		mp.setPointCode("monitorpoint1");
		
		monitorPointDao.save(mp);
		
		MonitorPoint mp2 = monitorPointDao.findById(1);
		if(mp2!=null){
			System.out.println(mp2.getPointName());
		}
		/*
		List<MailSenderAddress> senderAddressList = initMailSenderAddressAndIndex();

		
		List<CandidateInfo> candidateList = initCandidateInfoList();
		MailServiceConf mailServiceConf = new MailServiceConf();
		MailSessionHost mailSessionHost = mailSessionHostDao.getMailSessionHostByName(SMTPHostNameConstant.SMTP_VIP_163.name());
		if(mailSessionHost != null && senderAddressList != null && candidateList != null ){
			mailServiceConf.setHost(mailSessionHost.getSmtpHost());
			mailServiceConf.setUsername(senderAddressList.get(senderIndex).getUserName());
			mailServiceConf.setPassword(senderAddressList.get(senderIndex).getPassword());
			try {
				mailService.initMailService(mailServiceConf);
				CandidateInfo candidateInfo = null;
				if(receiverIndex < candidateList.size()){
					candidateInfo = candidateList.get(receiverIndex);
				}
				if(candidateInfo != null && (candidateInfo.getEmail() != null && !"".equals(candidateInfo.getEmail().trim()))
						&& !candidateInfo.getEmail().startsWith("www.") ){
					Long trackId = getTrackId(candidateInfo, senderAddressList);					
					
					if(trackId != -1L ){
						Mail mail = new Mail();
						mail.setMailFrom(senderAddressList.get(senderIndex).getMailAddress());
						List<String> addressToList = new ArrayList<String>();
						
						addressToList.add(candidateInfo.getEmail());
						System.out.println(candidateInfo.getEmail());
						if(receiverIndex !=0 && receiverIndex%50 != 0){
							addressToList.add(candidateInfo.getEmail());
							System.out.println(candidateInfo.getEmail());
						}else{
							addressToList.add("admin@caizhi.name");
							System.out.println("admin@caizhi.name");
						}
						//addressToList.add("daliliu@qq.com");
						mail.setMailTo(addressToList);
						mail.setEmailType("text/html");
						
						mail.setMailSubject("Ϊ���Ƽ�������"+candidateInfo.getExpectedPosition()+"ְλ");
						
						SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
						String currentDateStr = format.format(new Date());
						
						MailTemplate mailTemplate = new MailTemplate();
						mailTemplate.setTemplateName("email");
						Map map = new HashMap();
						map.put(MailTemplateKeyUtil.email.name, candidateInfo.getName());
						map.put(MailTemplateKeyUtil.email.position, candidateInfo.getExpectedPosition());
						map.put(MailTemplateKeyUtil.email.date, currentDateStr);
						map.put(MailTemplateKeyUtil.email.hidden_img, "<img src='"+MailTrackConstant.TRACKING_URL+"receiveReply/"+ trackId +"' style='display:none'>");
						map.put(MailTemplateKeyUtil.email.view_direct_url, MailTrackConstant.TRACKING_URL +"viewDirectly/" + trackId +"?url="+candidateInfo.getCityCode().trim()+".ganji.com/"+candidateInfo.getPositionCode().trim()+"/");
						map.put(MailTemplateKeyUtil.email.view_reg_url, MailTrackConstant.TRACKING_URL +"viewReg/" + trackId +"?url="+candidateInfo.getCityCode().trim()+".ganji.com/user/register.php");
						map.put(MailTemplateKeyUtil.email.view_all_url, MailTrackConstant.TRACKING_URL +"viewAll/" + trackId +"?url=www.ganji.com");
						
						mailTemplate.setEditPointMap(map);
					
						boolean result = mailService.sendMail(mail,mailTemplate);
						
						if(result){//Save Trace Record
							TraceRecords traceRecords = new TraceRecords();
							traceRecords.setLastSentTime(new Date());
							traceRecords.setSenderAddress(senderAddressList.get(senderIndex));
							traceRecords.setCandidateInfo(candidateInfo);
							traceRecordsDao.save(traceRecords);
						}
					}
				}
			} catch (AppException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
		
		
		
	}

}
