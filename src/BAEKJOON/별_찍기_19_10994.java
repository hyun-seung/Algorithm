package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 별_찍기_19_10994 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuffer sb = new StringBuffer();

    static int N;
    static int length;
    static char[][] arr;

    public static void base() throws IOException {
        N = Integer.parseInt(br.readLine());
        length = 4*(N-1) + 1;  // 점화식 : 4(N-1) + 1 or 4N - 3
        arr = new char[length][length];
    }

    public static void main(String[] args) throws IOException {
        base();

        for(int i=0; i<arr.length; i++) {
            Arrays.fill(arr[i], ' ');
        }

        draw(0, length);

        for(int i=0; i<length; i++) {
            for (int j=0; j<length; j++) {
                sb.append(arr[i][j]);
            }
            sb.append('\n');
        }

        System.out.println(sb);
    }

    public static void draw(int s, int len) {
        for(int i=s; i<len; i++) {
            arr[s][i] = '*';    // 위 가로
            arr[len-1][i] = '*';    // 아래 가로
            arr[i][s] = '*';    //왼쪽 세로
            arr[i][len-1] = '*'; // 오른쪽 세로
        }

        if(len == 1) return;

        draw(s+2, len-2);
    }
}
