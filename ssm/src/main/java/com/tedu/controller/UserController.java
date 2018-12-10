package com.tedu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tedu.pojo.User;
import com.tedu.server.UserServer;

@RestController
public class UserController {
@Autowired
private UserServer userServer;
	@RequestMapping("/fandAll")
	public List<User> fandAll(){
		return userServer.fandAll();
	}
	
	@RequestMapping("/get/{id}")
	public User get(@PathVariable Integer id) {
		return userServer.get(id);
	}
	
	@RequestMapping("/insert/{name}/{birthday}/{address}")
	public String insert(User user) {
		try {
			userServer.insert(user);
			return "OK!";
		} catch (Exception e) {
			return "insert error!!";
		}
	}
	
	@RequestMapping("/update/{name}/{birthday}/{address}/{id}")
	public String update(User user) {
		try {
			userServer.update(user);
			return "OK!";
		} catch (Exception e) {
			return "update error!!";
		}
	}
	
	@RequestMapping("/delect/{id}")
	public String delect(@PathVariable Integer id) {
		try {
			userServer.delete(id);
			return "OK!";
		} catch (Exception e) {
			return "delect error!!";
		}
	}
	
}
