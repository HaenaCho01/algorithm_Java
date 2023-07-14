package Programmers.lv0.codingTestIntroduction.day14_조건문_반복문_시뮬레이션_문자열;

public class Sol3_암호_해독 {
	public String solution(String cipher, int code) {
		StringBuilder sb = new StringBuilder();
		for (int i = code - 1; i < cipher.length(); i += code) sb.append(cipher.charAt(i));
		return sb.toString();
	}

	public static void main(String[] args) {
		Sol3_암호_해독 sol = new Sol3_암호_해독();
		System.out.println(sol.solution("dfjardstddetckdaccccdegk", 4));
		System.out.println(sol.solution("pfqallllabwaoclk", 2));
	}
}

/*
테스트 1 〉	통과 (0.03ms, 73.8MB)
테스트 2 〉	통과 (0.09ms, 73.9MB)
테스트 3 〉	통과 (0.03ms, 85.7MB)
테스트 4 〉	통과 (0.09ms, 73MB)
테스트 5 〉	통과 (0.03ms, 76.4MB)
테스트 6 〉	통과 (0.05ms, 74.3MB)
테스트 7 〉	통과 (0.19ms, 76.9MB)
테스트 8 〉	통과 (0.18ms, 81.4MB)
테스트 9 〉	통과 (0.14ms, 74.9MB)
테스트 10 〉	통과 (0.06ms, 74.4MB)
테스트 11 〉	통과 (0.09ms, 71.9MB)
 */