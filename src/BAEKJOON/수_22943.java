package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 수_22943 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int K, M;
    static int max;
    static boolean[] prime, primeSum, primeMul, visited;
    static int answer = 0;

    public static void base() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        K = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        max = (int)Math.pow(10, K);

        prime = new boolean[max];
        primeSum = new boolean[max];
        primeMul = new boolean[max];

        visited = new boolean[10];
    }

    public static void main(String[] args) throws IOException {
        base();

        getPrime();
        makeSum();
        makeMul();

        perm(0,0);
        System.out.println(answer);
    }

    public static void getPrime() { // false -> 소수
        prime[0] = true;
        prime[1] = true;

        for(int i=2; i<max; i++) {
            if(prime[i])
               continue;
            else {
                for(int j=i+i; j<max; j+=i) {
                    prime[j] = true;
                }
            }
        }
    }

    public static void makeSum() {
        for(int i=2; i<max; i++) {
            if(prime[i])
                continue;
            else {
                for(int j=i+1; j<max; j++) {
                    if(prime[j])
                        continue;
                    if(i + j < max)
                        primeSum[i+j] = true;
                }
            }
        }
    }

    public static void makeMul() {
        for(int i=2; i<max; i++) {
            if(prime[i])
                continue;

            for(int j=i; j<max; j++) {
                if(prime[j])
                    continue;

                long num = (long) i * (long) j;
                if(num < max)
                    primeMul[i*j] = true;
            }
        }
    }

    public static void perm(int cnt, int num) {
        if(cnt == K) {
            if(primeSum[num]) {
                while(true) {
                    if(num % M == 0) {
                        num /= M;
                    } else {
                        break;
                    }
                }
                if(primeMul[num]) {
                    answer++;
                }
            }
            return;
        } else {
            for(int i=0; i<10; i++) {
                if(cnt == K-1 && i == 0)
                    continue;
                if(visited[i])
                    continue;

                visited[i] = true;
                perm(cnt+1, num + i*(int)Math.pow(10,cnt));
                visited[i] = false;
            }
        }
    }
}
