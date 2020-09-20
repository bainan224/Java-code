package Sushe;

public class Fu {

	public static void main(String[] args) {
		double[] FDS;
				FDS = new double[] { 1.2, 7.8, -5.6, 4.8, -6.4 };

				for (int i = 0, j = FDS.length - 1;
						i < FDS.length && j >= 0; i++, j--) {
					if (FDS[j] < 0) {
						FDS[j] = 0;
					}
					System.out.println(FDS[j]);
				}

			}

		


	}


