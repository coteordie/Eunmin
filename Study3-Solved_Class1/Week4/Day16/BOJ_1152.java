package algorithm.study.boj.sc1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 단어의 개수
 */
public class BOJ_1152 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int cnt = 1;
		for(int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == ' ') cnt++;
		}
		if(input.charAt(0) == ' ') cnt--;
		if(input.charAt(input.length() - 1) == ' ') cnt--;
		System.out.println(cnt);
	}

}
