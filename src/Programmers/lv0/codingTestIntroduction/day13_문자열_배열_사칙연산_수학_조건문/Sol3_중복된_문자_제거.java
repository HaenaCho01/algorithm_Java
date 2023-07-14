package Programmers.lv0.codingTestIntroduction.day13_문자열_배열_사칙연산_수학_조건문;

public class Sol3_중복된_문자_제거 {
	public String solution(String my_string) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < my_string.length(); i++) {
			if (my_string.indexOf(my_string.charAt(i)) == i) {
				sb.append(my_string.charAt(i));
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		Sol3_중복된_문자_제거 sol = new Sol3_중복된_문자_제거();
		System.out.println(sol.solution("people"));
		System.out.println(sol.solution("We are the world"));
	}
}

/*
테스트 1 〉	통과 (0.05ms, 75.1MB)
테스트 2 〉	통과 (0.03ms, 78.5MB)
테스트 3 〉	통과 (0.04ms, 77.4MB)
테스트 4 〉	통과 (0.04ms, 77MB)
테스트 5 〉	통과 (0.03ms, 74.1MB)
테스트 6 〉	통과 (0.03ms, 68.8MB)
테스트 7 〉	통과 (0.03ms, 77.7MB)
 */