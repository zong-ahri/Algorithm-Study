package step05;

import java.util.Scanner;

public class no11654 {

	public static void main(String[] args) {
		// 아스키 코드
		// 데이터는 결국 0과 1일 텐데 문자를 어떻게 만드는 걸까요? 아스키 코드에 대해 알아봅시다.

		Scanner scanner = new Scanner(System.in);
		
		char c = scanner.next().charAt(0);
		
		System.out.println((int)c);
		
	}

}
