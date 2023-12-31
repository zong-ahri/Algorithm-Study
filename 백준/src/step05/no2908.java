package step05;

import java.util.*;

public class no2908 {

	public static void main(String[] args) {
		// 상수
		// 숫자를 뒤집어서 비교하는 문제
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int reverseA = reversefunction(A);
		int reverseB = reversefunction(B);
		
		System.out.println(Math.max(reverseA, reverseB));
		
	}
	
	private static int reversefunction(int num) {
		int reversed = 0;
		while (num > 0) {
			reversed = reversed * 10 + num % 10;
			num /= 10;
		}
		return reversed;
	}

}
