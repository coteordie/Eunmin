package algorithm.study.boj.sc1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 음계
 */
public class BOJ_2920 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int[] arr = new int[8];
		
		for(int i = 0; i < 8; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		String result = "";
		for(int i = 1; i < 8; i++) {
			int n = arr[i - 1];
			// 12345678
			if(n < arr[i]) {
				if(n + 1 == arr[i]) {
					result = "ascending";
				}
				else {
					result = "mixed";
					break;
				}
			}
			// 87654321
			else {
				if(n - 1 == arr[i]) {
					result = "descending";
				}
				else {
					result = "mixed";
					break;
				}
			}
		}
		System.out.println(result);
		
	}

}
