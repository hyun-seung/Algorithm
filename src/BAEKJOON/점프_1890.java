package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 점프_1890 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuffer sb = new StringBuffer();

    static int N;
    static int[][] arr;
    static long[][] dp;

    public static void base() throws IOException {
        N = Integer.parseInt(br.readLine());

        arr = new int[N+1][N+1];
        dp = new long[N+1][N+1];
        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }

    public static void main(String[] args) throws IOException {
        base();

        dp[0][0] = 1;

        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                if(arr[i][j] == 0)
                    break;
                else {
                    int right = j + arr[i][j];
                    int down = i + arr[i][j];

                    if(right < N) {
                        dp[i][right] += dp[i][j];
                    }
                    if(down < N) {
                        dp[down][j] += dp[i][j];
                    }
                }
            }
        }

        System.out.println(dp[N-1][N-1]);
    }
}
