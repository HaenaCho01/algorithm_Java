package Programmers.lv0.codingTestIntroduction.day17_문자열_수학_조건문_배열_사칙연산;

public class Sol3_자릿수_더하기 {
	public int solution(int n) {
		StringBuilder sb = new StringBuilder();
		sb.append(n);
		int answer = 0;
		for (int i = 0; i < sb.length(); i++) {
			answer += sb.charAt(i) - '0';
		}
		return answer;
	}

	public static void main(String[] args) {
		Sol3_자릿수_더하기 sol = new Sol3_자릿수_더하기();
		System.out.println(sol.solution(1234));
		System.out.println(sol.solution(930211));
	}
}

/*
테스트 1 〉	통과 (0.03ms, 74.2MB)
테스트 2 〉	통과 (0.04ms, 77MB)
테스트 3 〉	통과 (0.04ms, 78.8MB)
테스트 4 〉	통과 (0.03ms, 70MB)
테스트 5 〉	통과 (0.06ms, 77.2MB)
테스트 6 〉	통과 (0.05ms, 73.7MB)
테스트 7 〉	통과 (0.05ms, 66.7MB)
 */