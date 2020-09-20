package homework;
import java.util.Scanner;
public class classwork {

    public static void main(String[] args) {
 
    	Scanner scan=new Scanner(System.in);
    	System.out.println("days");
        int days=scan.nextInt();
        
        
        days=46;
        int week=days/7;
        int leftDay=days%7;
        
        System.out.println("天数"+days);
        System.out.println("星期"+week);
        System.out.println("剩余的天数"+leftDay);
    	

         double pi=3.14159;
         double radius=1.5;
         double area=pi*radius*radius;
    
         System.out.println("圆周率"+pi);
         System.out.println("半径"+radius);
         System.out.println("计算圆面积"+area);
    
    
    }

}













