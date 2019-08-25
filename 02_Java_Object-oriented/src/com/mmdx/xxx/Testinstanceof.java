package com.mmdx.xxx;

public class Testinstanceof {
	public static void main(String[] args) {
		Person person = new Person();
		Student student = new Student();
		System.out.println(student instanceof Person);  //true
		System.out.println(student instanceof Object);  //true
		System.out.println(person instanceof Student);  //false
	}

}

class Person{
	
}

class Student extends Person{
	
}