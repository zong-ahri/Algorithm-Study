package step7;

import java.util.*;

public class no2566 {

	public static void main(String[] args) {
		// 최댓값
		// 최댓값을 2차원에서 찾는 문제
		
		Scanner scanner = new Scanner(System.in);
		
		int size = 9;
		
		int[][] matrix = new int[size][size];
		int maxValue = -1;
		int row = 0;
		int column = 0;
		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				matrix[i][j] = scanner.nextInt();
				if (maxValue < matrix[i][j]) {
					maxValue = matrix[i][j];
					row = i + 1;
					column = j + 1;
				}
			}
		}
		
		System.out.println(maxValue);
		System.out.println(row + " " + column);
		
	}

}
