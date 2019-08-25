package com.xxx;

import java.util.Date;
import com.bmg.User;

public class Test {
	public static void main(String[] args) {
		//调用其他包中的类
		User user = new User();
		//调用java工具包中的类
		Date date = new Date();
		System.out.println(date);
	}
}
