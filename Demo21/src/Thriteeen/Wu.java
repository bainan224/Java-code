package Thriteeen;
import java.util.Scanner;
public class Wu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader=new Scanner(System.in);
    	
    	System.out.println("请输入文件名");
    	
    	String filename=reader.next();
    	int index=filename.indexOf(".java");
    	
    	if(filename.length()==index+".java".length()) {
    		System.out.println("对的");
    	}else {
    		System.out.println("错的");
    	}
    	
    	System.out.println();
    	
    	
    }
}
