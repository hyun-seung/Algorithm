package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 계단_오르기_2579 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int N;
    static int[] arr;
    static int[] dp;

    public static void base() throws IOException {
        N = Integer.parseInt(br.readLine());

        arr = new int[N+1];
        for(int i=1; i<=N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        dp = new int[N+1];
    }

    public static void main(String[] args) throws IOException {
        base();

        dp[1] = arr[1];

        if(N >= 2) {
            dp[2] = arr[1] + arr[2];
        }

        for(int i=3; i<N+1; i++) {
            dp[i] = Math.max(dp[i-2], dp[i-3] + arr[i-1]) + arr[i];     // 1) i-2에서 점프 , 2) i-3에서 i-1로 점프 후 한 칸 이동
        }

        System.out.println(dp[N]);
    }
}
