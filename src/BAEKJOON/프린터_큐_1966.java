package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class 프린터_큐_1966 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static StringBuilder sb = new StringBuilder();

    static int N;

    static String[] NM = new String[2];

    static String[] array;

    static LinkedList<String> list = new LinkedList<>();

    public static void base() throws IOException {
        N = Integer.parseInt(br.readLine());
    }

    public static void main(String[] args) throws IOException {
        base();

        for(int i=0; i<N; i++) {
            NM = br.readLine().split(" ");
            array = new String[Integer.parseInt(NM[0])];
            array = br.readLine().split(" ");
            list.clear();
            for(int j=0; j<array.length; j++) {
                list.add(array[j]);
            }

            solve();
        }

        System.out.println(sb);
    }

    public static void solve() {
        int count = 0;
        int index = Integer.parseInt(NM[1]);

        while(list.size() > 0) {
            if(IsMax()) {
                count++;
                list.removeFirst();
                if (index == 0) {
                    break;
                } else {
                    index--;
                }
            } else {
                list.addLast(list.removeFirst());
                if(index == 0)
                    index = list.size() - 1;
                else {
                    index--;
                }
            }
        }

        sb.append(count + "\n");
    }

    public static boolean IsMax() {
        int max = Integer.parseInt(list.get(0));

        for(int i=1; i<list.size(); i++) {
            if(Integer.parseInt(list.get(i)) > max) {
                return false;
            }
        }

        return true;
    }
}
