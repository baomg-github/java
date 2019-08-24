package com.bmg;

public interface TestBreak {
	public static void main(String[] args) {
		for (int i = 1; 1 <= 10; i++) {
			if (i == 7) {
				break;
			}
			System.out.print(i + "\t");
		}
	}
}
