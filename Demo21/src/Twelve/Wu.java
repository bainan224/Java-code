package Twelve;

import java.util.Scanner;

public class Wu {

	public static void main(String[] args) {
	String str1="abcdEF";
	Scanner scan= new Scanner(System.in);
	System.out.println("���������룺");
	String password = scan.next();
System.out.println(password);
	if("abcdEF".equals(password)) {
	System.out.println("����������ȷ");
	}
	else {
		System.out.println("�����������");
	}
	
	if("abcdEF".equalsIgnoreCase(password)) {
		System.out.println("�����ִ�Сд������������ȷ");
	}
	else {
		System.out.println("�����ִ�Сд�������������");
	}

}

}



