package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 이xN_타일링_2_11727 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int N;
    static int[] dp;

    public static void base() throws IOException {
        N = Integer.parseInt(br.readLine());
        dp = new int [N+1];
    }

    public static void main(String[] args) throws IOException {
        base();

        dp[1] = 1;

        if(N >= 2) {
            dp[2] = 3;
        }

        for(int i=3; i<N+1; i++) {
            dp[i] = (dp[i-1] + 2*dp[i-2]) % 10007;
        }

        System.out.println(dp[N]);
    }
}
