package step04;

import java.util.Scanner;

public class no10810 {

	public static void main(String[] args) {
		// �� �ֱ�
		
		Scanner scanner = new Scanner(System.in);
		
		// N, M �Է� �ޱ�
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		
		// �ٱ��� �迭 �ʱ�ȭ
		int[] baskets = new int[N + 1];
		
		// M�� ���� �ֱ�
		for (int m = 0; m < M; m++) {
			int start = scanner.nextInt();
			int end = scanner.nextInt();
			int ball = scanner.nextInt();
			
			// ���� �ִ� ����
			for (int i = start; i <= end; i++) {
				baskets[i] = ball;
			}
			
		}
		
		// ��� ���
		for (int i = 1; i <= N; i++) {
			System.out.print(baskets[i] + " ");
		}

	}

}
