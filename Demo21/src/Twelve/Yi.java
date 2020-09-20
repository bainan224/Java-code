package Twelve;

public class Yi {

	public static void main(String[] args) {
		int[][] arr2D=new int[10][5];
          for(int i=0;i<arr2D.length;i++) {
        for(int j=0;j<arr2D[0].length;j++) {
        	arr2D[i][j]=(int)(100*Math.random());

        
        }	  
	}
          System.out.println(arr2D);
	System.out.println(arr2D[9]);
	System.out.println(arr2D[9][4]);
	
	//二维数组的遍历
	//第一层，遍历的是，指向一维int型数组的每个引用
	for(int[] row:arr2D) {
	//第二层，遍历的是，一维引用指向每个元素
		for(int element:row) {
		
		
		System.out.print(" "+element);
	}
	//换行
		System.out.println();
	
	
	
	
	
	}
	
}
}