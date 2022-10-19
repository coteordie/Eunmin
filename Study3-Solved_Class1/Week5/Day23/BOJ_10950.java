package algorithm.study.boj.sc1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * A+B - 3
 */
public class BOJ_10950 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[n][2];
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0; j < 2; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken()); 
			}
		}
		for(int i = 0; i < n; i++) {
			System.out.println(arr[i][0] + arr[i][1]);
		}
	}

}
