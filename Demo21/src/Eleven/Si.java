package Eleven;

public class Si {

	public static void main(String[] args) {
		int[] scores = new int[7];
		scores[0] = 90;
		scores[1] = 85;
		scores[2] = 82;
		scores[3] = 70;
		scores[4] = 60;

		int insertedscore = 75;
		int index = 0;
		for (int i = 0; i < scores.length; i++) {
			if (insertedscore > scores[i]) {
				index = i;
				break;
			}
		}
		for (int i = scores.length - 2; i > index; i--) {
			scores[i + 1] = scores[i];

		}
		scores[index] = insertedscore;

		for (int x : scores) {
			System.out.println(" " + x);
		}

	}

}
