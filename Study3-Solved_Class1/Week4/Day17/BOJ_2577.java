package algorithm.study.boj.sc1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 숫자의 개수
 */
public class BOJ_2577 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		
		String result = String.valueOf(a * b * c);
		int[] cnt = new int[10];
		for(int i = 0; i < result.length(); i++) {
			int n = Character.getNumericValue(result.charAt(i));
			cnt[n] += 1;
		}
		
		for(int i : cnt)
			System.out.println(i);
		
	}

}
