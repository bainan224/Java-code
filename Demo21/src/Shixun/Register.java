package Shixun;

import java.util.Scanner;

public class Register {

	public void register() {
		Scanner reader= new Scanner(System.in);
		String username=null,password=null,repassword=null;
		System.out.println("请输入用户名：");
		username=reader.next();
		boolean flag = true;
		while(flag) {
		if(username.length()>3) {
			System.out.println("请输入密码：");
			System.out.println("密码为大于六位数的字母或数字");
		username = reader.next();
		if(password.length()>=6) {
		System.out.println("请在次输入密码：");
		repassword=reader.next();
		if(repassword.equals(password)) {
		System.out.println("注册成功！");
		
		}
		else {
    		System.out.println("第一次和第二次输入的密码不同，注册失败");
    	}
	}
	else {
		System.out.println("密码输入错误");
	}
}else {
	System.out.println("用户名输入错误");
}

	}

	}
	}
