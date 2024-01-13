package step13;

import java.io.*;
import java.util.*;

public class no1181 {

	public static void main(String[] args) throws IOException {
		// 단어 정렬
		// 단어의 순서를 정의하여 정렬하는 문제
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		String[] str = new String[N];
		
		// 단어 입력
		StringTokenizer st;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			str[i] = st.nextToken();
		}

//		System.out.println(Arrays.toString(str));
		
		// 단어 정렬
		Arrays.sort(str, (o1, o2) -> {
			if (o1.length() == o2.length()) {
				return o1.compareTo(o2);
			} else {
				return o1.length() - o2.length();
			}
		});
		
//		System.out.println(Arrays.toString(str));
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(str[0]).append("\n");
		
		// 중복 단어 체크
		for (int i = 0; i < N; i++) {
			if (!str[i].equals(str[i-1])) {
				sb.append(str[i]).append("\n");
			}
		}
		
		System.out.println(sb);
		
	}

}
