package com.bmg;

public class TestFac {
	//求n！
	public static void main(String[] args) {
		long time1 = System.currentTimeMillis();  //程序执行开始时的时间
		System.out.println("结果为：" + fac(40));
		long time2 = System.currentTimeMillis();  //程序执行结束时的时间
		System.out.println("递归耗时：" + (time2-time1) + "ms");
	}
	
	static long fac(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n * fac(n-1);
		}
	}
}
