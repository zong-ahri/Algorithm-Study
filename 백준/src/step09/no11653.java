package step09;

import java.util.*;

public class no11653 {

	public static void main(String[] args) {
		// 소인수분해
		// N을 소인수분해하는 문제
		
		Scanner scanner = new Scanner(System.in);
		
		int number = scanner.nextInt();
//		System.out.println("first number: " + number);
		
		
		for (int i = 2; i <= number; i++) {
			if (number%i == 0) {
				System.out.println(i);
				number = number/i;
//				System.out.println("number: " + number);
				i = i-1;
			} 
		}

	}

}
