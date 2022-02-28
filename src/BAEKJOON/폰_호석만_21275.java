package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 폰_호석만_21275 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    static String a, b;
    static ArrayList<long[]> list = new ArrayList<>();

    public static void base() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        a = st.nextToken();
        b = st.nextToken();
    }

    public static void main(String[] args) throws IOException {
        base();

        for(long i=2; i<=36; i++) {
            long getA = getNum(a, i);
            if(getA == -1 || getA >= Long.MAX_VALUE) {
                continue;
            }
            for(long j=2; j<=36; j++) {
                long getB = getNum(b, j);
                if(getB == -1 && getB >= Long.MAX_VALUE) {
                    continue;
                }
                if(getA == getB && i != j) {
                    long[] arr = {getA, i, j};
                    list.add(arr);
                }
            }
        }

        if(list.size() == 0) {
            sb.append("Impossible").append("\n");
        } else if(list.size() == 1) {
            long[] arr = list.get(0);
            sb.append(Long.toString(arr[0]) + " " + Long.toString(arr[1]) + " " + Long.toString(arr[2]) + " ");
        } else {
            sb.append("Multiple");
        }

        System.out.println(sb);
    }

    public static long getNum(String num, long k) {
        long ans = 0;

        for(int i=0; i<num.length(); i++) {
            int c = num.charAt(i);

            if('0' <= c && c <= '9') {
                c -= 48;
                if(c >= k) {
                    return -1;
                }
            } else if('a' <= c && c <= 'z') {
                c -= 87;
                if(c >= k) {
                    return -1;
                }
            }
            ans += c * Math.pow(k, num.length() - i -1);
        }
        return ans;
    }
}
