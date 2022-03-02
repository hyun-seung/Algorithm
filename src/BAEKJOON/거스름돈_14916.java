package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 거스름돈_14916 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int N;

    public static void base() throws IOException {
        N = Integer.parseInt(br.readLine());
    }

    public static void main(String[] args) throws IOException {
        base();

        int count = 0;

        while(N > 0) {
            if(N % 5 == 0) {
                count += N/5;
                break;
            }

            N -= 2;
            count++;
        }

        if(N < 0)
            System.out.println(-1);
        else
            System.out.println(count);
    }
}
