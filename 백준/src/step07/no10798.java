package step07;

import java.util.*;

public class no10798 {

	public static void main(String[] args) {
		// 세로읽기
		// 문자열의 배열을 다루는 문제
		
		Scanner scanner = new Scanner(System.in);
		
		String[] words = new String[5];
		int maxWord = 0;
		
		// 1차원 배열
		for (int i = 0; i < 5; i++) {
			words[i] = scanner.nextLine();
			if (maxWord < words[i].length()) {
				maxWord = words[i].length();
			}
		}
//		System.out.println(Arrays.toString(words));

		// 1차원 배열 2차원 배열 만들기
		String[][] deepWords = new String[5][maxWord];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < words[i].length(); j++) {
				deepWords[i][j] = words[i].split("")[j];
			}
		}
		
//		System.out.println(Arrays.deepToString(deepWords));
		
		for (int i = 0; i < maxWord; i++) {
			for (int j = 0; j < deepWords.length; j++) {
				if (deepWords[j][i] != null)
					System.out.print(deepWords[j][i]);
			}
		}
		
	}

}
