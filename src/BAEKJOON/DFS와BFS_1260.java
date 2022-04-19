package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class DFS와BFS_1260 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuffer sb = new StringBuffer();

    static int N;
    static int M;
    static int V;
    static boolean[][] node;
    static boolean[] check;

    public static void base() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());
        node = new boolean[N+1][N+1];
        check = new boolean[N+1];

        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            node[a][b] = true;
            node[b][a] = true;
        }
    }

    public static void main(String[] args) throws IOException {
        base();

        dfs(V);

        sb.append('\n');
        Arrays.fill(check, false);

        bfs(V);

        System.out.println(sb.toString());
    }

    public static void dfs(int temp) {
        check[temp] = true;
        sb.append(temp + " ");

        for(int i=1; i<N+1; i++) {
            if(node[temp][i] && check[i] == false) {
                dfs(i);
            }
        }
    }

    public static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        check[start] = true;
        sb.append(start + " ");

        while(!queue.isEmpty()) {
            int temp = queue.poll();

            for(int i=1; i<N+1; i++) {
                if(node[temp][i] && check[i] == false) {
                    queue.offer(i);
                    check[i] = true;
                    sb.append(i + " ");
                }
            }
        }
    }
}
