package No.step3;

import java.util.Scanner;

public class no10952 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] A = {}; // A�迭 �ʱ�ȭ
		int[] B = {}; // B�迭 �ʱ�ȭ

		for (;;) {

			// A�迭
			int[] TempAry = new int[A.length + 1]; // �����迭 A�迭���� ũ�� +1

			for (int i = 0; i < A.length; i++) { // �����迭�� A�迭 �ֱ�
				TempAry[i] = A[i];
			}

			TempAry[A.length] = sc.nextInt(); // �����迭 ������ ��� �ֱ�

			A = new int[TempAry.length]; // A�迭 ũ�� �ʱ�ȭ

			for (int i = 0; i < TempAry.length; i++) { // �����迭�� A�迭�� �ֱ�
				A[i] = TempAry[i];
			}

			// B�迭
			TempAry = new int[B.length + 1]; // �����迭 B�迭���� ũ�� +1

			for (int i = 0; i < B.length; i++) { // �����迭�� B�迭 �ֱ�
				TempAry[i] = B[i];
			}

			TempAry[B.length] = sc.nextInt(); // �����迭 ������ ��� �ֱ�

			B = new int[TempAry.length]; // B�迭 ũ�� �ʱ�ȭ

			for (int i = 0; i < TempAry.length; i++) { // �����迭�� A�迭�� �ֱ�
				B[i] = TempAry[i];
			}

			// A�迭 B�迭 0 0 ����
			if (A[A.length - 1] == 0 && B[B.length - 1] == 0) {
				break;
			}

		}

		sc.close();

//		System.out.println(Arrays.toString(A));
//		System.out.println(Arrays.toString(B));

		for (int i = 0; i < A.length - 1; i++) {
			System.out.printf("%d\n", A[i] + B[i]);
		}

	}

}
