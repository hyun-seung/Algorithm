package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 피보나치_수_10870 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int N;

    public static void base() throws IOException {
        N = Integer.parseInt(br.readLine());
    }

    public static void main(String[] args) throws IOException {
        base();

        System.out.println(fibo(N));
    }

    public static int fibo(int n) {
        if(n == 0) {
            return 0;
        } else if(n == 1) {
            return 1;
        } else {
            return fibo(n-1) + fibo(n-2);
        }
    }
}
