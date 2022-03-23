package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class 조합_2407 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int N;
    static int M;
    static BigInteger[][] dp;

    public static void base() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        dp = new BigInteger[N+1][N+1];
    }

    public static void main(String[] args) throws IOException {
        base();

        for(int i=1; i<N+1; i++) {
            for(int j=0; j<=i; j++) {
                if(j == 0 || j == i)
                    dp[i][j] = new BigInteger("1");
                else {
                    dp[i][j] = dp[i-1][j-1].add(dp[i-1][j]);
                }
            }
        }

        System.out.println(dp[N][M]);
    }
}
