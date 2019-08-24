package com.bmg;

public class TestSwitch {
	public static void main(String[] args) {
		int month = (int) (1+12*Math.random());
		System.out.println("得到的月份是：" + month);
		switch (month) {
		case 1:
		case 2:
		case 3:
			System.out.println("这是第一季度");
			break;
		case 4:
		case 5:
		case 6:
			System.out.println("这是第二季度");
			break;
		case 7:
		case 8:
		case 9:
			System.out.println("这是第三季度");
			break;
		case 10:
		case 11:
		case 12:
			System.out.println("这是第四季度");
			break;

		default:
			System.out.println("这个不是月份数");
			break;
		}
	}
}
