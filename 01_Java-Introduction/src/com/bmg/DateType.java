package com.bmg;
/**
 * 基本数据类型测试
 * @author baomg
 *
 */
public class DateType {
	public static void main(String[] args) {
		//整型
		byte a = 10;
		short b = 12;
		int c = 235;
		long d = 125846L;
		//进制测试
		int e1 = 0b1101;  //二进制，13
		int e2 = 015;  //八进制,12
		int e3 = 0x15;  //十六进制,21
		
		//浮点型
		float f = 2.45f;
		double g = 3.456;
		
		//字符型
		char h = 'A';
		char i = '保';
		char j = '\u0077';  //w
		
		//布尔型
		boolean k = true;
		boolean l = false;
	}

}
