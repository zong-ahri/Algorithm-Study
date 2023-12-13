package No;

import java.util.Arrays;
import java.util.Scanner;

public class no10807 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[] array = new int[N];
		int cnt = 0;
		
		for (int i = 0; i < N; i++) {
			array[i] = sc.nextInt();
		}
		
//		System.out.println(Arrays.toString(array));
		
		int number = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			if(array[i] == number) {
				cnt++;
			}
		}
		System.out.println(cnt);
		
	}

}
