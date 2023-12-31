package step06;

import java.util.*;

public class no2444 {

	public static void main(String[] args) {
		// 별 찍기 - 7
		
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		
		for (int i = 1; i < 2*N; i++) {
			if (i <= N) {
				drawingSpace(i, N);
				drawingStars(i);
			} else {
				drawingSpace(-i, -N);
				drawingStars(2*N-i);
			}
			
			System.out.println();
		}

	}
	
	// 공백 그리기
	private static void drawingSpace(int space, int N) {
		for (int i = 0; i < N-space; i++) {
			System.out.print("_");
		}
	}

	// 별 그리기
	private static void drawingStars(int stars) {
		for (int i = 0; i < 2 * stars - 1; i++) {
			System.out.print("*");
		}
	}
	
	

}
