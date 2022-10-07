package algorithm.study.boj.sc1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 알람 시계
 */
public class BOJ_2884 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int h = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		// 알람 = h:m
		if(m - 45 < 0) {
			h -= 1;
			m = 60 + m - 45;
		} else m -= 45;
		
		if(h < 0) h = 23;
		
		System.out.println(h + " " + m);
		
	}
	
}
