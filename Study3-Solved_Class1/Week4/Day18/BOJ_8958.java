package algorithm.study.boj.sc1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * OX퀴즈
 */
public class BOJ_8958 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] arr = new String[n];
		for(int i = 0; i < n; i++) {
			arr[i] = br.readLine();
		}
		
		int score = 0;
		int result = 0;
		for(int i = 0; i < arr.length; i++) {
			score = 0;
			result = 0;
			for(int j = 0; j < arr[i].length(); j++) {
				if(arr[i].charAt(j) == 'O') {
					score++;
					result += score;
				}
				else {
					score = 0;
				}
			}
			System.out.println(result);
		}
		
	}

}
