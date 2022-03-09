package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 서강근육맨_20300 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int N;
    static long[] arr;

    public static void base() throws IOException {
        N = Integer.parseInt(br.readLine());

        arr = new long[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<N; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }
    }

    public static void main(String[] args) throws IOException {
        base();

        Arrays.sort(arr);

        long M = 0;

        if(N % 2 != 0) {
            M = arr[N-1];
            for(int i=0; i<(N-1)/2; i++) {
                M = Math.max(M, arr[i] + arr[N-2-i]);
            }
        } else {
            for(int i=0; i<N/2; i++) {
                M = Math.max(M, arr[i] + arr[N-1-i]);
            }
        }

        System.out.println(M);
    }
}
