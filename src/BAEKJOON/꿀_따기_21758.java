package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 꿀_따기_21758 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int N;
    static int[] honeys;
    static long max;

    static long total;
    static long[] toRightTotal;
    static long[] toLeftTotal;

    public static void base() throws IOException {
        N = Integer.parseInt(br.readLine());

        honeys = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<N; i++) {
            honeys[i] = Integer.parseInt(st.nextToken());
        }

        toRightTotal = new long[N];
        toLeftTotal = new long[N];
    }

    public static void main(String[] args) throws IOException {
        base();

        long temp = 0;

        for(int i=0; i<N; i++) {
            temp += honeys[i];
            toRightTotal[i] = temp;
        }

        temp = 0;
        for(int i=N-1; i>=0; i--) {
            temp += honeys[i];
            toLeftTotal[i] = temp;
        }

        total = toRightTotal[N-1];

        rightHoney();
        leftHoney();
        midHoney();

        System.out.println(max);
    }

    public static void rightHoney() {   // 맨 왼쪽 벌, 맨 오른쪽 꿀, 중간의 벌 위치 찾기
        long b1, b2;

        for(int i=1; i<=N-2; i++) {
            b1 = total - honeys[0] - honeys[i];
            b2 = total - toRightTotal[i];
            max = Math.max(max, b1 + b2);
        }
    }

    public static void leftHoney() {    // 맨 오른쪽 꿀, 맨 왼쪽 벌, 중간의 벌 위치 찾기
        long b1, b2;

        for(int i=N-2; i>=1; i--) {
            b1 = total - honeys[N-1] - honeys[i];
            b2 = total - toLeftTotal[i];
            max = Math.max(max, b1 + b2);
        }
    }

    public static void midHoney() {     // 맨 오른쪽 벌, 맨 왼쪽 벌, 중간의 꿀 위치 찾기
        long b1, b2;

        for(int i=1; i<=N-2; i++) {
            b1 = toRightTotal[i] - honeys[0];
            b2 = toLeftTotal[i] - honeys[N-1];
            max = Math.max(max, b1 + b2);
        }
    }
}
