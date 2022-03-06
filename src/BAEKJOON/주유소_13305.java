package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 주유소_13305 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int N;
    static long[] arrLen;
    static long[] arrPrice;

    public static void base() throws IOException {
        N = Integer.parseInt(br.readLine());

        arrLen = new long [N-1];
        arrPrice = new long [N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<arrLen.length; i++) {
            arrLen[i] = Long.parseLong(st.nextToken());
        }

        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<arrPrice.length; i++) {
            arrPrice[i] = Long.parseLong(st.nextToken());
        }
    }

    public static void main(String[] args) throws IOException {
        base();

        long sum = 0;
        long minPrice = arrPrice[0];

        for(int i=0; i<N-1; i++) {
            if(arrPrice[i] < minPrice) {
                minPrice = arrPrice[i];
            }

            sum += (minPrice * arrLen[i]);
        }

        System.out.println(sum);
    }
}
