package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 괄호의_값_2504 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

   static String s;

    static Stack<Character> stack = new Stack<>();

    static int answer = 0;

    public static void base() throws IOException {
        s = br.readLine();
    }

    public static void main(String[] args) throws IOException {
        base();

        if(doIt()) {
            System.out.println(answer);
        } else {
            System.out.println("0");
        }
    }

    public static boolean doIt() {
        int tmp = 1;
        for(int i=0; i<s.length(); i++) {
            char now = s.charAt(i);
            if(now == '(') {
                stack.push(now);
                tmp *= 2;
            } else if(now == '[') {
                stack.push(now);
                tmp *= 3;
            } else if(now == ')') {
                if(stack.isEmpty() || stack.peek() != '(') {
                    return false;
                } else if(s.charAt(i-1) == '(') {
                    answer += tmp;
                }
                stack.pop();
                tmp /= 2;
            } else if(now == ']') {
                if(stack.isEmpty() || stack.peek() != '[') {
                    return false;
                } else if(s.charAt(i-1) == '[') {
                    answer += tmp;
                }
                stack.pop();
                tmp /= 3;
            }
        }

        if(stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
