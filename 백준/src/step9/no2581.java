package step9;

import java.util.*;

public class no2581 {

	public static void main(String[] args) {
		// �Ҽ�
		// 2���� X-1���� ��� ������ X�� �Ҽ����� �Ǻ��ϴ� ���� 2
		
		Scanner scanner = new Scanner(System.in);

		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int minValue = Integer.MAX_VALUE;
		int sum = 0;
		int count;
		
		for (int i = A; i <= B; i++) {
			count = 0;
			
//			System.out.println("����: " + i);
			
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			
			if (count == 1) {
//				System.out.println("�Ҽ�= " + i);
				sum += i;
				if (i < minValue) {
					minValue = i;
				}
			} 
		}
		
		if (sum == 0) {
			minValue = -1;
			System.out.println(minValue);
		} else {
			System.out.println(sum);
			System.out.println(minValue);
		}
		
	}

}
