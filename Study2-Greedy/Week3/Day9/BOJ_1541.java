package algorithm.study.boj.greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 잃어버린 괄호
 */
public class BOJ_1541 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine(); // + - 숫자 를 포함한 식
		
		// 최대한 주어진 수들을 음수로 만들어야돼
		// 즉 -가 나오고 다음 -가 나오기 전까지를 괄호로 묶으면 돼
		String[] arr = input.split("-");
		
		int result = 0;
		for(int i = 0; i < arr.length; i++) {
			// sum = - 사이에 묶인 값(각각의 arr[i])들을 더해야돼
			int sum = 0;
			String[] plus = arr[i].split("\\+");
			for(String s : plus) {
				sum += Integer.parseInt(s);
			}
			
			if(i == 0) result += sum;
			else result -= sum;
		}
		
		System.out.println(result);
	}

}
