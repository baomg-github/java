package com.bmg;

public class Method {

	public static void main(String[] args) {
		//ͨ��������÷���
		Method mt = new Method();
		mt.method1();
		int c = mt.add(100, 25) + 1000;
		System.out.println(c);  //1125
	}
	
	void method1() {
		System.out.println("���ǵ�һ������");
	}
	
	int add(int a,int b) {
		System.out.println(a+b);  //125
		return a + b;  //return���������ã�1���������������У�2������ֵ
	}
}
