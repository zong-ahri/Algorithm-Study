package step06;

import java.util.*;

public class no1157 {

	public static void main(String[] args) {
		// �ܾ� ����
		// �־��� �ܾ�� ���� ���� ���� ���ĺ��� ����ϴ� ����
		
		Scanner sc = new Scanner(System.in);
		
		// �ܾ� �빮�ڷ� ��ȯ
		String word = sc.nextLine().toUpperCase();
//		System.out.println(word);
		
		Map<Character, Integer> mCount = new HashMap<>();
		
		// ���ĺ� Ƚ�� ���
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
		
		// ���� ���� �� ���ĺ� ã�� 
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
