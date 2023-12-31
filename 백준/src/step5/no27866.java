package step5;

import java.util.Scanner;

public class no27866 {

	public static void main(String[] args) {
		// 문자와 문자열
		// 문자열을 입력받고 문자열의 특정 위치를 읽어 봅시다.

		Scanner scanner = new Scanner(System.in);
		
		String str = scanner.nextLine();
		int n = scanner.nextInt();
		
		System.out.println(str.charAt(n-1));
		
	}

}
