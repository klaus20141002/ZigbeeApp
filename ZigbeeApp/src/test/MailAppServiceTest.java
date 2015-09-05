import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.web.client.RestTemplate;

import com.zigbee.framework.common.util.ApplicationContextUtil;
import com.zigbee.function.constant.MailTrackConstant;
import com.zigbee.function.constant.WarningConstants;
import com.zigbee.function.dto.WarningInputDto;
import com.zigbee.function.service.IMailAppService;
import com.zigbee.function.service.IWarningService;

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
@ContextConfiguration(locations = { "classpath*:spring-context.xml" })
public class MailAppServiceTest extends AbstractJUnit4SpringContextTests  {

//    private static final String CONFIG = "D:/workspace_greenhouse/ZigbeeApp/webapp/WEB-INF/spring-context.xml";
    @Autowired
	private static IMailAppService mailAppService;
    
    @Autowired
    private IWarningService warningService ;
	/**
	 * @Author      :      YIFEGU
	 * @Date        :      2011-9-27
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		try {
//            ApplicationContext applicationContext = new FileSystemXmlApplicationContext(CONFIG);
//            mailAppService = (IMailAppService) applicationContext.getBean("mailAppServiceImpl");
//            warningService = (IWarningService) applicationContext.getBean("WarningServiceImpl");
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

	
	
	@Test
	public void testWarningReport(){
		
		WarningInputDto dto = new WarningInputDto();
		dto.setAlertType(WarningConstants.COZ_WARING);
		dto.setDataDalue(20);
		warningService.alermReport(dto);
	}
}
