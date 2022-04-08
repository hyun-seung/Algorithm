package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 겹치는_건_싫어_20922 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuffer sb = new StringBuffer();

    static int N;
    static int K;
    static int[] arr;
    static int[] num;

    public static void base() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        arr = new int[N];
        num = new int[100001];
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
    }

    public static void main(String[] args) throws IOException {
        base();

        int max =0;
        int start = 0;
        int end = 0;

        while(end < N) {
            while(end < N && num[arr[end]] + 1 <= K) {
                num[arr[end]]++;
                end++;
            }
            int len = end - start;
            max = Math.max(max, len);
            num[arr[start]]--;
            start++;
        }

        System.out.println(max);
    }
}
