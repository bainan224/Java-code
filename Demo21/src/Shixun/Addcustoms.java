package Shixun;

import java.util.Scanner;

public class Addcustoms {
	  public  void addcustoms(){
		  boolean flag = true;
		  Customs cus = new Customs();
		  int	fifthNum=0;String name;int id;String gender;
		while(true) {
			System.out.println("-----------");
			System.out.print("\t 按-1退出编辑");
			System.out.print("\t 按1进入编辑");
			Scanner in = new Scanner(System.in);
			int num = in.nextInt();
		if(num!=-1) {
			System.out.println("   *编号：    ");
			fifthNum=in.nextInt();
			System.out.println("   *姓名：    ");
			name=in.next();
			System.out.println("   *性别：    ");
			gender=in.next();
			System.out.println("   *卡号：    ");
			id=in.nextInt();
			flag = false;
			}else {
		      if(num==-1) {
				cus.customs();
			}
			}
		
		
		System.out.println("已成功添加！");
		
		}
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  }		
		}