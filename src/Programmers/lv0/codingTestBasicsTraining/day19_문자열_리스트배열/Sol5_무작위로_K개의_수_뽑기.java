package Programmers.lv0.codingTestBasicsTraining.day19_문자열_리스트배열;

import java.util.ArrayList;
import java.util.Arrays;

class Solution5 {
	public int[] solution(int[] arr, int k) {
		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			if (!list.contains(arr[i])) {
				list.add(arr[i]);
			}
		}

		if (list.size() != k) {
			int cnt = k - list.size();
			for (int i = 1; i <= cnt; i++) {
				list.add(-1);
			}
		}

		int[] answer = new int[k];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}

		return answer;
	}
}

/*
테스트 1 〉	통과 (0.03ms, 72.8MB)
테스트 2 〉	통과 (0.03ms, 71.3MB)
테스트 3 〉	통과 (0.05ms, 74MB)
테스트 4 〉	통과 (0.08ms, 71.8MB)
테스트 5 〉	통과 (0.12ms, 73.5MB)
테스트 6 〉	통과 (0.09ms, 70.6MB)
테스트 7 〉	통과 (1.19ms, 86.6MB)
테스트 8 〉	통과 (1.02ms, 80.6MB)
테스트 9 〉	통과 (1.15ms, 83.7MB)
테스트 10 〉	통과 (10.38ms, 82MB)
테스트 11 〉	통과 (9.52ms, 86.6MB)
테스트 12 〉	통과 (6.33ms, 73.1MB)
테스트 13 〉	통과 (6.35ms, 78.7MB)
테스트 14 〉	통과 (7.09ms, 77.4MB)
테스트 15 〉	통과 (7.13ms, 75.9MB)
테스트 16 〉	통과 (31.75ms, 95.4MB)
테스트 17 〉	통과 (18.57ms, 79.1MB)
테스트 18 〉	통과 (19.13ms, 84.7MB)
테스트 19 〉	통과 (164.28ms, 90.8MB)
테스트 20 〉	통과 (166.12ms, 78.3MB)
 */

public class Sol5_무작위로_K개의_수_뽑기 {
	public static void main(String[] args) {
		Solution5 sol = new Solution5();
		System.out.println(Arrays.toString(sol.solution(new int[]{0, 1, 1, 2, 2, 3}, 3)));
		System.out.println(Arrays.toString(sol.solution(new int[]{0, 1, 1, 1, 1}, 4)));
	}
}
