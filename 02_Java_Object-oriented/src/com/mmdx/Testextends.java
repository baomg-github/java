package com.mmdx;

import com.mmdx.Person;
import com.mmdx.Student;

public class Testextends {
	
	public static void main(String[] args) {
		Student1 student = new Student1();
		student.name = "����";
//		student.age = 14;  //���󣺸����˽�������޷�����
		student.id = 1001;
		student.rest();
		
	}
}

class Person {
	String name;
	//˽������
	private int age;
	public void rest() {
		System.out.println("��Ϣһ��");
	}
	
}

class Student1 extends Person {
	int id;
	public void study() {
		System.out.println("ѧϰһ����");
	}
}
