package commonclass;

import java.util.Random;

public class TestMathandRandom {
	public static void main(String[]args) {
		System.out.println(Math.ceil(20.56));
		System.out.println(Math.floor(20.56));
		
		System.out.println(Math.sqrt(2));
		System.out.println(Math.pow(2, 12));
		
		System.out.println("---------------");
		
		Random random = new Random(100);
		for(int i=0;i<100;i++) {
			//System.out.println(random.nextInt(100));
			System.out.println(50*random.nextDouble());
		}
	}

}
