package step6;

import java.util.*;

public class no1316 {

	public static void main(String[] args) {
		// 그룹 단어 체커
		// 조건에 맞는 문자열을 찾는 문제
		
		Scanner scanner = new Scanner(System.in);
		
		int number = scanner.nextInt();
		int count = 0;
		
		// 단어 number 만큼 입력
		for (int i = 0; i < number; i++) {
			if (groupWordCheck(scanner.next())) {
				count++;
			}
		}
		
		System.out.println(count);

	}
	
	public static boolean groupWordCheck(String word) {
		// 알파벳의 등장 여부를 저장할 배열
		boolean[] visited = new boolean[26];
		
		for (int i = 0; i < word.length(); i++) {
			char currentChar = word.charAt(i);
			
			if (visited[currentChar - 'a']) {
				// 현재 문자가 이미 등장한 적이 있는 경우
				if (i > 0 && word.charAt(i - 1) != currentChar) {
					return false; // 바로 이전 문자와 다르면 그룹 단어가 아님
				}
			} else {
				// 현재 문자가 처음 등장하는 경우
				visited[currentChar - 'a'] = true;
			}
		}

		
		return true; // 그룹 단어인 경우
	}

}
