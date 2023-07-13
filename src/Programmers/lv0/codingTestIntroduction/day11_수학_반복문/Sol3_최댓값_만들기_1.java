package Programmers.lv0.codingTestIntroduction.day11_수학_반복문;

import java.util.Arrays;

public class Sol3_최댓값_만들기_1 {
	public int solution(int[] numbers) {
		Arrays.sort(numbers);
		return numbers[numbers.length - 1] * numbers[numbers.length - 2];
	}

	public static void main(String[] args) {
		Sol3_최댓값_만들기_1 sol = new Sol3_최댓값_만들기_1();
		System.out.println(sol.solution(new int[]{1, 2, 3, 4, 5}));
		System.out.println(sol.solution(new int[]{0, 31, 24, 10, 1, 9}));
	}
}

/*
테스트 1 〉	통과 (0.46ms, 73.9MB)
테스트 2 〉	통과 (0.31ms, 80.3MB)
테스트 3 〉	통과 (0.40ms, 80.5MB)
테스트 4 〉	통과 (0.54ms, 74.7MB)
테스트 5 〉	통과 (0.34ms, 68.2MB)
테스트 6 〉	통과 (0.34ms, 71.6MB)
테스트 7 〉	통과 (0.49ms, 72.8MB)
테스트 8 〉	통과 (0.37ms, 73.3MB)
테스트 9 〉	통과 (0.40ms, 75.2MB)
테스트 10 〉	통과 (0.47ms, 70.9MB)
테스트 11 〉	통과 (0.33ms, 72.2MB)
테스트 12 〉	통과 (0.37ms, 74.9MB)
테스트 13 〉	통과 (0.37ms, 80.6MB)
테스트 14 〉	통과 (0.33ms, 73.8MB)
테스트 15 〉	통과 (0.34ms, 73.4MB)
 */