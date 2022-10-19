package algorithm.study.boj.sc1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 윤년
 */
public class BOJ_2753 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int result = 0;
		// 윤년 연도가 4의배수 && (100의 배수가 아닐 때 || 400의 배수일 때)
		if(n % 4 == 0 && (n % 100 != 0 || n % 400 == 0))
			result = 1;
		else
			result = 0;
		
		System.out.println(result);
	}

}
