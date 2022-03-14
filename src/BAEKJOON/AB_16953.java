package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AB_16953 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static long A,B;

    public static void base() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        A = Long.parseLong(st.nextToken());
        B = Long.parseLong(st.nextToken());
    }

    public static void main(String[] args) throws IOException {
        base();

        int answer = 1;

        while(B != A) {
            if(B < A) {
                answer = -1;
                break;
            }

            String s = String.valueOf(B);

            if(B % 2 != 0 && s.charAt(s.length() - 1) != '1') {
                answer = -1;
                break;
            }

            if(B % 2 == 0) {
                B /= 2;
            } else {
                s = s.substring(0, s.length() - 1);
                B = Long.parseLong(s);
            }

            answer++;
        }

        System.out.println(answer);
    }
}
