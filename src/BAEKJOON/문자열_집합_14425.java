package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class 문자열_집합_14425 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    static String[] NM;
    static ArrayList<String> list = new ArrayList<>();

    static int answer = 0;

    public static void main(String[] args) throws IOException {
        NM = br.readLine().split(" ");

        for(int i=0; i<Integer.parseInt(NM[0]); i++) {
            list.add(br.readLine());
        }

        for(int i=0; i<Integer.parseInt(NM[1]); i++) {
            String s = br.readLine();
            if(list.contains(s))
                answer++;
        }

        System.out.println(answer);
    }
}
