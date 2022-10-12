package algorithm.study.boj.sc1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

/**
 * 평균
 */
public class BOJ_1546 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		List<Double> list = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			list.add(Double.parseDouble(st.nextToken()));
		}
		
		double max = Collections.max(list);
		for(int i = 0; i < list.size(); i++) {
			double score = list.get(i);
			list.set(i, (score / max) * 100);
		}
		
		// 평균
		double sum = 0;
		for(double d : list) {
			sum += d;
		}
		System.out.println(sum / list.size());

	}

}
