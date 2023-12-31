package step3;

import java.util.Scanner;

public class no11022 {

	public static void main(String[] args) {

		int T;
		int[] A;
		int[] B;

		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		A = new int[T];
		B = new int[T];

		for (int i = 0; i < T; i++) {
			A[i] = sc.nextInt();
			B[i] = sc.nextInt();
		}

		for (int i = 0; i < T; i++) {
			System.out.printf("Case #%d: %d + %d = %d\n", i + 1, A[i], B[i], A[i] + B[i]);
		}

	}

}
