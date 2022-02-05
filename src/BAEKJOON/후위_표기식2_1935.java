package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 후위_표기식2_1935 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int N;
    static int[] array;
    static String s;

    static Stack<Double> stack = new Stack<>();

    public static void base() throws IOException {
        N = Integer.parseInt(br.readLine());

        s = br.readLine();

        array = new int [N];

        for(int i=0; i<N; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }
    }

    public static void main(String[] args) throws IOException {
        base();

        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) >= 65  && s.charAt(i) <= 90) {
                stack.push((double) array[s.charAt(i)-65]);
            } else {
                double b = stack.pop();
                double a = stack.pop();

                switch(s.charAt(i)) {
                    case '+' :
                        stack.push(a + b);
                        break;
                    case '-' :
                        stack.push(a - b);
                        break;
                    case '*' :
                        stack.push(a * b);
                        break;
                    case '/' :
                        stack.push(a / b);
                        break;
                }
            }
        }

        System.out.println(String.format("%.2f", stack.pop()));
    }
}
