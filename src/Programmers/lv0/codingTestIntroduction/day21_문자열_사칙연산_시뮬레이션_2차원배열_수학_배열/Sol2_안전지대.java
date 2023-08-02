package Programmers.lv0.codingTestIntroduction.day21_문자열_사칙연산_시뮬레이션_2차원배열_수학_배열;

public class Sol2_안전지대 {
	public int solution(int[][] board) {
		int[][] compare = new int[board.length][board[0].length];
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				compare[i][j] = board[i][j];
			}
		}

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] == 1) {
					if (i - 1 >= 0) compare[i-1][j] = -1;
					if (i + 1 < board.length) compare[i+1][j] = -1;
					if (j - 1 >= 0)	compare[i][j-1] = -1;
					if (j + 1 < board[i].length) compare[i][j+1] = -1;
					if (i - 1 >= 0 && j - 1 >= 0) compare[i-1][j-1] = -1;
					if (i - 1 >= 0 && j + 1 < board[i].length) compare[i-1][j+1] = -1;
					if (i + 1 < board.length && j - 1 >= 0) compare[i+1][j-1] = -1;
					if (i + 1 < board.length && j + 1 < board[i].length) compare[i+1][j+1] = -1;
				}
			}
		}

		int answer = 0;
		for (int i = 0; i < compare.length; i++) {
			for (int j = 0; j < compare[i].length; j++) {
				if (compare[i][j] == 0) {
					answer++;
				}
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		Sol2_안전지대 sol = new Sol2_안전지대();
		System.out.println(sol.solution(new int[][]{
				{0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0},
				{0, 0, 1, 0, 0},
				{0, 0, 0, 0, 0}}));
		System.out.println(sol.solution(new int[][]{
				{0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0},
				{0, 0, 1, 1, 0},
				{0, 0, 0, 0, 0}}));
		System.out.println(sol.solution(new int[][]{
				{1, 1, 1, 1, 1, 1},
				{1, 1, 1, 1, 1, 1},
				{1, 1, 1, 1, 1, 1},
				{1, 1, 1, 1, 1, 1},
				{1, 1, 1, 1, 1, 1},
				{1, 1, 1, 1, 1, 1}}));
	}
}

/*
테스트 1 〉	통과 (0.02ms, 72.9MB)
테스트 2 〉	통과 (0.02ms, 71MB)
테스트 3 〉	통과 (0.03ms, 76.7MB)
테스트 4 〉	통과 (0.03ms, 75.8MB)
테스트 5 〉	통과 (0.03ms, 74.8MB)
테스트 6 〉	통과 (0.04ms, 75.8MB)
테스트 7 〉	통과 (0.03ms, 73.9MB)
테스트 8 〉	통과 (0.01ms, 77.1MB)
테스트 9 〉	통과 (0.02ms, 75.8MB)
테스트 10 〉	통과 (0.02ms, 76.3MB)
테스트 11 〉	통과 (0.03ms, 73.9MB)
테스트 12 〉	통과 (0.03ms, 79.1MB)
테스트 13 〉	통과 (0.02ms, 72.3MB)
테스트 14 〉	통과 (0.03ms, 77.6MB)
 */