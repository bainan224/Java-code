package Shixun;
import java.util.Scanner;

import Sushe.Car;
public class Supermarket {
 public static void main(String[] args) {
			Scanner scan= new Scanner(System.in);
			String str ="y";
			boolean firstflag =true;
			Administrator adm = new Administrator();
			VipDemo  vip = new VipDemo();
			do {
			System.out.println("��ӭ���뷽�۹���ϵͳ��");
			System.out.println("\t 1.��ӭ�������Աϵͳ");
			System.out.println("\t 2.��ӭ�����Ա�˿�ϵͳ ");
			System.out.println("\t 3.��ӭ��������Աϵͳ");
			System.out.println("\t 0.�˳�ϵͳ");
			str = scan.next();
			switch (str) {
			case "1":
				adm.administrator();
				
				break;
			case "2":
				vip.vipDemo();
				break;
			case "3":
				
				break;
			case "0":
				firstflag =false;
				break;
			default:
				System.out.println("�������");
			}

		}while(!str.equals("0"));
	System.out.println("�Ѿ��˳�ϵͳ");
	}
		
	}

		
		
		






























