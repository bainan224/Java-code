package Sushe;

import java.util.Scanner;

public class Shengfenzheng {

	public static void main(String[] args) {
		

		Scanner reader=new Scanner(System.in);
	System.out.println("���֤���룺");
	String shenfenzheng=reader.next();
	String chushengriqi=shenfenzheng.substring(6,14);
	System.out.println("�������ڣ�"+chushengriqi);
	String nian=shenfenzheng.substring(6,10);
	System.out.println("�������ڣ�"+nian+"��");
	String yue=shenfenzheng.substring(10,12);
	System.out.println("�������ڣ�"+yue+"��");
	String ri=shenfenzheng.substring(12,14);
	System.out.println("�������ڣ�"+ri+"��");
	
	
	
	
	
	
	
	
	
	
	}

}
