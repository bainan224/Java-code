package Nine;

import java.util.Scanner;

public class Si {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        System.out.println("�������ͬѧ5�ſγ̵ĳɼ���");
	double sum=0;
			int score=0;
	boolean flag=true;
			for(int i=0;i<5;i++) {
	System.out.println("�������"+(i+1)+"�ſεĳɼ���");
	score=scan.nextInt();
	if(score<0||score>100) {
	
	System.out.println("�������󣬳��������");
	flag=false;
	break;
	}
	System.out.println(score);
	sum+=score;
			}
	if(flag==true) {
	System.out.println("ƽ����Ϊ��"+sum/5);
	}
	
	
	
	
	
	
	
	
	
	}
}