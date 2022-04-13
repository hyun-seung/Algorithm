package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 지뢰_찾기_4396 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuffer sb = new StringBuffer();

    static int N;
    static char[][] arr;
    static char[][] arr2;
    static boolean open = false;

    public static void base() throws IOException {
        N = Integer.parseInt(br.readLine());

        arr = new char[N+2][N+2];
        arr2 = new char[N+1][N+1];
        for(int i=1; i<=N; i++) {
            String s = br.readLine();
            for(int j=1; j<=N; j++) {
                arr[i][j] = s.charAt(j-1);
            }
        }
        for(int i=1; i<=N; i++) {
            String s = br.readLine();
            for(int j=1; j<=N; j++) {
                arr2[i][j] = s.charAt(j-1);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        base();

        for(int i=1; i<=N; i++) {
            for(int j=1; j<=N; j++) {
                if(arr2[i][j] == 'x') {
                    check(i, j);
                }
            }
        }

        for(int i=1; i<=N; i++) {
            for(int j=1; j<=N; j++) {
                sb.append(arr2[i][j]);
            }
            sb.append('\n');
        }

        System.out.println(sb);
    }

    public static void check(int i, int j) {
        if(arr[i][j] == '*') {
            arr2[i][j] = '*';
            if(open == false)
                open();
        } else {
            int count = 0;
            if(arr[i-1][j-1] == '*')
                count++;
            if(arr[i-1][j] == '*')
                count++;
            if(arr[i-1][j+1] == '*')
                count++;
            if(arr[i][j-1] == '*')
                count++;
            if(arr[i][j+1] == '*')
                count++;
            if(arr[i+1][j-1] == '*')
                count++;
            if(arr[i+1][j] == '*')
                count++;
            if(arr[i+1][j+1] == '*')
                count++;

            arr2[i][j] = (char)(count + '0');
        }
    }

    public static void open() {
        open = true;
        for(int i=1; i<=N; i++) {
            for(int j=1; j<=N; j++) {
                if(arr[i][j] == '*') {
                    arr2[i][j] = '*';
                }
            }
        }
    }
}
