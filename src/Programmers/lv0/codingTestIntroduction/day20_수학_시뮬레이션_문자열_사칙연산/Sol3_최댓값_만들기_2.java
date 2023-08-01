package Programmers.lv0.codingTestIntroduction.day20_수학_시뮬레이션_문자열_사칙연산;

import java.util.Arrays;

public class Sol3_최댓값_만들기_2 {
	public int solution(int[] numbers) {
		int answer = -100000000;
		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (answer < numbers[i] * numbers[j]) answer = numbers[i] * numbers[j];
			}
		}
		return answer;
	}

	public int solutionOther(int[] numbers) {
		Arrays.sort(numbers);
		return Math.max(numbers[0] * numbers[1], numbers[numbers.length - 1] * numbers[numbers.length - 2]);
	}

	public static void main(String[] args) {
		Sol3_최댓값_만들기_2 sol = new Sol3_최댓값_만들기_2();
		System.out.println(sol.solution(new int[]{1, 2, -3, 4, -5}));
		System.out.println(sol.solution(new int[]{0, -31, 24, 10, 1, 9}));
		System.out.println(sol.solutionOther(new int[]{10, 20, 30, 5, 5, 20, 5}));
	}
}

/*
테스트 1 〉	통과 (0.02ms, 71.5MB)
테스트 2 〉	통과 (0.02ms, 72.8MB)
테스트 3 〉	통과 (0.02ms, 77MB)
테스트 4 〉	통과 (0.15ms, 73.9MB)
테스트 5 〉	통과 (0.04ms, 80.1MB)
테스트 6 〉	통과 (0.02ms, 70.4MB)
테스트 7 〉	통과 (0.04ms, 71.9MB)
테스트 8 〉	통과 (0.01ms, 70.4MB)
테스트 9 〉	통과 (0.02ms, 74.6MB)
테스트 10 〉	통과 (0.02ms, 75.8MB)
테스트 11 〉	통과 (0.03ms, 76.1MB)
테스트 12 〉	통과 (0.02ms, 72.2MB)
 */