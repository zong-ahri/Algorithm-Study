package step09;

import java.util.*;

public class no2501 {

	public static void main(String[] args) {
		// 약수 구하기
		// 주어진 수의 약수를 구하는 문제
		
		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt(); // 숫자
		int B = scanner.nextInt(); // B번째 약수
		int count = 0; // 약수의 개수를 세는 변수
		
		// 브루트  포트 알고리즘
		for (int i = 1; i <= A; i++) {
			if (A % i == 0) {
				count++;
				
				if (count == B) {
					System.out.println(i);
					return;
				}
			}
			
		}

		// B번째 약수가 없는 경우
		System.out.println(0);
		
	}

}
