package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 소수_팰린드롬_1747 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int N;

    public static void base() throws IOException {
        N = Integer.parseInt(br.readLine());
    }

    public static void main(String[] args) throws IOException {
        base();

        int ans = 0;

        while(ans == 0) {
            if(!isPal()) {
               N++;
               continue;
            }
            if(!isPrime()) {
                N++;
                continue;
            }
            ans = N;
        }

        System.out.println(ans);
    }


    public static boolean isPal() {
        String n = Integer.toString(N);

        StringBuilder sb = new StringBuilder();
        for(int i=n.length()-1; i>=0; i--) {
            sb.append(n.charAt(i));
        }

        if(n.equals(sb.toString())) {
            return true;
        } else
            return false;
    }

    public static boolean isPrime() {
        if(N == 0 || N == 1) {
            return false;
        }

        for(int i=2; i<=Math.sqrt(N); i++) {
            if(N % i == 0)
                return false;
        }

        return true;
    }
}
