package algorithm.study.boj.greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11047 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken()); // 동전 N종류
		int K = Integer.parseInt(st.nextToken()); // 돈
		
		// 동전 종류 배열 선언
		int[] arr = new int[N];
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			arr[i] = Integer.parseInt(st.nextToken()); 
		} 
		
		int cnt = 0; // 동전 갯수
		for(int i = N - 1; i >= 0; i--) {
			cnt += K / arr[i];
			K %= arr[i];
		}
		System.out.println(cnt);
	}

}
