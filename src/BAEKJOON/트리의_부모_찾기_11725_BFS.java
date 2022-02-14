package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class 트리의_부모_찾기_11725_BFS {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    static int N;

    static ArrayList< ArrayList<Integer> > list = new ArrayList<>();
    static int[] parents;

    public static void base() throws IOException {
        N = Integer.parseInt(br.readLine());

        for(int i=0; i<=N+1; i++) {
            list.add(new ArrayList<>());
        }

        parents = new int[N+1];
    }

    public static void main(String[] args) throws IOException {
        base();

        for(int i=1; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            list.get(a).add(b);
            list.get(b).add(a);
        }

        int start = 1;

        bfs(start);

        for(int i=2; i<parents.length; i++) {
            System.out.println(parents[i]);
        }
    }

    public static void bfs(int start) {
        LinkedList<Integer> queue = new LinkedList<>();

        queue.offer(start);
        parents[start] = 1;

        while(!queue.isEmpty()) {
            int parent = queue.poll();

            for(int item : list.get(parent)) {
                if(parents[item] == 0) {
//                    System.out.println("item : " + item + " start : " + parent);
                    parents[item] = parent;
                    queue.offer(item);
                }
            }
        }
    }
}
