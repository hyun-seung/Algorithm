package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 가장_긴_짝수_연속한_부분_수열_small_22857 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int N;
    static int K;
    static int[] arr;

    public static void base() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        arr = new int[N+1];
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
    }

    public static void main(String[] args) throws IOException {
        base();

        int index = 0;
        int pre_count = 0;
        int count = 0;
        int k = 0;

        for(int i=0; i<N; i++) {
            if(arr[i] % 2 != 0) {   // 홀수
                k++;
                if(k > K) {
                    k = 0;
                    count = Math.max(pre_count, count);
                    pre_count = 0;
                    index++;
                    i = index-1;        // 이번 문장이 종료될 때 i++ 이 작동되기 때문에 -1
                }
            } else {                // 짝수
                pre_count++;
            }
        }

        count = Math.max(pre_count, count);

        System.out.println(count);
    }
}
