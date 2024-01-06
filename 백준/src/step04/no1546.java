package step04;

import java.util.Scanner;

public class no1546 {

	public static void main(String[] args) {
		// 평균
		// 평균을 조작하는 문제

		// 최댓값 M
		// 모든 점수를 점수/M *100
		
		Scanner scanner = new Scanner(System.in);
		
		// 기말 점수 배열 선언
		int size = scanner.nextInt();
		int[] scores = new int[size];
		for (int i = 0; i < scores.length; i++) {
			scores[i] = scanner.nextInt();
		}
		
		// 기말 점수 최대값 구하기
		int maxValue = scores[0];
		for (int i = 0; i < scores.length; i++) {
			if (maxValue < scores[i])
				maxValue = scores[i];
		}


		// 성적 고치기
		double sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += (double)scores[i] / maxValue * 100;
		}
		
		
		System.out.println(sum / size);
	}

}
