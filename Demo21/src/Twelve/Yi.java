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
	
	//��ά����ı���
	//��һ�㣬�������ǣ�ָ��һάint�������ÿ������
	for(int[] row:arr2D) {
	//�ڶ��㣬�������ǣ�һά����ָ��ÿ��Ԫ��
		for(int element:row) {
		
		
		System.out.print(" "+element);
	}
	//����
		System.out.println();
	
	
	
	
	
	}
	
}
}