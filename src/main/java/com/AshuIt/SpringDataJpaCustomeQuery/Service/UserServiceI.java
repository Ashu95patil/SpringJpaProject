package com.AshuIt.SpringDataJpaCustomeQuery.Service;

import java.util.List;

import com.AshuIt.SpringDataJpaCustomeQuery.Model.User;

public interface UserServiceI {
	

	public void SaveAllUserData(List<User>list);
	
	public List<User> getallData();
	
	
	//Use HQL Query
	
	public User getuserid(int id);
	
	public User getUserNameCustomQuery(String username);
	
	public User LoginByUsernameAndPassword(String username,String password);
	
	// Use Sql Query
	
	public User getUserSql(int User_Id);
	
	public User getUserNameCustomQuerysql(String username);
	
	public User LoginByUsernameAndPasswordsql(String User_name,String User_password);

	
	

}
