package algorithm.study.boj.sc2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 벌집
 */
public class BOJ_2292 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		// 6 12 18 24
		int room = 1;
		int i = 1;
		while(true) {
			if(i >= n) {
				System.out.println(room);
				break;
			}
			else if(n == 1) {
				System.out.println(1);
			}
			else {
				i = i + (room * 6);
				room++;
			}
		}
	}

}
