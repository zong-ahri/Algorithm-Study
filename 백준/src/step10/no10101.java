package step10;

import java.util.*;

public class no10101 {

	public static void main(String[] args) {
		// �ﰢ�� �ܿ��
		// ������ ���� �ﰢ���� �Ǻ��ϰ� �з��ϴ� ����
		
		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		
		if (A == 60 && B == 60 && C == 60) {
			System.out.println("Equilateral");
		} else if (A+B+C == 180 && (A == B || A == C || B == C)) {
			System.out.println("Isosceles");
		} else if (A+B+C == 180 && (A != B && A != C && B != C)) {
			System.out.println("Scalene");
		} else {
			System.out.println("Error");
		}

	}

}
