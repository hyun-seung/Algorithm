package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Four_Squares_17626 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int N;
    static int[] dp;

    public static void base() throws IOException {
        N = Integer.parseInt(br.readLine());
        dp = new int[N+1];
    }

    public static void main(String[] args) throws IOException {
        base();

        dp[0] = 0;
        dp[1] = 1;

        for(int i=2; i<=N; i++) {
            int min = Integer.MAX_VALUE;

            for(int j=1; j * j <= i; j++) {
                min = Math.min(min, dp[i - j*j]);
            }

            dp[i] = min + 1;
        }

        System.out.println(dp[N]);
    }
}
