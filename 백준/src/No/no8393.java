package No;

import java.util.Scanner;

public class no8393 {

	public static void main(String[] args) {

		int n;
		int sum = 0;

		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();

		sc.close();

		for (int i = 1; i < n + 1; i++) {
			sum += i;
		}

		System.out.printf("%d", sum);

	}

}
