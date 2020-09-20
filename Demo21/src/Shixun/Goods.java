package Shixun;

import java.util.Scanner;

public class Goods {
	public  void goods() {
		Scanner scan= new Scanner(System.in);
		int fourthNum = 1;
		do {
			System.out.println("------------------");
			System.out.println("\t 1.食品类");
			System.out.println("\t 2.蔬果类");
			System.out.println("\t 3.生鲜类");
			System.out.println("\t 4.生活用品类");
			System.out.println("\t 5.数码类");
			System.out.println("\t 6.其他");
			System.out.println("\t 0.返回上级菜单");
			System.out.println("请输入相关数字：");
			fourthNum = scan.nextInt();
			switch (fourthNum) {
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
		} 
		while (fourthNum != 0);
		}
}
