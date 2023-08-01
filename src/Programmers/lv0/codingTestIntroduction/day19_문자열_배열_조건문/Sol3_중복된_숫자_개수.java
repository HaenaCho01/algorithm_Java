package Programmers.lv0.codingTestIntroduction.day19_문자열_배열_조건문;

public class Sol3_중복된_숫자_개수 {
	public int solution(int[] array, int n) {
		int cnt = 0;
		for (int i : array) {
			if (i == n) cnt++;
		}
		return cnt;
	}

	public static void main(String[] args) {
		Sol3_중복된_숫자_개수 sol = new Sol3_중복된_숫자_개수();
		System.out.println(sol.solution(new int[]{1, 1, 2, 3, 4, 5}, 1));
		System.out.println(sol.solution(new int[]{0, 2, 3, 4}, 1));
	}
}

/*
테스트 1 〉	통과 (0.02ms, 75.2MB)
테스트 2 〉	통과 (0.01ms, 76.6MB)
테스트 3 〉	통과 (0.01ms, 72.8MB)
테스트 4 〉	통과 (0.04ms, 76.9MB)
테스트 5 〉	통과 (0.02ms, 85.6MB)
테스트 6 〉	통과 (0.02ms, 77.4MB)
 */