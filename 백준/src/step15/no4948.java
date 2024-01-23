package step15;

import java.io.*;
import java.util.*;

public class no4948 {

	public static boolean[] prime = new boolean[246913];
	
	public static void main(String[] args) throws IOException {
		// 베르트랑 공준
		// 소수를 더 자유자재로 다루는 문제 1
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		get_prime();
		
		StringBuilder sb = new StringBuilder();
		
		while (true) {
			int n = Integer.parseInt(br.readLine());
			if (n == 0) break; // n 이 0 일경우 종료
			
			int count = 0;
			
			for (int i = n+1; i <= 2*n; i++) {
				if (!prime[i]) count++;
			}
			
			sb.append(count).append('\n');
		}
		System.out.println(sb);
		
	}
	
	// 소수를 얻는 메소드
	public static void get_prime() {
		// 0 과 1 은 소수가 아니므로 true
		prime[0] = prime[1] = true;
		
		for (int i = 2; i < Math.sqrt(prime.length); i++) {
			if (prime[i]) continue;
			for (int j = i*i; j < prime.length; j += i) {
				prime[j] = true;
			}
		}
	}

}
