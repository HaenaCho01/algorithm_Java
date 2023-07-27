package Programmers.lv0.codingTestIntroduction.day16_문자열_수학_배열_조건문;

public class Sol1_편지 {
	public int solution(String message) {
		return message.length() * 2;
	}

/*
테스트 1 〉	통과 (0.01ms, 74.3MB)
테스트 2 〉	통과 (0.02ms, 78.9MB)
테스트 3 〉	통과 (0.02ms, 74.6MB)
 */

	public static void main(String[] args) {
		Sol1_편지 sol = new Sol1_편지();
		System.out.println(sol.solution("happy birthday!"));
		System.out.println(sol.solution("I love you~"));
	}
}
