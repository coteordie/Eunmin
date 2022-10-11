package algorithm.study.boj.sc1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 상수
 */
public class BOJ_2908 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		String strA = st.nextToken();
		String strB = st.nextToken();
		
		StringBuffer sb = new StringBuffer(strA);
		strA = sb.reverse().toString();
		sb = new StringBuffer(strB);
		strB = sb.reverse().toString();
		
		int a = Integer.parseInt(strA);
		int b = Integer.parseInt(strB);
		
		if(a > b) System.out.println(a);
		else System.out.println(b);
	}

}
