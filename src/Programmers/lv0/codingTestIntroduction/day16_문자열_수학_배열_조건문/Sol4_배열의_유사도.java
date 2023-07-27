package Programmers.lv0.codingTestIntroduction.day16_문자열_수학_배열_조건문;

public class Sol4_배열의_유사도 {
	public int solution(String[] s1, String[] s2) {
		int cnt = 0;
		for (int i = 0; i < s1.length; i++) {
			for (int j = 0; j < s2.length; j++) {
				if (s1[i].equals(s2[j])) cnt++;
			}
		}
		return cnt;
	}

/*
테스트 1 〉	통과 (0.03ms, 73.3MB)
테스트 2 〉	통과 (0.03ms, 74MB)
테스트 3 〉	통과 (0.03ms, 74.2MB)
테스트 4 〉	통과 (0.02ms, 73MB)
테스트 5 〉	통과 (0.03ms, 78.2MB)
테스트 6 〉	통과 (0.04ms, 76.4MB)
테스트 7 〉	통과 (0.03ms, 67.3MB)
테스트 8 〉	통과 (0.02ms, 76.9MB)
 */

	public static void main(String[] args) {
		Sol4_배열의_유사도 sol = new Sol4_배열의_유사도();
		System.out.println(sol.solution(new String[]{"a", "b", "c"}, new String[]{"com", "b", "d", "p", "c"}));
		System.out.println(sol.solution(new String[]{"n", "omg"}, new String[]{"m", "dot"}));
	}
}
