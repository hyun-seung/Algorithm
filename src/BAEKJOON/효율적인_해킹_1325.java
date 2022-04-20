package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 효율적인_해킹_1325 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuffer sb = new StringBuffer();

    static int N;
    static int M;
    static List<Integer>[] list;
    static boolean[] visited;
    static int[] answer;

    public static void base() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        list = new ArrayList[N+1];
        answer = new int[N+1];

        for(int i=1; i<N+1; i++) {
            list[i] = new ArrayList<Integer>();
        }

        for(int i=1; i<M+1; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            list[a].add(b);
        }
    }

    public static void main(String[] args) throws IOException {
        base();

        for(int i=1; i<N+1; i++) {
            visited = new boolean[N+1];
            bfs(i);
        }

        int max = 0;
        for (int i=1; i<N+1; i++) {
            max = Math.max(max, answer[i]);
        }
        for (int i=1; i<N+1; i++) {
            if (max == answer[i])
                sb.append(i + " ");
        }

        System.out.println(sb.toString().trim());
    }

    public static void bfs(int node) {
        Queue<Integer> queue = new LinkedList<Integer>();

        queue.offer(node);
        visited[node] = true;

        while(!queue.isEmpty()) {
            node = queue.poll();
            for(int next : list[node]) {
                if(visited[next] == false) {
                    answer[next]++;
                    visited[next] = true;
                    queue.add(next);
                }
            }
        }
    }
}
