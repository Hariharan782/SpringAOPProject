package com.spring.app;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.logic.User;

public class AOPApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext appCtx = new ClassPathXmlApplicationContext("Spring-User.xml");
		
		System.out.println("Starting Application ...... \n");
		User user = (User) appCtx.getBean("userObj");
		
		try {
			user.oneData(-10);
		} catch (IOException e) {
			System.out.println("IOException handing in psvm");
		}
		System.out.println("....End of program ....");
	}
}
