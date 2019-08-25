package com.bmg;

public class Student {
	String name;
	int age;
	Computer comp;
	
	void study() {
		System.out.println("我在学习,使用的电脑品牌是：" + comp.brand);
	}

	public static void main(String[] args) {
		Student student = new Student();
		student.name = "张三";
		student.age = 19;
		
		Computer computer = new Computer();
		computer.brand = "华硕";
		
		student.comp = computer;
		student.study();
	}
}

class Computer{
	String brand;
}
