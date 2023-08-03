package Programmers.lv0.codingTestIntroduction.day23_배열_정렬_문자열;

import java.util.Arrays;
import java.util.Comparator;

public class Sol2_등수_매기기 {
	public int[] solution(int[][] score) {
		int[][] scoreIndex = new int[score.length][2];
		for (int i = 0; i < score.length; i++) {
			scoreIndex[i][0] = score[i][0] + score[i][1];
			scoreIndex[i][1] = i;
		}
		Arrays.sort(scoreIndex, Comparator.comparingInt((int[] o) -> o[0]).reversed());

		int[] answer = new int[score.length];
		int rank = 1;
		answer[scoreIndex[0][1]] = rank;
		int sameRank = 0;
		for (int i = 1; i < score.length; i++) {
			if (scoreIndex[i][0] == scoreIndex[i-1][0]) {
				sameRank++;
			} else {
				rank += sameRank + 1;
				sameRank = 0;
			}
			answer[scoreIndex[i][1]] = rank;
		}
		return answer;
	}

	public static void main(String[] args) {
		Sol2_등수_매기기 sol = new Sol2_등수_매기기();
		System.out.println(Arrays.toString(sol.solution(new int[][]{{80, 70}, {90, 50}, {40, 70}, {50, 80}})));
		System.out.println(Arrays.toString(sol.solution(new int[][]{{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100},{10, 30}})));
	}
}

/*
테스트 1 〉	통과 (1.86ms, 80.1MB)
테스트 2 〉	통과 (2.19ms, 77.8MB)
테스트 3 〉	통과 (2.58ms, 76.3MB)
테스트 4 〉	통과 (1.77ms, 74.7MB)
테스트 5 〉	통과 (2.72ms, 78.5MB)
테스트 6 〉	통과 (2.50ms, 72.4MB)
테스트 7 〉	통과 (1.92ms, 78.8MB)
테스트 8 〉	통과 (1.98ms, 83.6MB)
테스트 9 〉	통과 (2.07ms, 77.1MB)
테스트 10 〉	통과 (4.01ms, 74.8MB)
테스트 11 〉	통과 (2.79ms, 74.3MB)
테스트 12 〉	통과 (1.96ms, 77.8MB)
 */