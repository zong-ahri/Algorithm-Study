package step5;

import java.util.*;

public class no1152 {

	public static void main(String[] args) {
		// �ܾ��� ����
		// �ܾ��� ������ ���ϴ� ����
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine().trim();	// ���ڿ� �յ� ���� ����
		
		// �Էµ� ���ڿ��� ��������� 0 ���
		if (str.isEmpty()) {
			System.out.println(0);
			return;
		}

		String[] words = str.split(" ");		// ���ڿ��� ������ �������� �и�
		
		System.out.println(words.length);

	}

}
