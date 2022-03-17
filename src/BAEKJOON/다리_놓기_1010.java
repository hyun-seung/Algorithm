package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 다리_놓기_1010 {

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
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            sb.append(String.format("%.0f\n", combi(M, N)));
        }

        System.out.println(sb);
    }

    public static double combi(int n, int r) {
        double a = 1;
        double b = 1;

        for(int i=n; i>n-r; i--) {
            a = a * i;
        }

        for(int i=r; i>0; i--) {
            b = b * i;
        }

        return a/b;
    }
}
