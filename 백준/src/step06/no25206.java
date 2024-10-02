package step06;

import java.util.*;

public class no25206 {

    public static void main(String[] args) {
        // 너의 평점은
        // 열심히 문제를 푸시는 여러분은 A+입니다.


        //전공평점 = 학점 x 과목평점 의 합을 학점의 총합으로 나눈값

        Scanner scanner = new Scanner(System.in);

        Map<String, Double> 과목성적목록 = new HashMap<>();
        과목성적목록.put("A+", 4.5);
        과목성적목록.put("A0", 4.0);
        과목성적목록.put("B+", 3.5);
        과목성적목록.put("B0", 3.0);
        과목성적목록.put("C+", 2.5);
        과목성적목록.put("C0", 2.0);
        과목성적목록.put("D+", 1.5);
        과목성적목록.put("D0", 1.0);
        과목성적목록.put("F", 0.0);

        List<String> 성적목록 = new ArrayList<>();
        int size = 20;
        for (int i = 0; i < size; i++) {
            성적목록.add(scanner.nextLine());
        }

        과목평점함수(성적목록, 과목성적목록);

    }

    // 과목평점 구현부
    private static void 과목평점함수(List<String> gradeList, Map<String, Double> subjectGradeList) {
        double 학점과목평점합 = 0;
        double 학점합 = 0;

        for (int i = 0; i < gradeList.size(); i++) {
            String[] grades = gradeList.get(i).split(" ");
            if (subjectGradeList.get(grades[2]) != null) {
                double 과목평점 = Double.parseDouble(grades[1]);
                double 학점 = subjectGradeList.get(grades[2]);
                double 학점과목평점 = 과목평점 * 학점;
                학점과목평점합 += 학점과목평점;
                학점합 += 과목평점;
//				System.out.println("과목이름: " + grades[0]);
//				System.out.println("과목평점: " + 과목평점);
//				System.out.println("학점: " + 학점);
//				System.out.println("학점과목평점: " + 학점과목평점);
//				System.out.println("학점과목평점합: " + 학점과목평점합);
//				System.out.println("학점합: " + 학점합);
            }
//			System.out.println();
        }

        System.out.printf("%f", 학점과목평점합/학점합);
    }

}