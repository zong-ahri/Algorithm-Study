package step12;

import java.util.*;

public class no2798 {

	public static void main(String[] args) {
		// 블랙잭
		// 세 장의 카드를 고르는 모든 경우를 고려하는 문제
		
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		int[] array = new int[N];
		for (int i = 0; i < N; i++) {
			array[i] = scanner.nextInt();
		}
		int sum = 0;
		int maxSum = 0;
		
//		System.out.println(Arrays.toString(array));
//		System.out.println(M);
//		System.out.println("-----------");
		
		for (int i = 0; i < N-2; i++) {
			for (int j = i+1; j < N-1; j++) {
				for (int k = j+1; k < N; k++) {
//					System.out.println("array["+i+"]:"+array[i]+", array["+j+"]:"+array[j]+", array["+k+"]:"+array[k]);
					sum = array[i]+array[j]+array[k];
//					System.out.println(sum);
					if (sum <= M && sum >= maxSum) {
//						System.out.println(sum);
						maxSum = sum;
					}
				}
			}
		}
		
		System.out.println(maxSum);

	}

}
