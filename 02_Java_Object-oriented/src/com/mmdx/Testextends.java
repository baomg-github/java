package com.mmdx;

import com.mmdx.Person;
import com.mmdx.Student;

public class Testextends {
	
	public static void main(String[] args) {
		Student1 student = new Student1();
		student.name = "张三";
//		student.age = 14;  //错误：父类的私有属性无法访问
		student.id = 1001;
		student.rest();
		
	}
}

class Person {
	String name;
	//私有属性
	private int age;
	public void rest() {
		System.out.println("休息一下");
	}
	
}

class Student1 extends Person {
	int id;
	public void study() {
		System.out.println("学习一整天");
	}
}
