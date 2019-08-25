package com.bmg;

public class User {
	int id;
	String userName;
	String password;
	//静态变量
	static String company = "华为";
	
	public void login(String userName,String password) {
		System.out.println("userName = " + userName + "\t" + "password = " + password);
		//在普通方法中可以调用静态变量和方法
		System.out.println(company);
		getConpany();
	}
	
	//静态方法
	public static void getConpany() {
		System.out.println(company);
		//在静态方法中不能调用普通方法和变量
//		login("张三", "zhangsan123");
//		System.out.println(userName);
	}
	
	public static void main(String[] args) {
		User user = new User();
		user.login("张三", "zhangsan123");
		//使用“类.方法”和“类.变量”来调用
		User.getConpany();
		User.company = "小米";
		User.getConpany();
	}
}
