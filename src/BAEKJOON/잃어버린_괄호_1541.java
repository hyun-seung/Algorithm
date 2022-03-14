package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 잃어버린_괄호_1541 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int sum = Integer.MAX_VALUE;

        StringTokenizer st = new StringTokenizer(br.readLine(), "-");

        while(st.hasMoreTokens()) {
            int temp = 0;

            StringTokenizer add = new StringTokenizer(st.nextToken(), "+");

            while(add.hasMoreTokens()) {
                temp += Integer.parseInt(add.nextToken());
            }

            if(sum == Integer.MAX_VALUE) {
                sum = temp;
            } else {
                sum -= temp;
            }
        }

        System.out.println(sum);
    }
}
