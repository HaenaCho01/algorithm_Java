package Programmers.lv0.codingTestIntroduction.day17_문자열_수학_조건문_배열_사칙연산;

public class Sol1_숫자_찾기 {
	public int solution(int num, int k) {
		int answer = -1;
		StringBuilder sb = new StringBuilder();
		sb.append(num);

		for (int i = 0; i < sb.length(); i++) {
			if (sb.charAt(i) - '0' == k) {
				answer = i + 1;
				break;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Sol1_숫자_찾기 sol = new Sol1_숫자_찾기();
		System.out.println(sol.solution(29183, 1));
		System.out.println(sol.solution(232443, 4));
		System.out.println(sol.solution(123456, 7));
	}
}

/*
테스트 1 〉	통과 (0.05ms, 80.8MB)
테스트 2 〉	통과 (0.05ms, 71MB)
테스트 3 〉	통과 (0.05ms, 73.4MB)
테스트 4 〉	통과 (0.04ms, 72.8MB)
테스트 5 〉	통과 (0.04ms, 69.2MB)
테스트 6 〉	통과 (0.03ms, 69.6MB)
테스트 7 〉	통과 (0.04ms, 77.8MB)
테스트 8 〉	통과 (0.07ms, 78.4MB)
 */