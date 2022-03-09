package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 동전0_11047 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int N;
    static int K;
    static int[] arr;

    public static void base() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        arr = new int[N];
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
    }

    public static void main(String[] args) throws IOException {
        base();

        int count = 0;

        for(int i=N-1; i>=0; i--) {
            if(arr[i] <= K) {
                count += (K/arr[i]);
                K = K % arr[i];
            }
        }

        System.out.println(count);
    }
}
