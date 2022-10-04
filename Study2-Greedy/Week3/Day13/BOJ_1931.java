package algorithm.study.boj.greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 회의실 배정
 */
public class BOJ_1931 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[N][2];
		for(int i = 0 ; i < N; i++) {
			String[] time = br.readLine().split(" "); // [[1, 4], [3, 5], ..]
			arr[i][0] = Integer.parseInt(time[0]); // 시작시간
			arr[i][1] = Integer.parseInt(time[1]); // 종료시간
		}
		
		// 끝나는 시간을 기준으로 정렬
		Arrays.sort(arr, (a, b) -> {
			if(a[1] == b[1]) return a[0] - b[0];
			return a[1] - b[1];
		});
			
		int result = 0;
		int time = 0;
		for(int i = 0; i < N; i++) {
			// 이번 회의 시작시간 >= 이전 회의 종료시간
			if(arr[i][0] >= time) {
				time = arr[i][1];
				result++;
			}
		}
		System.out.println(result);
	}

}
