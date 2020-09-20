package Six;

public class Plane {

	public static void main(String[] args) {
		int y = 8;
		double m = 1000;
		double s = 500;
		double dm = m * 0.7;
		double ds = s * 0.7;
		double wm = m * 0.9;
		double ws = s * 0.9;
		if (y <= 5 && y >= 2 || y > 10 && y <= 12) {
			System.out.println("淡季,经济舱售价" + ds);
			System.out.println("淡季,商务舱售价" + dm);
		} else if (y > 5 && y <= 10 || y >= 12 && y < 2) {
			System.out.println("旺季,经济舱售价" + wm);
			System.out.println("旺季,商务舱售价" + ws);
		}

	}

}
