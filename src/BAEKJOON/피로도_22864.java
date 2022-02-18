package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 피로도_22864 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int A, B, C, M;

    static int exhaustion = 0;
    static int totalWork = 0;

    public static void base() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
    }

    public static void main(String[] args) throws IOException {
        base();

        int hour = 0;

        while(hour < 24) {
            if(exhaustion + A <= M) {
                work();
            } else {
                rest();
            }
            hour++;
        }

        System.out.println(totalWork);
    }

    public static void work() {
        exhaustion += A;
        totalWork += B;
    }

    public static void rest() {
        exhaustion -= C;
        if(exhaustion < 0)
            exhaustion = 0;
    }
}
