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
		   System.out.println("�������û�����");
		   username=reader.next();
		   System.out.println("���������룺");
		   password = reader.next();
			   if(username.equals(username1)&& password.equals(password1)) {
			     System.out.println("����ɹ�!"); 
			     flag = false;
			   }else {
			     System.out.println("�û��������������������������:");
			   }
			        
	}while(flag);
		
	
	
	
	
	
	
	}

}
