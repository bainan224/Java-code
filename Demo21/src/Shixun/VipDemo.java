package Shixun;

import java.util.Scanner;

public class VipDemo {

	public  void vipDemo() {
		Scanner scan= new Scanner(System.in);
		int a = 1;
		Register  reg = new  Register();
		Login log = new Login();
		do {
		    System.out.println("----------------");
			System.out.println("\t 1.��Աע��");
		    System.out.println("\t 2.��Ա��¼");
		    System.out.println("\t 0.�����ϼ��˵�");
		    System.out.println("������������֣�");
		    a =scan.nextInt();
		    switch (a) {
		case 1:
			reg.register();
			break;
		case 2:
		     log.login();
		break;
		
		default:
			System.out.println("������0-4֮�����");
		}
		} while (a != 0);

	
	
	
	
	
	
	
	
	
	}
}