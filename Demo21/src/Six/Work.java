package Six;

public class Work {
	public static void main(String[] args) {
		int x = 10;
		if (x > 0 && x < 3) {
			System.out.println(1);
		} else if (x >= 3 && x < 5) {
			int b = 2 * x;
			System.out.println("Êä³öy=" + b);
		} else if (x > 5) {
			int c = x * x + 5 * x + 1;
			System.out.println("Êä³öy=" + c);
		}

	}
}