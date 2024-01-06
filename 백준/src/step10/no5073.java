package step10;

import java.util.*;

public class no5073 {

	public static void main(String[] args) {
		// 삼각형과 세 변
		// 변의 길이를 보고 삼각형을 판별하고 분류하는 문제
		
		Scanner scanner = new Scanner(System.in);
		List<String> array = new ArrayList<>();
		
		while (true) {
			int A = scanner.nextInt();
			int B = scanner.nextInt();
			int C = scanner.nextInt();
			int max = Math.max(A, Math.max(B, C));
//			System.out.println("가장 긴 변의 길이: " + max);
			

			if (A==0 && B==0 && C==0) {
				break;
			} else if (max >= A+B+C-max) {
				array.add("Invalid");
			} else {
				if (A == B && A == C) {
					array.add("Equilateral");
				} else if (A == B || A == C || B == C) {
					array.add("Isosceles");
				} else {
					array.add("Scalene ");
				}
			}
				
		}
		
		for (int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i));
		}

	}

}
