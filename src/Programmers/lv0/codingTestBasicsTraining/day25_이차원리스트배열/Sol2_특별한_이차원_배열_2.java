package Programmers.lv0.codingTestBasicsTraining.day25_이차원리스트배열;

class Solution2 {
	public int solution(int[][] arr) {
		int answer = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i][j] != arr[j][i]) {
					answer = 0;
					break;
				}
			}
			if (answer == 0) {
				break;
			}
		}
		return answer;
	}
}

/*
테스트 1 〉	통과 (0.02ms, 76.7MB)
테스트 2 〉	통과 (0.03ms, 75.9MB)
테스트 3 〉	통과 (0.02ms, 75.7MB)
테스트 4 〉	통과 (0.02ms, 75.3MB)
테스트 5 〉	통과 (0.03ms, 74MB)
테스트 6 〉	통과 (0.03ms, 76.3MB)
테스트 7 〉	통과 (0.02ms, 79.8MB)
테스트 8 〉	통과 (0.04ms, 78.1MB)
테스트 9 〉	통과 (0.02ms, 77.9MB)
테스트 10 〉	통과 (0.11ms, 74.3MB)
테스트 11 〉	통과 (0.02ms, 78.8MB)
테스트 12 〉	통과 (0.17ms, 78.7MB)
테스트 13 〉	통과 (0.01ms, 68.2MB)
테스트 14 〉	통과 (0.23ms, 79.3MB)
테스트 15 〉	통과 (0.01ms, 76.8MB)
테스트 16 〉	통과 (0.28ms, 75.2MB)
테스트 17 〉	통과 (0.01ms, 80.7MB)
테스트 18 〉	통과 (0.29ms, 76.2MB)
테스트 19 〉	통과 (0.01ms, 69.8MB)
테스트 20 〉	통과 (0.03ms, 75.2MB)
테스트 21 〉	통과 (0.02ms, 69.4MB)
 */

public class Sol2_특별한_이차원_배열_2 {
	public static void main(String[] args) {
		Solution2 sol = new Solution2();
		System.out.println(sol.solution(new int[][]{
				{5, 192, 33},
				{192, 72, 95},
				{33, 95, 999}}));
		System.out.println(sol.solution(new int[][]{
				{19, 498, 258, 587},
				{63, 93, 7, 754},
				{258, 7, 1000, 723},
				{587, 754, 723, 81}}));
	}
}
