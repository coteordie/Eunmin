package algorithm.study.boj.brute;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_2438 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputN = br.readLine();
		int N = Integer.parseInt(inputN);
		for(int i = 0; i < N; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
