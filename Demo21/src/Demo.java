import java.util.ArrayList;

public class Demo {
	public static void main(String[] args) {
		String[] arr = new String[2];

		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(1);
		arr[0] = "1";
		array.add(2);
		arr[1] = "2";
		System.out.println(array);
		array.add(3);
		arr[2] = "3";
		System.out.println(array);
		System.out.println(arr[2]);
	}
}
