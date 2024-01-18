package step14;

import java.io.*;
import java.util.*;

public class no1764 {

	public static void main(String[] args) throws IOException {
		// 듣보잡
		// 듣도 보도 못한 문제
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		Set<String> noListen = new HashSet<>();
		for (int i = 0; i < N; i++) {
			noListen.add(br.readLine());
		}
		List<String> noListenSee = new ArrayList<>();
		for (int i = 0; i < M; i++) {
			String noSee = br.readLine();
			if (noListen.contains(noSee)) {
				noListenSee.add(noSee);
			}
		}
		Collections.sort(noListenSee);
		
		sb.append(noListenSee.size()).append('\n');
		for (int i = 0; i < noListenSee.size(); i++) {
			sb.append(noListenSee.get(i)).append('\n');
		}
		System.out.println(sb);
		
	}

}
