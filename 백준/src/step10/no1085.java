package step10;

import java.util.Scanner;

public class no1085 {

	public static void main(String[] args) {
		// 직사각형에서 탈출
		// 직사각형과 점의 거리를 구하는 문제
		
		Scanner scanner = new Scanner(System.in);
		
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		System.out.println(Math.min( Math.min(x, y), Math.min(a-x, b-y) ));
		

	}

}
