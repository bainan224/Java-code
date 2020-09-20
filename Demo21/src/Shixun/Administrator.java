package Shixun;

import java.util.Scanner;
public class Administrator {
public void administrator() {
	Scanner scan= new Scanner(System.in);
	Scanner  reader= new Scanner(System.in);
	String username=null,password=null;
	String username1="abcd";
	String password1="123456";
	boolean flag = true;
	do {
	   System.out.println("请输入用户名：");
	   username=reader.next();
	   System.out.println("请输入密码：");
	   password = reader.next();
		   if(username.equals(username1)&& password.equals(password1)) {
		     System.out.println("登入成功!"); 
		     flag = false;
		   }else {
		     System.out.println("用户名或密码输入错误，请重新输入:");
		   }
		        
}while(flag);
	
	
	int secondNum = 1;
    Customs cus = new Customs();
	Kucun ku = new Kucun();
    Income income = new Income();
	do {
    System.out.println("----------------");
	System.out.println("\t 1.客户信息管理");
    System.out.println("\t 2.仓库商品管理");
    System.out.println("\t 3.收入明细");
    System.out.println("\t 3.真情回馈");
    System.out.println("\t 4.");
    System.out.println("\t 0.反回上级菜单");
    System.out.println("请输入相关数字：");
    secondNum =scan.nextInt();
    switch (secondNum) {
case 1:
	cus.customs();
	break;
case 2:
     ku.kucun();
break;
case 3:
     income.income();
break;
case 4:
	System.out.println();
break;
case 0:
	System.out.println("返回上级菜单");
	break;
default:
	System.out.println("请输入0-4之间的数");
}
} while (secondNum != 0);
	}


}








