package step15;

import java.io.*;

public class no4134 {

	public static void main(String[] args) throws IOException {
		// 다음 소수
		// √N까지만 나눠서 소수를 판별하는 문제
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < T; i++) {
			long number = Long.parseLong(br.readLine());
			sb.append(getPrime(number)).append('\n');
		}

		System.out.println(sb);

	}
	
	public static long getPrime(long num) {
		while (true) {
			long cnt = 0;
			for (long i = 2; i <= Math.sqrt(num); i++) {
				if (num % i == 0) {
					cnt++;
					break;
				}
			}
			if (cnt == 0) {
				if (num <= 2) {
					num = 2;
				}
				return(num);
			}
			num++;
		}
	}

}
