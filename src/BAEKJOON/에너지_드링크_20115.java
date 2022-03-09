package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class 에너지_드링크_20115 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int N;
    static Integer[] arr;

    public static void base() throws IOException {
        N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        arr = new Integer[N];
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
    }

    public static void main(String[] args) throws IOException {
        base();

        double sum = 0;

        Arrays.sort(arr, Comparator.reverseOrder());

        sum += arr[0];
        for(int i=1; i<N; i++) {
            sum += (double)arr[i]/2;
        }

        System.out.println(sum);
    }
}
