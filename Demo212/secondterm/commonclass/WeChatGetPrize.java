package commonclass;

import java.util.Random;

public class WeChatGetPrize {
	public static void main(String[]args) {
		int[] weight = new int[50];
		
		Random rd = new Random();
		int sum = 0;
		for(int i=0;i<weight.length;i++) {
			weight[i]=rd.nextInt(100);
			sum+=weight[i];
		}
		
		for (int i=0;i<weight.length;i++) {
			double prize=Math.floor((double)weight[i]/(double)sum*10.0*100)/100;
			System.out.println(prize);
		}
	}

}
