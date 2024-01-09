package step13;

import java.io.*;
import java.util.*;

public class no2751 {

	public static void main(String[] args) throws IOException {
		// 수 정렬하기 2
		// 시간 복잡도가 O(nlogn)인 정렬 알고리즘으로 풀 수 있습니다. 
		// 예를 들면 병합 정렬, 힙 정렬 등이 있지만, 
		// 어려운 알고리즘이므로 지금은 언어에 내장된 정렬 함수를 쓰는 것을 추천드립니다.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);
		
//		System.out.println(Arrays.toString(arr));
		
		for (int i = 0; i < N; i++) {
			bw.write(Integer.toString(arr[i])+"\n");
		}
		
		br.close();
		bw.flush();
		bw.close();

	}

}
