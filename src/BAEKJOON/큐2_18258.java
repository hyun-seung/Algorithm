package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class 큐2_18258 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static StringBuilder sb = new StringBuilder();

    static int N;

    static LinkedList<Integer> queue = new LinkedList<>();

    public static void base() throws IOException {
        N = Integer.parseInt(br.readLine());
    }

    public static void main(String[] args) throws IOException {
        base();

        for(int i=0; i<N; i++) {
            String s = br.readLine();
            String s1[] = s.split(" ");

            switch(s1[0]) {
                case "push" :
                    push(Integer.parseInt(s1[1]));
                    break;
                case "pop" :
                    pop();
                    break;
                case "size" :
                    size();
                    break;
                case "empty" :
                    empty();
                    break;
                case "front" :
                    front();
                    break;
                case "back" :
                    back();
                    break;
            }
        }
        System.out.println(sb);
    }

    public static void push(int n) {
        queue.add(n);
    }

    public static void pop() {
        if(queue.isEmpty())
            sb.append("-1\n");
        else
            sb.append(queue.pop() + "\n");
    }

    public static void size() {
        sb.append(queue.size() + "\n");
    }

    public static void empty() {
        if(queue.isEmpty())
            sb.append("1\n");
        else
            sb.append("0\n");
    }

    public static void front() {
        if(queue.isEmpty())
            sb.append("-1\n");
        else
            sb.append(queue.getFirst() + "\n");
    }

    public static void back() {
        if(queue.isEmpty())
            sb.append("-1\n");
        else
            sb.append(queue.getLast() + "\n");
            queue.peek();
    }
}
