package step06;

import java.util.*;

public class no1157 {

	public static void main(String[] args) {
		// 단어 공부
		// 주어진 단어에서 가장 많이 사용된 알파벳을 출력하는 문제
		
		Scanner sc = new Scanner(System.in);
		
		// 단어 대문자로 변환
		String word = sc.nextLine().toUpperCase();
//		System.out.println(word);
		
		Map<Character, Integer> mCount = new HashMap<>();
		
		// 알파벳 횟수 계산
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (mCount.containsKey(ch)) {
				mCount.put(ch, mCount.get(ch) + 1);
			} else {
				mCount.put(ch, 1);
			}
		}
//		System.out.println(mCount);
		
		
		int maxNum = 0;
		char maxChar = '?';
		
		// 가장 많이 쓴 알파벳 찾기 
		for (char key : mCount.keySet()) {
			int num = mCount.get(key);
			if (num > maxNum) {
				maxNum = num;
				maxChar = key;
			} else if (num == maxNum) {
				maxChar = '?';
			}
			
		}
//		System.out.println(maxNum);
		System.out.println(maxChar);

	}

}
