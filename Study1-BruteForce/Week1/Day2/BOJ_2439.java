package algorithm.study.boj.brute;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_2439 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputN = br.readLine();
		int N = Integer.parseInt(inputN);
		
		for(int i = 0; i < N; i++) { 
			for(int j = i; j < N - 1; j++) { 
				System.out.print(" ");
			}
			for(int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
