package Twelve;

import java.util.Scanner;

public class Qi {

	public static void main(String[] args) {
		
		Scanner reader= new Scanner(System.in);
		String username=null,password=null,repassword=null;
		System.out.println("�������û�����");
		username=reader.next();
		if(username.length()>3) {
			System.out.println("���������룺");
		username = reader.next();
		if(password.length()>=6) {
		System.out.println("���ڴ��������룺");
		repassword=reader.next();
		if(repassword.equals(password)) {
		System.out.println("ע��ɹ���");
		
		}
		else {
    		System.out.println("��һ�κ͵ڶ�����������벻ͬ��ע��ʧ��");
    	}
	}
	else {
		System.out.println("�����������");
	}
}else {
	System.out.println("�û����������");
}
}
}
