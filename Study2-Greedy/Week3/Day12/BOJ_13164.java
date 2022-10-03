package algorithm.study.boj.greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 행복 유치원
 */
public class BOJ_13164 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split(" "); // 5,3
		int N = Integer.parseInt(arr[0]);
		int K = Integer.parseInt(arr[1]);
		
		// 조마다 티셔츠를 맞추는 비용 = 제일 큰친구 - 제일 작은친구
		// 차이가 제일 적어야 최소 비용
		int[] heights = new int[N];
		String[] inputHeights = br.readLine().split(" "); // 1,3,5,6,10
		for(int i = 0; i < N; i++) {
			heights[i] = Integer.parseInt(inputHeights[i]);
		}
		
		// 인접한 학생 사이에 키차이를 다 구해
		int[] diff = new int[N - 1]; // 키차이
		for(int i = 0; i < heights.length; i++) {
			if(i > 0) {
				diff[i - 1] = heights[i] - heights[i - 1];
			} 
		}
		// 키차이를 정렬해
		Arrays.sort(diff); 
		
		// diff에서 K - 1개 만큼 더해
		int result = 0;
		for(int i = 0; i < diff.length - (K-1); i++) {
			result += diff[i];
		}
		System.out.println(result);
		
		
	}

}
