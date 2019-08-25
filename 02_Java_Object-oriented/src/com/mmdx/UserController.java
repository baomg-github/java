package com.mmdx;

import com.mmdx.xxx.User;

public class UserController {
	public static void main(String[] args) {
		User user = new User();
		user.setName("уехЩ");
		System.out.println(user.getName());
		
		user.setAge(-11);
		System.out.println(user.getAge());
		user.setAge(25);
		System.out.println(user.getAge());
		
		System.out.println(user);
	}
}
