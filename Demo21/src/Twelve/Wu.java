package Twelve;

import java.util.Scanner;

public class Wu {

	public static void main(String[] args) {
	String str1="abcdEF";
	Scanner scan= new Scanner(System.in);
	System.out.println("请输入密码：");
	String password = scan.next();
System.out.println(password);
	if("abcdEF".equals(password)) {
	System.out.println("输入密码正确");
	}
	else {
		System.out.println("密码输入错误");
	}
	
	if("abcdEF".equalsIgnoreCase(password)) {
		System.out.println("不区分大小写后，输入密码正确");
	}
	else {
		System.out.println("不区分大小写后，密码输入错误");
	}

}

}



