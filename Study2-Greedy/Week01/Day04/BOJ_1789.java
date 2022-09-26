package algorithm.study.boj.greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 수들의 합 
 */
public class BOJ_1789 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long s = Long.parseLong(br.readLine());
		long sum = 0;
		
		// 서로 다른 n개 자연수의 합이 s일 때, n의 최댓값
		int n = 0;
		// 1 + 199 
		// 1 + 2 + 197
		// 1 + 2 + 3 + 194 ....
		
		// 자연수 1부터의 합계(1 + 2 + 3..)가 입력값보다 작을 때 까지
		// sum에 n들의 합을 담는다.
		while(s >= sum) {
			sum += (++n);
		}
		
		// 합계가 입력값과 같을 경우 n이 총 갯수
		if(sum == s) System.out.println(n);
		// 합계가 입력값보다 큰 경우 자연수중 하나가 제거되기 때문에 -1을 해준다
		// 예를들어 50를 만들 것인데 1 + 2 + ... + 10 = 55 이고 
		// 여기서 자연수 5 하나를 빼주면 되는 원리와 같음
		else System.out.println(n - 1);
		
	}

}
