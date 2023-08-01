package Programmers.lv0.codingTestIntroduction.day17_문자열_수학_조건문_배열_사칙연산;

import java.util.ArrayList;
import java.util.Arrays;

public class Sol2_n의_배수_고르기 {
	public int[] solution(int n, int[] numlist) {
		ArrayList<Integer> answerList = new ArrayList<>();
		for (int num : numlist) {
			if (num % n == 0) {
				answerList.add(num);
			}
		}
		int[] answer = new int[answerList.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = answerList.get(i);
		}
		return answer;
	}

	public static void main(String[] args) {
		Sol2_n의_배수_고르기 sol = new Sol2_n의_배수_고르기();
		System.out.println(Arrays.toString(sol.solution(3, new int[]{4, 5, 6, 7, 8, 9, 10, 11, 12})));
		System.out.println(Arrays.toString(sol.solution(5, new int[]{1, 9, 3, 10, 13, 5})));
		System.out.println(Arrays.toString(sol.solution(12, new int[]{2, 100, 120, 600, 12, 12})));
	}
}

/*
테스트 1 〉	통과 (0.02ms, 73.5MB)
테스트 2 〉	통과 (0.02ms, 65.1MB)
테스트 3 〉	통과 (0.03ms, 75.4MB)
테스트 4 〉	통과 (0.03ms, 72.9MB)
테스트 5 〉	통과 (0.04ms, 77.5MB)
테스트 6 〉	통과 (0.03ms, 73MB)
테스트 7 〉	통과 (0.03ms, 76.7MB)
테스트 8 〉	통과 (0.03ms, 74.3MB)
 */