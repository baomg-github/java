package com.bmg;

public class Student {
	String name;
	int age;
	Computer comp;
	
	void study() {
		System.out.println("����ѧϰ,ʹ�õĵ���Ʒ���ǣ�" + comp.brand);
	}

	public static void main(String[] args) {
		Student student = new Student();
		student.name = "����";
		student.age = 19;
		
		Computer computer = new Computer();
		computer.brand = "��˶";
		
		student.comp = computer;
		student.study();
	}
}

class Computer{
	String brand;
}
