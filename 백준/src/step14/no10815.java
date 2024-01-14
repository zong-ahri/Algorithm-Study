package step14;

import java.io.*;
import java.util.*;

public class no10815 {

	public static void main(String[] args) throws IOException {
		// 숫자 카드
		// 카드의 집합을 만들어 특정 카드가 집합에 있는지 빠르게 찾는 문제
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		// N 값
		int N = Integer.parseInt(br.readLine());
		int[] arrN = new int[N];
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++) {
			arrN[i] = Integer.parseInt(st.nextToken());
		}
		
		// N 값 중복 체크
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < N; i++) {
			int count = 1;
			if (!map.containsKey(arrN[i])) {
				map.put(arrN[i], count);
			} else {
				count = map.get(arrN[i]) + 1;
				map.put(arrN[i], count);
			}
		}
		map.put(0, 0);
//		System.out.println(map);
		
		// M 값
		int M = Integer.parseInt(br.readLine());
		int[] arrM = new int[M];
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < M; i++) {
			arrM[i] = Integer.parseInt(st.nextToken());
		}
		
//		System.out.println(Arrays.toString(arrN));
//		System.out.println(Arrays.toString(arrM));
		
		// 출력
		StringBuilder sb = new StringBuilder();
		for (int i : arrM) {
			if (map.containsKey(i)) {
				sb.append(map.get(i)).append(' '); 
			} else {
				sb.append(map.get(0)).append(' ');
			}
		}
		System.out.println(sb);
		
	}

}
