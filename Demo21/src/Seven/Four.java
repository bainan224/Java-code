package Seven;

import java.util.Scanner;

public class Four {
	public static void main(String[] args) {
		Scanner scan;
		scan = new Scanner(System.in);
		System.out.println("欢迎进入xxx购物系统：");
		System.out.println("\t y:登入系统");
		System.out.println("\t n:退出系统 ");
		System.out.println("请输入命令指示：");
		String str = scan.next();
		switch (str) {
		case "y":
			System.out.println("1.客户信息管理");
			System.out.println("2.购物结算");
			System.out.println("3.真情回馈");
			System.out.println("4.注销");
			break;
		case "n":
			System.out.println("已经退出系统");
			break;
		default:
			System.out.println("输入错误");
		}
	}
}