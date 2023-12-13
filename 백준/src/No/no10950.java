package No;

import java.util.Scanner;

public class no10950 {

	public static void main(String[] args) {

		int T = 0;
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
			System.out.printf("%d\n", A[i] + B[i]);
		}

		sc.close();

	}

}
