package Programmers.lv0.codingTestIntroduction.day25_시뮬레이션_조건문_수학;

import java.util.Arrays;

public class Sol3_연속된_수의_합 {
	public int[] solution(int num, int total) {
		int[] answer = new int[num];
		int start = num % 2 == 0 ? total / num - num / 2 + 1 : total / num - num / 2;
		for (int i = 0; i < answer.length; i++) {
			answer[i] = start + i;
		}
		return answer;
	}

	public static void main(String[] args) {
		Sol3_연속된_수의_합 sol = new Sol3_연속된_수의_합();
		System.out.println(Arrays.toString(sol.solution(3, 12)));
		System.out.println(Arrays.toString(sol.solution(5, 15)));
		System.out.println(Arrays.toString(sol.solution(4, 14)));
		System.out.println(Arrays.toString(sol.solution(5, 5)));
	}
}

/*
테스트 1 〉	통과 (0.02ms, 72.1MB)
테스트 2 〉	통과 (0.02ms, 71.2MB)
테스트 3 〉	통과 (0.02ms, 74.9MB)
테스트 4 〉	통과 (0.02ms, 76.1MB)
테스트 5 〉	통과 (0.01ms, 65.7MB)
테스트 6 〉	통과 (0.01ms, 73.1MB)
테스트 7 〉	통과 (0.03ms, 73.8MB)
테스트 8 〉	통과 (0.02ms, 79.8MB)
테스트 9 〉	통과 (0.02ms, 76.2MB)
테스트 10 〉	통과 (0.02ms, 75MB)
 */