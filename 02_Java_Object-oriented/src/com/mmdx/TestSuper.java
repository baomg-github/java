package com.mmdx;

public class TestSuper {
	public static void main(String[] args) {
		System.out.println("׼����������......");
		new Child();
	}
}

class Father{
	public Father() {
		super();
		System.out.println("��ʼ����Father����......");
	}
}

class Child extends Father{
	public Child() {
		super();
		System.out.println("��ʼ����Child����......");
	}
}