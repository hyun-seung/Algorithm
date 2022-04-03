package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 징검다리_건너기_21317 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuffer sb = new StringBuffer();

    static int N;
    static int[] sJump;
    static int[] lJump;
    static int K;

    static int answer = Integer.MAX_VALUE;

    public static void base() throws IOException {
        N = Integer.parseInt(br.readLine());

        sJump = new int[N];
        lJump = new int[N];

        for(int i=1; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            sJump[i] = Integer.parseInt(st.nextToken());
            lJump[i] = Integer.parseInt(st.nextToken());
        }

        K = Integer.parseInt(br.readLine());
    }

    public static void main(String[] args) throws IOException {
        base();

        go(0, 1, false);

        System.out.println(answer);
    }

    public static void go(int sum, int to, boolean useMax) {
        if(to == N) {
            answer = Math.min(answer, sum);
            return;
        }

        if(to > N)
            return;

        go(sum + sJump[to], to+1, useMax);
        go(sum + lJump[to], to+2, useMax);

        if(!useMax) {
            go(sum + K, to+3, true);
        }
    }
}
