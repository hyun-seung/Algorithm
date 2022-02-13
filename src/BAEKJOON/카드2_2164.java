package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.LinkedList;

public class 카드2_2164 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int N;

    static LinkedList<Integer> list = new LinkedList<>();

    public static void base() throws IOException {
        N = Integer.parseInt(br.readLine());
    }

    public static void main(String[] args) throws IOException {
        base();

        for(int i=1; i<=N; i++) {
            list.add(i);
        }

        while(list.size() != 1) {
            list.pop();

            list.add(list.pop());
        }

        System.out.println(list.get(0));
    }
}
