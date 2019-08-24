package com.bmg;

import java.util.Scanner;

public class Testelseif {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入你的成绩:");
		double result = input.nextDouble();
		if (result < 60) {
			System.out.println("你的成绩不及格");
		} else if (result < 80) {
			System.out.println("你的成绩等级为C");
		} else if (result < 90) {
			System.out.println("你的成绩等级为B");
		} else {
			System.out.println("你的成绩等级为A");
		}
	}

}
