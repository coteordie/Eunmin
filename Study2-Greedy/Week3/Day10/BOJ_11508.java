package algorithm.study.boj.greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

/**
 *	2+1 세일 
 */
public class BOJ_11508 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Integer[] arr = new Integer[N];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr, Collections.reverseOrder());
		
		int result = 0;
		for(int i = 0; i < arr.length; i++) {
			if(i % 3 != 2) result += arr[i];
		}
		System.out.println(result);
	}

}
