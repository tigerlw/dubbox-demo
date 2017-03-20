package com.ucloudlink.dubbox;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ucloudlink.dubbox.service.UserService;

public class Main 
{
	public static void main(String args[])
	{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:META-INF/spring*.xml");
		
		
		UserService userService = (UserService) context.getBean("userService");
		
		String result = userService.queryUser("123");
		
		System.out.println(result);
		
	}

}
