package homework;

import java.util.Scanner;

public class scorreCompare {
	public static void main(String[] args) {
	    double bScoreofZh=85;
		Scanner scan= new Scanner((System.in));
		System.out.println("请输入李四同学的成绩");
		double bScoreofLi=scan.nextInt();
		boolean bRes=bScoreofLi>bScoreofZh;
		System.out.println("lisi的成绩"+bScoreofLi+
				",大于张三的成绩吗?"+bRes);
			if(bRes) {
				System.out.println("李四的成绩好于张三");
			}else {
				System.out.println("张三的成绩好于李四");
			}
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
	} 

