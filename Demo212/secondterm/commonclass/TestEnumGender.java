package commonclass;

import java.util.Random;

public class TestEnumGender {
	public static void main(String[]args) {
		Random rand = new Random();
		Gender gd = null;
		for(int i=0;i<100;i++) {
			int temp=rand.nextInt(100);
			if(temp%2==0) {
				gd=Gender.WOMEN;
			}else {
				gd=Gender.MEN;
			}
			switch(gd) {
			case WOMEN:
				System.out.println("Å®Ê¿");
			case MEN:
				System.out.println("ÄÐÊ¿");
			
			}
		}
	}

}
