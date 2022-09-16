package algorithm.study.boj.brute;

import java.util.Scanner;

public class BOJ_2798 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] cards = new int[N];
		for(int i = 0; i < N; i++) {
			cards[i] = sc.nextInt();
		}
		
		// 배열에 있는 숫자 3개를 더하는 모든 경우의 수
		int sum = 0; // 세개 수의 합
		for(int i = 0; i < N; i++) {
			for(int j = i + 1; j < N; j++) {
				for(int k = j + 1; k < N; k++) {
					int temp = cards[i] + cards[j] + cards[k]; 
					if(temp > M) continue;
					else if(temp == M) {
						sum = temp;
					}
					else if(temp < M) {
					// 세 수의 합이 M보다 작은 것들 중에서 제일 큰거
						if(temp > sum) sum = temp;
					}
				}
			}
		}
		System.out.println(sum);
		
	}

}
