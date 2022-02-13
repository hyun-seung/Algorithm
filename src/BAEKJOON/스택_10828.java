package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class 스택_10828 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static StringBuilder sb = new StringBuilder();

    static ArrayList<Integer> stack = new ArrayList<>();

    static int N;

    public static void base() throws IOException {
        N = Integer.parseInt(br.readLine());
    }

    public static String getLine() throws IOException {
        return br.readLine();
    }

    public static void main(String[] args) throws IOException {
        base();

        for(int i=0; i<N; i++) {
            String s= getLine();
            String[] s1 = s.split(" ");
            switch(s1[0]) {
                case "push":
                    push(Integer.parseInt(s1[1]));
                    break;
                case "pop":
                    pop();
                    break;
                case "size":
                    size();
                    break;
                case "empty":
                    empty();
                    break;
                case "top":
                    top();
                    break;
            }
        }

        System.out.println(sb);
    }

    public static void push(int n) {
        stack.add(n);
    }

    public static void pop() {
        int size = stack.size();
        if(size > 0) {
            sb.append(stack.remove(size-1) + "\n");
        } else {
            sb.append("-1\n");
        }
    }

    public static void size() {
        sb.append(stack.size() + "\n");
    }

    public static void empty() {
        if(stack.size() != 0)
            sb.append("0\n");
        else
            sb.append("1\n");
    }

    public static void top() {
        int size = stack.size();
        if(size > 0)
            sb.append(stack.get(size-1) + "\n");
        else
            sb.append("-1\n");
    }
}
