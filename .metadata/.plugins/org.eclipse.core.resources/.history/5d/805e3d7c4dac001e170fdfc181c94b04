package step5;

import java.util.*;

public class no10809 {

	public static void main(String[] args) {
		// 알파벳 찾기
		// 한 단어에서 각 알파벳이 처음 등장하는 위치를 찾는 문제
		
		Scanner scanner = new Scanner(System.in);
		
		String word = scanner.next();
		
		Map<Character, Integer> wordStartPosition = new HashMap<Character, Integer>();
		
		// 각 알파벳의 처음 등장 위치 기록
		for (int i = 0; i < word.length(); i++) {
			char currentChar = word.charAt(i);
			
			// key가 존재하지 않으면 value를 해당 key에 매핑
			// key가 존재하면 현재 매핑된 값을 반환하고, value를 해당 key에 매핑
			wordStartPosition.putIfAbsent(currentChar, i);
			
		}
		
		for (char ch = 'a'; ch <= 'z'; ch++) {
			// 존재하면 해당 값 반환, 존재하지 않으면 기본값 -1 반환
			System.out.print(wordStartPosition.getOrDefault(ch, -1) + " ");
		}
		

	}

}
