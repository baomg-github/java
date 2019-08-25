package com.mmdx.xxx;

public class User {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	
	//������set�����д������ϸ��
	public void setAge(int age) {
		if (age >= 1 && age <130) {
			this.age = age;
		} else {
			System.out.println("��������ȷ������");
		}
	}
	
	//��дtoString����
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
}
