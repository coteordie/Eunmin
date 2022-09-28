package algorithm.study.boj.greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 춘향이 거스름돈
 */
public class BOJ_14916 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int result = 0; // 동전 수

		while(N > 0) {
			// 5로 나뉘는 경우
			if(N % 5 == 0) {
				result += N / 5;
				break;
			}
			// 5로 나뉘지 않는 경우 - 2씩 빼고 동전을 하나씩 더한다.
			N -= 2;
			result++;
		}
		
		if(N < 0) System.out.println(-1);
		else System.out.println(result);
		
	}

}
