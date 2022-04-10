package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 윤년_2753 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuffer sb = new StringBuffer();

    static int N;

    public static void base() throws IOException {
        N = Integer.parseInt(br.readLine());
    }

    public static void main(String[] args) throws IOException {
        base();

        boolean check = false;

        if(N % 4 == 0) {
            if(N % 100 != 0 || N % 400 == 0)
                check = true;
        }

        if(check)
            System.out.println(1);
        else
            System.out.println(0);
    }
}
