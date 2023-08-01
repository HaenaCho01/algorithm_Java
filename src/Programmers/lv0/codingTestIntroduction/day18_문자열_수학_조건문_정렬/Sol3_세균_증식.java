package Programmers.lv0.codingTestIntroduction.day18_문자열_수학_조건문_정렬;

public class Sol3_세균_증식 {
	public int solution(int n, int t) {
		for (int i = 1; i <= t; i++) {
			n *= 2;
		}
		return n;
	}

	public static void main(String[] args) {
		Sol3_세균_증식 sol = new Sol3_세균_증식();
		System.out.println(sol.solution(2, 10));
		System.out.println(sol.solution(7, 15));
	}
}

/*
테스트 1 〉	통과 (0.02ms, 74.1MB)
테스트 2 〉	통과 (0.02ms, 72.6MB)
테스트 3 〉	통과 (0.02ms, 73.5MB)
테스트 4 〉	통과 (0.02ms, 72MB)
테스트 5 〉	통과 (0.02ms, 73.6MB)
테스트 6 〉	통과 (0.03ms, 76.6MB)
테스트 7 〉	통과 (0.02ms, 72.6MB)
테스트 8 〉	통과 (0.01ms, 65.5MB)
 */