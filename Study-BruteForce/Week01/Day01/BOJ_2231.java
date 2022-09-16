package algorithm.study.boj.brute;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2231 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		// 가장 간단한 방법 -> 1 ~ N 까지 모두 대입해보는 것
		for(int i = 1; i <= N; i++) {
			int num = i;
			int sum = i; // 분해합
			
			// 각 자리수를 분해해서 더한다
			while(num != 0) {
				sum += num % 10; 
				num /= 10;
			}
			
			if(sum == N) {
				System.out.println(i);
				return;
			}
		}
		System.out.println(0);
		
		
		
	}

}
