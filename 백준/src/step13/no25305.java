package step13;

import java.io.*;
import java.util.*;

public class no25305 {

	public static void main(String[] args) throws IOException {
		// 커트라인
		// k번째로 큰 수를 구하는 문제
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 두줄 입력
		StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
		StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
		
		// 첫번째 줄 값 N, k 저장
		int N = Integer.parseInt(st1.nextToken());
		int k = Integer.parseInt(st1.nextToken());
		int[] arr = new int[N];
		
		// 두번째 줄 배열에 저장
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st2.nextToken());
		}
		
		// 오름차순 정렬
		Arrays.sort(arr);
		
		// 출력
		System.out.println(arr[arr.length-k]);
		
	}

}
