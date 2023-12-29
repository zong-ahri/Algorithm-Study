package No.step4;

import java.util.Scanner;

public class no10818 {

	// �ּ�, �ִ�
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
//		System.out.println("�迭�� ũ�⸦ �Է��ϼ���: ");
		int size = scanner.nextInt();
		
		int[] numbers = new int[size];
		
		// �迭 ��� �Է�
		for (int i = 0; i < size; i++) {
			numbers[i] = scanner.nextInt();
		}
		
		// �ּڰ��� �ִ밪 ã��
		int[] result = findMinMax(numbers);
		
		// ��� ���
		System.out.println(result[0] + " " + result[1]);
	}

	
	public static int[] findMinMax(int[] numbers) {
		// �迭�� ����ִ� ��� ���� ó��
		
		if (numbers == null || numbers.length == 0) {
			return null;
		}
		
		int minVal = Integer.MAX_VALUE;
		int maxVal = Integer.MIN_VALUE;
		
		// �迭�� ��ȸȭ�鼭 �ּڰ��� �ִ� ���ÿ� ã��
		for (int number : numbers) {
			if (number < minVal)
				minVal = number;
			if (number > maxVal)
				maxVal = number;
		}
		
		return new int[] {minVal, maxVal};
	}
	
}
