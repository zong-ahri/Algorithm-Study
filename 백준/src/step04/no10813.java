package step04;

import java.util.Scanner;

public class no10813 {

	public static void main(String[] args) {
		// 공 바꾸기
		
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		
		// 바구니 초기화
		int[] baskets = new int[N+1];
		for (int i = 1; i < N+1; i++) {
			baskets[i] = i;
		}
		
		// M번 공 바꾸기
		for (int m = 0; m < M; m++) {
			int i = scanner.nextInt();
			int j = scanner.nextInt();
			int temp;
			
			temp = baskets[i];
			baskets[i] = baskets[j];
			baskets[j] = temp;
		}
		
		// 출력 값 
		for (int i = 1; i < N+1; i++) {
			System.out.print(baskets[i] + " ");
		}

	}

}
