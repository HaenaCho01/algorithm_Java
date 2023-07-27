package Programmers.lv0.codingTestIntroduction.day16_문자열_수학_배열_조건문;

import java.util.Arrays;

public class Sol2_가장_큰_수_찾기 {
	public int[] solution(int[] array) {
		int[] answer = {array[0], 0};
		for (int i = 1; i < array.length; i++) {
			if (answer[0] < array[i]) {
				answer[0] = array[i];
				answer[1] = i;
			}
		}
		return answer;
	}

/*
테스트 1 〉	통과 (0.03ms, 73.3MB)
테스트 2 〉	통과 (0.01ms, 77.4MB)
 */

	public static void main(String[] args) {
		Sol2_가장_큰_수_찾기 sol = new Sol2_가장_큰_수_찾기();
		System.out.println(Arrays.toString(sol.solution(new int[]{1, 8, 3})));
		System.out.println(Arrays.toString(sol.solution(new int[]{9, 10, 11, 8})));
	}

}
