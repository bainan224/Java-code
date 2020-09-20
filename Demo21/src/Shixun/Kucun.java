package Shixun;

import java.util.Scanner;

public class Kucun {

	public  void kucun() {
		Scanner scan= new Scanner(System.in);
		Goods goods = new Goods();
		int s = 1;
		do {
			System.out.println("------------------");
			System.out.println("\t 1.库存管理");
			System.out.println("\t 2.已出售商品");
			System.out.println("\t 0.返回上级菜单");
			System.out.println("请输入相关数字：");
			s = scan.nextInt();
			switch (s) {
			case 1:
				goods.goods();
				break;
			case 2:
				System.out.println("删除商品种类");
				break;
			case 0:
				System.out.println("返回上级菜单");
				break;
			default:
				System.out.println("请输入0-4之间的数");
			}
		} 
		while (s != 0);

	}

}
