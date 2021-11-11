package com.example.MyBlog.model;

import javax.persistence.Entity;

import javax.persistence.Id;

@Entity
public class UserDetails {
	
	@Id
	private int id;
	private String name;
	private String address;
	
	
	@Override
	public String toString() {
		return "UserDetails [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	

}
