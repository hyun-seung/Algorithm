package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 배열_합치기_11728 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuffer sb = new StringBuffer();

    static int N;
    static int M;
    static int[] arr1;
    static int[] arr2;
    static int[] answer;

    public static void base() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr1 = new int[N];
        arr2 = new int[M];
        answer = new int[N+M];

        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<N; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine(), " ");
        for(int j=0; j<M; j++) {
            arr2[j] = Integer.parseInt(st.nextToken());
        }
    }

    public static void main(String[] args) throws IOException {
        base();

        int i = 0;
        int j = 0;
        int index = 0;

        while(i<N && j<M) {
            if(arr1[i] < arr2[j]) {
                answer[index++] = arr1[i++];
            } else {
                answer[index++] = arr2[j++];
            }

            if(index == N+M)
                break;
        }

        while(i<N) {
            answer[index++] = arr1[i++];
        }
        while(j<M) {
            answer[index++] = arr2[j++];
        }

        for(int an : answer) {
            sb.append(an).append("\n");
        }

        System.out.println(sb);
    }
}
