package com.bmg;

import java.util.Scanner;

public class Testelseif {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("��������ĳɼ�:");
		double result = input.nextDouble();
		if (result < 60) {
			System.out.println("��ĳɼ�������");
		} else if (result < 80) {
			System.out.println("��ĳɼ��ȼ�ΪC");
		} else if (result < 90) {
			System.out.println("��ĳɼ��ȼ�ΪB");
		} else {
			System.out.println("��ĳɼ��ȼ�ΪA");
		}
	}

}
