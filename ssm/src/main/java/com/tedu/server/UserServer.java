package com.tedu.server;


import java.util.List;

import com.tedu.pojo.User;

public interface UserServer {

	List<User> fandAll();
	User get(Integer id);
	void insert(User user);
	void update(User user);
	void delete(Integer id);
	
}
