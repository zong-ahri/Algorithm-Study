package step9;

import java.util.*;

public class no11653 {

	public static void main(String[] args) {
		// 소인수분해
		// N을 소인수분해하는 문제
		
		Scanner scanner = new Scanner(System.in);
		
		List<Integer> array = new ArrayList<>();
		
		int number = scanner.nextInt();
		int quotient; // 몫
		
		if (number > 1) {
			for (int i = 1; i < number; i++) {
				if (number % i == 0) {
					number /= i;
				}
			}
		}

	}

}
