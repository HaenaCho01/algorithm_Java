package Programmers.lv0.codingTestBasicsTraining.day19_문자열_리스트배열;

import java.util.Arrays;

class Solution2 {
	public int[] solution(int[] arr) {
		int answerSize = 0;
		for (int i : arr) {
			answerSize += i;
		}
		int[] answer = new int[answerSize];
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j <= arr[i]; j++) {
				answer[index++] = arr[i];
			}
		}
		return answer;
	}
}

/*
테스트 1 〉	통과 (0.03ms, 78.8MB)
테스트 2 〉	통과 (0.05ms, 76.5MB)
테스트 3 〉	통과 (0.02ms, 75.9MB)
테스트 4 〉	통과 (0.04ms, 71.1MB)
테스트 5 〉	통과 (0.08ms, 75.5MB)
테스트 6 〉	통과 (0.03ms, 63.5MB)
테스트 7 〉	통과 (0.12ms, 76.2MB)
테스트 8 〉	통과 (0.11ms, 74.8MB)
테스트 9 〉	통과 (0.17ms, 77.8MB)
테스트 10 〉	통과 (0.18ms, 72.1MB)
테스트 11 〉	통과 (0.10ms, 75.5MB)
테스트 12 〉	통과 (0.11ms, 67.6MB)
테스트 13 〉	통과 (0.39ms, 89.7MB)
테스트 14 〉	통과 (0.02ms, 76.5MB)
테스트 15 〉	통과 (0.02ms, 85MB)
테스트 16 〉	통과 (0.01ms, 74.2MB)
 */

public class Sol2_배열의_원소만큼_추가하기 {
	public static void main(String[] args) {
		Solution2 sol = new Solution2();
		System.out.println(Arrays.toString(sol.solution(new int[]{5, 1, 4})));
		System.out.println(Arrays.toString(sol.solution(new int[]{6, 6})));
		System.out.println(Arrays.toString(sol.solution(new int[]{1})));
	}
}
