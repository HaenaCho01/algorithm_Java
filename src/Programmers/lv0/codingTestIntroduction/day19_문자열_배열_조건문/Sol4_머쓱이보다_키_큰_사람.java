package Programmers.lv0.codingTestIntroduction.day19_문자열_배열_조건문;

public class Sol4_머쓱이보다_키_큰_사람 {
	public int solution(int[] array, int height) {
		int cnt = 0;
		for (int i : array) {
			if (height < i) cnt++;
		}
		return cnt;
	}

	public static void main(String[] args) {
		Sol4_머쓱이보다_키_큰_사람 sol = new Sol4_머쓱이보다_키_큰_사람();
		System.out.println(sol.solution(new int[]{149, 180, 192, 170}, 167));
		System.out.println(sol.solution(new int[]{180, 120, 140}, 190));
	}
}

/*
테스트 1 〉	통과 (0.03ms, 74.5MB)
테스트 2 〉	통과 (0.01ms, 77.6MB)
테스트 3 〉	통과 (0.03ms, 77.3MB)
테스트 4 〉	통과 (0.02ms, 75.4MB)
 */