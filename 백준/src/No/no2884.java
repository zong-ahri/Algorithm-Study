package No;

import java.util.Scanner;

public class no2884 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int H = sc.nextInt();
		int M = sc.nextInt();

		sc.close();

		if (H == 0 && M < 45) {
			System.out.printf("%d %d\n", H + 23, M + 15);
		} else if (H == 0 && M >= 45) {
			System.out.printf("%d %d\n", H, M - 45);
		} else if (H != 0 && M < 45) {
			System.out.printf("%d %d\n", H - 1, M + 15);
		} else if (H != 0 && M >= 45) {
			System.out.printf("%d %d\n", H, M - 45);
		}

	}

}
