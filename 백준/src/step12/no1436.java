package step12;

import java.io.*;

public class no1436 {
	public static void main(String[] args) throws IOException {
		// 영화감독 숌
		// N번째 종말의 수가 나올 때까지 차례대로 시도하는 문제
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int num = 666;
		int count = 1;
		
		while (count != N) {
			num++;
			if (String.valueOf(num).contains("666")) {
				count++;
			}
		}
		
		System.out.println(num);
		
	}
}
