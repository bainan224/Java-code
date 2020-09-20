package Sushe;

import java.util.Scanner;

public class Sanji {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		String str ="y";
		boolean firstflag =true;
		do {
		System.out.println("欢迎进入方舟购物系统：");
		System.out.println("\t 1.欢迎进入管理员系统");
		System.out.println("\t 2:欢迎进入会员顾客系统 ");
		System.out.println("请输入命令指示y/n：");
		str = scan.next();
		switch (str) {
		case "y":
			Enter(scan);
			break;
		case "n":
			firstflag =false;
			break;
		default:
			System.out.println("输入错误");
		}

	}while(!str.equals("n"));
System.out.println("已经退出系统");
}
	public static void Enter(Scanner scan) {
		int secondNum = 1;
	do {
        System.out.println("----------------");
		System.out.println("\t1.客户信息管理");
	    System.out.println("\t2.购物结算");
	    System.out.println("\t3.真情回馈");
	    System.out.println("\t4.商品管理");
	    System.out.println("\t0.反回上级菜单");
	    System.out.println("请输入相关数字：");
	    secondNum = scan.nextInt();
	    switch (secondNum) {
	case 1:
		System.out.println("个人信息查阅");
		break;
	case 2:
	System.out.println("购物金额为：xxx");
	break;
	case 3:
	System.out.println("活动：");
	break;
	case 4:
		userManage(scan);
	break;
	case 0:
		System.out.println("返回上级菜单");
		break;
	default:
		System.out.println("请输入0-4之间的数");
	}
} while (secondNum != 0);
}
	public static void userManage(Scanner scan) {
		int thirdNum = 1;
		do {
			System.out.println("------------------");
			System.out.println("\t 1.增加商品");
			System.out.println("\t 2.删除商品");
			System.out.println("\t 3.修改商品");
			System.out.println("\t 4.查询商品");
			System.out.println("\t 0.返回上级菜单");
			System.out.println("请输入相关数字：");
			thirdNum = scan.nextInt();
			switch (thirdNum) {
			case 1:
				System.out.println("增加商品种类");
				break;
			case 2:
				System.out.println("删除商品种类");
				break;
			case 3:
				System.out.println("修改商品种类");
				break;
			case 4:
				System.out.println("查询商品种类");
				break;
			case 0:
				System.out.println("返回上级菜单");
				break;
			default:
				System.out.println("请输入0-4之间的数");
			}
		} while (thirdNum != 0);
	}
}

	
	
	
