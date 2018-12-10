package com.tedu.server;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tedu.mapper.UserMapper;
import com.tedu.pojo.User;

@Service
public class UserServerImpl implements UserServer {
@Autowired
public UserMapper userMapper;
	@Override
	public List<User> fandAll() {
		return userMapper.fandAll();
	}
	
	@Override
	public User get(Integer id) {
		return userMapper.get(id);
	}

	@Override
	public void insert(User user) {
		// TODO Auto-generated method stub
		userMapper.insert(user);
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
	  userMapper.update(user);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
	 userMapper.delete(id);
	}

}
