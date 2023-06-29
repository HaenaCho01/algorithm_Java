package Programmers.lv0.codingTestBasicsTraining.day21_함수메서드;

class Solution5 {
	public int solution(String n_str) {
		return Integer.parseInt(n_str);
	}
}

/*
테스트 1 〉	통과 (0.03ms, 76.2MB)
테스트 2 〉	통과 (0.02ms, 67.6MB)
테스트 3 〉	통과 (0.03ms, 78.2MB)
테스트 4 〉	통과 (0.04ms, 79.7MB)
테스트 5 〉	통과 (0.02ms, 79.6MB)
 */

public class Sol5_문자열을_정수로_변환하기 {
	public static void main(String[] args) {
		Solution5 sol = new Solution5();
		System.out.println(sol.solution("10"));
		System.out.println(sol.solution("8542"));
	}
}
