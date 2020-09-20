package Eight;

import java.util.Scanner;

public class Ba {
	public static void main(String[] args) {
    boolean l=false;
    Scanner scan = new Scanner(System.in);
	int i=0;
    do {
    l=false;
    System.out.println("目录：");
    System.out.println("\t 1.客户信息管理");
    System.out.println("\t 2.购物结算");
    System.out.println("\t 3.真情回馈");
    System.out.println("\t 4.注销");
	System.out.println("请输入序号：");
    i=scan.nextInt();
	switch(i) {
	case 1:
	System.out.println("客户信息管理");
	break;
	case 2:
		System.out.println("购物结算");
		break;
	case 3:
		System.out.println("真情回馈");
		break;
	
	case 4:
		System.out.println("注销");
		break;
	default:
		System.out.println("输入错误，请重新输入：");
	l=true;
	break;
	}
	}
   while(l==true) ;
	
	
    }
}
