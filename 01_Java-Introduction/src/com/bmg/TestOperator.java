package com.bmg;

public class TestOperator {
	public static void main(String[] args) {
		System.out.println(1<3 || 2>(3/0));  //true
		System.out.println(1>3 && 2>(3/0));  //false
		//|��&��ִ�еڶ��������������Իᱨ��
		System.out.println(1<3 | 2>(3/0));  //�������java.lang.ArithmeticException: / by zero
		System.out.println(1>3 & 2>(3/0));  //�������java.lang.ArithmeticException: / by zero
	}
}
