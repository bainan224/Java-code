package Seven;

import java.util.Scanner;

public class Er {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.println("请输入名次(汉字)：");
	    String str=scan.next();
        switch(str) {	
        case "一":
        System.out.println("奖励外出旅游！");
	    break;
        case "二":
	    System.out.println("奖励国内旅游");
	    break;
        case "三":
	    System.out.println("奖励笔记本一台");
	    break;
        default:
	    System.out.println("下次继续努力");
	    break;
        }
        }

}
