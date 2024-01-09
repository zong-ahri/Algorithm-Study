package step13;

import java.io.*;
import java.util.*;

public class no2750 {

	public static void main(String[] args) throws IOException {
		// 수 정렬하기
		// 시간 복잡도가 O(n²)인 정렬 알고리즘으로 풀 수 있습니다. 
		// 예를 들면 삽입 정렬, 거품 정렬 등이 있습니다.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
//		// 삽입 정렬
//		for (int i = 0; i < N-1; i++) {
//			for (int j = i+1; j < N; j++) {
//				if (arr[i] > arr[j]) {
//					int temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//				}
//			}
//		}
		
//		// 버블 정렬
//		for (int i = 0; i < N-1; i++) {
//			for (int j = 0; j < N-i-1; j++) {
//				int k = j+1;
//				if (arr[j] > arr[k]) {
//					int temp = arr[j];
//					arr[j] = arr[k];
//					arr[k] = temp;
//				}
//			}
//			
//		}
		
		// sort 메서드 사용
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
