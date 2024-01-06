package step11;

import java.util.Scanner;

public class no24265 {

	public static void main(String[] args) {
		// 알고리즘 수업 - 알고리즘의 수행 시간 4
		// n이 커질수록 n과 n²의 차이는 어마어마하게 벌어지기 때문에,
		
		Scanner scanner = new Scanner(System.in);
		
		long number = scanner.nextInt();
		
		System.out.println(number * (number-1) /2);
		System.out.println("2");

	}

}
