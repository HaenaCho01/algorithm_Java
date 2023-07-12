package Programmers.lv0.codingTestIntroduction.day10_조건문_배열_수학_시뮬레이션;

import java.util.Arrays;

public class Sol4_배열_회전시키기 {
	public int[] solution(int[] numbers, String direction) {
		int[] answer = new int[numbers.length];
		if (direction.equals("left")) {
			for (int i = 1; i < numbers.length; i++) {
				answer[i-1] = numbers[i];
			}
			answer[answer.length - 1] = numbers[0];
		} else if (direction.equals("right")) {
			answer[0] = numbers[numbers.length - 1];
			for (int i = 0; i < numbers.length - 1; i++) {
				answer[i+1] = numbers[i];
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Sol4_배열_회전시키기 sol = new Sol4_배열_회전시키기();
		System.out.println(Arrays.toString(sol.solution(new int[]{1, 2, 3}, "right")));
		System.out.println(Arrays.toString(sol.solution(new int[]{4,455,6,4,-1,45,6}, "left")));
	}
}

/*
테스트 1 〉	통과 (0.03ms, 79.1MB)
테스트 2 〉	통과 (0.02ms, 75.1MB)
테스트 3 〉	통과 (0.03ms, 77.7MB)
테스트 4 〉	통과 (0.02ms, 90MB)
테스트 5 〉	통과 (0.02ms, 77.5MB)
 */