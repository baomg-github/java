package com.bmg;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("���������������");
		String name = input.next();
		System.out.println("�������������");
		int age = input.nextInt();
		
		System.out.println("���������" + name);
		System.out.println("������䣺" + age);
	}
}
