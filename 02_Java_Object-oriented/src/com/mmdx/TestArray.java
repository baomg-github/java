package com.mmdx;

public class TestArray {
	public static void main(String[] args) {
		//Ĭ�ϳ�ʼ��
		int[] arr = new int[4];
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.print("\n");
		
		int[] a = new int[5];
		//��̬��ʼ��
		a[0] = 7;
		a[1] = 77;
		a[2] = 777;
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");  //7	77	777	0	0	
		}
		System.out.print("\n");
		//��̬��ʼ��
		int b[] = {30,58,89};
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + "\t");  //30	58	89
		}
		System.out.print("\n");
		Student[] c = new Student[3];
		//��̬��ʼ��
		c[0] = new Student("����", 18);
		c[1] = new Student("����", 25);
		c[2] = new Student("����", 40);
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + "\t");
		}
		System.out.print("\n");
		//��̬��ʼ��
		Student[] d = {new Student("����", 18),new Student("����", 25),new Student("����", 40)};
		for (int i = 0; i < c.length; i++) {
			System.out.print(d[i] + "\t");
		}
	}
}

