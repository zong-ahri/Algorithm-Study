package step13;

import java.io.*;
import java.util.*;

public class no1427 {

	public static void main(String[] args) throws IOException {
		// ��Ʈ�λ��̵�
		// ���ڸ� �����ϴ� ����
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// �Է�
		StringTokenizer st = new StringTokenizer(br.readLine());

		// String -> char[]
		char[] arrC = st.nextToken().toCharArray();
		
		
		// char[] -> int[]
		int[] arrI = new int[arrC.length];
		for (int i = 0; i < arrC.length; i++) {
			arrI[i] = Character.getNumericValue(arrC[i]);
		}

		// �������� ����
		Arrays.sort(arrI);
		
		// �������� ���
		for (int i = arrI.length-1; i >= 0; i--) {
			System.out.print(arrI[i]);
		}
		
		br.close();
		bw.flush();
		bw.close();
		
	}

}
