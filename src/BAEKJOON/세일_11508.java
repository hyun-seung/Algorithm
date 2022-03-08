package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class 세일_11508 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int N;
    static Integer[] arr;

    public static void base() throws IOException {
        N = Integer.parseInt(br.readLine());

        arr = new Integer[N];
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
    }

    public static void main(String[] args) throws IOException {
        base();

        Arrays.sort(arr, Comparator.reverseOrder());

        int count = N/3;
        long sum = 0;

        for(int i=0; i<count; i++) {
            sum += arr[3*i] + arr[3*i+1];
        }

        for(int i=3*count; i<N; i++) {
            sum += arr[i];
        }

        System.out.println(sum);
    }
}
