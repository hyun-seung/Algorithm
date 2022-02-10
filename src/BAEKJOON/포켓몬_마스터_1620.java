package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 포켓몬_마스터_1620 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    static String[] NM;

    static Map<String, String> map = new HashMap<>();

    public static void main(String[] args) throws IOException {

        NM = br.readLine().split(" ");

        for(int i=1; i<=Integer.parseInt(NM[0]); i++) {
            String s = br.readLine();
            map.put(Integer.toString(i), s);
            map.put(s, Integer.toString(i));
        }

        for(int i=0; i<Integer.parseInt(NM[1]); i++) {
            String s = br.readLine();
            sb.append(map.get(s) + "\n");
        }

        System.out.println(sb);
    }
}
