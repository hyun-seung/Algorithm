package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 계단_오르기_2579_diff {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int N;
    static int[] arr;
    static Integer[] dp;

    public static void base() throws IOException {
        N = Integer.parseInt(br.readLine());

        arr = new int[N+1];
        for(int i=1; i<=N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        dp = new Integer[N+1];
    }

    public static void main(String[] args) throws IOException {
        base();

        dp[0] = arr[0];
        dp[1] = arr[1];

        if(N >= 2) {
            dp[2] = arr[1] + arr[2];
        }

        System.out.println(recur(N));
    }

    public static int recur(int n) {
        if(dp[n] == null) {
            dp[n] = Math.max(recur(n-2), recur(n-3) + arr[n-1]) + arr[n];
        }

        return dp[n];
    }
}
