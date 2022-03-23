package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 가장_큰_증가_부분_수열_11055 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int A;
    static int[] arr;
    static int[] dp;

    public static void base() throws IOException {
        A = Integer.parseInt(br.readLine());

        arr = new int [A+1];
        dp = new int [A+1];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<A; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
    }

    public static void main(String[] args) throws IOException {
        base();

        dp[0] = arr[0];

        int result = dp[0];
        for(int i=1; i<A; i++) {
            dp[i] = arr[i];
            for(int j=0; j<i; j++) {
                if(arr[i] > arr[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + arr[i]);
                }
            }
            result = Math.max(result, dp[i]);
        }

        System.out.println(result);
    }
}
