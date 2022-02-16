package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 완전_이진_트리_9934 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    static int K;
    static int[] array;
    static StringBuffer[] answer;

    public static void base() throws IOException {
        K = Integer.parseInt(br.readLine());

        array = new int[(int) (Math.pow(2, K) - 1)];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for(int i=0; i<array.length; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        answer = new StringBuffer[K];
        for(int i=0; i<K; i++) {
            answer[i] = new StringBuffer();
        }
    }

    public static void main(String[] args) throws IOException {
        base();

        solve(0, array.length - 1, 0);

        for(StringBuffer s : answer) {
            System.out.println(s);
        }
    }

    public static void solve(int start, int end, int depth) {
        if(depth == K)
            return;

        int mid = (start + end) / 2;

        answer[depth].append(array[mid] + " ");

        solve(start, mid - 1, depth+1);
        solve(mid + 1, end, depth + 1);
    }
}
