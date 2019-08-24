package com.bmg;

public class TestWhile {
	public static void main(String[] args) {
		//¼ÆËã1+2+3+...+100µÄÖµ
		int i = 1;
		int sum = 0;
		while(i<=100) {
			sum = sum + i;
			i++;
		}
		System.out.println("1+2+3+...+100 = " + sum);
	}
}
