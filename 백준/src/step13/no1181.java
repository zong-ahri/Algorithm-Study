package step13;

import java.io.*;
import java.util.*;

public class no1181 {

	public static void main(String[] args) throws IOException {
		// 단어 정렬
		// 단어의 순서를 정의하여 정렬하는 문제
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		String[] str = new String[N];
		
		// 단어 입력
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			str[i] = st.nextToken();
		}

//		System.out.println(Arrays.toString(str));
		
		// 단어 정렬
		Arrays.sort(str, (s1, s2) -> {
			if (s1.length() == s2.length()) {
				return s1.compareTo(s2);
			} else {
				return s1.length() - s2.length();
			}
		});
		
//		System.out.println(Arrays.toString(str));
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(str[0]).append("\n");
		
		// 중복 단어 체크
		for (int i = 1; i < N; i++) {
			if (!str[i].equals(str[i-1])) {
				sb.append(str[i]).append("\n");
			}
		}
		
		System.out.println(sb);
		
	}

}
