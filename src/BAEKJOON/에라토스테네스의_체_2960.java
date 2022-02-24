package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 에라토스테네스의_체_2960 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int N, K;
    static boolean[] arr;

    public static void base() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        arr = new boolean[N+1];
    }

    public static void main(String[] args) throws IOException {
        base();

        int count = 0;

        arr[0] = true;
        arr[1] = true;

        for(int i=2; i<=N; i++) {
            for(int j=i; j<=N; j+=i) {
                if(!arr[j]) {
                    arr[j] = true;
                    count++;
                    if(count == K) {
                        System.out.println(j);
                        break;
                    }
                }
            }
        }
    }
}
