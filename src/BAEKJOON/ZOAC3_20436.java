package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class ZOAC3_20436 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuffer sb = new StringBuffer();

    static HashMap<String, Key> left;
    static HashMap<String, Key> right;
    static int answer = 0;

    static String s_left;
    static String s_right;
    static String str;

    static class Key {
        int x, y;
        public Key(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void base() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        s_left = st.nextToken();
        s_right = st.nextToken();

        str =  br.readLine();

        left = new HashMap<>();
        right = new HashMap<>();
    }

    public static void main(String[] args) throws IOException {
        base();

        left.put("q",new Key(0,0));
        left.put("w",new Key(1,0));
        left.put("e",new Key(2,0));
        left.put("r",new Key(3,0));
        left.put("t",new Key(4,0));
        right.put("y",new Key(5,0));
        right.put("u",new Key(6,0));
        right.put("i",new Key(7,0));
        right.put("o",new Key(8,0));
        right.put("p",new Key(9,0));

        left.put("a",new Key(0,1));
        left.put("s",new Key(1,1));
        left.put("d",new Key(2,1));
        left.put("f",new Key(3,1));
        left.put("g",new Key(4,1));
        right.put("h",new Key(5,1));
        right.put("j",new Key(6,1));
        right.put("k",new Key(7,1));
        right.put("l",new Key(8,1));

        left.put("z",new Key(0,2));
        left.put("x",new Key(1,2));
        left.put("c",new Key(2,2));
        left.put("v",new Key(3,2));
        right.put("b",new Key(4,2));
        right.put("n",new Key(5,2));
        right.put("m",new Key(6,2));

        calcTime(str, s_left, s_right);

        System.out.println(answer);
    }

    static void calcTime(String s, String le, String ri) {
        String temp_left = le;
        String temp_right = ri;

        for(int i=0; i<s.length(); i++) {
            if(left.containsKey(s.charAt(i) + "")) {
                Key k1 = left.get(temp_left);
                Key k2 = left.get(s.charAt(i) + "");
                answer += Math.abs(k1.x - k2.x) + Math.abs(k1.y - k2.y);
                answer++;
                temp_left = s.charAt(i) + "";
            } else {
                Key k1 = right.get(temp_right);
                Key k2 = right.get(s.charAt(i) + "");
                answer += Math.abs(k1.x - k2.x) + Math.abs(k1.y-k2.y);
                answer++;
                temp_right = s.charAt(i) + "";
            }
        }
    }
}
