package No.step4;

import java.util.Scanner;

public class no10818 {

	// 최소, 최대
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
//		System.out.println("배열의 크기를 입력하세요: ");
		int size = scanner.nextInt();
		
		int[] numbers = new int[size];
		
		// 배열 요소 입력
		for (int i = 0; i < size; i++) {
			numbers[i] = scanner.nextInt();
		}
		
		// 최솟값과 최대값 찾기
		int[] result = findMinMax(numbers);
		
		// 결과 출력
		System.out.println(result[0] + " " + result[1]);
	}

	
	public static int[] findMinMax(int[] numbers) {
		// 배열이 비어있는 경우 예외 처리
		
		if (numbers == null || numbers.length == 0) {
			return null;
		}
		
		int minVal = Integer.MAX_VALUE;
		int maxVal = Integer.MIN_VALUE;
		
		// 배열을 순회화면서 최솟값과 최댓값 동시에 찾기
		for (int number : numbers) {
			if (number < minVal)
				minVal = number;
			if (number > maxVal)
				maxVal = number;
		}
		
		return new int[] {minVal, maxVal};
	}
	
}
