package com.bmg;

public class TestThis {
	int a,b,c;
	
	//构造方法
	public TestThis(int a,int b) {
		this.a = a;
		this.b = b;
		System.out.println(a + b);
	}
	public TestThis(int a,int b,int c) {
		this(a, b);  //必须放在第一句
		this.c = c;
	}
	
	//普通方法
	void sing() {
		
	}
	void eat() {
		this.sing();
		System.out.println("你妈喊你回家吃饭");
	}
	
	public static void main(String[] args) {
		TestThis tt = new TestThis(3, 4);
		tt.eat();
	}
}
