package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class 풍선_터뜨리기_2346 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static StringBuilder sb = new StringBuilder();

    static int N;

    static String[] array;

    static LinkedList<Integer> list = new LinkedList<>();

    static int index = 0;

    public static void base() throws IOException {
        N = Integer.parseInt(br.readLine());

        array = new String[N];
        array = br.readLine().split(" ");

        for(int i=0; i<N; i++) {
            list.add(Integer.parseInt(array[i]));
        }
    }

    public static void main(String[] args) throws IOException {
        base();

        int move = list.get(0);

        sb.append("1 ");

        while(N-- > 1) {
            move = list.get(index);
            list.set(index, 0);
            if(move > 0) {
                for(int i=0; i<move; i++) {
                    rightMove();
                }
            } else {
                for(int i=0; i<Math.abs(move); i++) {
                    leftMove();
                }
            }
            sb.append((index + 1) + " ");
        }

        System.out.println(sb);
    }

    public static void leftMove() {
        index--;
        if(index < 0) {
            index = list.size() - 1;
        }

        if(list.get(index) == 0) {
            leftMove();
        }
    }

    public static void rightMove() {
        index++;
        if(index >= list.size()) {
            index = 1;
        }

        if(list.get(index) == 0) {
            rightMove();
        }
    }
}
