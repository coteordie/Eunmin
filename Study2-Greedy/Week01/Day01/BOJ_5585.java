package algorithm.study.boj.greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_5585 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = 1000 - Integer.parseInt(br.readLine()); // 거스름 돈
		int[] coins = {500, 100, 50, 10, 5, 1}; // 동전 종류 배열
		
		int cnt = 0; // 거스름돈으로 줄 동전 갯수
		
		// 동전의 종류 갯수만큼 반복문을 돌며 큰 동전부터 거스름돈으로 차감
		for(int i = 0; i < coins.length; i++) {
			cnt += n / coins[i];
			n %= coins[i];
		}
		System.out.println(cnt);
		
	}

}
