package step03;

import java.util.Scanner;

public class no25304 {

	public static void main(String[] args) {

		int X;
		int N;
		int[] a;
		int[] b;
		int sum = 0;

		Scanner sc = new Scanner(System.in);

		X = sc.nextInt();
		N = sc.nextInt();
		a = new int[N];
		b = new int[N];

		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}

		sc.close();

		for (int i = 0; i < N; i++) {
			sum += a[i] * b[i];
		}

		if (X == sum) {
			System.out.printf("Yes");
		} else {
			System.out.println("No");
		}

	}

}
