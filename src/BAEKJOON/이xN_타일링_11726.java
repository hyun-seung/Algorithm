package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 이xN_타일링_11726 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int N;
    static int[] dp;

    public static void base() throws IOException {
        N = Integer.parseInt(br.readLine());
        dp = new int[N+2];
    }

    public static void main(String[] args) throws IOException {
        base();

        dp[1] = 1;
        dp[2] = 2;

        for(int i=3; i<N+1; i++) {
            dp[i] = (dp[i-1] + dp[i-2]) % 10007;
        }

        System.out.println(dp[N]);
    }
}
