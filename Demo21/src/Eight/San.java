package Eight;

public class San {
	public static void main(String[] args) {

		double l = 1000;
		int t = 0;

		while (l > 5) {
			l = l / 2;

			System.out.println("第" + t + "天的长度为:" + l);
			t++;
		}
		System.out.println(t);

	}
}