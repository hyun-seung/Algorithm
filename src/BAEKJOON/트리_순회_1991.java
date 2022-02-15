package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 트리_순회_1991 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    static int N;

    static class Node {
        int left;
        int right;

        Node(int left, int right) {
            this.left = left;
            this.right = right;
        }
    }

    static ArrayList<Node>[] list;

    public static void base() throws IOException {
        N = Integer.parseInt(br.readLine());

        list = new ArrayList[N+1];
        for(int i=1; i<=N; i++) {
            list[i] = new ArrayList<>();
        }

        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int me = st.nextToken().charAt(0) - 'A' + 1;
            int left = st.nextToken().charAt(0) - 'A' + 1;
            int right = st.nextToken().charAt(0) - 'A' + 1;

            list[me].add(new Node(left, right));
        }
    }

    public static void main(String[] args) throws IOException {
        base();

        preorder(1);
        sb.append("\n");
        inorder(1);
        sb.append("\n");
        postorder(1);

        System.out.println(sb);
    }

    public static void preorder(int start) {
        for(Node temp : list[start]) {
            int left = temp.left;
            int right = temp.right;

            sb.append((char) (start + 'A' - 1));
            if(left != -18)
                preorder(left);
            if(right != -18)
                preorder(right);
        }
    }

    public static void inorder(int start) {
        for(Node temp : list[start]) {
            int left = temp.left;
            int right = temp.right;

            if(left != -18)
                inorder(left);
            sb.append((char) (start + 'A' - 1));
            if(right != -18)
                inorder(right);
        }
    }

    public static void postorder(int start) {
        for(Node temp : list[start]) {
            int left = temp.left;
            int right = temp.right;

            if(left != -18)
                postorder(left);
            if(right != -18)
                postorder(right);
            sb.append((char) (start + 'A' - 1));
        }
    }
}
