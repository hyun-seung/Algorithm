package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 쉬운_계단_수_10844 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int N;
    final static long MOD = 1000000000;
    static long count = 0;

    static Long[][] dp;

    public static void base() throws IOException {
        N = Integer.parseInt(br.readLine());

        dp = new Long[N+1][10];
    }

    public static void main(String[] args) throws IOException {
        base();

        for(int i=0; i<10; i++) {
            dp[1][i] = 1L;
        }

        for(int i=1; i<=9; i++) {
            count += recur(N, i);
        }

        System.out.println(count % MOD);
    }

    public static long recur(int digit, int value) {
        if(digit == 1) {
            return dp[digit][value];
        }

        if(dp[digit][value] == null) {
            if(value == 0) {
                dp[digit][value] = recur(digit-1, 1);
            } else if(value == 9) {
                dp[digit][value] = recur(digit-1, 8);
            } else {
                dp[digit][value] = recur(digit-1, value-1) + recur(digit-1, value+1);
            }
        }

        return dp[digit][value] % MOD;
    }
}
