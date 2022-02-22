package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class 최대_힙_11279_new {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    static int N;
    static PriorityQueue<Integer> queue = new PriorityQueue<>();

    public static void base() throws IOException {
        N = Integer.parseInt(br.readLine());
    }

    public static void main(String[] args) throws IOException {
        base();

        for(int i=0; i<N; i++) {
            int temp = Integer.parseInt(br.readLine());

            if(temp == 0) {
                if(queue.isEmpty())
                    sb.append(0).append("\n");
                else
                    sb.append(queue.poll() * -1).append("\n");
            } else {
                queue.offer(temp * -1);
            }
        }

        System.out.println(sb);
    }
}
