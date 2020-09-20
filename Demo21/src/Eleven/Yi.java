package Eleven;

import java.util.Scanner;

public class Yi {

	public static void main(String[] args) {
		String[] strarr=new String[] {"abc","def","ghi","xyz"};
         Scanner scan=new Scanner(System.in);
	System.out.println("ÇëÊäÈëÒªÌæ»»xyzµÄ×Ö·û´®");
	strarr[3]=scan.nextLine();
	
	for(int i=0;i<strarr.length;i++) {
	System.out.println(strarr[i]);
	}
	
	}

}
