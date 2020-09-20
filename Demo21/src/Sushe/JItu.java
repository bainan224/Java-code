package Sushe;

public class JItu {

	public static void main(String[] args) {
		int j, t;
		
		for (j = 0; j < 35; j++) {
			t = 35 - j;
			if (2 * j + 4 * t == 94) {
				System.out.println("鸡的数目为：" + j);
				System.out.println("兔的数目为：" + t);
				break;

			}

		}
	}

}
