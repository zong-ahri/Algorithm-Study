package step12;

import java.util.Scanner;

public class no2839 {

	public static void main(String[] args) {
		// 설탕 배달
		// 한때는 이 문제가 "기본 수학 1" 단계에 있었지만, 사실 브루트 포스로 푸는 게 더 쉽습니다.
		
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		int big = 5;
		int small = 3;
		int minValue = N;
		
		Loop1:
		for (int i = 0; i <= N/small; i++) {
			for (int j = 0; j <= N/big; j++) {
				if (i*small+j*big == N) {
					if (minValue > i+j) {
						minValue = i+j;
						break Loop1;
					} 
				}
			}
		}
		
		if (minValue == N) {
			minValue = -1;
		}
		
		System.out.println(minValue);

	}

}
