package step04;

import java.util.Scanner;

public class no10810 {

	public static void main(String[] args) {
		// 공 넣기
		
		Scanner scanner = new Scanner(System.in);
		
		// N, M 입력 받기
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		
		// 바구니 배열 초기화
		int[] baskets = new int[N + 1];
		
		// M번 공을 넣기
		for (int m = 0; m < M; m++) {
			int start = scanner.nextInt();
			int end = scanner.nextInt();
			int ball = scanner.nextInt();
			
			// 공을 넣는 과정
			for (int i = start; i <= end; i++) {
				baskets[i] = ball;
			}
			
		}
		
		// 결과 출력
		for (int i = 1; i <= N; i++) {
			System.out.print(baskets[i] + " ");
		}

	}

}
