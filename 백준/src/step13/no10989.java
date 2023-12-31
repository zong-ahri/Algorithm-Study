package step13;

import java.io.*;
import java.util.*;

public class no10989 {

	public static void main(String[] args) throws IOException {
		// 수 정렬하기 3
		// 수의 범위가 작다면 카운팅 정렬을 사용하여 더욱 빠르게 정렬할 수 있습니다.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		// 오름차순 정렬
		Arrays.sort(arr);
		
//		System.out.println(Arrays.toString(arr));
		
		// 출력
		for (int i = 0; i < N; i++) {
			bw.write(Integer.toString(arr[i])+"\n");
		}
		
		br.close();
		bw.flush();
		bw.close();

	}

}
