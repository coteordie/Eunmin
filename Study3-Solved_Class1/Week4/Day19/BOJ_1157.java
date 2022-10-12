package algorithm.study.boj.sc1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 단어 공부
 */
public class BOJ_1157 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] arr = new String[input.length()];
		
		// 입력 문자열을 한글자씩 배열로 생성
		for(int i = 0; i < arr.length; i++) {
			arr[i] = String.valueOf(input.charAt(i)).toUpperCase();
		}
		
		// 중복을 제거하면서 map에 추가
		Map<String, Integer> map = new HashMap<>();
		for(String key : arr) {
			map.put(key, map.getOrDefault(key, 0) + 1);
		}
		
		int max = Collections.max(map.values());
		int cnt = Collections.frequency(map.values(), max);
		
		if(cnt > 1) {
			System.out.println("?");
		} else {
			Set<Entry<String, Integer>> entrySet = map.entrySet();
			for(Entry<String, Integer> entry : entrySet) {
				if(entry.getValue().equals(max))
					System.out.println(entry.getKey());
			}
		}
			
	}

}
