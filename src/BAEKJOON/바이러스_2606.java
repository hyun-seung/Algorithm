package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 바이러스_2606 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuffer sb = new StringBuffer();

    static boolean[][] node;
    static boolean[] check;
    static int count = 0;

    static int N;
    static int M;

    public static void base() throws IOException {
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        node = new boolean[N+1][N+1];
        check = new boolean[N+1];

        for(int i=0; i<M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            node[a][b] = true;
            node[b][a] = true;
        }
    }

    public static void main(String[] args) throws IOException {
        base();

        bfs(1);

        System.out.println(count);
    }

    static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();

        check[start] = true;
        queue.offer(start);

        while(!queue.isEmpty()) {
            int temp = queue.poll();

            for(int i=1; i<N+1; i++) {
                if(node[temp][i] && !check[i]) {
                    queue.offer(i);
                    check[i] = true;
                    count++;
                }
            }
        }
    }
}
