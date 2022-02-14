package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class bfs_pratice {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int N;
    static ArrayList<Integer>[] list;
    static int[] parents;

    public static void base() throws IOException {
        N = Integer.parseInt(br.readLine());

        list = new ArrayList[N+1];
        for(int i=0; i<=N; i++) {
            list[i] = new ArrayList<Integer>();
        }

        parents = new int[N+1];
    }

    public static void main(String[] args) throws IOException {
        base();

        for(int i=1; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            list[a].add(b);
            list[b].add(a);
        }

        bfs(1);

        for(int i=2; i<=N; i++)
            System.out.println(parents[i]);
    }

    public static void bfs(int start) {
        LinkedList<Integer> queue = new LinkedList<>();

        queue.offer(start);
        parents[start] = 1;

        while(!queue.isEmpty()) {
            int parent = queue.poll();

            for(int item : list[parent]) {
                if(parents[item] == 0) {
                    queue.offer(item);
                    parents[item] = parent;
                }
            }
        }
    }
}
