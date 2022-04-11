package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 소가_길을_건너간_이유_1_14467 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuffer sb = new StringBuffer();

    static int N;
    static int[] move = new int[11];

    public static void base() throws IOException {
        N = Integer.parseInt(br.readLine());
    }

    public static void main(String[] args) throws IOException {
        base();

        Arrays.fill(move, 3);

        int count = 0;

        StringTokenizer st;
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int cow = Integer.parseInt(st.nextToken());
            int now = Integer.parseInt(st.nextToken());

            if(move[cow] == 3) {
                move[cow] = now;
            } else if(move[cow] != now) {
                count++;
                move[cow] = now;
            }
        }
        System.out.println(count);
    }
}
