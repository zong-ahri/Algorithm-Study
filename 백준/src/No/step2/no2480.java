package No.step2;

import java.util.Scanner;

public class no2480 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int max;

		sc.close();

		if (num1 == num2 && num1 == num3) {
			System.out.printf("%d\n", 10000 + num1 * 1000);
		} else if (num1 == num2) {
			System.out.printf("%d\n", 1000 + num1 * 100);
		} else if (num1 == num3) {
			System.out.printf("%d\n", 1000 + num1 * 100);
		} else if (num2 == num3) {
			System.out.printf("%d\n", 1000 + num2 * 100);
		} else {
			if (num1 >= num2 && num1 >= num3) {
				max = num1;
			} else if (num2 >= num1 && num2 >= num3) {
				max = num2;
			} else {
				max = num3;
			}
			System.out.printf("%d\n", max * 100);
		}

	}

}
