package Seven;

import java.util.Scanner;

public class Wu {
	public static void main(String[] args) {
		Scanner scan;
		scan = new Scanner(System.in);
		System.out.println("学习星期计划：");
		System.out.println("\t p1:周一、周四");
		System.out.println("\t p2:周二、周三、周五、周六");
		System.out.println("\t p3:星期天");
		System.out.println("请选择星期几：");
		String str = scan.next();
		switch (str) {
		case "p1":
			System.out.println("学习Java");
			break;
		case "p2":
			System.out.println("学习数学和英语");
			break;
		case "p3":
			System.out.println("休息");
			break;
		default:
			System.out.println("不在计划内");
			break;
		}
	}
}