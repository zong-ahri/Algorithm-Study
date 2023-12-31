package step5;

import java.util.*;

public class no10809 {

	public static void main(String[] args) {
		// ���ĺ� ã��
		// �� �ܾ�� �� ���ĺ��� ó�� �����ϴ� ��ġ�� ã�� ����
		
		Scanner scanner = new Scanner(System.in);
		
		String word = scanner.next();
		
		Map<Character, Integer> wordStartPosition = new HashMap<Character, Integer>();
		
		// �� ���ĺ��� ó�� ���� ��ġ ���
		for (int i = 0; i < word.length(); i++) {
			char currentChar = word.charAt(i);
			
			// key�� �������� ������ value�� �ش� key�� ����
			// key�� �����ϸ� ���� ���ε� ���� ��ȯ�ϰ�, value�� �ش� key�� ����
			wordStartPosition.putIfAbsent(currentChar, i);
			
		}
		
		for (char ch = 'a'; ch <= 'z'; ch++) {
			// �����ϸ� �ش� �� ��ȯ, �������� ������ �⺻�� -1 ��ȯ
			System.out.print(wordStartPosition.getOrDefault(ch, -1) + " ");
		}
		

	}

}
