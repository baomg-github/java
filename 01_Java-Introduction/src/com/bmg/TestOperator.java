package com.bmg;

public class TestOperator {
	public static void main(String[] args) {
		System.out.println(1<3 || 2>(3/0));  //true
		System.out.println(1>3 && 2>(3/0));  //false
		//|和&会执行第二个操作数，所以会报错
		System.out.println(1<3 | 2>(3/0));  //编译错误：java.lang.ArithmeticException: / by zero
		System.out.println(1>3 & 2>(3/0));  //编译错误：java.lang.ArithmeticException: / by zero
	}
}
