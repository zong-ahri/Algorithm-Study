package step6;

import java.util.*;

public class no25206 {

	public static void main(String[] args) {
		// 너의 평점은
		// 열심히 문제를 푸시는 여러분은 A+입니다.
		
		
		//전공평점 = 학점 x 과목평점 의 합을 학점의 총합으로 나눈값
		
		Scanner scanner = new Scanner(System.in);
		
		Map<String, Double> subjectGrade = new HashMap<>();
		subjectGrade.put("A+", 4.5);
		subjectGrade.put("A0", 4.0);
		subjectGrade.put("B+", 3.5);
		subjectGrade.put("B0", 3.0);
		subjectGrade.put("C+", 2.5);
		subjectGrade.put("C0", 2.0);
		subjectGrade.put("D+", 1.5);
		subjectGrade.put("D0", 1.0);
		subjectGrade.put("F", 0.0);

		List<String> gradeList = new ArrayList<>();
		int size = 20;
		for (int i = 0; i < size; i++) {
			gradeList.add(scanner.nextLine());
		}
		
		String[] str = gradeList.get(0).split(" ");
		

		
		System.out.println(str[1]);

	}

}
