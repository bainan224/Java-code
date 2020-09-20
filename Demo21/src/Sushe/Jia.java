package Sushe;

public class Jia {

	public static void main(String[] args) {
		double s = 0;
		double i = 1;

		while (i <= 50) {
			if (i % 7 == 0) {
				s = s + i;

			}

			i++;

		}
		System.out.println("±¶ÊýºÍÎª£º" + s);
	}

}
