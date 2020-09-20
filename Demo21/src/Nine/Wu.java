package Nine;

public class Wu {

	public static void main(String[] args) {
		boolean flag = true;
		for (int i = 0, s = 0; i <= 10; i++, s = s + i) {
			System.out.println("当前值为：" + i);
			if (s > 20) {
				System.out.println("结束！");
				flag = false;
				break;
			}
			if (flag == true) {
				System.out.println("累加值为：" + s);
			}
		}

	}
}
