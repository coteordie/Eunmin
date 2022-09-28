package algorithm.study.boj.greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 5와 6의 차이
 */
public class BOJ_2864 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 두 수의 합중 최솟값과 최댓값을 출력
		String A = st.nextToken();
		String B = st.nextToken();
		
		String minA = ""; // A에 있는 모든 6을 5로 바꾼 A 
		String maxA = ""; // A에 있는 모든 5를 6으로 바꾼 A
		String minB = ""; // B에 있는 모든 6을 5로 바꾼 B
		String maxB = ""; // B에 있는 모든 5를 6으로 바꾼 B
		
		String result = "";
		
//		minA = A.replace('6', '5');
//		maxA = A.replace('5', '6');
//		minB = B.replace('6', '5');
//		maxB = B.replace('5', '6');
		
		for(int i = 0; i < A.length(); i++) {
			if(A.charAt(i) == '6' || A.charAt(i) == '5') {
				minA += "5";
				maxA += "6";
			} else {
				minA += A.charAt(i);
				maxA += A.charAt(i);
			}
		}
		for(int i = 0; i < B.length(); i++) {
			if(B.charAt(i) == '6' || B.charAt(i) == '5') {
				minB += "5";
				maxB += "6";
			} else {
				minB += B.charAt(i);
				maxB += B.charAt(i);
			}
		}
		
		
		result = (Integer.parseInt(minA) + Integer.parseInt(minB)) + " " 
				+ (Integer.parseInt(maxA) + Integer.parseInt(maxB));
		
		// 최솟값과 최댓값 출력
		System.out.println(result);
	}

}
