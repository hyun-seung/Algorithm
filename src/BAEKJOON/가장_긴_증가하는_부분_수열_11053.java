package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 가장_긴_증가하는_부분_수열_11053 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int N;
    static int[] arr;
    static int[] dp;

    public static void base() throws IOException {
        N = Integer.parseInt(br.readLine());

        arr = new int[N+1];
        dp = new int[N+1];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
    }

    public static void main(String[] args) throws IOException {
        base();

        dp[0] = 1;
        int result = dp[0];

        for(int i=1; i<N; i++) {
            dp[i] = 1;
            for(int j=0; j<i; j++) {
                if(arr[i] > arr[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }

            result = Math.max(result, dp[i]);
        }

        System.out.println(result);
    }
}
