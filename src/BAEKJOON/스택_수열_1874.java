package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 스택_수열_1874 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static StringBuilder sb = new StringBuilder();

    static int N;

    static int[] array;

    static Stack<Integer> stack = new Stack<>();

    public static void base() throws IOException {
        N = Integer.parseInt(br.readLine());

        array = new int[N];

        for(int i=0; i<N; i++) {
            String s = br.readLine();
            array[i] = Integer.parseInt(s);
        }
    }

    public static void main(String[] args) throws IOException {
        base();

        int max = 1;
        int index = 0;

        while(index < N) {
            int target = array[index];

            if(target >= max) {
                for(int i=max; i<=target; i++) {
                    stack.add(i);
                    sb.append("+\n");
                }
                max = target + 1;
            } else {
                if(stack.size() > 0) {
                    if(stack.pop() == target) {
                        sb.append("-\n");
                        index++;
                    } else {
                        sb.append("-\n");
                    }
                } else {
                    System.out.println("NO");
                    sb.delete(0, sb.length());
                    break;
                }
            }
        }
        System.out.println(sb);
    }
}
