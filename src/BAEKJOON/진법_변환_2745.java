package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 진법_변환_2745 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static String B;
    static int N;
    static int answer= 0;

    public static void base() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        B = st.nextToken();
        N = Integer.parseInt(st.nextToken());
    }

    public static void main(String[] args) throws IOException {
        base();

        for(int i=0; i<B.length(); i++) {
            char temp = B.charAt(i);

            if('A' <= temp && temp <= 'Z') {
                answer = answer * N + ((temp - 'A') + 10);
            } else {
                answer = answer * N + (temp - '0');
            }
        }

        System.out.println(answer);
    }
}
