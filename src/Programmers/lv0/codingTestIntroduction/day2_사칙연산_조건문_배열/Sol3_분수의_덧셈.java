package Programmers.lv0.codingTestIntroduction.day2_사칙연산_조건문_배열;

import java.util.Arrays;

public class Sol3_분수의_덧셈 {
	public static void main(String[] args) {
		Sol3_분수의_덧셈 sol = new Sol3_분수의_덧셈();
		System.out.println(Arrays.toString(sol.solution(1, 2, 3, 4)));
		System.out.println(Arrays.toString(sol.solution(9,2,1,3)));
	}

	public int[] solution(int numer1, int denom1, int numer2, int denom2) {
		int numer = (numer1 * denom2) + (numer2 * denom1); // 분자
		int denom = (denom1 * denom2); // 분모
		int max = 1;
		for(int i = 1; i <= numer; i++) {
			if (numer % i == 0 && denom % i == 0) {
				max = i;// 최대공약수 만들기 -> 약분
			}
		}

		int[] answer = {numer/max, denom/max};
		return answer;
	}
}

/*
테스트 1 〉	통과 (2.56ms, 73.7MB)
테스트 2 〉	통과 (0.05ms, 75.1MB)
테스트 3 〉	통과 (0.03ms, 77.9MB)
테스트 4 〉	통과 (0.01ms, 76.1MB)
테스트 5 〉	통과 (0.03ms, 74.5MB)
테스트 6 〉	통과 (7.59ms, 76.5MB)
테스트 7 〉	통과 (5.63ms, 82.6MB)
테스트 8 〉	통과 (4.62ms, 77.2MB)
테스트 9 〉	통과 (2.23ms, 78.2MB)
테스트 10 〉	통과 (2.28ms, 73.5MB)
테스트 11 〉	통과 (0.07ms, 79.7MB)
테스트 12 〉	통과 (0.06ms, 75.8MB)
테스트 13 〉	통과 (0.05ms, 72.5MB)
테스트 14 〉	통과 (0.12ms, 77.1MB)
테스트 15 〉	통과 (0.29ms, 73.1MB)
 */