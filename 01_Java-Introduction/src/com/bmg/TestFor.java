package com.bmg;

public class TestFor {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum = sum + i;
		}
		System.out.println("1+2+3+...+100 = " + sum);
	}
}
