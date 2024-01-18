package step14;

import java.io.*;
import java.util.*;

public class no1620 {

	public static void main(String[] args) throws IOException {
		// 나는야 포켓몬 마스터 이다솜
		// 맵을 사용하여 이름과 수를 연결짓는 문제
		
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		 StringBuilder sb = new StringBuilder();
		 
		 int N = Integer.parseInt(st.nextToken());
		 int M = Integer.parseInt(st.nextToken());
		 
		 Map<String, Integer> list1 = new HashMap<>();
		 List<String> list2 = new ArrayList<>();
		 
		 for (int i = 1; i <= N; i++) {
			 String str = br.readLine();
			 list1.put(str, i);
			 list2.add(str);
		 }
		 
		 for (int i = 1; i <= M; i++) {
			 String str = br.readLine();
			 if (isInteger(str)) { // 숫자일 경우
				 int key = Integer.parseInt(str);
				 sb.append(list2.get(key-1)).append('\n');
			 } else { // 문자일 경우
				 sb.append(list1.get(str)).append('\n');
			 }
		 }
		 
		 System.out.print(sb);

	}
	
	public static boolean isInteger(String strValue) {
		try {
			Integer.parseInt(strValue);
			return true;
		} catch(NumberFormatException ex) {
			return false;
		}
	}

}
