package com.bmg;

public class TestContinue {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i == 7) {
				continue;
			}
			System.out.print(i + "\t");
		}
	}
}
