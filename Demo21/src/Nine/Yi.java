package Nine;

import java.util.Scanner;

public class Yi {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        System.out.println("请输入该同学5门课程的成绩：");
	double sum=0;
			int score=0;
	for(int i=0;i<5;i++) {
	System.out.println("请输入第"+(i+1)+"门课的成绩：");
	score=scan.nextInt();
	System.out.println(score);
	sum+=score;
	}
	System.out.println("平均分为："+sum/5);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
