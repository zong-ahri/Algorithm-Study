package step13;

import java.io.*;
import java.util.*;

public class no11650 {

	public static void main(String[] args) throws IOException {
		// 좌표 정렬하기
		// 좌표를 정렬하는 문제
		
//		// Scanner 입력문
//		Scanner scanner = new Scanner(System.in);
//		int N = scanner.nextInt();
//		int[][] arr = new int[N][2];
//		for (int i = 0; i < N; i++) {
//			arr[i][0] = scanner.nextInt();
//			arr[i][1] = scanner.nextInt();
//		}
		
		// BufferedReader 입력문
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[N][2];
		StringTokenizer st;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		// 2차원 배열 오름차순 정렬
		Arrays.sort(arr, (o1, o2) -> {
			if (o1[0] == o2[0]) {
				return o1[1] - o2[1];
			} else {
				return o1[0] - o2[0];
			}
		}); 
		
//		// System.out.println() 출력문
//		for (int i = 0; i < N; i++) {
//			System.out.println(arr[i][0] + " " + arr[i][1]);
//		}
		
		// StringBuilder 출력문
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			sb.append(arr[i][0] + " " + arr[i][1]).append('\n');
		}
		System.out.println(sb);

	}

}
