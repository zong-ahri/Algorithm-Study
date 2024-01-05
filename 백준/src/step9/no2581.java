package step9;

import java.util.*;

public class no2581 {

	public static void main(String[] args) {
		// 소수
		// 2부터 X-1까지 모두 나눠서 X가 소수인지 판별하는 문제 2
		
		Scanner scanner = new Scanner(System.in);

		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int minValue = Integer.MAX_VALUE;
		int sum = 0;
		int count;
		
		for (int i = A; i <= B; i++) {
			count = 0;
			
//			System.out.println("숫자: " + i);
			
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			
			if (count == 1) {
//				System.out.println("소수= " + i);
				sum += i;
				if (i < minValue) {
					minValue = i;
				}
			} 
		}
		
		if (sum == 0) {
			minValue = -1;
			System.out.println(minValue);
		} else {
			System.out.println(sum);
			System.out.println(minValue);
		}
		
	}

}
