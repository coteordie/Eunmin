package algorithm.study.boj.sc1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 문자열 반복
 */
public class BOJ_2675 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int r = Integer.parseInt(st.nextToken());
			String s = st.nextToken();
			
			String result = "";
			
			// r번씩
			for(int j = 0; j < s.length(); j++) {
				// 글자하나마다
				for(int k = 0; k < r; k++) {
					result += s.charAt(j);
				}
			}
			System.out.println(result);
		}
	}

}
