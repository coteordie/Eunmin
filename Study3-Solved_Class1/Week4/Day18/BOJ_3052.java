package algorithm.study.boj.sc1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 나머지
 */
public class BOJ_3052 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Integer> rests = new ArrayList<>();
		
		int result = 0;
		for(int i = 0; i < 10; i++) {
			int n = sc.nextInt() % 42;
			if(!rests.contains(n)) {
				result++;
			}
			rests.add(n); 
		}
		System.out.println(result);
				
	}
	
}
