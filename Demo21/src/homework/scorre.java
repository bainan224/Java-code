package homework;
import java.util.Scanner;
public class scorre {
	
	
	public static void main(String[] args) {
    int iScoreofZh=85;
	Scanner scan= new Scanner((System.in));
	System.out.println("����������ͬѧ�ĳɼ�");
	int iScoreofLi=scan.nextInt();
	boolean bRes=iScoreofLi>iScoreofZh;
	System.out.println("lisi�ĳɼ�"+iScoreofLi+
			",���������ĳɼ���?"+bRes);
		if(bRes) {
			System.out.println("���ĵĳɼ���������");
		}else {
			System.out.println("�����ĳɼ���������");
		}
	
	scan.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
} 