package No;

import java.util.Arrays;
import java.util.Scanner;

public class no10871 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();
		int N = sc.nextInt();

		int[] A = new int[X];
		
		for (int i = 0; i < X; i++) {
			A[i] = sc.nextInt();
		}
		
//		System.out.println(Arrays.toString(A));
		
		for (int i = 0; i < X; i++) {
			if (A[i] < N) System.out.print(A[i] + " ");
		}
		

	}

}
