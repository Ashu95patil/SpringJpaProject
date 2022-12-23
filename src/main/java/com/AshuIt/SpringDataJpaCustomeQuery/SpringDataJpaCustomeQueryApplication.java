package com.AshuIt.SpringDataJpaCustomeQuery;

import java.util.ArrayList;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.AshuIt.SpringDataJpaCustomeQuery.Model.User;
import com.AshuIt.SpringDataJpaCustomeQuery.Service.UserServiceI;
import com.AshuIt.SpringDataJpaCustomeQuery.Service.UserServiceImpl;

@SpringBootApplication
public class SpringDataJpaCustomeQueryApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringDataJpaCustomeQueryApplication.class, args);
		
		UserServiceImpl bean = context.getBean(UserServiceImpl.class);
		
//		User u1=new User();
//		u1.setUsername("Aishwarya");
//		u1.setUserpassword("abc123");
//		u1.setUseraddress("Mumbai");
//		u1.setUserage(35);
//		
//		User u2=new User();
//		u2.setUsername("Kajal");
//		u2.setUserpassword("abc124");
//		u2.setUseraddress("USA");
//		u2.setUserage(39);
//		
//		User u3=new User();
//		u3.setUsername("Katrina");
//		u3.setUserpassword("abc1235");
//		u3.setUseraddress("Pune");
//		u3.setUserage(28);
//		
//		User u4=new User();
//		u4.setUsername("Tejaswi");
//		u4.setUserpassword("abc1236");
//		u4.setUseraddress("Nashik");
//		u1.setUserage(37);
//		
//       List<User> list= new ArrayList();
//       list.add(u1);
//       list.add(u2);
//       list.add(u3);
//       list.add(u4);
//       
////       System.out.println(list);
//       bean.SaveAllUserData(list);
		
//		List<User> getallData = bean.getallData();
//		for(User u:getallData) {
//		System.out.println(u);
//		}
		
		
		//******** Use HQL Query  ******
		
//		User getuserid = bean.getuserid(2);
//		System.out.println(getuserid);
//       
//       User userNameCustomQuery = bean.getUserNameCustomQuery("Kajal");
//		
//		System.out.println(userNameCustomQuery);
		
		
//		User loginByUsernameAndPassword = bean.LoginByUsernameAndPassword("Kajal", "abc124");
//		System.out.println(loginByUsernameAndPassword);
		
		//******* Use SQL Query  ********
		
//		User userSql = bean.getUserSql(1);
//		System.out.println(userSql);
//		
//		User userNameCustomQuerysql = bean.getUserNameCustomQuerysql("Kajal");
//		System.out.println(userNameCustomQuerysql);
		
		User loginByUsernameAndPasswordsql = bean.LoginByUsernameAndPasswordsql("Kajal","abc124");
		System.out.println(loginByUsernameAndPasswordsql);
	}

}
