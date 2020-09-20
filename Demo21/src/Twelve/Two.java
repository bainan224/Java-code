package Twelve;

import java.util.Scanner;

public class Two {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
           System.out.print("请输入行数：");
            int rows=scan.nextInt();
   int[][] yanghui=new int[rows][];
     for(int i=0;i<yanghui.length;i++) {
	  yanghui[i]=new int[i+1];
	  for(int j=0;j<yanghui[i].length;j++) {
		if(j==0||j==yanghui[i].length-1) {
			yanghui[i][j]=1;
		}
		else {
			yanghui[i][j]=yanghui[i-1][j-1]+yanghui[i-1][j];
		}
	System.out.print(" "+yanghui[i][j]);
	  
	  
	  }

	



      System.out.println();
//使用增强型for循环
      for(int[] row:yanghui) {
for(int element:row) {
System.out.print(" "+element);     
}

System.out.println();
}

}
	}

}
