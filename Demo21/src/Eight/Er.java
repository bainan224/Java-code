package Eight;

import java.util.Scanner;

public class Er {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入考试成绩：");	
	    int score=scan.nextInt();
	
	    while(score<60) {
	    	System.out.println("再次学习");
	    	System.out.println("再次考试");
	    	System.out.println("得到考试成绩：");
	    	score=scan.nextInt();
	    }
	    System.out.println("你过关了，学会了！");
	    
	
	}

}
