package Sushe;
	import java.util.Scanner;
public class Jiayue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              Scanner scan=new Scanner(System.in);
				System.out.println("请输入生日信息：");
				String birthdate=scan.next();
				int month;
				int days;
				boolean TwoNum;
				boolean TwoNum1;
			
				do {
				    String[] strarr=birthdate.split("/");
				    TwoNum=strarr[0].matches("\\d{2}");
				    month=Integer.parseInt(strarr[0]);
				
				    TwoNum1=strarr[0].matches("\\d{2}");
				    days=Integer.parseInt(strarr[0]);
				if(TwoNum&&TwoNum1) {
				if(month<=12&&days<=31) {
					break;
					}
				}
					System.out.println("你输入错了，请重新输入:");
					birthdate=scan.next();
				}while(true);
					System.out.println("正确");
					
				}
				
				
			}