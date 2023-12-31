package step5;

import java.util.*;

public class no5622 {

	public static void main(String[] args) {
		// ���̾�
		// ��Ģ�� ���� ���ڿ� �����ϴ� ���� ����ϴ� ����

		Scanner sc = new Scanner(System.in);
		
		Map<Character, Integer> phone = createPhone();
		
		char[] str = sc.next().toCharArray();
		int sum = 0;
		
		for (int i = 0; i < str.length; i++) {
			sum += phone.get(str[i]);
		}
		
		System.out.println(sum);

	}
	
	private static Map<Character, Integer> createPhone() {
		Map<Character, Integer> phone = new HashMap<>();
		
		for (char ch = 'A'; ch <= 'O'; ch++) {
			phone.put(ch, (ch-56)/3);
		}
		for (char ch = 'P'; ch <= 'S'; ch++) {
			phone.put(ch, (ch-48)/4);
		}
		for (char ch = 'T'; ch <= 'V'; ch++) {
			phone.put(ch, (ch-57)/3);
		}
		for (char ch = 'W'; ch <= 'Z'; ch++) {
			phone.put(ch, (ch-47)/4);
		}
		phone.put('1', 2);
		phone.put('0', 11);
		return phone;
	}

}
