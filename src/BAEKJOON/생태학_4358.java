package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 생태학_4358 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    static HashMap<String, Integer> map = new HashMap<>();

    public static void main(String[] args) throws IOException {

        int count = 0;

        String s = br.readLine();

        while(true) {
            map.put(s, map.getOrDefault(s, 0) + 1);
            count++;

            s = br.readLine();
            if(s == null || s.length() == 0) {
                break;
            }
        }

        Object[] keyArray = map.keySet().toArray();
        Arrays.sort(keyArray);

        for(int i=0; i< keyArray.length; i++) {
            int many = map.get(keyArray[i]);
            double per = ((double)many / (double)count) * 100;
            String f = String.format("%.4f", per);

            sb.append(keyArray[i] + " " + f + "\n");
        }

        System.out.println(sb);
    }
}
