package step14;

import java.io.*;
import java.util.*;

public class no7785 {

	public static void main(String[] args) throws IOException {
		// 회사에 있는 사람
		// 지금까지는 삽입만 했습니다. 이제 제거도 해봅시다.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Map<String, String> map = new HashMap<>();
		
		StringTokenizer st;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			String name = st.nextToken(); 
			String acess = st.nextToken();
			
			// 출퇴근 로직
			if (acess.equals("enter")) {
				map.put(name, "enter");
			} else if (acess.equals("leave")) {
				map.put(name, "leave");
			}
		}
		
		// HashMap -> ArrayList
		List<String> ary = new ArrayList<>(map.keySet());
		
//		System.out.println(map);
//		System.out.println(ary);
		
		// 배열 정렬 오름차순
		Collections.sort(ary);
		Collections.reverse(ary);
		
		// 출력문
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for (String str : ary) {
			if (map.get(str).equals("enter")) {
				bw.write(str);
				bw.write('\n');
			}
		}
		bw.close();

	}

}
