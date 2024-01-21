package step14;

import java.io.*;
import java.util.*;

public class no1269 {

	public static void main(String[] args) throws IOException {
		// 대칭 차집합
		// 둘 중 한 집합에만 속하는 원소를 모두 구하는 문제
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine(), " ");
		int Asize = Integer.parseInt(st.nextToken());
		int Bsize = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " "); // A
		Set<Integer> Aset = new HashSet<>();
		for (int i = 0; i < Asize; i++) {
			Aset.add(Integer.parseInt(st.nextToken()));
		}
		
		st = new StringTokenizer(br.readLine(), " "); // B
		Set<Integer> Bset = new HashSet<>();
		for (int i = 0; i < Bsize; i++) {
			Bset.add(Integer.parseInt(st.nextToken()));
		}
		
//		System.out.println(Aset);
//		System.out.println(Bset);
		
		Set<Integer> union = new HashSet<>();
		union.addAll(Aset);
		union.addAll(Bset);
//		System.out.println(union);
//		System.out.println(union.size());
		
		Set<Integer> intersection = new HashSet<>();
		intersection.addAll(Aset);
		intersection.retainAll(Bset);
//		System.out.println(intersection);
//		System.out.println(intersection.size());
		
		StringBuilder sb = new StringBuilder();
		sb.append(union.size() - intersection.size());
		System.out.println(sb);

	}

}
