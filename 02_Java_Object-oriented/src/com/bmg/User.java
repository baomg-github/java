package com.bmg;

public class User {
	int id;
	String userName;
	String password;
	//��̬����
	static String company = "��Ϊ";
	
	public void login(String userName,String password) {
		System.out.println("userName = " + userName + "\t" + "password = " + password);
		//����ͨ�����п��Ե��þ�̬�����ͷ���
		System.out.println(company);
		getConpany();
	}
	
	//��̬����
	public static void getConpany() {
		System.out.println(company);
		//�ھ�̬�����в��ܵ�����ͨ�����ͱ���
//		login("����", "zhangsan123");
//		System.out.println(userName);
	}
	
	public static void main(String[] args) {
		User user = new User();
		user.login("����", "zhangsan123");
		//ʹ�á���.�������͡���.������������
		User.getConpany();
		User.company = "С��";
		User.getConpany();
	}
}
