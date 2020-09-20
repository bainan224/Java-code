package Sushe;
import java.util.Scanner;
public class Hefa {

	public static void main(String[] args) {
		int[] a = new int[] { 0, 8, 4, 2, 7, 5, 1, 9, 7, 3 };
		int HF = 0, FF = 0, i = 0;
		for (i = 0; i < a.length; i++) {
			if (a[i] == 1 || a[i] == 2 || a[i] == 3) {
				HF++;
			} else {
				FF++;
			}
		}
		System.out.println("合法数字的个数为：" + HF);
		System.out.println("非法数字的个数为：" + FF);

	}
}



