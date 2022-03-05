package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 로프_2217 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int N;
    static int[] arr;

    public static void base() throws IOException {
        N = Integer.parseInt(br.readLine());

        arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
    }

    public static void main(String[] args) throws IOException {
        base();

        Arrays.sort(arr);

        int max = 0;
        for (int i = N - 1; i >= 0; i--) {
            arr[i] = arr[i] * (N - i);
            if (arr[i] > max)
                max = arr[i];
        }

        System.out.println(max);
    }
}