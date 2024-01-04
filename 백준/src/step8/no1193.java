package step8;

import java.util.*;

public class no1193 {

	public static void main(String[] args) {
		// 분수찾기
		// 분수의 순서에서 규칙을 찾는 문제
		
		Scanner scanner = new Scanner(System.in);
		
		int number = scanner.nextInt();
		int i = 1;
		int j = 1;
		int count = 1;
		
		while (number > 1) {
			if (i == 1 && (i+j)%2 == 0) {
				j++;
				count = j - 1;
				number--;
			} else if (i == 1 && (i+j)%2 == 1) {
				i++;
				j--;
				count--;
				number--;
			} else if (j == 1 && (i+j)%2 == 1) {
				i++;
				count = -i + 1;
				number--;
			} else if (j == 1 && (i+j)%2 == 0) {
				i--;
				j++;
				count++;
				number--;
			} else if (count < 0) {
				i--;
				j++;
				count++;
				number--;
			} else if (count > 0) {
				i++;
				j--;
				count--;
				number--;
			}
			
		}
		
		System.out.println(i + "/" + j);
		
	}

}
