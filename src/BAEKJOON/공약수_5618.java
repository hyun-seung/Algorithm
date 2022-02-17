package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class 공약수_5618 {

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

        Collections.sort(list);

        for(int i=1; i<=list.get(0); i++) {
            int count = 0;

            for(int j=0; j<N; j++) {
                if(list.get(j) % i == 0)
                    count++;
            }

            if(count == N)
                System.out.println(i);
        }
    }
}
