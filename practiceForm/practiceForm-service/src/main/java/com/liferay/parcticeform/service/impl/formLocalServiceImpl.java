/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.parcticeform.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.headless.form.dto.v1_0.Form;
import com.liferay.parcticeform.model.form;
import com.liferay.parcticeform.service.formLocalServiceUtil;
import com.liferay.parcticeform.service.base.formLocalServiceBaseImpl;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.util.Http.Response;

import javax.mail.internet.InternetAddress;

import org.osgi.service.component.annotations.Component;
import com.liferay.mail.kernel.model.MailMessage;
import com.liferay.mail.kernel.service.MailServiceUtil;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.liferay.parcticeform.model.form",
	service = AopService.class
)
public class formLocalServiceImpl extends formLocalServiceBaseImpl {
//	public form saveFormData(String empName , String emailId ,Long mobileNo) {
//		long empId=CounterLocalServiceUtil.increment();
//		form form1 = formPersistence.create(empId);
//		
//		form1.setEmail(emailId);
//		form1.setEmpId(empId);
//		form1.setMobileNo(mobileNo);
//		form1.setUserName(empName);;
//		
//		formLocalServiceUtil.addform(form1);
//		return form1;
//	}
	
	public form fillFormData(String empName , String emailId ,Long mobileNo) {
		long empId=CounterLocalServiceUtil.increment();
		form form1 = formPersistence.create(empId);
		
		form1.setEmail(emailId);
		form1.setEmpId(empId);
		form1.setMobileNo(mobileNo);
		form1.setUserName(empName);;
		
		formLocalServiceUtil.addform(form1);
		
		return form1;
	}

	public void sendEmail(String email) {
		MailMessage mailMessage = new MailMessage();
		String subject = "Response Received";
		String body = "Thank you for your response! Your response content: " + email ;
		try {
		    // Replace [RECIPIENT_EMAIL], [SENDER_EMAIL], [EMAIL_SUBJECT], and [EMAIL_BODY] with the appropriate values
//		    String subject = "Sample Email Subject";
//		    String body = "This is the body of the email.";
		    InternetAddress fromAddress =new InternetAddress("jindalmukul700@gamail.com");
		    InternetAddress toAddress =new InternetAddress(email);
		    
		    mailMessage.setBody(body);
            mailMessage.setSubject(subject);
            mailMessage.setFrom(fromAddress);
            mailMessage.setTo(toAddress);

		    MailServiceUtil.sendEmail(mailMessage);

		    System.out.println("Email sent successfully!");
		} catch (Exception e) {
		    e.printStackTrace();
		    // Handle the exception if needed
		}
		
	}

	@Override
	public form saveFormData(String empName, Long empId, String emailId, Long mobileNo) {
		// TODO Auto-generated method stub
		return null;
	}
}