package step04;

import java.util.Scanner;

public class no10811 {

	public static void main(String[] args) {
		// 바구니 뒤집기
		// 배열을 뒤집는 문제
		
		Scanner scanner = new Scanner(System.in);
		
		int size = scanner.nextInt();	// 바구니 갯수
		int[] N = new int[size+1];		// 바구니 배열
		int[] reversArray = new int[size+1];	// 바구니 역순한 배열
		for (int i = 1; i < size+1; i++) {		// 바구니 초기화
			N[i] = i;
			reversArray[i] = i;
		}
		
		
		int M = scanner.nextInt();		// 역순 횟수
		
		for (int m = 0; m < M; m++) {	// M번 역순
			int i = scanner.nextInt();
			int j = scanner.nextInt();
			for (int a = i, b = j; a < j+1; a++, b--) {	// i부터 j까지 역순
				reversArray[a] = N[b];
			}
			for (int a = 1; a < size+1; a++) {		// 바구니 초기화
				N[a] = reversArray[a];
			}
			
			
		}
		
		for (int i = 1; i < size+1; i++) {
			System.out.print(reversArray[i] + " ");
		}

	}

}
