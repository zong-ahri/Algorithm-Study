package step14;

import java.io.*;
import java.util.*;

public class no10816 {

	public static void main(String[] args) throws IOException {
		// 숫자 카드 2
		// 각 카드의 개수를 찾는 문제
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < N; i++) {
			int key = Integer.parseInt(st.nextToken());
			map.put(key, map.getOrDefault(key, 0) + 1);
		}
		
//		System.out.println(map);
		
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < M; i++) {
			int key = Integer.parseInt(st.nextToken());
			sb.append(map.getOrDefault(key, 0)).append(' ');
		}

		System.out.println(sb);
		
	}

}
