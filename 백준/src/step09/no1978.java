package step09;

import java.util.*;

public class no1978 {

	public static void main(String[] args) {
		// �Ҽ� ã��
		// 2���� X-1���� ��� ������ X�� �Ҽ����� �Ǻ��ϴ� ���� 1
		
		Scanner scanner = new Scanner(System.in);
		
		List<Integer> array = new ArrayList<>();
		
		int N = scanner.nextInt();
		int count = 0;
		
		for (int i = 0; i < N; i++) {
			int number = scanner.nextInt();
			for (int j = 1; j < number; j++) {
				if (number%j == 0) {
					array.add(j);
				}
			}
			if (array.size() == 1) {
				count++;
			}
			array.clear();
		}
		
		System.out.println(count);

	}

}
