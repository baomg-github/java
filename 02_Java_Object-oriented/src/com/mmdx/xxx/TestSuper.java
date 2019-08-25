package com.mmdx.xxx;

public class TestSuper {
	public static void main(String[] args) {
		new Pig().eat();
	}
}

class Animal{
	int age;
	
	public void eat() {
		age = 3;
		System.out.println("Animal age = " + age);
	}
}

class Pig extends Animal{
	int age;
	
	public void eat() {
		super.eat();  //调用父类方法
		age = 15;
		System.out.println("Pig age = " + age);
		System.out.println(super.age);  //调用父类成员变量
	}
}