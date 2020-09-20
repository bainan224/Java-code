package homework;
import java.util.Scanner;
public class scorre {
	
	
	public static void main(String[] args) {
    int iScoreofZh=85;
	Scanner scan= new Scanner((System.in));
	System.out.println("请输入李四同学的成绩");
	int iScoreofLi=scan.nextInt();
	boolean bRes=iScoreofLi>iScoreofZh;
	System.out.println("lisi的成绩"+iScoreofLi+
			",大于张三的成绩吗?"+bRes);
		if(bRes) {
			System.out.println("李四的成绩好于张三");
		}else {
			System.out.println("张三的成绩好于李四");
		}
	
	scan.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
} 