package Shixun;

import java.util.Scanner;

public class Register {

	public void register() {
		Scanner reader= new Scanner(System.in);
		String username=null,password=null,repassword=null;
		System.out.println("�������û�����");
		username=reader.next();
		boolean flag = true;
		while(flag) {
		if(username.length()>3) {
			System.out.println("���������룺");
			System.out.println("����Ϊ������λ������ĸ������");
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
	}
