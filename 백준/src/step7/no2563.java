package step7;

import java.util.*;

public class no2563 {

	public static void main(String[] args) {
		// 색종이
		// 2차원 배열을 활용하여 색종이로 평면을 덮는 문제
		
		Scanner scanner = new Scanner(System.in);
		
		boolean[][] white = new boolean[100][100];
		int count = 0;
		
		int size = scanner.nextInt();
		
		// 검은색 색종이 붙이기
		for (int n = 0; n < size; n++) {
			int row = scanner.nextInt();
			int column = scanner.nextInt();
			
			for (int i = row; i < row+10; i++) {
				for (int j = column; j < column+10; j++) {
					white[i][j] = true;
				}
			}
		}
		
		// 검은색 색종이 면적 계산
		for (int i = 0; i < white.length; i++) {
			for (int j = 0; j < white[i].length; j++) {
				if (white[i][j] == true) {
					count++;
				}
//				System.out.print(white[i][j]);
			}
//			System.out.println();
		}
		System.out.println(count);

	}

}
