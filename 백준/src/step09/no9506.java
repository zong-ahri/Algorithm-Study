package step09;

import java.util.*;

public class no9506 {

	public static void main(String[] args) {
		// 약수들의 합
		// 약수를 구하면서 주어진 수가 완전수인지 판별하는 문제
		
		Scanner scanner = new Scanner(System.in);
		
		List<Integer> array = new ArrayList<>();
		
		while (true) {
			int A = scanner.nextInt();
			int sum = 0;
			if (A >= 0) {
				for (int i = 1; i < A; i++) {
					if (A % i == 0) {
						array.add(i) ;
						sum += i;
					}
				}
				
				if (A == sum) {
//					System.out.println(A + "약수의 합: " + sum);
					System.out.print(A + " = ");
					for (int i : array) {
						if (array.get(array.size()-1) != i)
							System.out.print(i + " + ");
						else
							System.out.println(i);
					}
//					System.out.println();
//					System.out.println(A + "의 약수: " + array);
				} else {
					System.out.println(A + " is NOT perfect.");
				}
				
			} else 
				break;

			array.clear();
			
		}
		
	}

}
