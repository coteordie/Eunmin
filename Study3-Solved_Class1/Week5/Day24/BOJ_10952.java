package algorithm.study.boj.sc1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * A+B - 5
 */
public class BOJ_10952 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String str;
		
		while((str = br.readLine()) != null) {
			st = new StringTokenizer(str, " ");
			int a = Integer.parseInt(st.nextToken()); 
			int b = Integer.parseInt(st.nextToken()); 
			if(a == 0 && b == 0) break;
			else System.out.println(a + b);
		}
	}

}
