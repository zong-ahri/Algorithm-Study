package step8;

import java.util.Scanner;

public class no2903 {

	public static void main(String[] args) {
		// 중앙 이동 알고리즘
		// 둘씩 반복해서 나눴을 때 점의 개수를 세는 문제
		
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int sum = 2;
		
		
		for (int i = 0; i < n; i++) {
			sum += (int)Math.pow(2, i);
		}
		
		System.out.println((int)Math.pow(sum, 2));
		
	}

}
