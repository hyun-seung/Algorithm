package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class 다음_소수_4134 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuffer sb = new StringBuffer();

    static int N;

    public static void base() throws IOException {
        N = Integer.parseInt(br.readLine());
    }

    public static void main(String[] args) throws IOException {
        base();

        for(int i=0; i<N; i++) {
            String temp = br.readLine();

            BigInteger nextPrimeNumber = new BigInteger(temp);

            if (nextPrimeNumber.isProbablePrime(10)) {  // 입력 값이 소수면 그대로 출력
                sb.append(nextPrimeNumber).append("\n");
            } else {  // 입력 값이 소수가 아니면 다음 소수를 구해서 출력
                sb.append(nextPrimeNumber.nextProbablePrime()).append("\n");
            }
        }
        System.out.println(sb);
    }
}
