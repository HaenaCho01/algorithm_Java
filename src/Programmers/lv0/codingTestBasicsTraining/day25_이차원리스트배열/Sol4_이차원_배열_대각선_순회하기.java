package Programmers.lv0.codingTestBasicsTraining.day25_이차원리스트배열;

class Solution4 {
	public int solution(int[][] board, int k) {
		int answer = 0;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (i + j <= k) {
					answer += board[i][j];
				}
			}
		}
		return answer;
	}
}

/*
테스트 1 〉	통과 (0.03ms, 77.8MB)
테스트 2 〉	통과 (0.02ms, 75.6MB)
테스트 3 〉	통과 (0.03ms, 81.3MB)
테스트 4 〉	통과 (0.03ms, 77.3MB)
테스트 5 〉	통과 (0.03ms, 75.3MB)
테스트 6 〉	통과 (0.02ms, 74.2MB)
테스트 7 〉	통과 (0.07ms, 78.8MB)
테스트 8 〉	통과 (0.02ms, 73.4MB)
테스트 9 〉	통과 (0.04ms, 72.1MB)
 */

public class Sol4_이차원_배열_대각선_순회하기 {
	public static void main(String[] args) {
		Solution4 sol = new Solution4();
		System.out.println(sol.solution(new int[][]{{0, 1, 2}, {1, 2, 3}, {2, 3, 4}, {3, 4, 5}}, 2));
	}
}
