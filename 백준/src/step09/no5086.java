package step09;

import java.util.*;

public class no5086 {

	public static void main(String[] args) {
		// 배수와 약수
		// 배수와 약수를 배우는 문제
		
		Scanner scanner = new Scanner(System.in);
		
		List<String> ary = new ArrayList<>();
		
		while (true) {
			int A = scanner.nextInt();
			int B = scanner.nextInt();
			int ADividedByB;
			int BDividedByA;
			
			if (A != 0 || B != 0) {
				ADividedByB = A % B;
				BDividedByA = B % A;
			} else {
				break;
			}
			
			if (ADividedByB != 0 && BDividedByA == 0) {
				ary.add("factor");
			} else if (ADividedByB == 0 && BDividedByA != 0) {
				ary.add("multiple");
			} else if (ADividedByB != 0 && BDividedByA != 0) {
				ary.add("neither");
			} 
			
		}
		
		for (String str : ary)
			System.out.println(str);
		
	}

}
