package step04;

import java.util.Scanner;

public class no1546 {

	public static void main(String[] args) {
		// ���
		// ����� �����ϴ� ����

		// �ִ� M
		// ��� ������ ����/M *100
		
		Scanner scanner = new Scanner(System.in);
		
		// �⸻ ���� �迭 ����
		int size = scanner.nextInt();
		int[] scores = new int[size];
		for (int i = 0; i < scores.length; i++) {
			scores[i] = scanner.nextInt();
		}
		
		// �⸻ ���� �ִ밪 ���ϱ�
		int maxValue = scores[0];
		for (int i = 0; i < scores.length; i++) {
			if (maxValue < scores[i])
				maxValue = scores[i];
		}


		// ���� ��ġ��
		double sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += (double)scores[i] / maxValue * 100;
		}
		
		
		System.out.println(sum / size);
	}

}
