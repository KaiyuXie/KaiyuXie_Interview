package com.uso;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.uso.service.user.IUserService;

public class SpringTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:config/applicationContext.xml");
		IUserService service = ctx.getBean("userServiceImpl", IUserService.class);
		int result = service.saveUser(null);
		System.out.println(result);
	}
}
