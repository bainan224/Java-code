package Fourteeen;

import java.util.Scanner;

public class Administrator {

	String Username;
	
	String password;
	
		
	
	
	public  void manger() {
		System.out.println("------------");
		System.out.println("用户名:"+Username);
		System.out.println("密码:"+password);
		System.out.println();
		
	}
		public  void modifypassword() {
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入用户名：");
		String name=scan.next();
		System.out.println("请输入密码：");
		String pass=scan.next();
		
		if(name.equals(Username)&&pass.equals(password)) {
		System.out.println("请输入新密码：");
		String Repassword=scan.next();
		password=Repassword;
		System.out.println("密码修改成功！");
		
		}else {
			System.out.println("密码没有修改成功!");
			
		}
			
			
			
			
		}






	}


