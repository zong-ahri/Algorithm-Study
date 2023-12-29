package No.step4;

import java.util.*;

public class no3052 {

	public static void main(String[] args) {
		// 나머지
		// 배열을 활용하여 서로 다른 값의 개수를 찾는 문제
		
		Scanner scanner = new Scanner(System.in);
		
		Set<Integer> remainders = new HashSet<>();
		
		// 10개의 숫자 입력 받아서 42로 나눈 나머지 구하기
		for (int i = 0; i < 10; i++) {
			int number = scanner.nextInt();
			int remainder = number % 42;
			remainders.add(remainder);
		}
		
		// 서로 다른 나머지의 개수 출력
		System.out.println(remainders.size());

	}

}
