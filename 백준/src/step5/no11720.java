package step5;

import java.util.*;

public class no11720 {

	public static void main(String[] args) {
		// ������ ��
		// ������ ���ڿ��� �Է¹޴� ����. 
		// Pythonó�� ���� ũ�⿡ ������ ���ٸ� ��� ������, 
		// ���� 3�� �Ϲ����� ���� �ڷ����� ��⿡ �ʹ� ũ�ٴ� ���� �ָ��սô�.
		
		Scanner scanner = new Scanner(System.in);

		int size = scanner.nextInt();
		scanner.nextLine();
		
		String strAry = scanner.nextLine();
		int sum = 0;

		for (int i = 0; i < size; i++) {
			sum += Character.getNumericValue(strAry.charAt(i));
		}
		
		System.out.println(sum);
		
		
	}

}
