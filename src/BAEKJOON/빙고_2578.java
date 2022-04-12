package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 빙고_2578 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuffer sb = new StringBuffer();

    static int[][] bingo;

    static int count = 0;
    static int ans = 0;

    public static void base() throws IOException {
        bingo = new int[5][5];

        StringTokenizer st;
        for(int i=0; i<5; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<5; j++) {
                bingo[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }

    public static void main(String[] args) throws IOException {
        base();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        while(true) {
            ans++;
            int num;
            if(st.hasMoreTokens()) {
                 num = Integer.parseInt(st.nextToken());
            } else {
                st = new StringTokenizer(br.readLine(), " ");
                num = Integer.parseInt(st.nextToken());
            }

            for(int i=0; i<5; i++) {
                for(int j=0; j<5; j++) {
                    if(bingo[i][j] == num)
                        bingo[i][j] = 0;
                }
            }

            rCheck();
            cCheck();
            leftCheck();
            rightCheck();

            if(count >= 3)
                break;
            else
                count = 0;
        }

        System.out.println(ans);
    }

    public static void rCheck() {
        for(int i=0; i<5; i++) {
            int zeroCount = 0;
            for(int j=0; j<5; j++) {
                if(bingo[i][j] == 0)
                    zeroCount++;
            }
            if(zeroCount == 5)
                count++;
        }
    }

    public static void cCheck() {
        for(int i=0; i<5; i++) {
            int zeroCount = 0;
            for(int j=0; j<5; j++) {
                if(bingo[j][i] == 0)
                    zeroCount++;
            }
            if(zeroCount == 5)
                count++;
        }
    }

    public static void leftCheck() {
        int zeroCount = 0;
        for(int i=0; i<5; i++) {
            if(bingo[i][i] == 0)
                zeroCount++;
        }
        if(zeroCount == 5)
            count++;
    }

    public static void rightCheck() {
        int zeroCount = 0;
        for(int i=0; i<5; i++) {
            if(bingo[i][4-i] == 0)
                zeroCount++;
        }
        if(zeroCount == 5)
            count++;
    }
}
