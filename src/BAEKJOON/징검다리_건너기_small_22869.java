package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 징검다리_건너기_small_22869 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuffer sb = new StringBuffer();

    static int N;
    static int K;
    static int[] arr;
    static int[] dp;

    public static void base() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        arr = new int[N+1];
        dp = new int[N+1];

        st = new StringTokenizer(br.readLine(), " ");
        for(int i=1; i<=N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
    }

    public static void main(String[] args) throws IOException {
        base();

        Arrays.fill(dp, Integer.MAX_VALUE);

        dp[0] = 0;
        dp[1] = 0;

        for(int i=1; i<N; i++) {
            if(dp[i] > K) {
                continue;
            }

            for(int j=i+1; j<N+1; j++) {
                int temp = (j-i) * (1 + Math.abs(arr[i] - arr[j]));
                dp[j] = Math.min(dp[j], temp);
            }
        }

        if(dp[N] > K)
            System.out.println("NO");
        else
            System.out.println("YES");

    }
}
