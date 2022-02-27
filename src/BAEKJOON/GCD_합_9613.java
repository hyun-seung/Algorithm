package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GCD_합_9613 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    static int N;
    static int[] arr;

    public static void base() throws IOException {
        N = Integer.parseInt(br.readLine());
    }

    public static void main(String[] args) throws IOException {
        base();

        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int n = Integer.parseInt(st.nextToken());
            arr = new int [n];
            for(int j=0; j<n; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }

            long sum = 0;

            for(int j=0; j<n; j++) {
                for(int k=j+1; k<n; k++) {
                    sum += GCD(arr[j], arr[k]);
                }
            }

            sb.append(sum).append("\n");
        }

        System.out.println(sb);
    }

    public static long GCD(long a, long b) {
        while(b != 0) {
            long temp = a % b;

            a = b;
            b = temp;
        }

        return a;
    }
}
