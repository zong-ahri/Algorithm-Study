package step15;

import java.io.*;
import java.util.*;

public class no13241 {

	public static void main(String[] args) throws IOException {
		// 최소공배수
		// 유클리드 호제법으로 최대공약수를 (그리고 최소공배수도) 빠르게 구하는 문제
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		long A = Integer.parseInt(st.nextToken());
		long B = Integer.parseInt(st.nextToken());
		
		sb.append(getLCM(A, B));

		System.out.println(sb);
		
	}
	
	public static long getGCD(long a, long b) { // 최대공약수
		if (a < b) {
			long temp = a;
			a = b;
			b = temp;
		}
		if (b == 0) {
			return a;
		}
		return getGCD(b, a % b);
	}

	public static long getLCM(long a, long b) { // 최소공배수
		return a * b / getGCD(a, b);
	}
}
