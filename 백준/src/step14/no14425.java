package step14;

import java.io.*;
import java.util.*;

public class no14425 {

	public static void main(String[] args) throws IOException {
		// ���ڿ� ����
		// �� ��� ���ڿ��� �����ϴ� ����

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		// N ������ �ֱ�
		Set<String> strN = new HashSet<>();
		for (int i = 0; i < N; i++) {
			strN.add(br.readLine());
		}
		
		
		// M ������ �ְ� N�����Ϳ� �ִ��� Ȯ��. ������ ī�����ϱ�
		int count = 0;
		for (int i = 0; i < M; i++) {
			if (strN.contains(br.readLine())) {
				count++;
			}
		}
		
		// ��¹�
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(Integer.toString(count));
		bw.flush();
		bw.close();
		
	}

}
