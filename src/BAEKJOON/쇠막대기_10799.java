package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 쇠막대기_10799 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static String s;

    static Stack<Character> stack = new Stack<>();

    public static void base() throws IOException {
        s = br.readLine();
    }

    public static void main(String[] args) throws IOException {
        base();

        s = s.replace("()","0");

        int sum = 0;

        for(int i=0; i<s.length(); i++) {
            switch(s.charAt(i)) {
                case '(' :
                    stack.add(s.charAt(i));
                    break;
                case ')' :
                    stack.pop();
                    sum++;
                    break;
                case '0' :
                    sum += stack.size();
                    break;
            }
        }

        System.out.println(sum);
    }
}
