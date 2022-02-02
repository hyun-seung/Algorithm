package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class 덱_10866 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static StringBuilder sb = new StringBuilder();

    static ArrayDeque<Integer> deq = new ArrayDeque<>();

    static int N;

    public static void base() throws IOException {
        N = Integer.parseInt(br.readLine());
    }

    public static void main(String[] args) throws IOException {
        base();

        for(int i=0; i<N; i++) {
            String s = br.readLine();
            String[] s1 = s.split(" ");

            switch (s1[0]) {
                case "push_front":
                    push_front(Integer.parseInt(s1[1]));
                    break;
                case "push_back":
                    push_back(Integer.parseInt(s1[1]));
                    break;
                case "pop_front":
                    pop_front();
                    break;
                case "pop_back":
                    pop_back();
                    break;
                case "size":
                    size();
                    break;
                case "empty":
                    empty();
                    break;
                case "front":
                    front();
                    break;
                case "back":
                    back();
                    break;
            }
        }
        System.out.println(sb);
    }

    public static void push_front(int n) {
        deq.addFirst(n);
    }

    public static void push_back(int n) {
        deq.addLast(n);
    }

    public static void pop_front() {
        if(deq.size() > 0)
            sb.append(deq.pollFirst() + "\n");
        else
            sb.append("-1\n");
    }

    public static void pop_back() {
        if(deq.size() > 0)
            sb.append(deq.pollLast() + "\n");
        else
            sb.append("-1\n");
    }

    public static void size() {
        sb.append(deq.size() + "\n");
    }

    public static void empty() {
        if(deq.isEmpty())
            sb.append("1\n");
        else
            sb.append("0\n");
    }

    public static void front() {
        if(deq.size() > 0)
            sb.append(deq.peekFirst() + "\n");
        else
            sb.append("-1\n");
    }

    public static void back() {
        if(deq.size() > 0)
            sb.append(deq.peekLast() + "\n");
        else
            sb.append("-1\n");
    }
}
