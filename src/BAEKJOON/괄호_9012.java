package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class 괄호_9012 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static StringBuilder sb = new StringBuilder();

    static int N;

    static ArrayList<String> list = new ArrayList<>();

    public static void base() throws IOException {
        N = Integer.parseInt(br.readLine());
    }

    public static void main(String[] args) throws IOException {
        base();

        for(int i=0; i<N; i++) {
            String s = br.readLine();
            if(check(s))
                sb.append("YES\n");
            else
                sb.append("NO\n");
        }

        System.out.println(sb);
    }

    public static Boolean check(String s) {
        int count = 0;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '(')
                count++;
            else if(s.charAt(i) == ')')
                if(count > 0)
                    count--;
                else
                    return false;
        }

        if(count == 0)
            return true;
        else
            return false;
    }
}
