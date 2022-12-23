package com.AshuIt.SpringDataJpaCustomeQuery.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.AshuIt.SpringDataJpaCustomeQuery.Model.User;
import com.AshuIt.SpringDataJpaCustomeQuery.Repository.UserRepository;

@Service
public class UserServiceImpl implements UserServiceI {
    @Autowired
	private UserRepository userRepository;

	@Override
	public void SaveAllUserData(List<User> list) {
		List<User> saveAll = userRepository.saveAll(list);
		
		
	}

	@Override
	public List<User> getallData() {
		List<User> allUserTable = userRepository.getAllUserTable();
		return allUserTable;
	}

	@Override
	public User getuserid(int id) {
		User byUserid = userRepository.getByUserid(id);
		return byUserid;
	}

	@Override
	public User getUserNameCustomQuery(String username) {
		User userName2 = userRepository.getUserName(username);
		return userName2;
	}

	@Override
	public User LoginByUsernameAndPassword(String username, String password) {
		User getlogin = userRepository.getlogin(username, password);
		return getlogin;
	}

	@Override
	public User getUserSql(int User_Id) {
		User userIdSql = userRepository.getUserIdSql(User_Id);
		return userIdSql;
	}

	@Override
	public User getUserNameCustomQuerysql(String username) {
		User userNameSql = userRepository.getUserNameSql(username);
		return userNameSql;
	}

	@Override
	public User LoginByUsernameAndPasswordsql(String User_name, String User_password) {
		User getloginsql = userRepository.getloginsql(User_name, User_password);
		return getloginsql;
	}


	
}
