package step13;

import java.io.*;
import java.util.*;

public class no25305 {

	public static void main(String[] args) throws IOException {
		// ĿƮ����
		// k��°�� ū ���� ���ϴ� ����
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// ���� �Է�
		StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
		StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
		
		// ù��° �� �� N, k ����
		int N = Integer.parseInt(st1.nextToken());
		int k = Integer.parseInt(st1.nextToken());
		int[] arr = new int[N];
		
		// �ι�° �� �迭�� ����
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st2.nextToken());
		}
		
		// �������� ����
		Arrays.sort(arr);
		
		// ���
		System.out.println(arr[arr.length-k]);
		
	}

}
