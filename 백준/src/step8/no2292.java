package step8;

import java.util.*;

public class no2292 {

	public static void main(String[] args) {
		// 벌집
		// 벌집이 형성되는 규칙에 따라 벌집의 위치를 구하는 문제
		
		Scanner scanner = new Scanner(System.in);
		
		int number = scanner.nextInt();
		int value = 1;
		int count = 0;
		
		while (number > 0) {
			number -= value;
//			System.out.println(number);
			if (value <= 1) 
				value += 5;
			else 
				value += 6;
			count++;
		}
		
		System.out.println(count);

	}

}
