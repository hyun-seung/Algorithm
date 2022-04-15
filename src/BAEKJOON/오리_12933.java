package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 오리_12933 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuffer sb = new StringBuffer();

    static String s;
    static String duck = "quack";
    static boolean[] visit;
    static int count = 0;

    public static void base() throws IOException {
        s = br.readLine();
        visit = new boolean[s.length()];
    }

    public static void main(String[] args) throws IOException {
        base();

        if(s.length() % 5 == 0) {
            for(int i=0; i<s.length(); i++) {
                if(s.charAt(i) == 'q' && !visit[i]) {
                    check(i);
                }
            }

            for(int i=0; i<s.length(); i++) {
                if(visit[i] == false) {
                    System.out.println(-1);
                    return;
                }
            }

            if(count == 0) {
                System.out.println(-1);
                return;
            }

            System.out.println(count);
        } else {
            System.out.println(-1);
            return;
        }
    }

    public static void check(int start) {
        boolean first = true;
        int index = 0;

        for(int i=start; i<s.length(); i++) {
            if(s.charAt(i) == duck.charAt(index) && !visit[i]) {
                visit[i] = true;
                if(duck.charAt(index) == 'k') {
                        if(first) {
                            count++;
                            first = false;
                        }
                        index = 0;
                        continue;
                }
                index++;
            }
        }
    }
}
