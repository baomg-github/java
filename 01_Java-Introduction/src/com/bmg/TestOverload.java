package com.bmg;

public class TestOverload {
	public static void main(String[] args) {
		TestOverload tOverload = new TestOverload();
		System.out.println(tOverload.add(10, 20));
		System.out.println(tOverload.add(25, 37, 45));
		System.out.println(tOverload.add(15, 37.26));
		System.out.println(tOverload.add(25.25, 68));
	}
	
	public static int add(int a,int b) {
		return a + b;
	}
	
	//�βθ�����ͬ����������
	public static int add(int a,int b,int c) {
		return a + b + c;
	}

	//�β����Ͳ�ͬ����������
	public static double add(int a,double b) {
		return a + b;
	}
	
	//�β�˳��ͬ����������
	public static double add(double a,int b) {
		return a + b;
	}
}
