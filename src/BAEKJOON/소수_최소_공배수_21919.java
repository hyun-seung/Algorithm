package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 소수_최소_공배수_21919 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int N;
    static int[] arr;
    static ArrayList<Integer> list = new ArrayList<>();

    public static void base() throws IOException {
        N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        arr = new int [N+1];
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
    }

    public static void main(String[] args) throws IOException {
        base();

        for(int i=0; i<N; i++) {
            if(isPrime(arr[i])) {
                if(!list.contains(arr[i]))
                    list.add(arr[i]);
            }
        }

        long ans = 1;

        for(int i=0; i<list.size(); i++) {
            ans *= list.get(i);
        }

        if(list.size() == 0)
            System.out.println(-1);
        else {
            System.out.println(ans);
        }
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
