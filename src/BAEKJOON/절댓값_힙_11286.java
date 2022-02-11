package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class 절댓값_힙_11286 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    static int N;

    static PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            int tmp1 = Math.abs(o1);
            int tmp2 = Math.abs(o2);

            if(tmp1 == tmp2)
                return o1 > o2 ? 1 : -1;
            else
                return tmp1 - tmp2;
        }
    });

    public static void base() throws IOException {
        N = Integer.parseInt(br.readLine());
    }

    public static void main(String[] args) throws IOException {
        base();

        for(int i=0; i<N; i++) {
            int now = Integer.parseInt(br.readLine());

            if(now == 0) {
               if(pq.size() == 0) {
                   sb.append("0").append("\n");
               } else {
                   sb.append(pq.poll()).append("\n");
               }
            } else {
                pq.offer(now);
            }
        }

        System.out.println(sb);
    }
}
