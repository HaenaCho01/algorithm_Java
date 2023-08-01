package Programmers.lv0.codingTestIntroduction.day19_문자열_배열_조건문;

public class Sol1_7의_개수 {
	public int solution(int[] array) {
		StringBuilder sb = new StringBuilder();
		for (int i : array) {
			sb.append(i);
		}

		int cnt = 0;
		for (int i = 0; i < sb.length(); i++) {
			if (sb.charAt(i) - '0' == 7) {
				cnt++;
			}
		}

		return cnt;
	}

	public static void main(String[] args) {
		Sol1_7의_개수 sol = new Sol1_7의_개수();
		System.out.println(sol.solution(new int[]{7, 77, 17}));
		System.out.println(sol.solution(new int[]{10, 29}));
	}
}

/*
테스트 1 〉	통과 (0.06ms, 69.2MB)
테스트 2 〉	통과 (0.06ms, 76.6MB)
테스트 3 〉	통과 (0.07ms, 78.8MB)
테스트 4 〉	통과 (0.04ms, 76.7MB)
 */