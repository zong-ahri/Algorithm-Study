package step14;

import java.io.*;
import java.util.*;

public class no11478 {

	public static void main(String[] args) throws IOException {
		// 서로 다른 부분 문자열의 개수
		// 집합을 활용하여 중복을 제거하는 문제
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String S = br.readLine();
		Set<String> subS = new HashSet<>();
		
		for (int i = 0; i < S.length(); i++) {
			for (int j = i+1; j <= S.length(); j++) {
				subS.add(S.substring(i, j));
			}
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(subS.size());
		System.out.println(sb);
		
	}

}
