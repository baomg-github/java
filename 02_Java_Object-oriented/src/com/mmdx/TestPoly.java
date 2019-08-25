package com.mmdx;

public class TestPoly {
	public static void main(String[] args) {
		getCry(new Animal());
		
		//父类引用指向子类对象，多态产生
		getCry(new Cat());
		getCry(new Dog());
		
		Animal a = new Dog();  //向上转型
		a.Cry();  // 汪汪汪......
		//如果需要调用Dog类中特有的方法，必须进行向下强制转型
		Dog d = (Dog)a;  //向下转型
		d.seeDoor();
		
		Math.sqrt(10);
	}

	//父类引用
	static void getCry(Animal a) {
		a.Cry();
	}
	
	
	
	//如果不使用多态，则实现会更加麻烦
//	static void getCry(Cat a) {
//		a.Cry();
//	}
//	static void getCry(Dog a) {
//		a.Cry();
//	}
	
}

class Animal {
	public void Cry() {
		System.out.println("叫......");
	}
}

class Cat extends Animal {
	public void Cry() {
		System.out.println("喵喵喵......");
	}
}

class Dog extends Animal {
	public void Cry() {
		System.out.println("汪汪汪......");
	}
	
	public void seeDoor() {
		System.out.println("看门......");
	}
}