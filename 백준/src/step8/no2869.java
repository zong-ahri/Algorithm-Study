package step8;

import java.util.*;

public class no2869 {

	public static void main(String[] args) {
		// �����̴� �ö󰡰� �ʹ�
		// �������� �������� ����ϴ� ����
		
		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int V = scanner.nextInt();
		
		int days = (V - B) / (A - B);	// �̵� Ƚ��
		if ((V-B) % (A-B) != 0) {
			days++;
		}

		System.out.println(days);
	}

}
