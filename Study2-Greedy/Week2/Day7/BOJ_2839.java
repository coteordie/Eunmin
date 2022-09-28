package algorithm.study.boj.greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 설탕배달 
 */
public class BOJ_2839 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int result = 0;

		while(n > 0) {
			// 5로 나뉘는 경우
			if(n % 5 == 0) {
				result += n / 5;
				break;
			}
			n -= 3;
			result++;
		}
		if(n < 0) System.out.println(-1);
		else System.out.println(result);
		
	}

}
