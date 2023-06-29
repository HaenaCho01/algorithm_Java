package Programmers.lv0.codingTestBasicsTraining.day24_조건문활용_반복문활용_이차원리스트배열;

import java.util.Arrays;

class Solution5 {
	public int[][] solution(int n) {
		int[][] answer = new int[n][n];
		for (int i = 0; i < answer.length; i++) {
			answer[i][i] = 1;
		}
		return answer;
	}
}

/*
테스트 1 〉	통과 (0.01ms, 72.1MB)
테스트 2 〉	통과 (0.06ms, 78.5MB)
테스트 3 〉	통과 (0.03ms, 76.8MB)
테스트 4 〉	통과 (0.04ms, 86.7MB)
테스트 5 〉	통과 (0.06ms, 80.6MB)
테스트 6 〉	통과 (0.01ms, 72.9MB)
테스트 7 〉	통과 (0.05ms, 77.8MB)
테스트 8 〉	통과 (0.01ms, 72.8MB)
테스트 9 〉	통과 (0.01ms, 75.8MB)
테스트 10 〉	통과 (0.04ms, 67.3MB)
테스트 11 〉	통과 (0.05ms, 79.2MB)
테스트 12 〉	통과 (0.03ms, 78.1MB)
테스트 13 〉	통과 (0.03ms, 71.2MB)
테스트 14 〉	통과 (0.02ms, 73.9MB)
테스트 15 〉	통과 (0.04ms, 79.9MB)
 */

public class Sol5_특별한_2차원_배열_1 {
	public static void main(String[] args) {
		Solution5 sol = new Solution5();
		System.out.println(Arrays.deepToString(sol.solution(3)));
		System.out.println(Arrays.deepToString(sol.solution(6)));
		System.out.println(Arrays.deepToString(sol.solution(1)));
	}
}
