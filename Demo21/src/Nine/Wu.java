package Nine;

public class Wu {

	public static void main(String[] args) {
		boolean flag = true;
		for (int i = 0, s = 0; i <= 10; i++, s = s + i) {
			System.out.println("��ǰֵΪ��" + i);
			if (s > 20) {
				System.out.println("������");
				flag = false;
				break;
			}
			if (flag == true) {
				System.out.println("�ۼ�ֵΪ��" + s);
			}
		}

	}
}
