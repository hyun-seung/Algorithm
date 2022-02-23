package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 소수_2581_new {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int M, N;

    public static void base() throws IOException {
        M = Integer.parseInt(br.readLine());
        N = Integer.parseInt(br.readLine());
    }

    public static void main(String[] args) throws IOException {
        base();

        int sum = 0;
        int min = -1;

        for(int i=M; i<=N; i++) {
            if(isPrime(i)) {
                sum += i;
                if(min == -1)
                    min = i;
            }
        }

        if(sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }

    public static boolean isPrime(int n) {
        if(n == 0 || n == 1)
            return false;

        for(int i=2; i<=(int)Math.sqrt(n); i++) {
            if(n % i == 0)
                return false;
        }

        return true;
    }
}
