package step06;

import java.util.*;

public class no10988 {

	public static void main(String[] args) {
		// 팰린드롬인지 확인하기
		
		Scanner scanner = new Scanner(System.in);
		
		// 단어 입력
		String str = scanner.nextLine();
		
		// 단어 거꾸로 읽을때 
		StringBuffer reverseStr = new StringBuffer(str).reverse();

		// 단어 비교
		if (str.equals(reverseStr.toString())) 
			System.out.println(1);
		else
			System.out.println(0);
		
	}

}
