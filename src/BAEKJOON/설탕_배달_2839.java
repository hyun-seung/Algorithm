package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 설탕_배달_2839 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int N;

    public static void base() throws IOException {
        N = Integer.parseInt(br.readLine());
    }

    public static void main(String[] args) throws IOException {
        base();

        int count = 0;

        while(true) {
            if(N%5 == 0) {
                count += N/5;
                System.out.println(count);
                break;
            } else {
                N -= 3;
                count++;
            }

            if(N < 0) {
                System.out.println(-1);
                break;
            }
        }

    }
}
