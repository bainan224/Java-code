package Eight;

public class Qi {

	public static void main(String[] args) {
		double s = 0;
		int t = 1;
		double h = s * 9 / 5.0 + 32;

		do {
			s = s + 20;
			t = t + 1;
			System.out.println("���϶�Ϊ��" + s);
			System.out.println("��ĿΪ��" + t);
			System.out.println("���϶�Ϊ��" + h);

		} while (t < 10 && s <= 250);
		System.out.println("����!");

	}

}
