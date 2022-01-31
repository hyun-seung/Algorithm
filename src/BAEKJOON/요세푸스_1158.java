package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class 요세푸스_1158 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static StringBuilder sb = new StringBuilder();

    static String[] array;

    public static void base() throws IOException {
        String s = br.readLine();
        array = s.split(" ");
    }

    public static void main(String[] args) throws IOException {
        base();

        int N = Integer.parseInt(array[0]);
        int K = Integer.parseInt(array[1]);

        List<Integer> list = new ArrayList<>();
        for(int i=1; i<=N; i++) {
            list.add(i);
        }

        int index = K-1;

        sb.append("<");

        while(list.size() > 1) {
            sb.append(list.get(index) + ", ");
            list.remove(index--);

            for(int i=0; i<K; i++) {
                if(index + 1  > list.size()-1) {
                    index = index + 1 - list.size();
                } else if(index + 1 <= list.size()-1) {
                    index++;
                }
            }
        }

        sb.append(list.get(0) + ">");

        System.out.println(sb);
    }
}
