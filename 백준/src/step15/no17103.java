package step15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class no17103 {

    static boolean[] primeArray = new boolean[1000001];

    public static void main(String[] args) throws Exception {
        // 골드바흐 파티션
        // 소수를 더 자유자재로 다루는 문제 2

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // Scanner와 유사
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // System.out.println();과 유사

        findPrime(); // 0부터 1000001까지 소수 = false, 소수x = true

        int T = Integer.parseInt(br.readLine()); // br.readLine()은 String형 타입 출력하여 Integer.parseInt로 형변환

        for (int i = 0; i < T; i++) { // 첫줄 입력값 만큼 테스트 반복

            int N = Integer.parseInt(br.readLine());

            int partitionCount = 0;

            if (N % 2 == 0 && N != 0) { // N은 짝수이면서 0이 아님
                for (int j = 2; j <= N / 2; j++) { // 두 소수(a,b) a + b = N일 경우 (N - a = b 라고 생각할 수도 있음)
                    if (!primeArray[j]) {
                        if (!primeArray[N - j]) {
                            partitionCount++;
                        }
                    }
                }
                bw.write(partitionCount + "\n");
            } else {
                bw.write(0 + "\n");
            }
        }

        br.close();

        bw.flush();
        bw.close();

    }

    // 소수판별 배열 만드는 메소드
    static void findPrime() {
        primeArray[0] = primeArray[1] = true;

        for (int i = 2; i < primeArray.length; i++) {

            if (primeArray[i] == false) {
                for (int j = 2; i * j < primeArray.length; j++) {
                    primeArray[i * j] = true;
                }
            }
        }
    }

}