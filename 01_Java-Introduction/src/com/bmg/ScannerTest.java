package com.bmg;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入你的姓名：");
		String name = input.next();
		System.out.println("请输入你的年龄");
		int age = input.nextInt();
		
		System.out.println("你的姓名：" + name);
		System.out.println("你的年龄：" + age);
	}
}
