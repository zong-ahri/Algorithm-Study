package step06;

import java.util.*;

public class no10988 {

	public static void main(String[] args) {
		// �Ӹ�������� Ȯ���ϱ�
		
		Scanner scanner = new Scanner(System.in);
		
		// �ܾ� �Է�
		String str = scanner.nextLine();
		
		// �ܾ� �Ųٷ� ������ 
		StringBuffer reverseStr = new StringBuffer(str).reverse();

		// �ܾ� ��
		if (str.equals(reverseStr.toString())) 
			System.out.println(1);
		else
			System.out.println(0);
		
	}

}
