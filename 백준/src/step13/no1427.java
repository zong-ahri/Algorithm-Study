package step13;

import java.io.*;
import java.util.*;

public class no1427 {

	public static void main(String[] args) throws IOException {
		// 소트인사이드
		// 숫자를 정렬하는 문제
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력
		StringTokenizer st = new StringTokenizer(br.readLine());

		// String -> char[]
		char[] arrC = st.nextToken().toCharArray();
		
		
		// char[] -> int[]
		int[] arrI = new int[arrC.length];
		for (int i = 0; i < arrC.length; i++) {
			arrI[i] = Character.getNumericValue(arrC[i]);
		}

		// 오름차순 정렬
		Arrays.sort(arrI);
		
		// 내림차순 출력
		for (int i = arrI.length-1; i >= 0; i--) {
			System.out.print(arrI[i]);
		}
		
		br.close();
		bw.flush();
		bw.close();
		
	}

}
