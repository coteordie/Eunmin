package algorithm.study.boj.brute;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_17614 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputN = br.readLine();
		int N = Integer.parseInt(inputN);
		
		int result = 0;
		for(int i = 1; i <= N; i++) {
			String str = Integer.toString(i);
			for(int j = 0; j < str.length(); j++) {
//				if(str.substring(j, j+1).equals("3") || 
//					str.substring(j, j+1).equals("6") ||
//					str.substring(j, j+1).equals("9")) {
//					result += 1;
//				}
				// switch 버전
				switch(str.substring(j, j + 1)) {
				case "3" : case "6" : case "9" : result++; break;
				}
			}
		}
		System.out.println(result);
		

	}

}
