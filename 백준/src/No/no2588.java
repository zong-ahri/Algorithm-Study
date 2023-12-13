package No;

import java.util.Scanner;

public class no2588 {

	public static void main(String[] args) {

		int num1;
		int num2;

		Scanner sc = new Scanner(System.in);

		num1 = sc.nextInt();
		num2 = sc.nextInt();

		String temp = Integer.toString(num2);
		int[] digits = new int[temp.length()];
		for (int i = 0; i < temp.length(); i++)
			digits[i] = temp.charAt(i) - '0';
//		System.out.println(Arrays.toString(digits)); // [3, 8, 5]

		int text1 = num1 * digits[2];
		int text2 = num1 * digits[1];
		int text3 = num1 * digits[0];
		int text4 = text1 + text2 * 10 + text3 * 100;

		System.out.println(text1);
		System.out.println(text2);
		System.out.println(text3);
		System.out.println(text4);

	}

}
