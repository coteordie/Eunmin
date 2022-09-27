package algorithm.study.boj.greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * ATM 
 */
public class BOJ_11399 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		Integer[] pi = new Integer[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < pi.length; i++) {
			pi[i] = Integer.parseInt(st.nextToken());
		}
		
		// 작은 순서대로 정렬
		Arrays.sort(pi);
		
		int result = 0;
		int p = 0;
		for(int i = 0; i < pi.length; i++) {
			// p가 pi[0] pi[0]+pi[1] ...
			p += pi[i];
			result += p;
		}
		System.out.println(result);
		
	}

}
