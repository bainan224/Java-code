package Fourteeen;

import java.util.Scanner;

public class Administrator {

	String Username;
	
	String password;
	
		
	
	
	public  void manger() {
		System.out.println("------------");
		System.out.println("�û���:"+Username);
		System.out.println("����:"+password);
		System.out.println();
		
	}
		public  void modifypassword() {
		Scanner scan=new Scanner(System.in);
		System.out.println("�������û�����");
		String name=scan.next();
		System.out.println("���������룺");
		String pass=scan.next();
		
		if(name.equals(Username)&&pass.equals(password)) {
		System.out.println("�����������룺");
		String Repassword=scan.next();
		password=Repassword;
		System.out.println("�����޸ĳɹ���");
		
		}else {
			System.out.println("����û���޸ĳɹ�!");
			
		}
			
			
			
			
		}






	}


