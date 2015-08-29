import java.util.HashMap;
import java.util.Map;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.web.client.RestTemplate;

import com.zigbee.framework.common.util.ApplicationContextUtil;
import com.zigbee.function.constant.MailTrackConstant;
import com.zigbee.function.service.IMailAppService;

/************************************************************************************
 * @File name   :      MailAppServiceTest.java
 *
 * @Author      :      YIFEGU
 *
 * @Date        :      2011-9-27
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
 * 2011-9-28 ����12:13:25			YIFEGU			1.0				Initial Version
 ************************************************************************************/

/**
 *
 */
public class MailAppServiceTest {

    private static final String CONFIG = "D:/workspace/MailServiceApp/webapp/WEB-INF/spring-context.xml";
    private static IMailAppService mailAppService;
	/**
	 * @Author      :      YIFEGU
	 * @Date        :      2011-9-27
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		try {
            ApplicationContext applicationContext = new FileSystemXmlApplicationContext(CONFIG);
            mailAppService = (IMailAppService) applicationContext.getBean("mailAppServiceImpl");
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
	}

	/**
	 * @Author      :      YIFEGU
	 * @Date        :      2011-9-27
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * Test method for {@link com.zigbee.function.service.impl.MailAppServiceImpl#autoSendMail(long)}.
	 */
	@Test
	public void testAutoSendMail() {
		
		mailAppService.autoSendMail(0);
		Assert.assertTrue(true);
	}
	
	@Test
	public void testRestWebservice(){
		RestTemplate restTemplate = (RestTemplate) ApplicationContextUtil.getBean("restTemplate");
		String id = "6666";
		Map<String, String> params = new HashMap<String, String>();
		params.put("id", id);
		restTemplate.put(MailTrackConstant.TRACKING_URL+ "MailTracking/receiveReply/{id}", 
		null, params);

	}

}
