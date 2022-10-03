package algorithm.study.boj.greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * A -> B
 */
public class BOJ_16953 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int result = 1;
		
		// B -> A 
		while(A != B) {
			if(A > B){
				System.out.println(-1);
				return;
			}
			// B가 1로 끝난다면
			if(B % 10 == 1) {
				// 끝에 1을 제거
				String b = String.valueOf(B);
				b = b.substring(0, b.length() - 1);
				B = Integer.parseInt(b);
				result++;
			}
			// B가 2로 나뉜다면
			else if(B % 2 == 0) {
				// 2로 나눠
				B /= 2;
				result++;
			}
			// A -> B가 되지 않는 경우
			// 1. 연산이 끝났을 때 A가 B보다 큰경우
			// 2. 연산이 안되는 경우
			else {
				System.out.println(-1);
				return;
			}
				
		}
		System.out.println(result);
		
	}

}