package com.mmdx.xxx;

public class User {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	
	//可以在set方法中处理相关细节
	public void setAge(int age) {
		if (age >= 1 && age <130) {
			this.age = age;
		} else {
			System.out.println("请输入正确的年龄");
		}
	}
	
	//重写toString方法
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
}
