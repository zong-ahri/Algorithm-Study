package step15;

import java.io.*;
import java.util.*;

public class no1934 {

	public static void main(String[] args) throws IOException {
		// 최소공배수
		// 최대공약수만 구해도 최소공배수를 바로 알 수 있습니다.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int lcm = getLCM(A, B);
			
			sb.append(lcm).append('\n');
		}
		
		System.out.println(sb);

	}
	
	public static int getGCD(int a, int b) { // 최대공약수
		if (a < b) {
			int temp = a;
			a = b;
			b = temp;
		}
		if (b == 0) {
			return a;
		}
		return getGCD(b, a % b);
	}
	
	public static int getLCM(int a, int b) { // 최소공배수
		return a * b / getGCD(a, b);
	}

}
