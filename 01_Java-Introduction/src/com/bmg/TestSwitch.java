package com.bmg;

public class TestSwitch {
	public static void main(String[] args) {
		int month = (int) (1+12*Math.random());
		System.out.println("�õ����·��ǣ�" + month);
		switch (month) {
		case 1:
		case 2:
		case 3:
			System.out.println("���ǵ�һ����");
			break;
		case 4:
		case 5:
		case 6:
			System.out.println("���ǵڶ�����");
			break;
		case 7:
		case 8:
		case 9:
			System.out.println("���ǵ�������");
			break;
		case 10:
		case 11:
		case 12:
			System.out.println("���ǵ��ļ���");
			break;

		default:
			System.out.println("��������·���");
			break;
		}
	}
}
