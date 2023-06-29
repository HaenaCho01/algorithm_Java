package Programmers.lv0.codingTestBasicsTraining.day25_이차원리스트배열;

import java.util.Arrays;

class Solution3 {
	public int[][] solution(int[][] arr) {
		int length = arr.length;
		int width = arr[0].length;

		if (width == length) {
			return arr;
		}

		int size = Math.max(length, width);
		int[][] answer = new int[size][size];
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < width; j++) {
				answer[i][j] = arr[i][j];
			}
		}
		return answer;
	}
}

/*
테스트 1 〉	통과 (0.06ms, 67.1MB)
테스트 2 〉	통과 (0.02ms, 78.3MB)
테스트 3 〉	통과 (0.03ms, 75.1MB)
테스트 4 〉	통과 (0.09ms, 77.2MB)
테스트 5 〉	통과 (0.08ms, 84.5MB)
테스트 6 〉	통과 (0.05ms, 78.5MB)
테스트 7 〉	통과 (0.04ms, 77MB)
테스트 8 〉	통과 (0.03ms, 76.6MB)
테스트 9 〉	통과 (0.13ms, 79.5MB)
테스트 10 〉	통과 (0.13ms, 77.5MB)
테스트 11 〉	통과 (0.07ms, 74.4MB)
테스트 12 〉	통과 (0.06ms, 74.6MB)
테스트 13 〉	통과 (0.07ms, 74.5MB)
테스트 14 〉	통과 (0.22ms, 75.9MB)
테스트 15 〉	통과 (0.23ms, 80.6MB)
테스트 16 〉	통과 (0.07ms, 79.9MB)
테스트 17 〉	통과 (0.14ms, 90.1MB)
테스트 18 〉	통과 (0.18ms, 93.2MB)
테스트 19 〉	통과 (0.25ms, 80.9MB)
테스트 20 〉	통과 (0.40ms, 83.5MB)
테스트 21 〉	통과 (0.06ms, 83.2MB)
테스트 22 〉	통과 (0.10ms, 80.5MB)
테스트 23 〉	통과 (0.18ms, 83.9MB)
테스트 24 〉	통과 (0.29ms, 86.8MB)
테스트 25 〉	통과 (0.02ms, 72.2MB)
테스트 26 〉	통과 (0.01ms, 73.1MB)
테스트 27 〉	통과 (0.01ms, 83.4MB)
테스트 28 〉	통과 (0.01ms, 76.9MB)
테스트 29 〉	통과 (0.02ms, 81.8MB)
 */

public class Sol3_정사각형으로_만들기 {
	public static void main(String[] args) {
		Solution3 sol = new Solution3();
		System.out.println(Arrays.deepToString(sol.solution(new int[][]{
				{572, 22, 37},
				{287, 726, 384},
				{85, 137, 292},
				{487, 13, 876}})));
		System.out.println(Arrays.deepToString(sol.solution(new int[][]{
				{57,192,534,2},
				{9,345,192,999}})));
		System.out.println(Arrays.deepToString(sol.solution(new int[][]{
				{1,2},
				{3,4}})));
	}
}
