package step14;

import java.io.*;
import java.util.*;

public class no14425 {

	public static void main(String[] args) throws IOException {
		// 문자열 집합
		// 수 대신 문자열을 저장하는 문제

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		// N 데이터 넣기
		Set<String> strN = new HashSet<>();
		for (int i = 0; i < N; i++) {
			strN.add(br.readLine());
		}
		
		
		// M 데이터 넣고 N데이터에 있는지 확인. 있으면 카운팅하기
		int count = 0;
		for (int i = 0; i < M; i++) {
			if (strN.contains(br.readLine())) {
				count++;
			}
		}
		
		// 출력문
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(Integer.toString(count));
		bw.flush();
		bw.close();
		
	}

}
