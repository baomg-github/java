package com.bmg;

public class TestThis {
	int a,b,c;
	
	//���췽��
	public TestThis(int a,int b) {
		this.a = a;
		this.b = b;
		System.out.println(a + b);
	}
	public TestThis(int a,int b,int c) {
		this(a, b);  //������ڵ�һ��
		this.c = c;
	}
	
	//��ͨ����
	void sing() {
		
	}
	void eat() {
		this.sing();
		System.out.println("���躰��ؼҳԷ�");
	}
	
	public static void main(String[] args) {
		TestThis tt = new TestThis(3, 4);
		tt.eat();
	}
}
