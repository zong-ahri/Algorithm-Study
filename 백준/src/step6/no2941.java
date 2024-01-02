package step6;

import java.util.*;

public class no2941 {

	public static void main(String[] args) {
		// ũ�ξ�Ƽ�� ���ĺ�
		// �μ� ���ڰ� �� ���ڷ� ���� �� ���� �� ������ ���� ���� ����
		
		Scanner scanner = new Scanner(System.in);
		
		// �ܾ� �Է�
		String inputWord = scanner.nextLine();

		// ũ�ξ�Ƽ�� ���ĺ� ���ڿ� �迭
		String[] croatianAlphabet = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		// ũ�ξ�Ƽ�� ���ĺ� �˻�
		for (String alphabet : croatianAlphabet) {
			if (inputWord.contains(alphabet)) {
				inputWord = inputWord.replace(alphabet, " "); // ũ�ξ�Ƽ�� ���ĺ� ũ�⸦ 1�� ����
			}
		}
		
		// ���
		System.out.println(inputWord.length());

	}

}
