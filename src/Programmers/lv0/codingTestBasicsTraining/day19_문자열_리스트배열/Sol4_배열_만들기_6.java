package Programmers.lv0.codingTestBasicsTraining.day19_문자열_리스트배열;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution4 {
	public int[] solution(int[] arr) {
		List<Integer> stkList = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (stkList.size() == 0) {
				stkList.add(arr[i]);
			} else {
				if(arr[i] == stkList.get(stkList.size() - 1)) {
					stkList.remove(stkList.size()-1);
				} else {
					stkList.add(arr[i]);
				}
			}
		}
		int[] answer;
		if (stkList.size() == 0) {
			answer = new int[] {-1};
		} else {
			answer = new int[stkList.size()];
			for (int i = 0; i < answer.length; i++) {
				answer[i] = stkList.get(i);
			}
		}
		return answer;
	}
}

/*
테스트 1 〉	통과 (0.04ms, 76.6MB)
테스트 2 〉	통과 (0.04ms, 66.9MB)
테스트 3 〉	통과 (0.05ms, 73MB)
테스트 4 〉	통과 (0.07ms, 77.9MB)
테스트 5 〉	통과 (0.06ms, 74.7MB)
테스트 6 〉	통과 (0.04ms, 70.5MB)
테스트 7 〉	통과 (0.10ms, 79.7MB)
테스트 8 〉	통과 (0.05ms, 69MB)
테스트 9 〉	통과 (0.06ms, 71.9MB)
테스트 10 〉	통과 (0.21ms, 84.1MB)
테스트 11 〉	통과 (0.20ms, 72.7MB)
테스트 12 〉	통과 (5.11ms, 78.6MB)
테스트 13 〉	통과 (3.19ms, 76.8MB)
테스트 14 〉	통과 (2.38ms, 78.1MB)
테스트 15 〉	통과 (1.30ms, 72.6MB)
테스트 16 〉	통과 (18.52ms, 80.9MB)
테스트 17 〉	통과 (15.34ms, 91MB)
테스트 18 〉	통과 (18.10ms, 80.2MB)
테스트 19 〉	통과 (39.99ms, 125MB)
테스트 20 〉	통과 (13.51ms, 82.4MB)
 */

public class Sol4_배열_만들기_6 {
	public static void main(String[] args) {
		Solution4 sol = new Solution4();
		System.out.println(Arrays.toString(sol.solution(new int[]{0, 1, 1, 1, 0})));
		System.out.println(Arrays.toString(sol.solution(new int[]{0, 1, 0, 1, 0})));
		System.out.println(Arrays.toString(sol.solution(new int[]{0, 1, 1, 0})));
	}
}
