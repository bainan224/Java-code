package Eight;

public class San {
	public static void main(String[] args) {

		double l = 1000;
		int t = 0;

		while (l > 5) {
			l = l / 2;

			System.out.println("��" + t + "��ĳ���Ϊ:" + l);
			t++;
		}
		System.out.println(t);

	}
}