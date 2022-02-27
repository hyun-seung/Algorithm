package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 서로소_평균_21920java {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int N;
    static int[] arr;
    static int X;

    public static void base() throws IOException  {
        N = Integer.parseInt(br.readLine());

        arr = new int [N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        X = Integer.parseInt(br.readLine());
    }

    public static void main(String[] args) throws IOException {
        base();

        double sum = 0;
        double count = 0;

        for(int i=0; i<N; i++) {
            if(checkGCD(X, arr[i]) == 1) {
                sum += arr[i];
                count++;
            }
        }

        System.out.println(sum / count);
    }

    public static int checkGCD(int a, int b) {
        while(b != 0) {
            int temp = a % b;

            a = b;
            b = temp;
        }

        return a;
    }
}
