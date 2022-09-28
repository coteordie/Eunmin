package algorithm.study.boj.brute;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_1436 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int title = 666; // 제목 최솟값
		int i = 1; 
		while(i != N) { // i ~ N번째 까지
			title++; // 제목 1씩 증가시키면서
			if(String.valueOf(title).contains("666")) // 666있는지 확인
				i++; // 있으면 다음번째 제목으로
		}
		System.out.println(title);
	}

}
