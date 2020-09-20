package Shixun;

import java.util.Scanner;

public class Supermarket3 {
	static Scanner scan= new Scanner(System.in);
	boolean firstflag =true;
	static Administrator adm = new Administrator();
	static VipDemo  vip = new VipDemo();
	public static void main(String[] args) {
	        manageMenu();
	    }
	    
	    private static void manageMenu() {
			// TODO Auto-generated method stub

	        //用循环完成再次回到主界面
	        while (true) {
	            //用输出语句完主界面的编写
	        	System.out.println("欢迎进入方舟购物系统：");
				System.out.println("\t 1.欢迎进入管理员系统");
				System.out.println("\t 2.欢迎进入会员顾客系统 ");
				System.out.println("\t 3.欢迎进入收银员系统");
				System.out.println("\t 0.退出系统");
	            //用Scanner实现键盘录入数据
	            Scanner input = new Scanner(System.in);
	            String str = scan.next();
	            //用switch语句完成操作的选择
	            switch (str) {
	            
	            case "1":
					adm.administrator();
					
					break;
				case "2":
					vip.vipDemo();
					break;
				case "3":
					
					break;
				case "0":
					System.out.println("谢谢使用,已经退出系统");
                    //break;
                    System.exit(0);//JVM退出
				default:
					System.out.println("输入错误");
	                    
	            }
	        }
		}
}
