package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 소수_2581 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int M, N;
    static boolean arr[];

    public static void base() throws IOException {
        M = Integer.parseInt(br.readLine());
        N = Integer.parseInt(br.readLine());

        arr = new boolean[N+1];
    }

    public static void main(String[] args) throws IOException {
        base();

        getPrime();

        int sum = 0;
        int min = -1;

        for(int i=M; i<=N; i++) {
            if(arr[i] == false) {
                if(min == -1) {
                    min = i;
                }
                sum += i;
            }
        }

        if(sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }

    public static void getPrime() {
        arr[0] = true;
        arr[1] = true;

        for(int i=2; i<=Math.sqrt(N+1); i++) {
            for(int j=i*i; j<N+1; j += i) {
                arr[j] = true;
            }
        }
    }
}
