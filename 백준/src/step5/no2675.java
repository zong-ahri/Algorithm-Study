package step5;

import java.util.*;

public class no2675 {

	public static void main(String[] args) {
		// ���ڿ� �ݺ�
		// �� ���ڸ� �ݺ��Ͽ� ����ϴ� ����
		
		Scanner scanner = new Scanner(System.in);
		
		int T = scanner.nextInt();
		
		String[] ary = new String[T];
		
		// T:���̽�����, R:�ݺ�Ƚ��, S:���ڿ�
		for (int i = 0; i < T; i++) {	// 2���� �׽�Ʈ ���̽� ����
			int R = scanner.nextInt();		// �ݺ�Ƚ�� 3��
			String S = scanner.next();			// ABC
			
			ary[i] = "";		// �迭 �ʱ�ȭ
			
			for (int j = 0; j < S.length(); j++) {	// S ũ�⸸ŭ �ݺ�
				for (int k = 0; k < R; k++) {		// 3�� �ݺ�
					ary[i] += S.charAt(j);
				}
			}
			
		}
		
		for (int i = 0; i < T; i++) {
			System.out.println(ary[i]);
		}
	}

}
