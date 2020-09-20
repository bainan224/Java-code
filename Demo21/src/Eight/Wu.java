package Eight;


import java.util.Scanner;

public class Wu {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	int productNo=0;
	String str="y";
	str=scan.next();
	while(str.equals("y")) {
	System.out.println("请输入商品编号：");
	productNo=scan.nextInt();
	switch(productNo) {
	case 1:
	System.out.println("苹果的价格为五元每斤");
	break;
	case 2:
		System.out.println("香蕉的价格为六元每斤");
		break;
	case 3:
		System.out.println("橙子的价格为四元每斤");
		break;
	default:
		System.out.println("查无此编号");
		break;
	}
	}
	}
}