package com.bmg;

public class Method {

	public static void main(String[] args) {
		//通过对象调用方法
		Method mt = new Method();
		mt.method1();
		int c = mt.add(100, 25) + 1000;
		System.out.println(c);  //1125
	}
	
	void method1() {
		System.out.println("这是第一个方法");
	}
	
	int add(int a,int b) {
		System.out.println(a+b);  //125
		return a + b;  //return的两个作用：1、结束方法的运行；2、返回值
	}
}
