package Programmers.lv0.codingTestIntroduction.day22_dp_수학_조건문_배열;

public class Sol3_겹치는_선분의_길이 {
	public int solution(int[][] lines) {
		int answer = 0;
		int[] line = new int[201];
		for (int i = 0; i < lines.length; i++) {
			for (int j = lines[i][0] + 1; j <= lines[i][1]; j++) {
				line[j + 100]++;
			}
		}
		for (int i = 0; i < line.length; i++) {
			if (line[i] > 1) answer++;
		}
		return answer;
	}

	public static void main(String[] args) {
		Sol3_겹치는_선분의_길이 sol = new Sol3_겹치는_선분의_길이();
		System.out.println(sol.solution(new int[][]{{0, 1}, {2, 5}, {3, 9}}));
		System.out.println(sol.solution(new int[][]{{-1, 1}, {1, 3}, {3, 9}}));
		System.out.println(sol.solution(new int[][]{{0, 5}, {3, 9}, {1, 10}}));
	}
}

/*
테스트 1 〉	통과 (0.03ms, 76.7MB)
테스트 2 〉	통과 (0.02ms, 73.1MB)
테스트 3 〉	통과 (0.02ms, 76.6MB)
테스트 4 〉	통과 (0.03ms, 74.6MB)
테스트 5 〉	통과 (0.02ms, 72.7MB)
테스트 6 〉	통과 (0.02ms, 74.6MB)
테스트 7 〉	통과 (0.04ms, 77.1MB)
테스트 8 〉	통과 (0.05ms, 85MB)
테스트 9 〉	통과 (0.03ms, 74.2MB)
테스트 10 〉	통과 (0.02ms, 73.1MB)
 */