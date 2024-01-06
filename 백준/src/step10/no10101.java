package step10;

import java.util.*;

public class no10101 {

	public static void main(String[] args) {
		// 삼각형 외우기
		// 각도를 보고 삼각형을 판별하고 분류하는 문제
		
		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		
		if (A == 60 && B == 60 && C == 60) {
			System.out.println("Equilateral");
		} else if (A+B+C == 180 && (A == B || A == C || B == C)) {
			System.out.println("Isosceles");
		} else if (A+B+C == 180 && (A != B && A != C && B != C)) {
			System.out.println("Scalene");
		} else {
			System.out.println("Error");
		}

	}

}
