package No.step4;

import java.util.Scanner;

public class no5597 {

	public static void main(String[] args) {
		// 과제 안 내신 분..?
		// 과제 제출 기한이 지났습니다.

		Scanner scanner = new Scanner(System.in);
		
		boolean[] n = new boolean[31];
		int total = 28;
		
		// 제출한사람=1, 제출안한사람=0
		for(int i = 0; i < total; i++) {
			int studentNumber = scanner.nextInt();
			n[studentNumber] = true;
		}
		
		// 제출안한사람 출력
		for (int i = 1; i < n.length; i++) {
			if ( !n[i]) {
				System.out.println(i);
			}
		}
		
	}

}
