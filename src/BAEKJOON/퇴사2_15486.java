package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 퇴사2_15486 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int N;
    static int[] t;
    static int[] p;
    static int[] dp;

    public static void base() throws IOException {
        N = Integer.parseInt(br.readLine());

        t = new int[N+1];
        p = new int[N+1];
        dp = new int[N+1];

        StringTokenizer st;
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            t[i] = Integer.parseInt(st.nextToken());
            p[i] = Integer.parseInt(st.nextToken());
        }
    }

    public static void main(String[] args) throws IOException {
        base();

        int max = 0;

        for(int i=0; i<N+1; i++) {
            if(dp[i] > max) {
                max = dp[i];
            }

            int next = i + t[i];
            if(N+1 > next) {
                dp[next] = Math.max(dp[next], max + p[i]);
            }
        }

        System.out.println(max);
    }
}
