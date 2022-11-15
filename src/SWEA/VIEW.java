package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class VIEW {
	static int n;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i=1; i<=10; i++) {
			n = Integer.parseInt(br.readLine());
			int[] arr = new int[n];
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=2; j<=n; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			
			System.out.println("#" + i + " " + solve(arr));
		}
	}
	
	private static int solve(int[] arr) {
		int result = 0;
		
		for(int i=2; i<=n; i++) {
			int l1 = arr[i]-arr[i-2];
            int l2 = arr[i]-arr[i-1];
            int r1 = arr[i]-arr[i+1];
            int r2 = arr[i]-arr[i+2];
            if(l1<0 || l2<0 || r1<0 || r2<0) continue;
            result += Math.min(l1, Math.min(l2, Math.min(r1, r2)));
		}
		return result;
	}
}
