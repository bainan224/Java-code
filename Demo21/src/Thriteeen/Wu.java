package Thriteeen;
import java.util.Scanner;
public class Wu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader=new Scanner(System.in);
    	
    	System.out.println("�������ļ���");
    	
    	String filename=reader.next();
    	int index=filename.indexOf(".java");
    	
    	if(filename.length()==index+".java".length()) {
    		System.out.println("�Ե�");
    	}else {
    		System.out.println("���");
    	}
    	
    	System.out.println();
    	
    	
    }
}
