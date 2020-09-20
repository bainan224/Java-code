package Thriteeen;

import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Yi {

	public static void main(String[] args) {
		
		Scanner reader= new Scanner(System.in);
		String username=null,password=null,repassword=null;
		 boolean flag=true;
			
			do {
				System.out.println("请输入用户名：");
				username=reader.next();
				System.out.println("请输入密码：");
				password=reader.next();
				System.out.println("请再次输入密码：");
				repassword=reader.next();
				flag=verify(username, password, repassword);
				
			}while(flag==false);
		}
		public static boolean verify(String name,String pass,String repass) {
			if(name.length()>=3) {
				if(pass.length()>=6) {
					if(pass.equals(repass)) {
						return true;
					}else {
						System.out.println("密码不相同");
						return false;
					}
				}else {
					System.out.println("密码不合法");
					return false;
				}
			}else {
				System.out.println("名字不合法");
				return false;
			}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}		
}
