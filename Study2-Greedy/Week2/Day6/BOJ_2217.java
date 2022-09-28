package algorithm.study.boj.greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class BOJ_2217 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 로프 갯수
		Integer[] arr = new Integer[N];

		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine()); // i번째 로프가 버틸 수 있는 최대 중량 (총 N개)
		}

		// 중량이 큰 순서대로 정렬
		Arrays.sort(arr, Collections.reverseOrder());
		
		// 최대 중량 = 중량이 가장 적은 로프 * 현재 로프 수
		int max = 0;
		
		// 로프의 수를 하나씩 늘려가며 최대중량을 계산 
		for(int i = 0; i < N; i++) {
			if(max < arr[i] * (i + 1)) max = arr[i] * (i + 1);
			//max = Math.max(max, arr[i] * (i + 1));
		}
		System.out.println(max);
		
	}

}
