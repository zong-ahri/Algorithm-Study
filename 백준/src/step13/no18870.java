package step13;

import java.io.*;
import java.util.*;

public class no18870 {

	public static void main(String[] args) throws IOException {
		// 좌표 압축
		// 만약 정확한 값이 필요 없고 값의 대소 관계만 필요하다면, 
		// 모든 수를 0 이상 N 미만의 수로 바꿀 수 있습니다.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] xPoints = new int[N];
		int[] xPointsSort = new int[N];
		Map<Integer, Integer> rankMap = new HashMap<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++) {
			xPointsSort[i] = xPoints[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(xPointsSort);
		

		int count = 0;
		for (int i : xPointsSort) {
			if(!rankMap.containsKey(i)) {
				rankMap.put(i, count);
				count++;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for (int i : xPoints) {
			int counting = rankMap.get(i);
			sb.append(counting).append(' ');
		}
		
		System.out.println(sb);
		
	}

}
