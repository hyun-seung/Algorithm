package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 소인수분해_11653 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int N;

    public static void base() throws IOException {
        N = Integer.parseInt(br.readLine());
    }

    public static void main(String[] args) throws IOException {
        base();

        for(int i=2; i<=Math.sqrt(N); i++) {
            while(N % i == 0) {
                System.out.println(i);
                N /= i;
            }
        }

        if(N != 1) {
            System.out.println(N);
        }


    }
}
