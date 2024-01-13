package step13;

import java.io.*;
import java.util.*;

public class no10814 {

	public static void main(String[] args) throws IOException {
		// 나이순 정렬
		// 값이 같은 원소의 전후관계가 바뀌지 않는 정렬 알고리즘을 
		// 안정 정렬(stable sort)이라고 합니다.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		String[][] people = new String[N][2];
		
		StringTokenizer st;
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			people[i][0] = st.nextToken(); // 나이
			people[i][1] = st.nextToken(); // 이름
		}
		
//		System.out.println(Arrays.deepToString(people));
		
		Arrays.sort(people, (o1, o2) -> {
			return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
		});

//		System.out.println(Arrays.deepToString(people));
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < N; i++) {
			sb.append(people[i][0]).append(' ').append(people[i][1]).append('\n');
		}
		System.out.print(sb);

	}

}
