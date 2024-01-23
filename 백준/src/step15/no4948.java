package step15;

import java.io.*;
import java.util.*;

public class no4948 {

	public static boolean[] prime = new boolean[246913];
	
	public static void main(String[] args) throws IOException {
		// ����Ʈ�� ����
		// �Ҽ��� �� ��������� �ٷ�� ���� 1
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		get_prime();
		
		StringBuilder sb = new StringBuilder();
		
		while (true) {
			int n = Integer.parseInt(br.readLine());
			if (n == 0) break; // n �� 0 �ϰ�� ����
			
			int count = 0;
			
			for (int i = n+1; i <= 2*n; i++) {
				if (!prime[i]) count++;
			}
			
			sb.append(count).append('\n');
		}
		System.out.println(sb);
		
	}
	
	// �Ҽ��� ��� �޼ҵ�
	public static void get_prime() {
		// 0 �� 1 �� �Ҽ��� �ƴϹǷ� true
		prime[0] = prime[1] = true;
		
		for (int i = 2; i < Math.sqrt(prime.length); i++) {
			if (prime[i]) continue;
			for (int j = i*i; j < prime.length; j += i) {
				prime[j] = true;
			}
		}
	}

}
