package com.mmdx;

public class TestSuper {
	public static void main(String[] args) {
		System.out.println("准备创建对象......");
		new Child();
	}
}

class Father{
	public Father() {
		super();
		System.out.println("开始创建Father对象......");
	}
}

class Child extends Father{
	public Child() {
		super();
		System.out.println("开始创建Child对象......");
	}
}