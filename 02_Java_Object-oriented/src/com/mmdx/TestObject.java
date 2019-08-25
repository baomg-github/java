package com.mmdx;

public class TestObject {
	public static void main(String[] args) {
		User u1 = new User(1001,"����", 25);
		User u2 = new User(1001,"����", 25);
		System.out.println(u1 == u2);  //false
		System.out.println(u1.equals(u2));  //Ĭ����false����дequals()������Ϊtrue
		
		String s1 = new String("xxx");
		String s2 = new String("xxx");
		System.out.println(s1 == s2);  //false
		System.out.println(s1.equals(s2));  //true
	}
}

class User{
	int id;
	String name;
	int age;
	
	public User(int id,String name,int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	//��дequals()������ֻ�����������id��ͬ�����ж���ͬ
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (id != other.id)
			return false;
		return true;
	}
}