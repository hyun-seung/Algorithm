package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class 알바생_강호_1758 {

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

        Arrays.sort(arr, Collections.reverseOrder());

        long answer = 0;

        for(int i=0; i<N; i++) {
            if(arr[i] - i <= 0) {
                break;
            }
            answer += arr[i] - i;
        }


        System.out.println(answer);
    }
}
