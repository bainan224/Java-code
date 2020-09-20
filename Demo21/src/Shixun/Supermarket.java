package Shixun;
import java.util.Scanner;

import Sushe.Car;
public class Supermarket {
 public static void main(String[] args) {
			Scanner scan= new Scanner(System.in);
			String str ="y";
			boolean firstflag =true;
			Administrator adm = new Administrator();
			VipDemo  vip = new VipDemo();
			do {
			System.out.println("欢迎进入方舟购物系统：");
			System.out.println("\t 1.欢迎进入管理员系统");
			System.out.println("\t 2.欢迎进入会员顾客系统 ");
			System.out.println("\t 3.欢迎进入收银员系统");
			System.out.println("\t 0.退出系统");
			str = scan.next();
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
				firstflag =false;
				break;
			default:
				System.out.println("输入错误");
			}

		}while(!str.equals("0"));
	System.out.println("已经退出系统");
	}
		
	}

		
		
		






























