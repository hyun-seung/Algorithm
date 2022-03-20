package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 일이삼더하기_9095 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    static int T;
    static int[] dp = new int[11];

    public static void base() throws IOException {
        T = Integer.parseInt(br.readLine());
    }

    public static void main(String[] args) throws IOException {
        base();

        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for(int i=4; i<11; i++) {
            dp[i] = dp[i-3] + dp[i-2] + dp[i-1];
        }

        for(int i=0; i<T; i++) {
            int n = Integer.parseInt(br.readLine());

            sb.append(dp[n]).append('\n');
        }

        System.out.println(sb);
    }
}
