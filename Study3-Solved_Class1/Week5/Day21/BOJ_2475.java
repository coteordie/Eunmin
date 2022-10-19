package algorithm.study.boj.sc1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 검증수
 */
public class BOJ_2475 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int[] arr = new int[5];
		
		for(int i = 0; i < arr.length; i++) 
			arr[i] = Integer.parseInt(st.nextToken());
		
		int sum = 0;
		for(int i : arr) 
			sum += i * i;
		System.out.println(sum % 10);
	}

}
