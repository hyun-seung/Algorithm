package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 블로그2_20365 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int N;
    static String s;

    public static void base() throws IOException {
         N = Integer.parseInt(br.readLine());
         s = br.readLine();
    }

    public static void main(String[] args) throws IOException {
        base();

        int blue = 0;
        int red = 0;

        for(int i=0; i<N; i++) {
            char c = s.charAt(i);

            if(i == 0) {
                if(c == 'B') blue++;
                else
                    red++;
            } else {
                if(s.charAt(i-1) == c)
                    continue;
                else {
                    if(c == 'B') blue++;
                    else
                        red++;
                }
            }
        }

        int answer = 0;

        if(blue >= red)
            answer = red + 1;
        else
            answer = blue + 1;

        System.out.println(answer);
    }
}
