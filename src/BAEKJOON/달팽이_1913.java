package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 달팽이_1913 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuffer sb = new StringBuffer();

    static int N;
    static int K;
    static int[][] map;

    public static void base() throws IOException {
        N = Integer.parseInt(br.readLine());
        K = Integer.parseInt(br.readLine());

        map = new int[N][N];
    }

    public static void main(String[] args) throws IOException {
        base();

        int count = 1;

        int x = N/2;
        int y = N/2;

        int limit = 1;

        while(true) {
            for(int i=0; i<limit; i++) {
                map[x--][y] = count++;
            }
            if(count-1 == N*N) break;
            for(int i=0; i<limit; i++) {
                map[x][y++] = count++;
            }
            limit++;
            for(int i=0; i<limit; i++) {
                map[x++][y] = count++;
            }
            for(int i=0; i<limit; i++) {
                map[x][y--] = count++;
            }
            limit++;
        }

        int ans1 = 0, ans2 = 0;

        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                sb.append(map[i][j]);
                sb.append(' ');
                if(map[i][j] == K) {
                    ans1 = i+1;
                    ans2 = j+1;
                }
            }
            sb.append('\n');
        }

        sb.append(ans1 + " " + ans2);

        System.out.println(sb);
    }
}
