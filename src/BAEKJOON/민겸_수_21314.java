package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 민겸_수_21314 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb;

    static String s;

    public static void base() throws IOException {
        s = br.readLine();
    }

    public static void main(String[] args) throws IOException {
        base();

        System.out.println(findMax());
        System.out.println(findMin());
    }

    public static String findMax() {
        sb = new StringBuilder();

        int M_stack = 0;

        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == 'M') {
                M_stack++;
                if(i == s.length() - 1) {
                    while(M_stack != 0) {
                        sb.append(1);
                        M_stack--;
                    }
                }
            } else {
                sb.append(5);
                while(M_stack != 0) {
                    sb.append(0);
                    M_stack--;
                }
            }
        }

        return sb.toString();
    }

    public static String findMin() {
        sb = new StringBuilder();

        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == 'M') {
                sb.append(1);

                while(i+1 < s.length() && s.charAt(i+1) == 'M') {
                    i++;
                    sb.append(0);
                }
            } else {
                sb.append(5);
            }
        }

        return sb.toString();
    }
}
