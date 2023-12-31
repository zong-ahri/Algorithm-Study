package step06;

import java.util.Scanner;

public class no3003 {

	public static void main(String[] args) {
		// 킹, 퀸, 룩, 비숍, 나이트, 폰
		
		Scanner scanner = new Scanner(System.in);
		
		// 체스는 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개로 구성
		int[] chess = {1, 1, 2, 2, 2, 8};
		
		int pieceTypes = 6;
		int[] discoveredChess = new int[pieceTypes];
		int[] neededChess = new int[pieceTypes];
		
		// 동혁이가 발견한 체스 입력
		for (int i = 0; i < pieceTypes; i++) {
			discoveredChess[i] = scanner.nextInt(); 
		}
		
		//  피스를 더하거나 빼야 되는지를 출력
		for (int i = 0; i < pieceTypes; i++) {
			neededChess[i] = chess[i] - discoveredChess[i];
			System.out.print(neededChess[i] + " ");
		}
		
	}

}
