package com.spring.logic;

import java.io.IOException;

public interface User {
	public void addNewUser();
	public void addNewUserWithData(int userId, String username);
	public void addNewUserWithTwoData(int userId, String username);
	
	public void oneData(int userId) throws IOException ;	
}
