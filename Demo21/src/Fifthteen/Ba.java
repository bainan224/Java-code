package Fifthteen;

import java.util.Scanner;

public class Ba {

	public static void main(String[] args) {
		Qi  score=new Qi();
	Scanner scan = new Scanner(System.in);
	System.out.println("������java�ĳɼ���");
	score.java=scan.nextFloat();
	System.out.println("������C1�ĳɼ���");
	score.C1=scan.nextFloat();
	System.out.println("������DB�ĳɼ���");
	score.DB=scan.nextFloat();
	
	score.showsumscore();
	score.showaveragescore();
	
	
	
	
	}

}
