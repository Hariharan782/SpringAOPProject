package com.spring.logic;

import java.io.IOException;

public class UserImpl implements User{

	@Override
	public void addNewUser() {
		System.out.println("addNewUser() is running .....");
	}

	@Override
	public void addNewUserWithData(int userId, String username) {
		System.out.println("addNewUserWithData() is running .....");
	}
	
	@Override
	public void addNewUserWithTwoData(int userId, String username) {
		System.out.println("addNewUserWithTwoData() is running ......");		
	}
	
	public void oneData(int userId) throws IOException {
		if(userId < 0) {
			System.out.println("Exception raised");
			throw new IOException();
		}
		System.out.println("Without Exception");
	}
}
