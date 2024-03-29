package step15;

import java.io.*;
import java.util.*;

public class no2485 {

	public static void main(String[] args) throws IOException {
		// 가로수
		// 균일하게 가로수를 심는 문제
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		int[] streetTree = new int[N];
		
		for (int i = 0; i < N; i++) {
			streetTree[i] = Integer.parseInt(br.readLine());
		}

		int gcd = 0; // 가로수 간격의 최대 공약수를 저장하는 변수
		
		for (int i = 0; i < N-1; i++) {
			int distance = streetTree[i+1] - streetTree[i];
			gcd = getGCD(distance, gcd); // 가로수 간격의 최대 공약수
		}
		
		// (streetTree[N-1]-streetTree[0])/gcd은 간격의 수니까
        // 가로수의 나무의 개수를 구하려면 간격의 수에서 + 1을 해야한다. 
		sb.append((streetTree[N-1]-streetTree[0])/gcd+1-(streetTree.length));
		System.out.println(sb);
		
	}
	
	public static int getGCD (int a, int b) { // 최대공약수
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
	
}
