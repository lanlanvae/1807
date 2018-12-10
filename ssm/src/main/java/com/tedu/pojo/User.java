package com.tedu.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class User {

	public Integer id;
	public String name;
	public String address;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	public Date birthday;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", address=" + address + ", birthday=" + birthday + "]";
	}
	
}
