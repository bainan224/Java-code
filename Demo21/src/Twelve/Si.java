package Twelve;

public class Si {

	public static void main(String[] args) {
		//直接赋值
		double[][] scores= {
				{12,40.5,90},
				{1,2,5.0},
				{98,60,52},
				{5,20,90}};
				
				
				
		//第二种数组初始化
		scores=new double[5][3];
		scores[0][1]=56.0;
		//第三种初始化过程
		scores=new double[5][];
		scores[0]=new double[3];
		scores[0][2]=90;
		
		
		//随机生成一个3或4
		for(int i=0;i<scores.length;i++) {;
		int rd=(int)(2*Math.random()+3);
		System.out.println(rd);
		scores[i]=new double[rd];
		}
	
	
	
	
	
	
	}

}
