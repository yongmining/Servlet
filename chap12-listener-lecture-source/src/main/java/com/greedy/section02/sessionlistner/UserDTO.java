package com.greedy.section02.sessionlistner;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

public class UserDTO implements HttpSessionBindingListener {

	private String name;
	private String age;
	
	public UserDTO() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "UserDTO [name=" + name + ", age=" + age + "]";
	}

	public UserDTO(String name, String age) {
		super();
		this.name = name;
		this.age = age;
	}
		@Override
		public void valueBound(HttpSessionBindingEvent event) {
			System.out.println("value bound!!");
		}
		@Override
		public void valueUnbound(HttpSessionBindingEvent event) {
			System.out.println("value unbound!!");
		}
}
