package com.bmg;

public class US {
	int id;
	String name;
	
	public US(int id,String name) {
		this.id = id;
		this.name = name;
	}
	
	public void test01(US u1) {
		u1.name = "����";
	}
	
	public void test02(US u2) {
		u2 = new US(1005, "����");
	}
	
	public static void main(String[] args) {
		US us = new US(1001, "����");
		us.test01(us);
		System.out.println(us.name);  //����
		us.test02(us);
		System.out.println(us.name);  //����
	}
}
