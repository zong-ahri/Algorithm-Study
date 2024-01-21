package step15;

import java.io.*;
import java.util.*;

public class no2485 {

	public static void main(String[] args) throws IOException {
		// 가로수
		// 균일하게 가로수를 심는 문제
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		List<Integer> arr = new ArrayList<>();
		
		for (int i = 0; i < N; i++) {
			arr.add(Integer.parseInt(br.readLine()));
		}

		System.out.println(getGCD(arr));
		
	}
	
	public static long getGCD(List<Integer> arr) { // 배열 최대공배수
		long result = arr.get(0);
		for (int i = 1; i < arr.size(); i++) {
			result = getGCD(result, arr.get(i));
		}
		return result;
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
