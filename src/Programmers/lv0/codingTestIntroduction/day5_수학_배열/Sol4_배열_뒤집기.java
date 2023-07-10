package Programmers.lv0.codingTestIntroduction.day5_수학_배열;

import java.util.Arrays;

public class Sol4_배열_뒤집기 {
	public int[] solution(int[] num_list) {
		int[] answer = new int[num_list.length];
		for(int i = 0, j = num_list.length - 1; i < answer.length; i++, j--) {
			answer[i] = num_list[j];
		}
		return answer;
	}

	public static void main(String[] args) {
		Sol4_배열_뒤집기 sol = new Sol4_배열_뒤집기();
		System.out.println(Arrays.toString(sol.solution(new int[]{1, 2, 3, 4, 5})));
		System.out.println(Arrays.toString(sol.solution(new int[]{1,1,1,1,1,2})));
		System.out.println(Arrays.toString(sol.solution(new int[]{1,0,1,1,1,3,5})));
	}
}

/*
테스트 1 〉	통과 (0.01ms, 75.4MB)
테스트 2 〉	통과 (0.01ms, 78.8MB)
테스트 3 〉	통과 (0.02ms, 77.3MB)
테스트 4 〉	통과 (0.01ms, 74.2MB)
 */
