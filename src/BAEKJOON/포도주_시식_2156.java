package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 포도주_시식_2156 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuffer sb = new StringBuffer();

    static int N;
    static int[] arr;
    static int[] dp;

    public static void base() throws IOException {
        N = Integer.parseInt(br.readLine());

        arr = new int [N+1];
        dp = new int [N+1];
        for(int i=1; i<N+1; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
    }

    public static void main(String[] args) throws IOException {
        base();

        dp[1] = arr[1];
        if(N > 1) {
            dp[2] = arr[2] + arr[1];
        }

        for(int i=3; i<N+1; i++) {
            dp[i] = Math.max(dp[i-1], Math.max(dp[i-2] + arr[i], dp[i-3] + arr[i-1] + arr[i]));
        }

        System.out.println(dp[N]);
    }
}
