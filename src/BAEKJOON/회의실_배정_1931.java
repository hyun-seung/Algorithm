package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class 회의실_배정_1931 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int N;
    static int[][] time;

    public static void base() throws IOException {
        N = Integer.parseInt(br.readLine());

        time = new int[N][2];
        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            time[i][0] = Integer.parseInt(st.nextToken());
            time[i][1] = Integer.parseInt(st.nextToken());
        }
    }

    public static void main(String[] args) throws IOException {
        base();

        Arrays.sort(time, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] == o2[1])
                    return o1[0] - o2[0];

                return o1[1] - o2[1];       // 오름차순
            }
        });

        int count = 0;
        int prev_end = 0;

        for(int i=0; i<N; i++) {
            if(prev_end <= time[i][0]) {
                prev_end = time[i][1];
                count++;
            }
        }

        System.out.println(count);
    }
}
