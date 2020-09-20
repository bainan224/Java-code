package Shixun;

import java.util.Scanner;

public class Login {

	public  void login() {
		
		Scanner scan= new Scanner(System.in);
		Scanner  reader= new Scanner(System.in);
		String username=null,password=null;
		String username1="aali";
		String password1="aa1234";
		boolean flag = true;
		do {
		   System.out.println("请输入用户名：");
		   username=reader.next();
		   System.out.println("请输入密码：");
		   password = reader.next();
			   if(username.equals(username1)&& password.equals(password1)) {
			     System.out.println("登入成功!"); 
			     flag = false;
			   }else {
			     System.out.println("用户名或密码输入错误，请重新输入:");
			   }
			        
	}while(flag);
		
	
	
	
	
	
	
	}

}
