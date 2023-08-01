package Programmers.lv0.codingTestIntroduction.day20_수학_시뮬레이션_문자열_사칙연산;

public class Sol4_다항식_더하기 {
	public String solution(String polynomial) {
		String[] split = polynomial.split(" ");

		int[] variableAndConstant = {0, 0};
		for (String s : split) {
			if (s.contains("x")) {
				variableAndConstant[0] += s.charAt(0) == 'x' ? 1 : Integer.parseInt(s.substring(0, s.length() - 1));
			} else if (!s.contains("x") && !s.equals("+")) {
				variableAndConstant[1] += Integer.parseInt(s);
			}
		}

		StringBuilder sb = new StringBuilder();
		if (variableAndConstant[0] != 0) {
			if (variableAndConstant[0] != 1 ) sb.append(variableAndConstant[0]);
			sb.append('x');
		}
		if (variableAndConstant[0] != 0 && variableAndConstant[1] != 0) sb.append(" + ");
		if (variableAndConstant[1] != 0) sb.append(variableAndConstant[1]);

		return sb.toString();
	}

	public static void main(String[] args) {
		Sol4_다항식_더하기 sol = new Sol4_다항식_더하기();
		System.out.println(sol.solution("3x + 7 + x"));
		System.out.println(sol.solution("x + x + x"));
		System.out.println(sol.solution("15x + 200 + x"));
		System.out.println(sol.solution("200 + 301"));
		System.out.println(sol.solution("x + 99 + x + x + x + 101"));
		System.out.println(sol.solution("x"));

	}
}

/*
테스트 1 〉	통과 (0.17ms, 65.6MB)
테스트 2 〉	통과 (0.14ms, 74.5MB)
테스트 3 〉	통과 (0.17ms, 75.9MB)
테스트 4 〉	통과 (0.16ms, 72.7MB)
테스트 5 〉	통과 (0.11ms, 74.3MB)
테스트 6 〉	통과 (0.06ms, 70.9MB)
테스트 7 〉	통과 (0.05ms, 67.4MB)
테스트 8 〉	통과 (0.14ms, 76.2MB)
테스트 9 〉	통과 (0.19ms, 85.9MB)
테스트 10 〉	통과 (0.04ms, 80.8MB)
테스트 11 〉	통과 (0.05ms, 71.7MB)
테스트 12 〉	통과 (0.10ms, 77.1MB)
 */