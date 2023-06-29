package Programmers.lv0.codingTestBasicsTraining.day22_함수메서드_조건문활용;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution4 {
	public int[] solution(int[] arr, int[] delete_list) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
		for (int i = 0; i < delete_list.length; i++) {
			if (list.contains(delete_list[i])) {
				list.remove(list.indexOf(delete_list[i]));
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
테스트 1 〉	통과 (0.07ms, 84.2MB)
테스트 2 〉	통과 (0.07ms, 72.4MB)
테스트 3 〉	통과 (0.09ms, 74.9MB)
테스트 4 〉	통과 (0.15ms, 71.4MB)
테스트 5 〉	통과 (0.43ms, 75.2MB)
테스트 6 〉	통과 (0.42ms, 79.1MB)
테스트 7 〉	통과 (0.53ms, 71.6MB)
테스트 8 〉	통과 (0.36ms, 78.4MB)
테스트 9 〉	통과 (0.47ms, 74.8MB)
테스트 10 〉	통과 (0.52ms, 78.2MB)
테스트 11 〉	통과 (0.97ms, 73.5MB)
테스트 12 〉	통과 (0.40ms, 73.4MB)
테스트 13 〉	통과 (0.11ms, 76.7MB)
 */

public class Sol4_배열의_원소_삭제하기 {
	public static void main(String[] args) {
		Solution4 sol = new Solution4();
		System.out.println(Arrays.toString(sol.solution(new int[]{293, 1000, 395, 678, 94}, new int[]{94, 777, 104, 1000, 1, 12})));
		System.out.println(Arrays.toString(sol.solution(new int[]{110, 66, 439, 785, 1}, new int[]{377, 823, 119, 43})));
	}
}
