package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 소수_찾기_1978 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int N;
    static ArrayList<Integer> list = new ArrayList<>();

    public static void base() throws IOException {
        N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<N; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }
    }

    public static void main(String[] args) throws IOException {
        base();

        int count = 0;

        for(int i=0; i<N; i++) {
            if(isPrime(list.get(i))) {
                count++;
            }
        }

        System.out.println(count);
    }

    public static boolean isPrime(int n) {
        if(n == 0 || n == 1)
            return false;

        for(int i=2; i<=Math.sqrt(n); i++) {
            if(n % i == 0)
                return false;
        }

        return true;
    }
}
