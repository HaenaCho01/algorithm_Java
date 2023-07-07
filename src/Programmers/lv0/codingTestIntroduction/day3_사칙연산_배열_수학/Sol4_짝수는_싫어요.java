package Programmers.lv0.codingTestIntroduction.day3_사칙연산_배열_수학;

import java.util.Arrays;

public class Sol4_짝수는_싫어요 {
	public int[] solution(int n) {
		int index = n % 2 == 0 ? n / 2 : n / 2 + 1;
		int[] answer = new int[index];
		for (int i = 0, j = 1; i < answer.length; i++, j = j + 2) {
			answer[i] = j;
		}
		return answer;
	}

	public static void main(String[] args) {
		Sol4_짝수는_싫어요 sol = new Sol4_짝수는_싫어요();
		System.out.println(Arrays.toString(sol.solution(10)));
		System.out.println(Arrays.toString(sol.solution(15)));
	}
}

/*
테스트 1 〉	통과 (0.02ms, 72.6MB)
테스트 2 〉	통과 (0.02ms, 74.3MB)
테스트 3 〉	통과 (0.02ms, 76.7MB)
테스트 4 〉	통과 (0.01ms, 78.5MB)
테스트 5 〉	통과 (0.01ms, 79.9MB)
테스트 6 〉	통과 (0.01ms, 75.7MB)
테스트 7 〉	통과 (0.02ms, 65.2MB)
테스트 8 〉	통과 (0.01ms, 74.9MB)
 */
