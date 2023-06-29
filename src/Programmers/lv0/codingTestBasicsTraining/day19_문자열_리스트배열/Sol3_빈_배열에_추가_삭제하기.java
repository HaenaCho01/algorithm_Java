package Programmers.lv0.codingTestBasicsTraining.day19_문자열_리스트배열;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution3 {
	public int[] solution(int[] arr, boolean[] flag) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (flag[i]) {
				for (int j = 1; j <= arr[i]*2; j++) {
					list.add(arr[i]);
				}
			} else {
				for (int j = 1; j <= arr[i]; j++) {
					list.remove(list.size()-1);
				}
			}
		}
		int[] answer = new int[list.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}
}

/*
테스트 1 〉	통과 (0.07ms, 76.5MB)
테스트 2 〉	통과 (0.17ms, 75.1MB)
테스트 3 〉	통과 (0.04ms, 78.1MB)
테스트 4 〉	통과 (0.16ms, 71.9MB)
테스트 5 〉	통과 (0.13ms, 71.6MB)
테스트 6 〉	통과 (0.05ms, 63MB)
테스트 7 〉	통과 (0.21ms, 70.4MB)
테스트 8 〉	통과 (0.15ms, 78.4MB)
테스트 9 〉	통과 (0.35ms, 75.9MB)
테스트 10 〉	통과 (0.22ms, 78MB)
테스트 11 〉	통과 (0.30ms, 79.3MB)
테스트 12 〉	통과 (0.28ms, 76.4MB)
테스트 13 〉	통과 (0.26ms, 78.7MB)
테스트 14 〉	통과 (0.23ms, 73.2MB)
테스트 15 〉	통과 (0.34ms, 74.7MB)
테스트 16 〉	통과 (0.34ms, 74.9MB)
테스트 17 〉	통과 (0.33ms, 79.7MB)
테스트 18 〉	통과 (0.67ms, 80.6MB)
테스트 19 〉	통과 (0.38ms, 72.8MB)
테스트 20 〉	통과 (0.04ms, 72.5MB)
 */

public class Sol3_빈_배열에_추가_삭제하기 {
	public static void main(String[] args) {
		Solution3 sol = new Solution3();
		System.out.println(Arrays.toString(sol.solution(new int[]{3, 2, 4, 1, 3}, new boolean[]{true, false, true, false, false})));
	}
}
