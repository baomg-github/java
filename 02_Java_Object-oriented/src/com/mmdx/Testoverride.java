package com.mmdx;

public class Testoverride {
	public static void main(String[] args) {
		Pig pig = new Pig();
		pig.run();
	}
}

class Animal1 {
	public void run() {
		System.out.println("�ܡ�����");
	}
}

class Pig extends Animal1 {
	//������д
	@Override
	public void run() {
		System.out.println("ʹ���ܡ�����");
	}
}