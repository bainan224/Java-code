package Sushe;

import java.util.Scanner;

public class Shengfenzheng {

	public static void main(String[] args) {
		

		Scanner reader=new Scanner(System.in);
	System.out.println("身份证号码：");
	String shenfenzheng=reader.next();
	String chushengriqi=shenfenzheng.substring(6,14);
	System.out.println("出生日期："+chushengriqi);
	String nian=shenfenzheng.substring(6,10);
	System.out.println("出生日期："+nian+"年");
	String yue=shenfenzheng.substring(10,12);
	System.out.println("出生日期："+yue+"月");
	String ri=shenfenzheng.substring(12,14);
	System.out.println("出生日期："+ri+"日");
	
	
	
	
	
	
	
	
	
	
	}

}
