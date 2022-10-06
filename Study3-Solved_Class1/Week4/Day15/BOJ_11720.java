package algorithm.study.boj.sc1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *	숫자의 합
 */
public class BOJ_11720 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String input = br.readLine();
		
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++)
			arr[i] = Integer.parseInt(String.valueOf(input.charAt(i)));
		
		int result = 0;
		for(int i = 0; i < arr.length; i++) result += arr[i];
		System.out.println(result);
	}

}
