package Programmers.lv0.codingTestIntroduction.day2_사칙연산_조건문_배열;

import java.util.Arrays;

public class Sol4_배열_두배_만들기 {
	public static void main(String[] args) {
		Sol4_배열_두배_만들기 sol = new Sol4_배열_두배_만들기();
		System.out.println(Arrays.toString(sol.solution(new int[]{1, 2, 3, 4, 5})));
		System.out.println(Arrays.toString(sol.solution(new int[]{1,2,100,-99,1,2,3})));
	}

	public int[] solution(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] *= 2;
		}
		return numbers;
	}
}

/*
테스트 1 〉	통과 (0.01ms, 75.8MB)
테스트 2 〉	통과 (0.02ms, 74.7MB)
테스트 3 〉	통과 (0.01ms, 70.8MB)
테스트 4 〉	통과 (0.02ms, 74.3MB)
테스트 5 〉	통과 (0.01ms, 78.2MB)
테스트 6 〉	통과 (0.05ms, 80MB)
테스트 7 〉	통과 (0.05ms, 85.1MB)
테스트 8 〉	통과 (0.03ms, 78MB)
테스트 9 〉	통과 (0.03ms, 75.3MB)
테스트 10 〉	통과 (0.03ms, 87.7MB)
 */