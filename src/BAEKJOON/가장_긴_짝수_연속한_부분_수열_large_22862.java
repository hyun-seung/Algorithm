package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 가장_긴_짝수_연속한_부분_수열_large_22862 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuffer sb = new StringBuffer();

    static int S;
    static int K;
    static int[] arr;
    static boolean[] check;

    public static void base() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        S = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        arr = new int[S];
        check = new boolean[S];
        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<S; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if(arr[i] % 2 != 1) {
                check[i] = true;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        base();

        int first = 0;
        int second = 0;
        int count = 0;
        int max = 0;

        while (second < S){
            if(count < K){
                if(!check[second]){
                    count++;
                }
                second++;
                max = Math.max(max,second-first-count);
            }
            else if(check[second]){
                second++;
                max = Math.max(max , second-first-count);
            }
            else if(count == K && !check[second]){
                if(!check[first]){ //
                    count--;
                }
                first++;
            }
        }

        System.out.println(max);
    }
}
