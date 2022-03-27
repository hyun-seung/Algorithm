package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 스티커_9465 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuffer sb = new StringBuffer();

    static int T;
    static int[][] arr;
    static int[][] dp;

    public static void base() throws IOException {
        T = Integer.parseInt(br.readLine());
    }

    public static void main(String[] args) throws IOException {
        base();

        for(int i=0; i<T; i++) {
            int n = Integer.parseInt(br.readLine());

            arr = new int[2][n+1];
            dp = new int[2][n+1];

            StringTokenizer st;
            for(int j=0; j<2; j++) {
                st = new StringTokenizer(br.readLine(), " ");
                for(int k=1; k<n+1; k++) {
                    arr[j][k] = Integer.parseInt(st.nextToken());
                }
            }

            dp[0][1] = arr[0][1];
            dp[1][1] = arr[1][1];

            for(int k=2; k<n+1; k++) {
                dp[0][k] = Math.max(dp[1][k-1],dp[1][k-2]) + arr[0][k];
                dp[1][k] = Math.max(dp[0][k-1],dp[0][k-2]) + arr[1][k];
            }

            sb.append(Math.max(dp[0][n], dp[1][n])).append('\n');
        }

        System.out.println(sb.toString());
    }
}
