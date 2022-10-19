package algorithm.study.boj.sc1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 알파벳 찾기
 */
public class BOJ_10809 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[26];
		for(int i = 0; i < arr.length; i++) arr[i] = -1;
		
		String s = br.readLine();
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(arr[c - 'a'] == -1) arr[c - 'a']= i;
		}
		for(int i : arr) System.out.print(i + " ");
	}

}
