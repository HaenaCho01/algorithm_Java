package Programmers.lv0.codingTestIntroduction.day21_문자열_사칙연산_시뮬레이션_2차원배열_수학_배열;

public class Sol3_삼각형의_완성조건_2 {
	public int solution(int[] sides) {
		int answer = 0;

		int min = Math.min(sides[0], sides[1]);
		int max = Math.max(sides[0], sides[1]);

		for (int i = max - min + 1; i <= max; i++) answer++;
		for (int i = max + 1; i < min + max; i++) answer++;
		return answer;
	}

	public static void main(String[] args) {
		Sol3_삼각형의_완성조건_2 sol = new Sol3_삼각형의_완성조건_2();
		System.out.println(sol.solution(new int[]{1, 2}));
		System.out.println(sol.solution(new int[]{3, 6}));
		System.out.println(sol.solution(new int[]{11, 7}));
	}
}

/*
테스트 1 〉	통과 (0.02ms, 79.9MB)
테스트 2 〉	통과 (0.03ms, 66.4MB)
테스트 3 〉	통과 (0.04ms, 70.1MB)
테스트 4 〉	통과 (0.03ms, 74.2MB)
테스트 5 〉	통과 (0.03ms, 76.3MB)
테스트 6 〉	통과 (0.06ms, 70.1MB)
테스트 7 〉	통과 (0.11ms, 70.9MB)
테스트 8 〉	통과 (0.04ms, 71.9MB)
테스트 9 〉	통과 (0.03ms, 75.2MB)
테스트 10 〉	통과 (0.02ms, 78.3MB)
 */