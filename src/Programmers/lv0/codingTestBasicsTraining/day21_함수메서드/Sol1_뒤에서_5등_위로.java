package Programmers.lv0.codingTestBasicsTraining.day21_함수메서드;

import java.util.Arrays;

class Solution1 {
	public int[] solution(int[] num_list) {
		Arrays.sort(num_list);
		int[] answer = new int[num_list.length - 5];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = num_list[i+5];
		}
		return answer;
	}
}

/*
테스트 1 〉	통과 (0.33ms, 74.3MB)
테스트 2 〉	통과 (0.47ms, 74MB)
테스트 3 〉	통과 (0.34ms, 73.1MB)
테스트 4 〉	통과 (0.36ms, 75.4MB)
테스트 5 〉	통과 (0.35ms, 76MB)
테스트 6 〉	통과 (0.31ms, 78.3MB)
테스트 7 〉	통과 (0.32ms, 76.8MB)
테스트 8 〉	통과 (0.34ms, 72.3MB)
테스트 9 〉	통과 (0.32ms, 66.6MB)
테스트 10 〉	통과 (0.47ms, 74.3MB)
테스트 11 〉	통과 (0.46ms, 76.3MB)
테스트 12 〉	통과 (0.46ms, 78.4MB)
테스트 13 〉	통과 (0.48ms, 74.5MB)
테스트 14 〉	통과 (0.33ms, 77MB)
테스트 15 〉	통과 (0.39ms, 70.7MB)
테스트 16 〉	통과 (0.33ms, 75.2MB)
테스트 17 〉	통과 (0.49ms, 74.9MB)
테스트 18 〉	통과 (0.50ms, 74.8MB)
테스트 19 〉	통과 (0.35ms, 75.5MB)
 */

public class Sol1_뒤에서_5등_위로 {
	public static void main(String[] args) {
		Solution1 sol = new Solution1();
		System.out.println(Arrays.toString(sol.solution(new int[]{12, 4, 15, 46, 38, 1, 14, 56, 32, 10})));
	}
}
