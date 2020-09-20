package Eight;

import java.util.Scanner;

public class Liu {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
	    int score=0;
	do {
		System.out.println("学习");
		System.out.println("考试");
		System.out.println("得到考试成绩");
		score=scan.nextInt();
	    }while(score<60); 
	    	
	   
	    System.out.println("你过关了，学会了！");
	    

	}

}
