package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 호텔_1106 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuffer sb = new StringBuffer();

    static int C;
    static int N;
    static int[] dp;

    public static void base() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        C = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        dp = new int[C+101];
    }

    public static void main(String[] args) throws IOException {
        base();

        Arrays.fill(dp, Integer.MAX_VALUE);

        dp[0] = 0;

        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int cost = Integer.parseInt(st.nextToken());
            int reward = Integer.parseInt(st.nextToken());
            for(int j = reward; j<C+101; j++) {
                int prev = dp[j-reward];
                if(prev != Integer.MAX_VALUE)
                    dp[j] = Math.min(dp[j], cost+prev);
            }
        }

        int result = Integer.MAX_VALUE;
        for(int i=C; i<C+101; i++) {
            result = Math.min(result, dp[i]);
        }

        System.out.println(result);
    }
}
