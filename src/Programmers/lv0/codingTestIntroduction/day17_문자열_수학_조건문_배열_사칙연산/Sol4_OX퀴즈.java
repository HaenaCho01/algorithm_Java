package Programmers.lv0.codingTestIntroduction.day17_문자열_수학_조건문_배열_사칙연산;

import java.util.Arrays;

public class Sol4_OX퀴즈 {
	public String[] solution(String[] quiz) {
		String[] answer = new String[quiz.length];

		for (int i = 0; i < quiz.length; i++) {
			String[] quizSplit = quiz[i].split(" ");

			int num1 = Integer.parseInt(quizSplit[0]);
			String operator = quizSplit[1];
			int num2 = Integer.parseInt(quizSplit[2]);
			int result = Integer.parseInt(quizSplit[4]);

			if (operator.equals("+")) {
				if (num1 + num2 == result) {
					answer[i] = "O";
				} else {
					answer[i] ="X";
				}
			} else if (operator.equals("-")) {
				if (num1 - num2 == result) {
					answer[i] = "O";
				} else {
					answer[i] ="X";
				}
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Sol4_OX퀴즈 sol = new Sol4_OX퀴즈();
		System.out.println(Arrays.toString(sol.solution(new String[]{"3 - 4 = -3", "5 + 6 = 11"})));
		System.out.println(Arrays.toString(sol.solution(new String[]{"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"})));
	}
}

/*
테스트 1 〉	통과 (0.12ms, 67.8MB)
테스트 2 〉	통과 (0.16ms, 75.2MB)
테스트 3 〉	통과 (0.21ms, 74.1MB)
테스트 4 〉	통과 (0.08ms, 72.3MB)
테스트 5 〉	통과 (0.13ms, 73.8MB)
테스트 6 〉	통과 (1.11ms, 74.1MB)
테스트 7 〉	통과 (0.08ms, 76.1MB)
테스트 8 〉	통과 (0.19ms, 72.5MB)
테스트 9 〉	통과 (0.14ms, 78.6MB)
테스트 10 〉	통과 (0.19ms, 80.9MB)
테스트 11 〉	통과 (0.16ms, 72.4MB)
테스트 12 〉	통과 (0.24ms, 70.2MB)
테스트 13 〉	통과 (0.25ms, 71.8MB)
테스트 14 〉	통과 (0.22ms, 74.8MB)
테스트 15 〉	통과 (0.14ms, 74.4MB)
테스트 16 〉	통과 (0.19ms, 73.3MB)
테스트 17 〉	통과 (0.13ms, 79.8MB)
 */