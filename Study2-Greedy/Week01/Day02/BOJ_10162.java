package algorithm.study.boj.greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_10162 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine()); // 요리해야할 시간 (초) 
		
		// 배열 : 버튼 A B C 각각 5분 1분 10초
		int[] arr = {300, 60, 10};
		
		// 최소 조작으로 각각 A B C를 몇번씩눌러야하는지 출력
		// 3개 버튼으로 정확히 맞출 수 없으면 -1 출력
		
		int[] cnt = new int[arr.length]; // ABC버튼카운팅 될 배열
		for(int i = 0; i < arr.length; i++) {
			cnt[i] = T / arr[i];
			T %= arr[i];
		}
		
		// 결과 출력
		if(T == 0) {
			for(int i : cnt) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println(-1);
		}
//		
//		int a = 0;
//		int b = 0;
//		int c = 0;
//		
//		for(int i = 0; i < arr.length; i++) {
//			switch(i) {
//				case 0 : a = T / arr[i]; break; 
//				case 1 : b = T / arr[i]; break; 
//				case 2 : c = T / arr[i]; break; 
//			}
//			
//			T %= arr[i];
//		}
//		
//		// 결과 출력
//		if(T == 0) {
//			System.out.println(a + " " + b + " " + c);
//		} else {
//			System.out.println(-1);
//		}
		

	}

}
