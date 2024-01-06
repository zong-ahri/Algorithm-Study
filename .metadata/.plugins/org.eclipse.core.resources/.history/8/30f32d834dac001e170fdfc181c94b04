package step8;

import java.util.*;

public class no11005 {

	public static void main(String[] args) {
		// 진법 변환 2
		// 반대 방향으로 진법을 변환하는 문제
		
		Scanner scanner = new Scanner(System.in);
		
		Map<Integer, Character> base = new HashMap<>();
		for (int i = 0; i < 36; i++) {
			if (i < 10) {
				base.put(i, (char)(i+48));
			} else {
				base.put(i, (char)(i+55));
			}
		}
		
		int N = scanner.nextInt();
		int B = scanner.nextInt();
		ArrayList<Character> str = new ArrayList<>();
		
		int remainder;
		while (true) {
			if (N > 0) {
				remainder = N % B;
				str.add(base.get(remainder));
				N /= B;
			} else
				break;
		}
		
		for (int i = str.size()-1; i >= 0; i--) {
			System.out.print(str.get(i));
		}
		
		
	}

}
