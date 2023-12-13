package no;

public class no68645 {
	public int[] solution(int n) {
		// nxn 2���� �迭 ����
		int[][] triangle = new int[n][n];
		int v = 1;
		
		// ���ڸ� ä�� ���� ��ġ�� (0, 0)���� ����
		int x = 0;
		int y = 0;
		
		// ���⿡ ���� �̵��� �� ���� ������ �ݺ��ϸ鼭 ���� ä���
		while (true) {
			// �Ʒ��� �̵�
			while (true) {
				triangle[y][x] = v++;
				if (y + 1 == n || triangle[y + 1][x] != 0) break;
				y += 1;
				
			}
			if (x + 1 == n || triangle[y][x + 1] != 0) break;
			x += 1;
			
			// ���������� �̵�
			while (true) {
				triangle[y][x] = v++;
				if (x + 1 == n || triangle[y][x + 1] != 0) break;
				x += 1;
			}
			if (triangle[y - 1][x - 1] != 0) break;
			x -= 1;
			y -= 1;
			
			// ���� ���� �̵�
			while (true) {
				triangle[y][x] = v++;
				if (triangle[y - 1][x - 1] != 0) break;
				x -= 1;
				y -= 1;
			}
			if (y + 1 == n || triangle[y + 1][x] != 0) break;
			y += 1;
		}
		
		// ä���� ���ڸ� ���ʴ�� 1���� �迭�� �Űܼ� ��ȯ
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
