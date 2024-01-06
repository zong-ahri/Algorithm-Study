package step04;

import java.util.Scanner;

public class no10813 {

	public static void main(String[] args) {
		// �� �ٲٱ�
		
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		
		// �ٱ��� �ʱ�ȭ
		int[] baskets = new int[N+1];
		for (int i = 1; i < N+1; i++) {
			baskets[i] = i;
		}
		
		// M�� �� �ٲٱ�
		for (int m = 0; m < M; m++) {
			int i = scanner.nextInt();
			int j = scanner.nextInt();
			int temp;
			
			temp = baskets[i];
			baskets[i] = baskets[j];
			baskets[j] = temp;
		}
		
		// ��� �� 
		for (int i = 1; i < N+1; i++) {
			System.out.print(baskets[i] + " ");
		}

	}

}
