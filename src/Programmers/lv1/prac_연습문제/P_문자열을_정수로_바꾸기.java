package Programmers.lv1.prac_연습문제;

public class P_문자열을_정수로_바꾸기 {
	public int solution(String s) {
		return Integer.parseInt(s);
	}

	public static void main(String[] args) {
		P_문자열을_정수로_바꾸기 sol = new P_문자열을_정수로_바꾸기();
		System.out.println(sol.solution("-1234"));
	}
}

/*
테스트 1 〉	통과 (0.02ms, 76.1MB)
테스트 2 〉	통과 (0.03ms, 78.3MB)
테스트 3 〉	통과 (0.03ms, 73.1MB)
테스트 4 〉	통과 (0.02ms, 75.4MB)
테스트 5 〉	통과 (0.03ms, 77.3MB)
테스트 6 〉	통과 (0.04ms, 76.9MB)
테스트 7 〉	통과 (0.04ms, 77.2MB)
테스트 8 〉	통과 (0.02ms, 67.7MB)
테스트 9 〉	통과 (0.03ms, 77.8MB)
테스트 10 〉	통과 (0.02ms, 73MB)
테스트 11 〉	통과 (0.02ms, 76.1MB)
테스트 12 〉	통과 (0.03ms, 71.9MB)
테스트 13 〉	통과 (0.02ms, 76.8MB)
테스트 14 〉	통과 (0.02ms, 73.6MB)
테스트 15 〉	통과 (0.03ms, 77.7MB)
 */