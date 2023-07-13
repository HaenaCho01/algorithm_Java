package Programmers.lv0.codingTestIntroduction.day12_문자열_정렬_사칙연산_수학;

public class Sol3_숨어있는_숫자의_덧셈_1 {
	public int solution(String my_string) {
		int answer = 0;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < my_string.length(); i++) {
			if (my_string.charAt(i) >= '0' && my_string.charAt(i) <= '9') {
				sb.append(my_string.charAt(i));
			}
		}
		for (int i = 0; i < sb.length(); i++) {
			answer += sb.charAt(i) - '0';
		}
		return answer;
	}

	public int solutionOther1(String myString) {
		return myString.chars().mapToObj(i -> (char) i).filter(Character::isDigit).map(String::valueOf).mapToInt(Integer::valueOf).sum();
	}

	public static void main(String[] args) {
		Sol3_숨어있는_숫자의_덧셈_1 sol = new Sol3_숨어있는_숫자의_덧셈_1();
		System.out.println(sol.solution("aAb1B2cC34oOp"));
		System.out.println(sol.solution("1a2b3c4d123"));
	}
}

/*
테스트 1 〉	통과 (0.06ms, 82.1MB)
테스트 2 〉	통과 (0.05ms, 74.9MB)
테스트 3 〉	통과 (0.08ms, 89.9MB)
테스트 4 〉	통과 (0.07ms, 73.6MB)
테스트 5 〉	통과 (0.04ms, 77.4MB)
테스트 6 〉	통과 (0.03ms, 77.7MB)
 */