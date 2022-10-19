package algorithm.study.boj.sc1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * A+B - 4
 */
public class BOJ_10951 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String str;
		
		while((str = br.readLine()) != null) {
			st = new StringTokenizer(str, " ");
			System.out.println(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
		}
		
	}

}
