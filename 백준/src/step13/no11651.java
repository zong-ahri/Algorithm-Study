package step13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class no11651 {

	public static void main(String[] args) throws IOException {
		// 좌표 정렬하기 2
		// 좌표를 다른 순서로 정렬하는 문제
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int[][] points = new int[N][2];
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			points[i][0] = Integer.parseInt(st.nextToken());
			points[i][1] = Integer.parseInt(st.nextToken());
		}
		
//		// 2차원 배열 입력 확인
//		System.out.println(Arrays.deepToString(points));
		
		// 2차원 배열 y좌표 오름차순 정렬
		Arrays.sort(points, (o1, o2) -> {
			if (o1[1] == o2[1]) {
				return o1[0] - o2[0];
			} else {
				return o1[1] - o2[1];
			}
		});
		
//		// 2차원 배열 x좌표 오름차순 정렬
//		Arrays.sort(points, (o1, o2) -> {
//			if (o1[0] == o2[0]) {
//				return o1[1] - o2[1];
//			} else {
//				return o1[0] - o2[0];
//			}
//		});
		
//		// 정렬 확인
//		System.out.println(Arrays.deepToString(points));

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			sb.append(points[i][0] + " " + points[i][1] + "\n");
		}
		
		System.out.println(sb);
		
	}

}
