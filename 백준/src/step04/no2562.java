package step04;

import java.util.Scanner;

public class no2562 {

	public static void main(String[] args) {
		// 최댓값
		
		Scanner scanner = new Scanner(System.in);
		
		// 9개의 자연수 입력받기
		int[] numbers = new int[9];
		
		for (int i = 0; i < 9; i++) {
			numbers[i] = scanner.nextInt();
		}
		
		// 최댓값과 해당 인덱스 찾기
		int maxVal = Integer.MIN_VALUE;
		int maxIndex = 0;
		
		for (int i = 0; i < 9; i++) {
			if (numbers[i] > maxVal) {
				maxVal = numbers[i];
				maxIndex = i + 1;
			}
		}
		
		System.out.println(maxVal);
		System.out.println(maxIndex);

	}

}
