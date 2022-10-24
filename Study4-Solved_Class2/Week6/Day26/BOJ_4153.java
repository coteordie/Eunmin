package algorithm.study.boj.sc2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 직각삼각형
 */
public class BOJ_4153 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		while(true) {
			st = new StringTokenizer(br.readLine(), " ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int z = Integer.parseInt(st.nextToken());
			if(x == 0 && y == 0 && z == 0) break;
			
			if((x * x) + (y * y) == (z * z)) System.out.println("right");
			else if((x * x) == (y * y) + (z * z)) System.out.println("right");
			else if((x * x) + (z * z) == (y * y)) System.out.println("right");
			else System.out.println("wrong");
		}
	}

}
