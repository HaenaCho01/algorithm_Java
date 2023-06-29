package Programmers.lv0.codingTestBasicsTraining.day25_이차원리스트배열;

import java.util.Arrays;

class Solution1 {
	public int[][] solution(int n) {
		int[][] answer = new int[n][n];
		int value = 1; // 채울 값
		int y = 0; int x = 0; //행/열
		String direction = "right"; // 방향

		while (value <= n * n) {
			answer[y][x] = value++; // 값 채우고 이동하기

			// 이동하기
			if (direction.equals("right")) {
				if (x == n - 1 || answer[y][x + 1] != 0) { // 배열을 벗어났는지 혹은 이미 채워져있는지 확인
					direction = "down";
					y++;
				} else {
					x++;
				}
			} else if (direction.equals("down")) {
				if (y == n - 1 || answer[y + 1][x] != 0) {
					direction = "left";
					x--;
				} else {
					y++;
				}
			} else if (direction.equals("left")) {
				if (x == 0 || answer[y][x-1] != 0) {
					direction = "up";
					y--;
				} else {
					x--;
				}
			} else if (direction.equals("up")) {
				if (y == 0 || answer[y-1][x] != 0) {
					direction = "right";
					x++;
				} else {
					y--;
				}
			}
		}
		return answer;
	}
}

/*
테스트 1 〉	통과 (0.04ms, 76.1MB)
테스트 2 〉	통과 (0.04ms, 72.5MB)
테스트 3 〉	통과 (0.07ms, 74.5MB)
테스트 4 〉	통과 (0.06ms, 73.2MB)
테스트 5 〉	통과 (0.04ms, 76.7MB)
테스트 6 〉	통과 (0.02ms, 75.9MB)
테스트 7 〉	통과 (0.05ms, 68.2MB)
테스트 8 〉	통과 (0.11ms, 83MB)
테스트 9 〉	통과 (0.05ms, 75.7MB)
테스트 10 〉	통과 (0.06ms, 77.3MB)
테스트 11 〉	통과 (0.08ms, 71.8MB)
테스트 12 〉	통과 (0.09ms, 76MB)
테스트 13 〉	통과 (0.04ms, 73.7MB)
테스트 14 〉	통과 (0.03ms, 73.7MB)
테스트 15 〉	통과 (0.12ms, 78.6MB)
테스트 16 〉	통과 (0.03ms, 73.2MB)
테스트 17 〉	통과 (0.10ms, 75.3MB)
테스트 18 〉	통과 (0.06ms, 66.8MB)
테스트 19 〉	통과 (0.09ms, 75.6MB)
테스트 20 〉	통과 (0.10ms, 80.2MB)
테스트 21 〉	통과 (0.04ms, 71.7MB)
테스트 22 〉	통과 (0.02ms, 77.6MB)
테스트 23 〉	통과 (0.04ms, 73.6MB)
테스트 24 〉	통과 (0.07ms, 76.6MB)
테스트 25 〉	통과 (0.07ms, 73.1MB)
테스트 26 〉	통과 (0.04ms, 69.6MB)
테스트 27 〉	통과 (0.04ms, 80.7MB)
테스트 28 〉	통과 (0.10ms, 76.1MB)
 */

public class Sol1_정수를_나선형으로_배치하기 {
	public static void main(String[] args) {
		Solution1 sol = new Solution1();
		System.out.println(Arrays.deepToString(sol.solution(4)));
		System.out.println(Arrays.deepToString(sol.solution(5)));
	}
}
