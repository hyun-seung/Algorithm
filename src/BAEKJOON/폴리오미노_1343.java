package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 폴리오미노_1343 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuffer sb = new StringBuffer();

    static String S;

    public static void base() throws IOException {
        S = br.readLine();
    }

    public static void main(String[] args) throws IOException {
        base();

        int tempCount = 0;

        for(int i=0; i<S.length(); i++) {
            if(S.charAt(i) == 'X') {
                tempCount++;
            } else if(S.charAt(i) == '.'){
                if(tempCount % 2 != 0) {
                    System.out.println(-1);
                    return;
                }

                while(tempCount != 0) {
                    if(tempCount >= 4) {
                        sb.append("AAAA");
                        tempCount -= 4;
                    } else {
                        sb.append("BB");
                        tempCount -= 2;
                    }
                }

                sb.append(".");
            }
        }

        if(tempCount > 0) {
            if(tempCount % 2 != 0) {
                System.out.println(-1);
                return;
            }

            while(tempCount != 0) {
                if(tempCount >= 4) {
                    sb.append("AAAA");
                    tempCount -= 4;
                } else {
                    sb.append("BB");
                    tempCount -= 2;
                }
            }
        }

        System.out.println(sb);
    }
}
