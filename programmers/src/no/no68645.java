package no;

public class no68645 {
	public int[] solution(int n) {
		// nxn 2차원 배열 선언
		int[][] triangle = new int[n][n];
		int v = 1;
		
		// 숫자를 채운 현재 위치를 (0, 0)으로 설정
		int x = 0;
		int y = 0;
		
		// 방향에 따라 이동할 수 없을 때까지 반복하면서 숫자 채우기
		while (true) {
			// 아래로 이동
			while (true) {
				triangle[y][x] = v++;
				if (y + 1 == n || triangle[y + 1][x] != 0) break;
				y += 1;
				
			}
			if (x + 1 == n || triangle[y][x + 1] != 0) break;
			x += 1;
			
			// 오른쪽으로 이동
			while (true) {
				triangle[y][x] = v++;
				if (x + 1 == n || triangle[y][x + 1] != 0) break;
				x += 1;
			}
			if (triangle[y - 1][x - 1] != 0) break;
			x -= 1;
			y -= 1;
			
			// 왼쪽 위로 이동
			while (true) {
				triangle[y][x] = v++;
				if (triangle[y - 1][x - 1] != 0) break;
				x -= 1;
				y -= 1;
			}
			if (y + 1 == n || triangle[y + 1][x] != 0) break;
			y += 1;
		}
		
		// 채워진 숫자를 차례대로 1차원 배열에 옮겨서 반환
		int[] result = new int[v - 1];
		
		int index = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				result[index++] = triangle[i][j];
			}
		}
		
		return result;
	}
}
