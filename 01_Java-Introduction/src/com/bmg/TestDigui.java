package com.bmg;

public class TestDigui {
	
	public static void main(String[] args) {
		a();
	}

	static int count = 1;
	static void a() {
		System.out.println("a" + " + " + count);
		count++;
		if (count<=10) {
			a();
		} else {
			return;
		}
	}
}
