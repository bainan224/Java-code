package Shixun;

import java.util.Scanner;

public class VipDemo {

	public  void vipDemo() {
		Scanner scan= new Scanner(System.in);
		int a = 1;
		Register  reg = new  Register();
		Login log = new Login();
		do {
		    System.out.println("----------------");
			System.out.println("\t 1.会员注册");
		    System.out.println("\t 2.会员登录");
		    System.out.println("\t 0.反回上级菜单");
		    System.out.println("请输入相关数字：");
		    a =scan.nextInt();
		    switch (a) {
		case 1:
			reg.register();
			break;
		case 2:
		     log.login();
		break;
		
		default:
			System.out.println("请输入0-4之间的数");
		}
		} while (a != 0);

	
	
	
	
	
	
	
	
	
	}
}