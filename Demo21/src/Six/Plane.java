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
			System.out.println("����,���ò��ۼ�" + ds);
			System.out.println("����,������ۼ�" + dm);
		} else if (y > 5 && y <= 10 || y >= 12 && y < 2) {
			System.out.println("����,���ò��ۼ�" + wm);
			System.out.println("����,������ۼ�" + ws);
		}

	}

}
