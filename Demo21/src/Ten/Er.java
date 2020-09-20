package Ten;

public class Er {

	public static void main(String[] args) {
		int sum = 0;

		for (int i = 1; i <= 1000; i++) {

			if (i % 3 != 0) {

				continue;
			}
			sum = sum + i;

			if (sum > 5000) {

				break;
			}

		}
		System.out.println("ºÍÎª£º" + sum);

	}

}
