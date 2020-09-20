package Seven;

import java.util.Scanner;

public class Yi {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.println("请输入名次：");
	    int i=scan.nextInt();
        switch(i) {	
        case 1:
        System.out.println("奖励外出旅游！");
	    break;
        case 2:
	    System.out.println("奖励国内旅游");
	    break;
        case 3:
	    System.out.println("奖励笔记本一台");
	    break;
        default:
	    System.out.println("下次继续努力");
	    break;
        }
        }

}
