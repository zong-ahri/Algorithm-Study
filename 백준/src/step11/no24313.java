package step11;

import java.util.Scanner;

public class no24313 {

	public static void main(String[] args) {
		// 알고리즘 수업 - 점근적 표기 1
		// 시간 복잡도는 빅-O 표기법으로 표현할 수 있습니다. 
		// 정확한 정의보다는 "이 함수에 비례한다" 정도만 기억해도 무방합니다.
		
		Scanner scanner = new Scanner(System.in);
		
		int a1 = scanner.nextInt();
		int a0 = scanner.nextInt();
		int c = scanner.nextInt();
		int n0 = scanner.nextInt();
		
		for (int i = 0; i < n0; i++) {
			int fn = a1*i + a0;
			int gn = i;
			if (fn <= gn) {
				System.out.println("1");
			}
		}
		
		int n;
			
		}
		

	}

}
