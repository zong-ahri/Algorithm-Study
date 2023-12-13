package No;

import java.util.Scanner;

public class no25314 {

	public static void main(String[] args) {

		int N;
		int count;

		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();

		sc.close();

		count = N / 4;

		for (int i = 0; i < count; i++) {
			System.out.printf("long ");
		}

		System.out.println("int");
	}

}
