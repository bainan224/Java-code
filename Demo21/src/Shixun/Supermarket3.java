package Shixun;

import java.util.Scanner;

public class Supermarket3 {
	static Scanner scan= new Scanner(System.in);
	boolean firstflag =true;
	static Administrator adm = new Administrator();
	static VipDemo  vip = new VipDemo();
	public static void main(String[] args) {
	        manageMenu();
	    }
	    
	    private static void manageMenu() {
			// TODO Auto-generated method stub

	        //��ѭ������ٴλص�������
	        while (true) {
	            //����������������ı�д
	        	System.out.println("��ӭ���뷽�۹���ϵͳ��");
				System.out.println("\t 1.��ӭ�������Աϵͳ");
				System.out.println("\t 2.��ӭ�����Ա�˿�ϵͳ ");
				System.out.println("\t 3.��ӭ��������Աϵͳ");
				System.out.println("\t 0.�˳�ϵͳ");
	            //��Scannerʵ�ּ���¼������
	            Scanner input = new Scanner(System.in);
	            String str = scan.next();
	            //��switch�����ɲ�����ѡ��
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
					System.out.println("ллʹ��,�Ѿ��˳�ϵͳ");
                    //break;
                    System.exit(0);//JVM�˳�
				default:
					System.out.println("�������");
	                    
	            }
	        }
		}
}
