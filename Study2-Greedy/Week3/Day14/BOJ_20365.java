package algorithm.study.boj.greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * 블로그2
 */
public class BOJ_20365 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String input = br.readLine();
		
		List<String> b = new ArrayList<>(); // 입력문자 B가 저장될 List
		List<String> r = new ArrayList<>(); // 입력문자 R이 저장될 List
		
//		이거 안돼서 Tokenizer써봐
//		for(int i = 0; i < input.length(); i++) {
//			if(input.charAt(i) == 'B') b.add(String.valueOf(input.charAt(i)));
//			else r.add(String.valueOf(input.charAt(i)));
//		}

		StringTokenizer st = new StringTokenizer(input, "R");
		while(st.hasMoreTokens()) b.add(st.nextToken());
		
		st = new StringTokenizer(input, "B");
		while(st.hasMoreTokens()) r.add(st.nextToken());
		
		// 최소 방법 = 많은 알파벳을 먼저 칠한 뒤 덧칠한다
		int result = 0;
		if(r.size() >= b.size()) result = b.size() + 1;
		else result = r.size() + 1;
		
		System.out.println(result);
		
		
	}

}
