package Programmers.lv0.codingTestIntroduction.day13_문자열_배열_사칙연산_수학_조건문;

import java.util.Arrays;

public class Sol4_삼각형의_완성조건_1 {
	public int solution(int[] sides) {
		Arrays.sort(sides);
		return sides[2] < sides[0] + sides[1] ? 1 : 2;
	}

	public static void main(String[] args) {
		Sol4_삼각형의_완성조건_1 sol = new Sol4_삼각형의_완성조건_1();
		System.out.println(sol.solution(new int[]{1, 2, 3}));
		System.out.println(sol.solution(new int[]{3, 6, 2}));
		System.out.println(sol.solution(new int[]{199, 72, 222}));
	}
}

/*
테스트 1 〉	통과 (0.32ms, 77.4MB)
테스트 2 〉	통과 (0.35ms, 75.4MB)
테스트 3 〉	통과 (0.34ms, 81.3MB)
테스트 4 〉	통과 (0.37ms, 79.5MB)
테스트 5 〉	통과 (0.35ms, 77.8MB)
테스트 6 〉	통과 (0.52ms, 73.5MB)
테스트 7 〉	통과 (0.35ms, 75.8MB)
테스트 8 〉	통과 (0.31ms, 77.3MB)
테스트 9 〉	통과 (0.33ms, 72.3MB)
 */