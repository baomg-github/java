package com.bmg;

public class Variable {
	
	int a;  //成员变量
	
	static double PI = 3.1415926;  //静态变量
	
	public static void main(String[] args) {
		int b = 7;   //局部变量
		System.out.println(b);
		
		{
			double c = 0.001;   //局部变量
		}
	}

}
