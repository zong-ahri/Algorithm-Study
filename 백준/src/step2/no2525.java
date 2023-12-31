package step2;

import java.util.Scanner;

public class no2525 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		sc.close();

//		System.out.printf("%d %d %d\n", A, B, C);

		if (A + ((B + C) / 60) >= 24 && B + C >= 60) {
			System.out.printf("%d %d\n", (A + ((B + C) / 60)) % 24, (B + C) % 60);
		} else if (A + ((B + C) / 60) >= 24 && B + C < 60) {
			System.out.printf("%d %d\n", (A + ((B + C) / 60)) % 24, (B + C) % 60);
		} else if (A + ((B + C) / 60) < 24 && B + C >= 60) {
			System.out.printf("%d %d\n", A + ((B + C) / 60), (B + C) % 60);
		} else if (A + ((B + C) / 60) < 24 && B + C < 60) {
			System.out.printf("%d %d\n", A + ((B + C) / 60), (B + C) % 60);
		}

	}

}
