package step07;

import java.util.*;

public class no10798 {

	public static void main(String[] args) {
		// �����б�
		// ���ڿ��� �迭�� �ٷ�� ����
		
		Scanner scanner = new Scanner(System.in);
		
		String[] words = new String[5];
		int maxWord = 0;
		
		// 1���� �迭
		for (int i = 0; i < 5; i++) {
			words[i] = scanner.nextLine();
			if (maxWord < words[i].length()) {
				maxWord = words[i].length();
			}
		}
//		System.out.println(Arrays.toString(words));

		// 1���� �迭 2���� �迭 �����
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
