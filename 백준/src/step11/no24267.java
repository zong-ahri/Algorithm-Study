package step11;

import java.util.Scanner;

public class no24267 {

	public static void main(String[] args) {
		// 알고리즘 수업 - 알고리즘의 수행 시간 6
		// 그 역할을 하는 것이 바로 시간 복잡도입니다.
		
		Scanner scanner = new Scanner(System.in);
		
		long number = scanner.nextInt();
		long sum = 0;
		long count = 0;
		
		System.out.println(number*(number-1)*(number-2) / 3 / 2);
		System.out.println("3");


	}

}
