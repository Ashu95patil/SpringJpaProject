package com.AshuIt.SpringDataJpaCustomeQuery.Repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.AshuIt.SpringDataJpaCustomeQuery.Model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	
	
	// For Use HQl Query
	
	@Query("from User")
	public List<User> getAllUserTable();
	
	@Query("from User where id=:userid")
	public User getByUserid(int userid);
	
	@Query("from User where username=:username")
	public User getUserName(String username);
	
	@Query("from User where username=:username and userpassword=:userpassword")
	public User getlogin(String username,String userpassword);
	
	
	// For use Sql Query
	
	@Query(value="select * from User where User_Id=:User_Id",nativeQuery = true)
	public User getUserIdSql(int User_Id);
	
	@Query(value="select * from User where User_name=:username",nativeQuery = true)
	public User getUserNameSql(String username);
	

	@Query(value="select * from User where User_name=:User_name and User_password=:User_password",nativeQuery = true)
	public User getloginsql(String User_name,String User_password);
	
	
	
		
	
	
	
	
	
}
