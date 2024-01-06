package step5;

import java.util.*;

public class no2675 {

	public static void main(String[] args) {
		// 문자열 반복
		// 각 문자를 반복하여 출력하는 문제
		
		Scanner scanner = new Scanner(System.in);
		
		int T = scanner.nextInt();
		
		String[] ary = new String[T];
		
		// T:케이스개수, R:반복횟수, S:문자열
		for (int i = 0; i < T; i++) {	// 2개의 테스트 케이스 생성
			int R = scanner.nextInt();		// 반복횟수 3번
			String S = scanner.next();			// ABC
			
			ary[i] = "";		// 배열 초기화
			
			for (int j = 0; j < S.length(); j++) {	// S 크기만큼 반복
				for (int k = 0; k < R; k++) {		// 3번 반복
					ary[i] += S.charAt(j);
				}
			}
			
		}
		
		for (int i = 0; i < T; i++) {
			System.out.println(ary[i]);
		}
	}

}
