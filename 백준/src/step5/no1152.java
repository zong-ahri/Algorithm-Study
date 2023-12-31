package step5;

import java.util.*;

public class no1152 {

	public static void main(String[] args) {
		// 단어의 개수
		// 단어의 개수를 구하는 문제
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine().trim();	// 문자열 앞뒤 공백 제거
		
		// 입력된 문자열이 비어있으면 0 출력
		if (str.isEmpty()) {
			System.out.println(0);
			return;
		}

		String[] words = str.split(" ");		// 문자열을 공백을 기준으로 분리
		
		System.out.println(words.length);

	}

}
