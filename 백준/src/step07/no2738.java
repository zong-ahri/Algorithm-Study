package step07;

import java.util.*;

public class no2738 {

	public static void main(String[] args) {
		// 행렬 덧셈
		// 행렬을 2차원 배열로 만들어 더하는 문제
		
		Scanner scanner = new Scanner(System.in);
		
		int column = scanner.nextInt(); // 행
		int row = scanner.nextInt(); // 열
		
		int[][] matrix1 = new int[row][column];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				matrix1[i][j] = scanner.nextInt();
			}
		}
		
		
		int[][] matrix2 = new int[row][column];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				matrix2[i][j] = scanner.nextInt();
			}
		}
		
		matrixSum(matrix1, matrix2);
		
	}

	// 행렬 덧셈 함수
	private static void matrixSum(int[][] matrix1, int[][] matrix2) {
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1[i].length; j++) {
				System.out.print(matrix1[i][j] + matrix2[i][j]);
				if (j < matrix1[i].length - 1) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
