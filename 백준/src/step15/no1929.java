package step15;

import java.io.*;
import java.util.*;

public class no1929 {

	public static void main(String[] args) throws IOException {
		// 소수 구하기
		// 위 문제의 테크닉을 쓰거나 에라토스테네스의 체를 써서 범위 안의 모든 소수를 구하는 문제
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		
		// 사용자로부터 M, N 입력
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		// N <= 1 일 때 종료
		if (N <= 1) return;
		List<Boolean> primeList = new ArrayList<>(N+1);
		// 0번째와 1번째를 소수 아님으로 처리
		primeList.add(false);
		primeList.add(false);
		// 2~N 까지 소수로 설정
		for (int i = 2; i <= N; i++) {
			primeList.add(i, true);
		}
		// 2부터 ~ i*i <= N
		// 각각의 배수들을 지워간다.
		for (int i = 2; (i*i) <= N; i++) {
			if (primeList.get(i)) {
				for (int j = i*i; j <= N; j += i) {
					primeList.set(j, false);
					// i*i 미만은 이미 처리되었으므로 j의 시작값은 i*i로 최적화할 수 있다.
				}
			}
		}
		for (int i = 2; i < M; i++) {
			primeList.set(i, false);
		}
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i <= N; i++) {
			if (primeList.get(i) == true) {
				sb.append(i).append('\n');
			}
		}
		System.out.println(sb);

	}

}
