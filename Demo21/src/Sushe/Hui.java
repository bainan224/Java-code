package Sushe;

import java.util.Scanner;

public class Hui {
	public static void main(String[] args) {
		boolean l = true;
		Scanner scan = new Scanner(System.in);

		do {

			System.out.println("请输入数字：");
			int i = scan.nextInt();
			switch (i) {
			case 0:
				System.out.println("Exit");
				l = false;
				break;

			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			case 7:
				System.out.println("Sunday");
				break;
			default:
				System.out.println("输入错误，请重新输入：");
				l = true;

			}
		} while (l == true);
	}
}
