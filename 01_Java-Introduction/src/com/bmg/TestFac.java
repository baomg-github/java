package com.bmg;

public class TestFac {
	//��n��
	public static void main(String[] args) {
		long time1 = System.currentTimeMillis();  //����ִ�п�ʼʱ��ʱ��
		System.out.println("���Ϊ��" + fac(40));
		long time2 = System.currentTimeMillis();  //����ִ�н���ʱ��ʱ��
		System.out.println("�ݹ��ʱ��" + (time2-time1) + "ms");
	}
	
	static long fac(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n * fac(n-1);
		}
	}
}
