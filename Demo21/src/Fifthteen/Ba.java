package Fifthteen;

import java.util.Scanner;

public class Ba {

	public static void main(String[] args) {
		Qi  score=new Qi();
	Scanner scan = new Scanner(System.in);
	System.out.println("请输入java的成绩：");
	score.java=scan.nextFloat();
	System.out.println("请输入C1的成绩：");
	score.C1=scan.nextFloat();
	System.out.println("请输入DB的成绩：");
	score.DB=scan.nextFloat();
	
	score.showsumscore();
	score.showaveragescore();
	
	
	
	
	}

}
