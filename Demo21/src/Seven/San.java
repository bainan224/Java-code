package Seven;

import java.util.Scanner;

public class San {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ÇëÊäÈëºÅÂë£º");
		int i = scan.nextInt();
		switch (i) {
		case 1:
			System.out.println("²¥°Ö°ÖµÄºÅ");
			break;

		case 2:
			System.out.println("²¥ÂèÂèµÄºÅ");
			break;

		case 3:
			System.out.println("²¥Ò¯Ò¯µÄºÅ");
			break;

		case 4:
			System.out.println("²¥ÄÌÄÌµÄºÅ");
			break;

		default:
			System.out.println("ÎŞ");

		}

	}
}