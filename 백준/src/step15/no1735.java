package step15;

import java.io.*;
import java.util.*;

public class no1735 {

	public static void main(String[] args) throws IOException {
		// 분수 합
		// 분수를 더하고 약분하는 문제
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		st = new StringTokenizer(br.readLine(), " ");
		long A1 = Integer.parseInt(st.nextToken());
		long B1 = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine(), " ");
		long A2 = Integer.parseInt(st.nextToken());
		long B2 = Integer.parseInt(st.nextToken());
		
		long A3 = A1*B2/getGCD(B1, B2) + A2*B1/getGCD(B1, B2);
		long B3 = getLCM(B1, B2);

		long gcd = getGCD(A3, B3);
		
		sb.append(A3/gcd).append(' ').append(B3/gcd);
		System.out.println(sb);
		
	}
	
	public static long getGCD(long a, long b) { // 최대공배수
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
