package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LCM_5347 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    static int N;

    public static void base() throws IOException {
        N = Integer.parseInt(br.readLine());
    }

    public static void main(String[] args) throws IOException {
        base();

        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            long A = Integer.parseInt(st.nextToken());
            long B = Integer.parseInt(st.nextToken());

            long D = gcd(A, B);

            sb.append(Math.abs(A * B / D)).append("\n");
        }

        System.out.println(sb);
    }

    public static long gcd(long a, long b) {
        while(b != 0) {
            long temp = a % b;

            a = b;
            b = temp;
        }

        return a;
    }
}
