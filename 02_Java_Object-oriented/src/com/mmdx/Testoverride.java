package com.mmdx;

public class Testoverride {
	public static void main(String[] args) {
		Pig pig = new Pig();
		pig.run();
	}
}

class Animal1 {
	public void run() {
		System.out.println("跑。。。");
	}
}

class Pig extends Animal1 {
	//方法重写
	@Override
	public void run() {
		System.out.println("使劲跑。。。");
	}
}