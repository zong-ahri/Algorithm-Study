package step6;

import java.util.*;

public class no2941 {

	public static void main(String[] args) {
		// 크로아티아 알파벳
		// 두세 문자가 한 글자로 묶일 수 있을 때 글자의 수를 세는 문제
		
		Scanner scanner = new Scanner(System.in);
		
		// 단어 입력
		String inputWord = scanner.nextLine();

		// 크로아티아 알파벳 문자열 배열
		String[] croatianAlphabet = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		// 크로아티아 알파벳 검색
		for (String alphabet : croatianAlphabet) {
			if (inputWord.contains(alphabet)) {
				inputWord = inputWord.replace(alphabet, " "); // 크로아티아 알파벳 크기를 1로 만듬
			}
		}
		
		// 출력
		System.out.println(inputWord.length());

	}

}
