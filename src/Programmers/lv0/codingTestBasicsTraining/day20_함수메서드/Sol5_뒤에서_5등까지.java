package Programmers.lv0.codingTestBasicsTraining.day20_함수메서드;

import java.util.Arrays;

class Solution5 {
	public int[] solution(int[] num_list) {
		int[] answer = new int[5];
		Arrays.sort(num_list);
		for (int i = 0; i < answer.length; i++) {
			answer[i] = num_list[i];
		}
		return answer;
	}
}

/*
테스트 1 〉	통과 (0.35ms, 74.6MB)
테스트 2 〉	통과 (0.35ms, 78MB)
테스트 3 〉	통과 (0.42ms, 75.9MB)
테스트 4 〉	통과 (0.43ms, 75.3MB)
테스트 5 〉	통과 (0.37ms, 74.2MB)
테스트 6 〉	통과 (0.32ms, 79.8MB)
테스트 7 〉	통과 (0.35ms, 77.1MB)
테스트 8 〉	통과 (0.44ms, 80.9MB)
테스트 9 〉	통과 (0.35ms, 79.7MB)
테스트 10 〉	통과 (0.36ms, 75.9MB)
테스트 11 〉	통과 (0.51ms, 76.9MB)
테스트 12 〉	통과 (0.31ms, 71.2MB)
테스트 13 〉	통과 (0.35ms, 75.4MB)
테스트 14 〉	통과 (0.33ms, 74MB)
테스트 15 〉	통과 (0.62ms, 72.9MB)
테스트 16 〉	통과 (0.44ms, 74.8MB)
테스트 17 〉	통과 (0.42ms, 75.2MB)
테스트 18 〉	통과 (0.50ms, 71.3MB)
테스트 19 〉	통과 (0.37ms, 76MB)
 */

public class Sol5_뒤에서_5등까지 {
	public static void main(String[] args) {
		Solution5 sol = new Solution5();
		System.out.println(Arrays.toString(sol.solution(new int[]{12, 4, 15, 46, 38, 1, 14})));
	}
}
