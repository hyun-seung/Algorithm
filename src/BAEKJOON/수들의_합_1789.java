package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 수들의_합_1789 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static long S;

    public static void base() throws IOException {
        S = Long.parseLong(br.readLine());
    }

    public static void main(String[] args) throws IOException {
        base();

        int i = 1;
        long s = 0;
        int count = 0;

        while(true) {
            s += i;
            count++;
            if(s > S) {
                break;
            }
            i++;
        }

        System.out.println(count - 1);
    }
}
