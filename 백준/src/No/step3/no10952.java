package No.step3;

import java.util.Scanner;

public class no10952 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] A = {}; // A배열 초기화
		int[] B = {}; // B배열 초기화

		for (;;) {

			// A배열
			int[] TempAry = new int[A.length + 1]; // 탬프배열 A배열보다 크기 +1

			for (int i = 0; i < A.length; i++) { // 탬프배열에 A배열 넣기
				TempAry[i] = A[i];
			}

			TempAry[A.length] = sc.nextInt(); // 탬프배열 마지막 요소 넣기

			A = new int[TempAry.length]; // A배열 크기 초기화

			for (int i = 0; i < TempAry.length; i++) { // 탬프배열을 A배열에 넣기
				A[i] = TempAry[i];
			}

			// B배열
			TempAry = new int[B.length + 1]; // 탬프배열 B배열보다 크기 +1

			for (int i = 0; i < B.length; i++) { // 탬프배열에 B배열 넣기
				TempAry[i] = B[i];
			}

			TempAry[B.length] = sc.nextInt(); // 탬프배열 마지막 요소 넣기

			B = new int[TempAry.length]; // B배열 크기 초기화

			for (int i = 0; i < TempAry.length; i++) { // 탬프배열을 A배열에 넣기
				B[i] = TempAry[i];
			}

			// A배열 B배열 0 0 종료
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
