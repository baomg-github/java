package com.mmdx;

public class TestPoly {
	public static void main(String[] args) {
		getCry(new Animal());
		
		//��������ָ��������󣬶�̬����
		getCry(new Cat());
		getCry(new Dog());
		
		Animal a = new Dog();  //����ת��
		a.Cry();  // ������......
		//�����Ҫ����Dog�������еķ����������������ǿ��ת��
		Dog d = (Dog)a;  //����ת��
		d.seeDoor();
		
		Math.sqrt(10);
	}

	//��������
	static void getCry(Animal a) {
		a.Cry();
	}
	
	
	
	//�����ʹ�ö�̬����ʵ�ֻ�����鷳
//	static void getCry(Cat a) {
//		a.Cry();
//	}
//	static void getCry(Dog a) {
//		a.Cry();
//	}
	
}

class Animal {
	public void Cry() {
		System.out.println("��......");
	}
}

class Cat extends Animal {
	public void Cry() {
		System.out.println("������......");
	}
}

class Dog extends Animal {
	public void Cry() {
		System.out.println("������......");
	}
	
	public void seeDoor() {
		System.out.println("����......");
	}
}