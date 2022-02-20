package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 최대공약수_최소공배수_2609 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int A, B;

    public static void base() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
    }

    public static void main(String[] args) throws IOException {
        base();

        int D = gcd(A, B);

        System.out.println(D);
        System.out.println(A * B / D);
    }

    public static int gcd(int a, int b) {
        while(b != 0) {
            int temp = a % b;

            a = b;
            b = temp;
        }

        return a;
    }
}
